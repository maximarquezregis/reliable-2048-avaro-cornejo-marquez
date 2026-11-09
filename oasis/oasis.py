"""
Simple OASIs-like tool: LLM-assisted oracle (assertion) assessment.

Given a Java program and an assertion, the tool generate:

  1. False positives (Strong assertions): asks the LLM for inputs that
     violate the assertion, runs them on the real program and reports the
     ones where the assertion is actually false.
  2. False negatives (Weak assertions): asks the LLM for mutants of the
     method, runs them on the inputs and reports the mutants that the
     assertion cannot kill even though they behave differently from
     the original program.

The tool only gives feedback; the user decides how to refine the assertion.

Modules:
    llm.py      queries to the LLM
    prompts.py  prompts and parsing of the LLM answers
    report.py   Markdown report generation
    oasis.py    Java execution, analysis and entry point (this file)

Usage:
    python3 oasis.py cases/merge_row
    python3 oasis.py cases/merge_row --assertion "result.length == row.length && ..."
"""

import argparse
import json
import os
import re
import shutil
import subprocess
import tempfile

from llm import ask_llm, load_env
from prompts import inputs_prompt, mutants_prompt, parse_inputs, parse_mutants
from report import write_report

# ---------------------------------------------------------------------------
# Java execution
# ---------------------------------------------------------------------------


def build_harness(case, assertion, inputs):
    """Java main that runs every input and prints, per input, the verdict and the result."""
    params = case["params"]
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
            {case["return_type"]} result = Subject.{case["method"]}({call_args});
            boolean ok = ({assertion});
            System.out.println("{i}|" + (ok ? "HOLDS" : "VIOLATED") + "|" + show(result));
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
            m = re.match(r"^(\d+)\|(HOLDS|VIOLATED|EXCEPTION)\|(.*)$", line)
            if m:  # ignore any other output printed by the program itself
                out[int(m.group(1))] = (m.group(2), m.group(3))
        return out
    finally:
        shutil.rmtree(tmp)


# ---------------------------------------------------------------------------
# OASIs analysis
# ---------------------------------------------------------------------------


def analyze(case_dir, assertion=None):
    with open(os.path.join(case_dir, "case.json")) as f:
        case = json.load(f)
    with open(os.path.join(case_dir, "Subject.java")) as f:
        subject = f.read()
    assertion = assertion or case["assertion"]

    # ---- 1. False positives: inputs that violate the assertion ----
    print("[1/2] Asking the LLM for inputs that could violate the assertion...")
    inputs = parse_inputs(ask_llm(inputs_prompt(case, subject, assertion)))
    inputs = [i for i in inputs if len(i) == len(case["params"])]
    original = run_java(subject, build_harness(case, assertion, inputs))
    if original is None:  # an LLM input did not compile: try them one by one
        ok = [
            i
            for i in inputs
            if run_java(subject, build_harness(case, assertion, [i])) is not None
        ]
        inputs = ok
        original = run_java(subject, build_harness(case, assertion, inputs))
    violating = [
        (inputs[i], res) for i, (v, res) in original.items() if v == "VIOLATED"
    ]

    # ---- 2. False negatives: mutants the assertion cannot kill ----
    print("[2/2] Asking the LLM for mutants the assertion might not kill...")
    mutants = parse_mutants(ask_llm(mutants_prompt(case, subject, assertion)))
    # only inputs where the assertion holds on the original program can kill a mutant
    good = [i for i, (v, _) in original.items() if v == "HOLDS"]
    mutant_results = []
    for desc, code in mutants:
        out = run_java(code, build_harness(case, assertion, inputs))
        if out is None:
            status = "DOES NOT COMPILE"
        elif any(out.get(i, ("TIMEOUT",))[0] != "HOLDS" for i in good):
            status = "KILLED"
        elif all(out[i][1] == original[i][1] for i in good):
            status = "EQUIVALENT ON INPUTS"  # same outputs as the original: no evidence
        else:
            status = "SURVIVED"
        mutant_results.append((desc, code, status, out))

    return case, subject, assertion, inputs, original, violating, mutant_results, good


def main():
    load_env()
    ap = argparse.ArgumentParser(
        description="Simple OASIs: LLM-based assertion assessment"
    )
    ap.add_argument("case_dir", help="folder with Subject.java and case.json")
    ap.add_argument(
        "--assertion", help="assertion to analyze (default: the one in case.json)"
    )
    ap.add_argument(
        "--label",
        default="initial",
        help="name of this run, used in the report file name",
    )
    args = ap.parse_args()

    data = analyze(args.case_dir, args.assertion)
    path, fp, fn = write_report(args.case_dir, args.label, data)
    print(f"False positives (violating tests): {fp}")
    print(f"False negatives (surviving mutants): {fn}")
    print(f"Report: {path}")


if __name__ == "__main__":
    main()
