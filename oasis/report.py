"""
Generation of the Markdown report of one round: oasis/results/<case>/round-N.md.
N is the next free number, so every run adds a new file and keeps the previous rounds.
"""

import os
from datetime import datetime

ACTUAL_PATH = os.path.dirname(os.path.abspath(__file__))


def _next_path(case_name):
    folder = os.path.join(ACTUAL_PATH, "results", case_name)
    os.makedirs(folder, exist_ok=True)
    n = 1
    while os.path.exists(os.path.join(folder, f"round-{n}.md")):
        n += 1
    return n, os.path.join(folder, f"round-{n}.md")


def write_report(case_dir, case, subject, assertion, fp, fn):
    """Write the report of this round. Returns the report path."""
    case_name = os.path.basename(case_dir.rstrip("/"))
    n, path = _next_path(case_name)
    call = case["method"]
    L = [
        f"# OASIs report: {call}, round {n}",
        "",
        f"- Date: {datetime.now():%Y-%m-%d %H:%M}",
        f"- Model: `{os.environ.get('OASIS_MODEL', '?')}`",
        f"- Precondition: `{case.get('precondition', 'true')}`",
        "",
        "## Program",
        "",
        "```java",
        subject.strip(),
        "```",
        "",
        "## Assertion",
        "",
        "```java",
        assertion,
        "```",
        "",
        "## Result",
        "",
    ]
    if fp:
        L += [
            "**False-positive search:** found a failing test on the correct program.",
            "",
            f"- Test input: `{call}({', '.join(fp['input'])})`",
            f"- The program returns `{fp['result']}`, which is the correct answer",
            "- The assertion is **false** → a correct run raises an alarm",
            "",
            "**Verdict:** false positive → weaken or refine the assertion.",
        ]
    elif fn:
        L += [
            "**False-positive search:** no counterexample found.",
            "",
            "**False-negative search:** found a surviving mutant.",
            "",
            f"- Mutant: {fn['description']}",
            f"- Test input: `{call}({', '.join(fn['input'])})`",
            f"- The mutant returns `{fn['got']}`, the correct answer is `{fn['expected']}`",
            "- The assertion is still **true** → the fault slips through unnoticed",
            "",
            "```java",
            fn["code"],
            "```",
            "",
            "**Verdict:** false negative → strengthen the assertion.",
        ]
    else:
        L += [
            "**False-positive search:** no counterexample found.",
            "",
            "**False-negative search:** no counterexample found.",
            "",
            "**Verdict:** no evidence that the assertion is too strong or too weak.",
        ]
    L += [
        "",
        f"Next step (developer): edit the assertion in `cases/{case_name}/case.json` and run "
        "the tool again for a new round, or stop here and keep this assertion.",
    ]

    with open(path, "w") as f:
        f.write("\n".join(L) + "\n")
    return path
