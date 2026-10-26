# Automated Testing and Fuzzing Report

## Coverage and Mutation Results

The following table contains the final JaCoCo results after adding `repOK()` and
updating the tests. `MainCLI` was excluded from JaCoCo because it is an interactive
command-line program.

| Suite | Instructions | Branches | Lines | Methods | Classes |
| :---: | :---: | :---: | :---: | :---: | :---: |
| Manual | 98% (1191/1210) | 97% (173/178) | 98% (200/204) | 100% (43/43) | 100% (4/4) |
| Randoop | 99% (1204/1210) | 98% (175/178) | 98% (201/204) | 100% (43/43) | 100% (4/4) |
| EvoSuite | 99% (1200/1210) | 96% (172/178) | 97% (199/204) | 100% (43/43) | 100% (4/4) |

The available PIT results were:

| Suite | Line Coverage | Mutation Coverage | Test Strength |
| :---: | :---: | :---: | :---: |
| Manual | 100% (176/176) | 98% (184/188) | 98% (184/188) |
| Randoop | 98% (191/194) | 96% (187/195) | 97% (187/192) |
| EvoSuite | 94% (180/192) | 87% (154/177) | 99% (154/156) |

## EvoSuite and Randoop

The generated tests differed mainly in the kind of test cases they produced.
Randoop created sequences of calls to `Board` and `Cell` using boundary values,
nulls, and invalid arguments. These tests were useful for checking general
contracts, valid and invalid object states, and expected exceptions. However, the
sequences were less likely to build complex game states, such as a board that was
clearly winning or losing, and the resulting tests were not always easy to relate
to a specific game scenario, something close to the reality.

EvoSuite generated a wider variety of JUnit test methods, including constructor
variants, movement sequences, equality and string representations, invalid
positions, exceptions, and calls to `repOk()`. Some tests included concrete
assertions about return values or object state, while others only exercised a
sequence of methods or recorded automatically generated regression assertions.
This made EvoSuite useful for reaching additional behaviors, although several of
its tests were harder to read and understand than the manually written tests.

Therefore, the main difference in the generated suites was not only how the
inputs were selected, but also how useful the resulting tests were as readable
examples of the behavior of the game. Both suites achieved high coverage, but
coverage alone did not guarantee that the tests represented meaningful gameplay
scenarios.

Neither tool was designed to exercise the complete interactive CLI flow. That is
why the fuzzer was used as a complement to these unit-level techniques.

## Fuzzer

The fuzzer is divided into a `Fuzzer` that creates inputs and a `Runner` that
executes the Java program. `RandomFuzzer.fuzz()` first chooses a random length
between `min_length` and `max_length`. It then chooses each move randomly from
`a`, `s`, `w`, and `d`, placing every key on its own line. Finally, it appends
`q\n` so that the game exits gracefully.

The runner sends the generated string to `MainCLI`, waits up to ten seconds, and
classifies the result as `PASS`, `FAIL`, or `UNRESOLVED`. In the recorded run,
300 inputs were executed and all of them passed:

```text
PASS        : 300/300
FAIL        : 0/300
UNRESOLVED  : 0/300
```

Assertions using `Board.repOk()` were added after moves and around terminal board
states. Repeating the fuzzer with different input lengths did not produce an
assertion failure or an invalid board state.

## Bug Found

While reviewing the representation invariants, we found that the `Cell` constructor
and `repOK()` rejected values greater than `2048`. This was incorrect because the
player can continue playing after reaching the winning tile, so `4096` is a valid
cell value.

A minimal reproducing input for the original validation was:

```java
new Cell(4096);
```

The original implementation rejected this value even though it is a power of two
and can be produced by continuing the game. We removed the incorrect upper-bound
validation and updated the corresponding tests. The fuzzer did not find this bug as
a crash because it required checking a specific `Cell` value rather than only
sending random moves through the CLI.

## Reflection

For this project, no single technique was sufficient on its own. EvoSuite and
Randoop were more effective for testing individual methods and measuring coverage
of `Board` and `Cell`. The fuzzer was more effective for testing the complete CLI
interaction and, together with `repOK()`, checking that the board remained valid
after each move.

The most useful approach was therefore the combination of techniques: EvoSuite and
Randoop improved automated unit-level exploration, while fuzzing tested the external
interface and normal game flow. The `Cell` bug also showed that coverage alone does
not guarantee that the expected behavior or the domain rules are correct.

# Daikon Report

### Generated invariants

**`Board` invariants:**

```
ar.edu.unrc.game2048.Board:::OBJECT
this.size == size(this.grid[])
this.size one of { 1, 4, 5 }
this.grid != null
this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class
this.grid[] elements != null
this.score >= 0
this.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0
ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1
ar.edu.unrc.game2048.Board.WINNING_VALUE > this.size
ar.edu.unrc.game2048.Board.WINNING_VALUE != this.score
this.score % this.size == 0
```

**`Cell` invariants:**

```
ar.edu.unrc.game2048.Cell:::OBJECT
this.value >= 0
this.value >= ar.edu.unrc.game2048.Cell.EMPTY.value
```

### Board

| Invariant | Correct? | Useful? | Already in `repOK()`? | Too strong? (counterexample) | Classification
|-----------|----------|---------|------------------------|------------------------------|---------------|
| `this.size == size(this.grid[])` | Yes, genuine property | Yes, catches inconsistencies between `size` and the grid | It was not taken into account in our repOK() | It is not possible to construct any valid execution that violates this property | Correct and useful
| `this.size one of { 1, 4, 5 }` | That's not correct; those are just the sizes used in the tests | No, because the invariant is incorrect | No | Yes, we could create a 6 x 6 board, which is valid, and the invariant would be violated | Spurious and incorrect
| `this.grid != null` | Yes, because it's created in the board constructor | It's useful because it should never be null | It was not taken into account in the repOK() functions we implemented | It is not possible to provide a valid execution that violates the invariant | Correct and useful
| `this.grid.getClass().getName() == ar.edu.unrc.game2048.Cell[][].class` | If that's correct, since a grid is a matrix | The grid type cannot be changed, so it is an unnecessary invariant | We didn't take it into account because it's unnecessary | We cannot provide a valid execution that violates the invariant | Correct, but trivial
| `this.grid[] elements != null` | Yes | Yes, catches uninitialized rows | Yes | No | Correct and useful
| `this.score >= 0` | Yes, because it's initialized to 0, and you can only add to it | If, for some reason, two negative numbers were merged (for example, -2), the score could be negative, and this invariant would detect it | It was not taken into account in our invariants | No | Correct and useful
| `this.score % ar.edu.unrc.game2048.Board.DEFAULT_SIZE == 0` | If it is correct, even if the information is irrelevant. This is because each cell merge can increase the score by 4, 8, 16, 32, ..., which are multiples of 4 | It could be used to detect whether two numbers that are not powers of 2 are a merge | No | There is no valid execution that violates the invariant, but it only works in this case (or in case 2); however, if the `default_size` were changed, it would no longer be correct | Correct but useless
| `ar.edu.unrc.game2048.Board.DEFAULT_SIZE >= size(this.grid[])-1` | That's not correct; it overfits the data from the current tests | It's not useful, since the invariant is incorrect | No | Yes, we could create a board by passing size = 10 as a parameter, and that would violate the invariant | Spurious and incorrect
| `ar.edu.unrc.game2048.Board.WINNING_VALUE > this.size` | That's not correct, since you could create a board with a size greater than 2048, but that wouldn't be reasonable | No | No | Creating a board with size = 2048 breaks the invariant | Spurious and incorrect
| `ar.edu.unrc.game2048.Board.WINNING_VALUE != this.score` | That's not correct; what's happening is that, with the tests we've run and the interactive execution of the game, we've never encountered that scenario | It is not useful because it does not provide valuable information | No | If we end up with a score of 2048, the invariant is violated, and it is also possible to reach a score of 2048 | Spurious and incorrect
| `this.score % this.size == 0` | That is not correct, since there is no direct relationship between the two values | It's not useful | No | Yes: on a 5 × 5 board, merging two cells with value 2 gives `score = 4`, and `4 % 5 != 0` | Spurious and incorrect

### Cell

| Invariant | Correct? | Useful? | Already in `repOK()`? | Too strong? (counterexample) | Classification
|-------------|----------|---------|------------------------|------------------------------|-------------|
| `this.value >= 0` | Yes | It's useful, but it's weak | While we considered this case, we also took other cases into account to strengthen the invariant | No | Correct and useful (but weak) 
| `this.value >= ar.edu.unrc.game2048.Cell.EMPTY.value` | Yes, it's similar to the previous one | It's not useful, since it's redundant | Yes | No | Correct and useful (but weak)


### Summary of the New Trace

Test cases were added to `DaikonTestTrace` to expand the range of observed values:

- A board of size `6` was created—a value outside the set `{1, 4, 5}`.
- A board of size `10` was created—a value greater than `DEFAULT_SIZE + 1`.
- A board of size `2048` was created to demonstrate that `WINNING_VALUE > size` is not a valid invariant.
- A score of `2048` was reached by combining two `1024` cells.
- A score of `4` was reached on a board of size `5`, demonstrating that `score % size == 0` is false.

All five new tests pass (`5 tests, 0 failures, 0 errors`). Consequently, the five spurious invariants are refuted by valid executions:

| Spurious Invariant | Refuting Case | Result |
|---|---|---|
| `this.size one of {1, 4, 5}` | `new Board(6)` | Refuted |
| `DEFAULT_SIZE >= size(this.grid[])-1` | `new Board(10)` | Refuted |
| `WINNING_VALUE > this.size` | `new Board(2048)` | Refuted |
| `WINNING_VALUE != this.score` | score `2048` after combining `1024 + 1024` | Refuted |
| `this.score % this.size == 0` | score `4` on a board of size `5` | Refuted |

The initial attempt included `new Board(2048)`, which allocated a 2048x2048 matrix and produced an excessively large trace. That test is kept in `DaikonTestTrace`, but marked with `@Ignore` for the dynamic-instrumentation run. The remaining boundary tests still cover board sizes `6` and `10`, score `2048`, and score `4` on a board of size `5`.

The final run generated both `JUnitCore.dtrace.gz` and `MainCLI.dtrace.gz`, and fed both traces to Daikon. The long CLI trace was generated through `fuzzer.py` with 1000 moves. Daikon completed successfully (`Exiting Daikon`) and the new raw output was saved as `daikon-output-expanded.txt`, without overwriting the original `daikon-output.txt`. The two output files can be compared manually.

The broader trace removed some overly specific invariants at individual program points. `WINNING_VALUE != this.score` disappeared from the new global output, but `WINNING_VALUE > this.size` remained. The size and score invariants also remained at some method-specific program points, including `this.size one of {4, 5}`, `DEFAULT_SIZE >= size(this.grid[])-1`, and `this.score % this.size == 0`. This is expected because the fuzzer only creates the default 4x4 board, and Daikon infers invariants separately for each program point.

The broader trace also introduced a new spurious candidate in the global `Board:::OBJECT` output: `Board.DEFAULT_SIZE <= this.size`. It is an artefact of the observed sizes, because valid boards of sizes `1`, `2`, and `3` are allowed by the constructor. Thus, broadening the trace improved the evidence and removed one incorrect invariant, but it did not eliminate every spurious invariant and introduced another one caused by incomplete boundary coverage. The remaining candidates require executions through the same program points with smaller board sizes and non-default score values.

## Comparison between Daikon and repOK()

The Board invariant from `repOK()` that Daikon also inferred is `this.grid[] elements != null`. 
And the Cell invariant from `repOK()` that Daikon also inferred is `this.value >= 0`.

The Cell invariant that we have in `repOK()` but Daikon didn't infer is `isPowerOf2(this.value)`. That is because its template library does not generally express custom predicates or bitwise properties such as `(value & (value - 1)) == 0`. It can infer simpler properties like `this.value >= 0`, but not that a value belongs to the set of powers of two.
And the Board `repOK()` doesn't have any invariant that Daikon didn't infer.

Daikon inferred many useful invariants that we didn't include in our Board `repOK()`, those are informed in the [Generated invariants](#generated-invariants) section.

We updated Board `repOk()` to check that the size, grid, rows, cells, and score are valid, while still checking every cell with `Cell.repOk()`. This makes the representation invariant more complete and returns `false` for invalid boards. Daikon helped us identify and recognize invariants that we hadn't taken into account when implementing Board `repOk()`.

Manual testing was the most useful approach for us because it was the first stage of the software evaluation process and allowed us to assess most of the program’s functionality. It helped us verify the expected behavior of the main features and identify usability issues early in the evaluation process. If we had to select an automated testing technique, we would probably choose EvoSuite because it helped us identify edge cases that we had not previously considered.