# Randoop vs. Manual Test Suite

## Pit Test Coverage Report

| Suite | Number of Classes | Line Coverage | Mutation Coverage | Test Strength |
| :---: | :---: | :---: | :---: | :---: |
| Manual | 2 | 100% (163/163) | 98% (163/167) | 98% (163/167) |
| Randoop | 2 | 93% (151/163) | 83% (139/167) | 95% (139/146) |

## JaCoCo Report

| Suite | Instructions | Branches | Complexity | Lines | Methods | Classes |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Manual | 100% (1055/1055) | 100% (158/158) | 175/175 | 100% (118/118) | 100% (39/39) | 100% (4/4) |
| Randoop | 88% (938/1055) | 84% (134/158) | 156/175 | 90% (106/118) | 95% (37/39) | 100% (4/4) |

Randoop generated tests for `Board` and `Cell` (10s each). `MainCLI` was excluded because it is interactive (`Scanner`/infinite loop), consistent with the rest of the project.

**Why Randoop has lower coverage:** it constructs sequences of method calls by combining random values, without any knowledge of the game rules or which sequence produces a specific state—it only knows the methods exist, not what they do. Reaching a "won" board (with a 2048 tile) or a "lost" one (full, with no possible moves) requires stringing together dozens of coherent moves—something virtually impossible to generate by chance during a 10-second run. That is why it fails to cover `isWinningBoard`/`isLosingBoard` or `equals`/`hashCode` (it did not encounter calls with "interesting" arguments for those methods within the allotted time). The manual suite, on the other hand, was written with full knowledge of the specific move sequences that create each scenario; consequently, it covers those branches, whereas Randoop does not.

Conversely, Randoop is better at exploring edge cases (negative sizes, out-of-range positions, nulls) because these do not require game logic—only the variation of types and boundary values—something the manual suite does not always test exhaustively.

## Post-repOK() — Randoop Re-run

After merging the `repOK()` implementation for `Cell` and `Board` (along with their manual tests) from `main`, Randoop was regenerated from scratch based on the updated classes.

### Pit Test Coverage Report

| Suite | Number of Classes | Line Coverage | Mutation Coverage | Test Strength |
| :---: | :---: | :---: | :---: | :---: |
| Manual | 2 | 100% (176/176) | 98% (184/188) | 98% (184/188) |
| Randoop | 2 | 98% (191/194) | 96% (187/195) | 97% (187/192) |

### JaCoCo Report

| Suite | Instructions | Branches | Complexity | Lines | Methods | Classes |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Manual | 100% (1114/1114) | 99% (175/176) | 128/129 | 100% (188/188) | 100% (42/42) | 100% (4/4) |
| Randoop | 99% (1206/1212) | 97% (178/182) | 130/134 | 98% (203/206) | 100% (43/43) | 100% (4/4) |

**repOK() and Randoop:** Randoop does indeed call `repOK()` naturally (as it is a boolean getter with no side effects) and kills almost all mutants in both classes—no game logic was required to exercise it, only varying the object's state. No invariant violations were found (no cases where `repOk()` unexpectedly returned `false` for an object constructed via the public API).

## Deterministic Re-run with `@CheckRep` (`Cell` and `Board`)

After making `Board.randomGen` an instance field (copied in `Board(Board)`) so that moves no longer re-seed a shared static `Random` with `LocalDateTime.now().getNano()`, Randoop was re-run for `Cell` and `Board` (15s time limit, producing 1,220 tests across `RegressionTest0`–`RegressionTest2`, with 0 failures and 0 flaky assertions) using:

- `--omit-methods='^ar\.edu\.unrc\.game2048\.Board\((|int)\)$'` to avoid the non-deterministic constructors (`Board()` and `Board(int)`) and force deterministic construction via `Board(int, int)` (with an explicit seed).
- `--omit-field='ar.edu.unrc.game2048.Board.WINNING_VALUE'` and `--check-compilable=false` to prevent Randoop from passing `2048` into `Board(int, int)` (which creates `2048 × 2048` grids of ~4.2M cells and throttles generation) and to skip per-sequence in-memory compilation overhead during generation.

### Pit Test Coverage Report

| Suite | Number of Classes | Line Coverage | Mutation Coverage | Test Strength |
| :---: | :---: | :---: | :---: | :---: |
| Randoop | 2 | 71% (163/228) | 61% (133/218) | 85% (133/156) |

*(Ran on `randoopTests.RegressionTest`; 100% test strength on covered lines of `Cell` with 29 killed and 10 `NO_COVERAGE` mutants, and 104 killed / 23 survived / 52 `NO_COVERAGE` on `Board`.)*

### JaCoCo Report

| Suite | Instructions | Branches | Complexity | Lines | Methods | Classes |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Randoop | 71% (1050/1459) | 68% (146/214) | 106/152 | 72% (174/240) | 86% (39/45) | 100% (4/4) |

### Why Some Methods Have 0% or Partial Coverage

- **`repOk()` (`0%` on both `Cell` and `Board`):** Once `Cell.repOk()` and `Board.repOk()` are annotated with `@CheckRep`, Randoop's `DefaultReflectionPredicate` explicitly excludes `@CheckRep`-annotated methods from the generated JUnit test files (`RegressionTest*.java`). Randoop still executes `repOk()` internally after every sequence during generation to check representation invariants, so the invariant is verified at generation time even though JaCoCo (which only measures JUnit execution) reports `0%` for `repOk()` (23 instructions in `Cell`, 68 in `Board`).
- **`hashCode()` (`0%` on `Cell` and `Board`):** Randoop `4.3.4` filters out `hashCode()` calls by default (`"hashCode may be nondeterministic"`), except for `String.hashCode()`. As a result, `Cell.hashCode()` (10 instructions) and `Board.hashCode()` (23 instructions) are never invoked directly in the generated tests, whereas `Board.Position.hashCode()` reaches 100% (16/16 instructions) indirectly through `HashSet<Position>` in `getEmptyPositions()`.
- **`Board()` and `Board(int)` (`0%`):** Excluded via `--omit-methods` to ensure deterministic, non-flaky regression assertions (12 and 44 instructions, respectively).
- **`isLosingBoard()` (`7%`), `isFull()` (`71%`), `hasEmptyCells()` (`87%`), `isWinningBoard()` (`93%`), and `setCell()` (`73%`):** As noted in the baseline analysis, random call sequences rarely fill an entire board (especially larger grids up to `100 × 100`) to get past `if (hasEmptyCells()) return false;` in `isLosingBoard()`. Likewise, omitting `WINNING_VALUE` keeps Randoop from generating a `2048` cell to cover the `return true` branch in `isWinningBoard()`, and `setCell()` only missed the `cell == null` guard where a valid in-bounds coordinate was not paired with `null`.
