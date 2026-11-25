# Project 5 – Exercise 2: Simple OASIs (LLM-based oracle assessment)

## 1. The tool

`oasis/oasis.py` (with `llm.py`, `prompts.py` and `report.py`) is a simple version of OASIs.
Given a Java method and an assertion (a postcondition), it uses an LLM to look for
counterexamples. The developer revises the assertion until no counterexample is found.
The tool never changes the assertion itself: the decision is always the developer's.

The tool works in **rounds**. Each round reports **at most one** counterexample:

| Step | Question | LLM is asked for | The tool confirms it if… |
|---|---|---|---|
| 1. False-positive search | Is the assertion **too strong**? | One valid input | the **correct** program, run on that input, makes the assertion **false**. |
| 2. False-negative search (only if step 1 found nothing) | Is the assertion **too weak**? | One mutant (a faulty version of the method) plus one input | on that input the mutant returns a **wrong** value and the assertion is still **true**. |
| 3. No evidence | – | – | neither search found anything (3 LLM attempts each). |

Each run of the tool is **one round** and writes its own report, `results/<case>/round-N.md`.
After a false positive the developer weakens or refines the assertion; after a false negative
the developer strengthens it. The developer edits the assertion by hand in `case.json` and runs
the tool again, which is a new round. As in OASIs, the developer decides when to stop.

LLM answers are never trusted directly. Every input and mutant is compiled and executed with
`javac`/`java` before it is reported. Inputs that do not satisfy the case's **precondition**
are discarded. For both case studies the precondition is "every cell is 0 or a power of two ≥ 2",
which means a valid 2048 board.

### Files

| Path | Content |
|---|---|
| `oasis/oasis.py` | Java harness and the two searches of one round (entry point) |
| `oasis/llm.py` | Call to the LLM API |
| `oasis/prompts.py` | Prompts and parsing of the LLM answers |
| `oasis/report.py` | Markdown report |
| `oasis/cases/<case>/` | `Subject.java` (the method) and `case.json` (signature, precondition, current assertion) |
| `oasis/results/<case>/round-N.md` | Report of round N (one file per run) |

---

## 2. How to run it (cheat sheet)

### Setup (once)

Requirements: Python 3 and a JDK (`javac` and `java` on the `PATH`). No pip packages are needed.

Create `oasis/.env` (it is git-ignored) with a free OpenRouter key:

```
OASIS_API_KEY=<your key>
OASIS_BASE_URL=https://openrouter.ai/api/v1
OASIS_MODEL=nvidia/nemotron-3-ultra-550b-a55b:free
```

### Flow

```
edit the assertion in cases/<case>/case.json
        │
        ▼
python3 oasis.py cases/<case>          ← one run = one round
        │
        ├─► false-positive search: LLM proposes an input
        │       └─► Java harness runs the CORRECT method on it
        │             (checks the precondition, evaluates the assertion)
        │
        ├─► (if none) false-negative search: LLM proposes a mutant + input
        │       └─► Java harness runs the original AND the mutant on it
        │
        └─► report written to results/<case>/round-N.md
                │
                ▼
        developer reads the counterexample and decides:
          • edit the assertion in case.json and run again (round N+1), or
          • stop and keep the assertion
```

### Step by step

1. **Write the assertion** in `oasis/cases/<case>/case.json`, in the `"assertion"` field. It is a
   Java boolean expression that can use `result` and the parameters, for example
   `"result >= 2 && result <= 2048"`.

2. **Run one round:**
   ```bash
   cd oasis
   python3 oasis.py cases/max_tile
   ```

3. **The tool runs the Java harness.** For every candidate it builds a small `Harness.java`. The
   harness declares the input, checks the precondition, calls `Subject.<method>(...)` and
   evaluates the assertion. It prints `HOLDS`, `VIOLATED`, `INVALID` or `EXCEPTION`. You will see:
   ```
   Assertion: result >= 2 && result <= 2048
   False-positive search...
     attempt 1/3
   FALSE POSITIVE: maxTile(new int[]{}) returns 0 (correct), but the assertion is false -> weaken or refine it.
   Report: .../oasis/results/max_tile/round-1.md
   ```

4. **Read the report** of this round in `oasis/results/<case>/round-N.md`. Earlier rounds are never
   overwritten: each run adds the next number.

5. **Decide (human in the loop):**
   - false positive → the assertion rejects a correct result → weaken or refine it;
   - false negative → the assertion accepts a wrong result → strengthen it;
   - no counterexample → no evidence against the assertion, so you can stop.

   To continue, edit the assertion in `case.json` and go back to step 2. To stop, just don't run it again.

---

## 3. Case studies

Each round was a separate run, and every input and mutant was compiled and executed
in Java, so only real counterexamples were reported. After the runs, each `case.json` was left with
the final assertion.

## 3.1 Case study 1: `maxTile`

Reports: [`oasis/results/max_tile/`](../oasis/results/max_tile/), one file per round
(`round-1.md` … `round-5.md`).

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

**Initial assertion**, the kind Daikon infers from traces of normal games, where there is always
a tile and nobody passes 2048: `result >= 2 && result <= 2048`.

| Round | Assertion | Counterexample | Verdict |
|---|---|---|---|
| 1 | `result >= 2 && result <= 2048` | `maxTile({})` returns `0` | False positive |
| 2 | `result >= 0 && result <= 2048` | `maxTile({4096})` returns `4096` | False positive |
| 3 | `result >= 0` | mutant whose loop starts at index 1: `{4, 2, 0}` → `2` (correct `4`) | False negative |
| 4 | `result >= 0 && allMatch(v -> v <= result)` | mutant `return max * 2`: `{2, 4}` → `8` (correct `4`) | False negative |
| 5 | `allMatch(v -> v <= result) && (result == 0 \|\| anyMatch(v -> v == result))` | none | No evidence → **stop** |

(`allMatch`/`anyMatch` are short for `java.util.Arrays.stream(board).allMatch(...)` and `.anyMatch(...)`.)

Between rounds, the developer edited the assertion in `case.json` and ran the tool again:

1. An empty board is valid and its highest tile is 0, so the lower bound is relaxed to `result >= 0`.
2. The game goes on after 2048, so the upper bound is dropped.
3. `result >= 0` says nothing about the board. Require that no tile is greater than `result`.
4. An upper bound is not enough: a result that is too big also passes. Require that `result` is one
   of the tiles, or 0 for an empty board.
5. No counterexample, so the developer stops here. In round 5 the LLM tried 3 inputs (`{}`, `{0, 0, 0}`, `{16, 2, 16, 4}`) and 3 mutants
   (the loop starting at index 1, an inverted comparison, returning the last cell), and the assertion
   detected all of them. The final assertion is the full definition of "maximum".

---

## 3.2 Case study 2: `countEmpty`

Reports: [`oasis/results/count_empty/`](../oasis/results/count_empty/) (`round-1.md`, `round-2.md`).

**Program** (`oasis/cases/count_empty/Subject.java`): counts the empty cells (0) of a board.
It is the value behind `Board.getEmptyPositions().size()` in the game.

```java
public static int countEmpty(int[] board) {
    int count = 0;
    for (int v : board) {
        if (v == 0) count++;
    }
    return count;
}
```

**Initial assertion**, a typical weak invariant: `result >= 0`.

| Round | Assertion | Counterexample | Verdict |
|---|---|---|---|
| 1 | `result >= 0` | mutant that counts the non-zero cells: `{0, 2, 4, 8}` → `3` (correct `1`) | False negative |
| 2 | `result == java.util.Arrays.stream(board).filter(v -> v == 0).count()` | none | No evidence → **stop** |

In round 1 the LLM tried 3 inputs, but no false positive is possible: a count is never negative. The mutant shows that the
assertion does not tie `result` to the board at all. The developer strengthened the assertion in `case.json` to
the exact definition. In round 2 the 3 inputs and 3 mutants (counting non-zero cells, skipping
the first cell, returning one more) were all handled by the assertion, so the developer stops.

---

## 4. Conclusions

- **One counterexample per round** keeps the feedback concrete. Each round tells the developer
  exactly what is wrong with the current assertion.
- The **false-positive search** quickly breaks Daikon-style bounds that come from limited traces,
  such as `result >= 2` and `result <= 2048`.
- The **false-negative search** shows what a weak assertion misses, with a readable mutant and the
  input that exposes it.
- A strengthened assertion can still be too weak. In `maxTile`, round 4 adds an upper bound
  and a new mutant passes it. Iterating until there is no counterexample is what produces a complete assertion.
- **Executing every answer is essential.** Unparseable or wrong LLM answers are skipped, and only
  behaviour that was actually observed in Java is reported.
