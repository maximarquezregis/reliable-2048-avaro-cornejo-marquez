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
| EvoSuite | Not recorded | Not recorded | Not recorded |

Mutation results for EvoSuite were not included in the recorded metrics, so no
value is reported for that suite. The EvoSuite tests did pass and achieved high
JaCoCo coverage, but coverage and mutation score measure different things.

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