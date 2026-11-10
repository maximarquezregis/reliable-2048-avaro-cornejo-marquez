# Project 5 – Exercise 2: Simple OASIs (LLM-based oracle assessment)

## 1. The tool

`oasis/oasis.py` (with `llm.py`, `prompts.py` and `report.py`) is a simple version of OASIs. Given a Java program and an assertion
(a postcondition), it queries an LLM and gives the user feedback to refine the assertion.
The tool never changes the assertion itself: the final decision is always the user's.

It performs two checks:

| Check | Question | What the LLM is asked for | How the tool validates the answer |
|---|---|---|---|
| False positives | Is the assertion **too strong**? | Inputs that may make the assertion false | Runs them on the real (correct) program. Every input where the assertion is false is a test that violates the assertion. |
| False negatives | Is the assertion **too weak**? | Mutants of the method that the assertion would not detect | Compiles and runs every mutant on the inputs where the assertion holds on the original program. A mutant **survives** if the assertion holds on all those inputs but some output differs from the original. |

Mutant statuses in the reports:

- `KILLED`: the assertion fails (or the mutant crashes/loops) on some input.
- `SURVIVED`: the assertion holds but the mutant behaves differently → evidence that the assertion is too weak.
- `EQUIVALENT ON INPUTS`: same outputs as the original on all inputs → no evidence.
- `DOES NOT COMPILE`: discarded.

LLM answers are never trusted directly: every input and mutant is executed with `javac`/`java`
before being reported.

### Setup and usage

To use the tool, create `oasis/.env`
(git-ignored) with a free OpenRouter key:

```
OASIS_API_KEY=<your key>
OASIS_BASE_URL=https://openrouter.ai/api/v1
OASIS_MODEL=nvidia/nemotron-3-ultra-550b-a55b:free
```

A case study is a folder with `Subject.java` (a class with a static method) and `case.json`
(method name, parameters, return type and initial assertion). To run it:

```bash
cd oasis
python3 oasis.py cases/max_tile                                   # initial assertion
python3 oasis.py cases/max_tile --label refined --assertion "..."  # refined assertion
```

The report is written to `oasis/results/<case>-<label>.md`.

Model used in all runs: `nvidia/nemotron-3-ultra-550b-a55b:free` (OpenRouter).
LLM answers are not deterministic, so new runs may give different inputs and mutants.

---

## 2. Case study 1: `maxTile` – an assertion that is too strong

**Program** (`oasis/cases/max_tile/Subject.java`): returns the highest tile of a 2048 board
given as a flat array (0 = empty cell, so an empty board returns 0).

```java
public static int maxTile(int[] board) {
    int max = 0;
    for (int v : board) {
        if (v > max) max = v;
    }
    return max;
}
```

**Initial assertion**, similar to what Daikon infers from traces of normal games, where
there is always a tile and nobody passed 2048:

```java
result >= 2 && result <= 2048
```

### Iteration 1 (report: [`max_tile-initial.md`](../oasis/results/max_tile-initial.md))

**False positives: 6 of 12 inputs violate the assertion.** Some of them:

| input | result | why the assertion is wrong |
|---|---|---|
| `new int[]{}` / `new int[]{0, 0, 0}` | `0` | an empty board is valid and its max is 0 |
| `new int[]{4096}` | `4096` | 2048 can keep going after reaching 2048 |
| `new int[]{1, 1, 1}`, `new int[]{-1, -2, -3}` | `1`, `0` | invalid tiles: the user may decide these inputs are outside the precondition |

**False negatives: 2 surviving mutants.**

| mutant | example |
|---|---|
| `return 2;` (constant) | `{2048}` → original `2048`, mutant `2`, assertion holds |
| caps the maximum at 1024 | `{2048}` → original `2048`, mutant `1024`, assertion holds |

**Feedback:** the assertion is both too strong (bounds 2 and 2048) and too weak (it does not
relate `result` with `board` at all).

**User decision:** remove the arbitrary bounds and say what a maximum is: no tile is greater
than the result, and the result is one of the tiles (or 0):

```java
result >= 0
&& java.util.Arrays.stream(board).allMatch(v -> v <= result)
&& (result == 0 || java.util.Arrays.stream(board).anyMatch(v -> v == result))
```

### Iteration 2 (report: [`max_tile-refined.md`](../oasis/results/max_tile-refined.md))

- **False positives: 0 of 12.** Inputs such as `{}`, `{-2, -4, -8}`, `{1024, 2048, 4096}`
  and `{Integer.MAX_VALUE, 0}` now satisfy the assertion.
- **False negatives: 0.** 4 mutants were killed. The other 2 are `EQUIVALENT ON INPUTS`:
  they modify the input array (sort it, overwrite the first element) but return the same value.
  The tool calls each method with a copy of the array, so the assertion cannot see these side
  effects. If they matter, the user could add a frame condition such as "`board` is not modified".

**Result:** the refined assertion is accepted. No evidence that it is too strong or too weak.

---

## 3. Case study 2: `mergeRowLeft` – an assertion that is too weak

**Program** (`oasis/cases/merge_row/Subject.java`): the core move of 2048. It slides a row
to the left and merges equal adjacent tiles, each tile merging at most once.
Example: `[2, 2, 4, 0] → [4, 4, 0, 0]`.

```java
public static int[] mergeRowLeft(int[] row) {
    int[] result = new int[row.length];
    int pos = 0, last = 0;
    for (int v : row) {
        if (v == 0) continue;
        if (v == last) { result[pos - 1] = v * 2; last = 0; }
        else           { result[pos++] = v;      last = v; }
    }
    return result;
}
```

**Initial assertion**, a typical weak Daikon invariant (`size(return[]) == size(row[])`):

```java
result.length == row.length
```

### Iteration 1 (report: [`merge_row-initial.md`](../oasis/results/merge_row-initial.md))

- **False positives: 0 of 12.** The assertion is never violated, as expected for a weak assertion.
- **False negatives: 3 of 6 mutants survive.**

| surviving mutant | example input | original | mutant |
|---|---|---|---|
| does not reset `last` after a merge (chained merges) | `{2, 2, 2, 2}` | `[4, 4, 0, 0]` | `[4, 0, 0, 0]` |
| wrong `last` update (never merges) | `{2, 2, 4, 0}` | `[4, 4, 0, 0]` | `[2, 2, 4, 0]` |
| merge writes to the wrong position | `{2, 2, 4, 0}` | `[4, 4, 0, 0]` | `[2, 4, 0, 0]` |

**Feedback:** the assertion is too weak: it only talks about the length.

**User decision:** add two properties of a 2048 move. The sum of the tiles is preserved
(merging `x + x` gives `2x`) and the tiles are packed to the left (no tile after a zero):

```java
result.length == row.length
&& java.util.Arrays.stream(result).sum() == java.util.Arrays.stream(row).sum()
&& java.util.stream.IntStream.range(1, result.length)
       .allMatch(i -> result[i - 1] != 0 || result[i] == 0)
```

With this assertion, the first and third mutants of iteration 1 are killed, because they
change the sum. The mutant that never merges tiles does not die: it returns the row as is ([2,2,4,0]), which preserves the sum and already has the tiles positioned to the left. 

### Iteration 2 (report: [`merge_row-refined.md`](../oasis/results/merge_row-refined.md))

- **False positives: 0 of 12.**
- **False negatives: 6 of 6 mutants survive.** Given the new assertion, the LLM generated
  mutants that keep the sum and the left packing but merge wrongly:

| surviving mutant | example input | original | mutant |
|---|---|---|---|
| never merges | `{2, 2, 2, 2}` | `[4, 4, 0, 0]` | `[2, 2, 2, 2]` |
| chain merge (merged value is merged again) | `{2, 2, 2, 2}` | `[4, 4, 0, 0]` | `[8, 0, 0, 0]` |
| processes the row right to left | `{4, 4, 8, 8}` | `[8, 16, 0, 0]` | `[16, 8, 0, 0]` |
| resets `last` on zeros | `{2, 0, 2, 0}` | `[4, 0, 0, 0]` | `[2, 2, 0, 0]` |
| merges different adjacent tiles | `{2, 4, 2, 4}` | `[2, 4, 2, 4]` | `[6, 6, 0, 0]` |

**Feedback:** the refinement is better (it kills the mutants of iteration 1) but it is
still too weak. Sum preservation and left packing do not describe *which* tiles merge.

**User decision:** the assertion was strengthened, and the surviving mutants show what is
still missing: the order of the tiles and the "each tile merges at most once" rule.
Specifying these in a single expression basically means writing the full algorithm again.
So we keep the refined assertion as a reasonable lightweight contract and leave the exact
merge behaviour to unit tests. This is the kind of trade-off that OASIs leaves to the user.

---

## 4. Conclusions

- The **false-positive check** quickly found real counterexamples to Daikon-style bounds
  (`result <= 2048`, `result >= 2`) that come from limited traces.
- The **false-negative check** produced concrete, readable mutants that show what an
  assertion misses. They make it clear what property has to be added.
- Running the tool again on the refined assertion is useful. The LLM adapts its mutants to the
  new assertion, so it finds the next weakness (case 2), or there is no evidence left (case 1).
- Executing every LLM answer is essential. In the reports, some LLM mutants were equivalent or
  were killed, and some LLM inputs were invalid for 2048 (negative or odd tiles). Only
  behaviour that was actually observed is reported to the user.
