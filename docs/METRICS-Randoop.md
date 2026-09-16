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