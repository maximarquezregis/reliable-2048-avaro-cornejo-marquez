"""
Prompts sent to the LLM and parsing of its answers.
"""

import json
import re


def inputs_prompt(case, subject, assertion):
    params = ", ".join(f"{p['type']} {p['name']}" for p in case["params"])
    return f"""You are helping to test a Java assertion (postcondition).

Program:
```java
{subject}
```

Method under analysis: {case["method"]}({params})
Postcondition (Java boolean expression, `result` is the return value):
    {assertion}

Task: give 12 test inputs for this method. At least half of them must try to
make the postcondition FALSE on this (correct) program. The rest must be
diverse inputs, including edge cases.

Answer ONLY with a JSON list. Each element is a list with one Java expression
per parameter, in order ({params}). Example for a method f(int[] a, int x):
[["new int[]{{1, 2}}", "3"], ["new int[]{{}}", "0"]]"""


def mutants_prompt(case, subject, assertion):
    return f"""You are helping to evaluate whether a Java assertion is too weak.

Program:
```java
{subject}
```

Postcondition of method {case["method"]} (`result` is the return value):
    {assertion}

Task: write 6 mutants of the program. A mutant is the same class `Subject`
with a small change in method {case["method"]} that makes it behave
INCORRECTLY but that the postcondition above would probably NOT detect.

Write each mutant as the complete Java class, preceded by a line
"=== MUTANT <n>: <one-line description> ===". No other text."""


def parse_inputs(text):
    """Extract the JSON list of inputs from the LLM answer."""
    text = text[text.index("[") : text.rindex("]") + 1]
    return json.loads(text)


def parse_mutants(text):
    """Split the LLM answer into (description, java_source) pairs."""
    parts = re.split(r"^=== MUTANT \d+:?\s*(.*?)\s*===\s*$", text, flags=re.MULTILINE)
    mutants = []
    for desc, code in zip(parts[1::2], parts[2::2]):
        code = re.sub(r"```(java)?", "", code).strip()
        if "class Subject" in code:
            mutants.append((desc, code))
    return mutants
