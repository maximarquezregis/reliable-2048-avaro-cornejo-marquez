"""
Simple OASIs-like tool: LLM-assisted oracle (assertion) assessment and improvement.

Each run is ONE round, for the assertion currently in case.json:

  1. False-positive search: asks the LLM for an input on which the CORRECT
     program makes the assertion fail. If the input really violates the
     assertion, it is reported (the assertion is too strong -> weaken/refine).
  2. False-negative search (only if no false positive was found): asks the
     LLM for a mutant (a faulty version of the method) plus an input where
     its wrong result still satisfies the assertion. If confirmed, it is
     reported (the assertion is too weak -> strengthen).
  3. If neither search finds a counterexample, there is no evidence against
     the assertion.

Each round writes a new report, results/<case>/round-N.md. The user then edits
the assertion in case.json and runs the tool again, or decides to stop. The
tool never changes the assertion by itself.

Modules:
    llm.py      queries to the LLM
    prompts.py  prompts and parsing of the LLM answers
    report.py   Markdown report generation
    oasis.py    Java execution, searches and one round (this file)

Usage:
    python3 oasis.py cases/max_tile
"""

import argparse
import json
import os
import re
import shutil
import subprocess
import tempfile

from llm import ask_llm, load_env
from prompts import fn_prompt, fp_prompt, parse_input, parse_mutant
from report import write_report

MAX_ATTEMPTS = 3  # LLM candidates tried per search before giving up

# ---------------------------------------------------------------------------
# Java execution
# ---------------------------------------------------------------------------


def build_harness(case, assertion, inputs):
    """Java main that runs every input and prints, per input, the verdict and the result."""
    params = case["params"]
    pre = case.get("precondition", "true")
    call_args = ", ".join(
        p["name"] + ".clone()" if p["type"].endswith("[]") else p["name"]
        for p in params
    )
    blocks = []
    for i, inp in enumerate(inputs):
        decls = " ".join(f"{p['type']} {p['name']} = {v};" for p, v in zip(params, inp))
        blocks.append(f"""
        try {{
            {decls}
            if (!({pre})) {{
                System.out.println("{i}|INVALID|");
            }} else {{
                {case["return_type"]} result = Subject.{case["method"]}({call_args});
                boolean ok = ({assertion});
                System.out.println("{i}|" + (ok ? "HOLDS" : "VIOLATED") + "|" + show(result));
            }}
        }} catch (Throwable t) {{
            System.out.println("{i}|EXCEPTION|" + t);
        }}""")
    return f"""
public class Harness {{
    static String show(Object o) {{
        if (o instanceof int[]) return java.util.Arrays.toString((int[]) o);
        return String.valueOf(o);
    }}
    public static void main(String[] args) {{{"".join(blocks)}
    }}
}}
"""


def run_java(subject_src, harness_src):
    """Compile Subject + Harness in a temp dir and run it.
    Returns {input_index: (verdict, result)} or None if it does not compile."""
    tmp = tempfile.mkdtemp()
    try:
        with open(os.path.join(tmp, "Subject.java"), "w") as f:
            f.write(subject_src)
        with open(os.path.join(tmp, "Harness.java"), "w") as f:
            f.write(harness_src)
        c = subprocess.run(
            ["javac", "Subject.java", "Harness.java"],
            cwd=tmp,
            capture_output=True,
            text=True,
            check=False,
        )
        if c.returncode != 0:
            return None
        try:
            r = subprocess.run(
                ["java", "-cp", ".", "Harness"],
                cwd=tmp,
                capture_output=True,
                text=True,
                timeout=10,
                check=False,
            )
        except subprocess.TimeoutExpired:
            return {}  # e.g. a mutant with an infinite loop
        out = {}
        for line in r.stdout.splitlines():
            m = re.match(r"^(\d+)\|(HOLDS|VIOLATED|EXCEPTION|INVALID)\|(.*)$", line)
            if m:  # ignore any other output printed by the program itself
                out[int(m.group(1))] = (m.group(2), m.group(3))
        return out
    finally:
        shutil.rmtree(tmp)


def run_one(src, case, assertion, inp):
    """Run one input. Returns (verdict, result) or None if it does not compile / times out."""
    out = run_java(src, build_harness(case, assertion, [inp]))
    return out.get(0) if out else None


# ---------------------------------------------------------------------------
# OASIs searches
# ---------------------------------------------------------------------------


def fp_search(case, subject, assertion):
    """False-positive search: one input where the correct program violates the assertion."""
    tried = []
    for attempt in range(1, MAX_ATTEMPTS + 1):
        print(f"  attempt {attempt}/{MAX_ATTEMPTS}")
        try:
            inp = parse_input(ask_llm(fp_prompt(case, subject, assertion, tried)))
        except (ValueError, OSError) as e:  # unparseable answer or network error
            print(f"  skipped: {e}")
            continue
        if len(inp) != len(case["params"]):
            continue
        res = run_one(subject, case, assertion, inp)
        if res and res[0] == "VIOLATED":
            return {"input": inp, "result": res[1]}
        tried.append(inp)
    return None


def fn_search(case, subject, assertion):
    """False-negative search: one mutant whose wrong result still satisfies the assertion."""
    tried = []
    for attempt in range(1, MAX_ATTEMPTS + 1):
        print(f"  attempt {attempt}/{MAX_ATTEMPTS}")
        try:
            desc, inp, code = parse_mutant(ask_llm(fn_prompt(case, subject, assertion, tried)))
        except (ValueError, OSError) as e:  # unparseable answer or network error
            print(f"  skipped: {e}")
            continue
        if len(inp) != len(case["params"]):
            continue
        orig = run_one(subject, case, assertion, inp)
        mut = run_one(code, case, assertion, inp)
        # confirmed only if the assertion holds on both runs but the mutant's result is wrong
        if orig and mut and orig[0] == mut[0] == "HOLDS" and orig[1] != mut[1]:
            return {"description": desc, "code": code, "input": inp,
                    "expected": orig[1], "got": mut[1]}
        tried.append(desc)
    return None


# ---------------------------------------------------------------------------
# One round
# ---------------------------------------------------------------------------


def main():
    load_env()
    ap = argparse.ArgumentParser(description="Simple OASIs: one round of LLM-based assertion assessment")
    ap.add_argument("case_dir", help="folder with Subject.java and case.json")
    args = ap.parse_args()

    with open(os.path.join(args.case_dir, "case.json")) as f:
        case = json.load(f)
    with open(os.path.join(args.case_dir, "Subject.java")) as f:
        subject = f.read()
    assertion = case["assertion"]
    call = case["method"]

    print(f"Assertion: {assertion}")
    print("False-positive search...")
    fp = fp_search(case, subject, assertion)
    fn = None
    if not fp:
        print("False-negative search...")
        fn = fn_search(case, subject, assertion)

    if fp:
        print(f"FALSE POSITIVE: {call}({', '.join(fp['input'])}) returns {fp['result']} "
              "(correct), but the assertion is false -> weaken or refine it.")
    elif fn:
        print(f"FALSE NEGATIVE: mutant '{fn['description']}': {call}({', '.join(fn['input'])}) "
              f"returns {fn['got']} (correct: {fn['expected']}) and the assertion still holds "
              "-> strengthen it.")
    else:
        print("No counterexample found: no evidence that the assertion is too strong or too weak.")
    print(f"Report: {write_report(args.case_dir, case, subject, assertion, fp, fn)}")


if __name__ == "__main__":
    main()
