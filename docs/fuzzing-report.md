# Fuzzing Report

## Execution

### Overview

The fuzzing harness combines two independent fuzzers to generate comprehensive test inputs:

1. **Board Grammar Fuzzer** (`grammar_fuzzer.py`): Generates random starting board configurations with varying sizes and cell values using context-free grammar expansion.
2. **Move Fuzzer** (`fuzzer.py`): Generates random move sequences consisting of random key presses (a, s, w, d) followed by q to quit.

Each trial pairs a randomly generated board with a randomly generated move sequence, then executes the game through `MainCLI` with assertions enabled to detect invariant violations.

### Commands

Run all commands from the repository root directory.

#### Basic execution (10,000 trials, default):

```bash
python3 harness.py
```

#### Display move sequences and execution details for each trial:

```bash
python3 harness.py --show-moves
```

This flag prints detailed execution information per trial: a `Moves :` line showing all keypresses (separated by spaces), and when the trial completes (not a timeout), `Exit :` with the return code and `Output:` with the game's full stdout transcript (all board states printed during play plus final messages). Output becomes substantial with large trial counts; redirecting to a file is practically required for long runs.

#### Pad boards to perfect square dimensions:

```bash
python3 harness.py --pad-boards
```

This flag appends trailing `0` cells to generated boards so the total cell count becomes a perfect square. For example, a 5-cell board becomes a 9-cell board (size 3). Zeros are placed at the end, so later rows tend to be sparser. This flag significantly increases the number of trials that execute moves instead of being rejected for size mismatch.

#### Combine both flags:

```bash
python3 harness.py --show-moves --pad-boards
```

### Harness Execution Details

#### Underlying mechanics

For each trial, the harness:

1. Generates a random board string and size using `GrammarFuzzer.board_with_size()`.
2. Optionally pads the board if `--pad-boards` is specified.
3. Generates a random move sequence using `RandomFuzzer.fuzz()` (a sequence of key presses followed by `q` to terminate).
4. Executes `MainCLI` with the board and size as command-line arguments and the move sequence via stdin.
5. Classifies the outcome as `PASS`, `FAIL`, `UNRESOLVED`, or `EXPECTED REJECTION`.

#### Output Details

- **Board**: The board string passed to MainCLI.
- **Size**: The board dimension passed to MainCLI.
- **Moves** (only with `--show-moves`): The sequence of keypresses, with newlines replaced by spaces. Moves are from `{a, s, w, d, q}` representing left, down, up, right, and quit.
- **Exit** (only with `--show-moves`, if trial did not timeout): The process return code (0 for success, non-zero for failure).
- **Output** (only with `--show-moves`, if trial did not timeout): The full game stdout—all board states printed on each loop iteration plus final messages, providing a complete game transcript per trial.
- **Stderr** (only for genuine `FAIL` outcomes): Standard error output, typically containing exception traces or assertion failures.

### Summary Output

After all trials, the harness prints a summary:

```
==================================================
Summary:
  PASS                : count/trials
  FAIL                : count/trials
  UNRESOLVED          : count/trials
  Expected rejections : count/trials
```

Counts sum to `trials`. `EXPECTED REJECTION` trials are excluded from `FAIL` to highlight genuine bugs.

## Results

**Configuration**: 10,000 trials; move sequences of 100–5,000 moves; assertions enabled (`-ea`).

| Run | PASS | FAIL | UNRESOLVED | Expected rejections |
| --- | --- | --- | --- | --- |
| Without `--pad-boards` | 3,360 | 0 | 0 | 6,640 |
| With `--pad-boards` | 10,000 | 0 | 0 | 0 |

**Key observations**:
- Without padding: ~66% of trials rejected due to non-perfect-square cell counts; only ~34% executed moves through size validation.
- With padding: All 10,000 trials executed move sequences by bypassing size validation.
- No assertion violations or timeouts in either run.
- Padding demonstrates the fuzzer's ability to exercise the game logic without size constraints; unpadded runs validate the Board size-checking path.

**No bugs were found.**
