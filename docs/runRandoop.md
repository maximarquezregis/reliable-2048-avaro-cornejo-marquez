# How to Run Randoop

This guide documents the command and flags used to automatically generate JUnit regression tests with Randoop for `Cell` and `Board`, as well as how to run the generated suite with Maven, JaCoCo, and PITest.

## 1. Compile the Project and Clean Previous Output

From the repository root, compile the production classes into `target/classes`:

```bash
mvn clean compile
```

Randoop overwrites files with the same names (`RegressionTest.java`, `RegressionTest0.java`, etc.), but it does not remove extra files left over from earlier runs (such as `RegressionTest2.java` or `ErrorTest*.java`). Clean the output directory first if it already exists:

```bash
rm -rf src/test/java/randoopTests
```

## 2. Generate Tests for `Cell` and `Board`

Run Randoop `4.3.4` targeting both classes in a single invocation:

```bash
java -cp "lib/randoop-all-4.3.4.jar:target/classes" randoop.main.Main gentests \
  --testclass=ar.edu.unrc.game2048.Cell \
  --testclass=ar.edu.unrc.game2048.Board \
  --omit-methods='^ar\.edu\.unrc\.game2048\.Board\((|int)\)$' \
  --omit-field='ar.edu.unrc.game2048.Board.WINNING_VALUE' \
  --check-compilable=false \
  --time-limit=15 \
  --junit-output-dir=src/test/java \
  --junit-package-name=randoopTests
```

### Flag Explanation

- `-cp "lib/randoop-all-4.3.4.jar:target/classes"`: includes Randoop (`4.3.4`) and the compiled project classes (`Cell`, `Board`, `Board$Position`, `Board$Direction`).
- `--testclass=ar.edu.unrc.game2048.Cell` and `--testclass=ar.edu.unrc.game2048.Board`: tests both classes together in one suite so a second run does not overwrite `RegressionTest.java` and `RegressionTest0.java`. Randoop automatically detects `@CheckRep` on `Cell.repOk()` and `Board.repOk()`, and also exercises the public inner types `Board.Position` and `Board.Direction`. (`MainCLI` is excluded because it is interactive.)
- `--omit-methods='^ar\.edu\.unrc\.game2048\.Board\((|int)\)$'`: excludes the non-deterministic constructors `Board()` and `Board(int)`, which seed `Random` with `LocalDateTime.now().getNano()`. Together with keeping `randomGen` as an instance field copied in `Board(Board)`, this forces Randoop to construct boards deterministically via `Board(int, int)` (with an explicit seed) and prevents flaky regression assertions.
- `--omit-field='ar.edu.unrc.game2048.Board.WINNING_VALUE'`: prevents Randoop from reading `2048` from `Board.WINNING_VALUE` and passing it as `size` to `Board(int, int)`. Creating `2048 × 2048` grids (~4.2M cells per board) severely degrades generation throughput and memory usage.
- `--check-compilable=false`: disables compiling every candidate sequence individually in memory during generation. Because `Cell` and `Board` expose straightforward public types, omitting this per-test compilation check increases generation speed substantially; compilation is still verified afterwards by Maven.
- `--time-limit=15`: sets the generation budget to 15 seconds (generating ~1,220 tests split across `RegressionTest0.java`–`RegressionTest2.java`, while staying comfortably within Randoop's default `3000m` heap and keeping downstream mutation analysis practical).
- `--junit-output-dir=src/test/java` and `--junit-package-name=randoopTests`: writes the generated suite (`RegressionTest.java` plus `RegressionTest0.java`..`RegressionTestN.java`, and `ErrorTest*.java` if any invariant/contract violation is found) into `src/test/java/randoopTests/`.

## 3. Run the Generated Tests and Measure Coverage

### Run Randoop Tests and JaCoCo

```bash
mvn clean test -Dtest=RegressionTest jacoco:report
```

- Filtering with `-Dtest=RegressionTest` runs only the Randoop suite (avoiding mixing `BoardTest` and EvoSuite tests in the same JVM).
- The HTML coverage report is generated at `target/site/jacoco/index.html`.

### Run PITest Mutation Analysis

```bash
mvn test-compile pitest:mutationCoverage \
  -DtargetTests=randoopTests.RegressionTest \
  -DjvmArgs="-Xmx2g"
```

- `-DtargetTests=randoopTests.RegressionTest` restricts mutation testing to the Randoop suite.
- `-DjvmArgs="-Xmx2g"` gives the PITest minion JVM enough heap to run all generated tests (including boards up to `100 × 100`) without failing with `MINION_DIED`.
- The HTML mutation report is generated at `target/pit-reports/index.html`.

For recorded metrics and an explanation of why `@CheckRep` (`repOk()`), `hashCode()`, and certain branches remain at `0%` or partial coverage in JaCoCo, see [METRICS-Randoop.md](./METRICS-Randoop.md).
