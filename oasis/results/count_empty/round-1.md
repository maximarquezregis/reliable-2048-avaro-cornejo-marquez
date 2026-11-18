# OASIs report: countEmpty, round 1

- Date: 2026-11-18 13:37
- Model: `nvidia/nemotron-3-ultra-550b-a55b:free`
- Precondition: `java.util.Arrays.stream(board).allMatch(v -> v == 0 || (v >= 2 && (v & (v - 1)) == 0))`

## Program

```java
public class Subject {

    /**
     * Returns the number of empty cells (value 0) of a 2048 board
     * given as a flat array.
     */
    public static int countEmpty(int[] board) {
        int count = 0;
        for (int v : board) {
            if (v == 0) {
                count++;
            }
        }
        return count;
    }
}
```

## Assertion

```java
result >= 0
```

## Result

**False-positive search:** no counterexample found.

**False-negative search:** found a surviving mutant.

- Mutant: Counts the non-zero cells instead of the empty ones.
- Test input: `countEmpty(new int[]{0, 2, 4, 8})`
- The mutant returns `3`, the correct answer is `1`
- The assertion is still **true** → the fault slips through unnoticed

```java
public class Subject {
    public static int countEmpty(int[] board) {
        int count = 0;
        for (int v : board) {
            if (v != 0) {
                count++;
            }
        }
        return count;
    }
}
```

**Verdict:** false negative → strengthen the assertion.

Next step (developer): edit the assertion in `cases/count_empty/case.json` and run the tool again for a new round, or stop here and keep this assertion.
