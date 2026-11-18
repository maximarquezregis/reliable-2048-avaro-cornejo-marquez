# OASIs report: maxTile, round 3

- Date: 2026-11-18 15:29
- Model: `nvidia/nemotron-3-ultra-550b-a55b:free`
- Precondition: `java.util.Arrays.stream(board).allMatch(v -> v == 0 || (v >= 2 && (v & (v - 1)) == 0))`

## Program

```java
public class Subject {

    /**
     * Returns the highest tile of a 2048 board given as a flat array.
     * Empty cells are 0, so an empty board returns 0.
     */
    public static int maxTile(int[] board) {
        int max = 0;
        for (int v : board) {
            if (v > max) {
                max = v;
            }
        }
        return max;
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

- Mutant: The loop starts at index 1, so a maximum in the first cell is missed.
- Test input: `maxTile(new int[]{4, 2, 0})`
- The mutant returns `2`, the correct answer is `4`
- The assertion is still **true** → the fault slips through unnoticed

```java
public class Subject {
    public static int maxTile(int[] board) {
        int max = 0;
        for (int i = 1; i < board.length; i++) {
            if (board[i] > max) {
                max = board[i];
            }
        }
        return max;
    }
}
```

**Verdict:** false negative → strengthen the assertion.

Next step (developer): edit the assertion in `cases/max_tile/case.json` and run the tool again for a new round, or stop here and keep this assertion.
