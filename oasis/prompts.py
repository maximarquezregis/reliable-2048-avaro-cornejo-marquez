"""
Prompts sent to the LLM and parsing of its answers.

Each search asks the LLM for ONE candidate counterexample:
  - false-positive search: one input
  - false-negative search: one mutant plus the input that shows its fault
"""

import json
import re


def _header(case, subject, assertion):
    params = ", ".join(f"{p['type']} {p['name']}" for p in case["params"])
    pre = case.get("precondition", "true")
    return f"""Program:
```java
{subject}
```

Method under analysis: {case["method"]}({params})
Precondition (only inputs that satisfy it are valid): {pre}
Assertion (postcondition, `result` is the return value):
    {assertion}
"""


def fp_prompt(case, subject, assertion, tried):
    params = ", ".join(f"{p['type']} {p['name']}" for p in case["params"])
    tried_txt = ""
    if tried:
        tried_txt = "\nThese inputs were already tried and did NOT make the assertion false:\n"
        tried_txt += "\n".join(f"- {json.dumps(t)}" for t in tried) + "\n"
    return f"""You are the false-positive search of OASIs (test oracle assessment).

{_header(case, subject, assertion)}
The program is CORRECT. Find ONE valid input on which the real return value
of the program makes the assertion FALSE (the assertion is too strong).
Think about edge cases: empty arrays, zeros, boundaries, large values.
{tried_txt}
Answer ONLY with a JSON list with one Java expression per parameter, in order
({params}). Example for a method f(int[] a, int x): ["new int[]{{1, 2}}", "3"]"""


def fn_prompt(case, subject, assertion, tried):
    tried_txt = ""
    if tried:
        tried_txt = "\nThese mutants were already tried and were detected by the assertion (or behaved like the original):\n"
        tried_txt += "\n".join(f"- {t}" for t in tried) + "\n"
    return f"""You are the false-negative search of OASIs (test oracle assessment).

{_header(case, subject, assertion)}
Write ONE mutant: the same class `Subject` with a small fault in method
{case["method"]}, such that on some valid input the mutant returns a WRONG
value that still satisfies the assertion (the assertion is too weak to
detect the fault). Also give that input.
{tried_txt}
Answer exactly in this format and nothing else:
DESCRIPTION: <one-line description of the fault>
INPUT: <JSON list with one Java expression per parameter>
```java
<the complete mutant class>
```"""


def parse_input(text):
    """Extract the JSON list (one Java expression per parameter) from the LLM answer."""
    value = json.loads(text[text.index("[") : text.rindex("]") + 1])
    if value and isinstance(value[0], list):  # the LLM sometimes wraps it in another list
        value = value[0]
    return [str(v) for v in value]


def parse_mutant(text):
    """Return (description, input, java_source) from the LLM answer. Raises ValueError if malformed."""
    desc = re.search(r"DESCRIPTION:\s*(.*)", text)
    inp = re.search(r"INPUT:\s*(\[.*\])", text)
    code = re.search(r"```(?:java)?\s*(.*?)```", text, flags=re.DOTALL)
    if not (desc and inp and code) or "class Subject" not in code.group(1):
        raise ValueError("malformed mutant answer")
    return desc.group(1).strip(), parse_input(inp.group(1)), code.group(1).strip()
