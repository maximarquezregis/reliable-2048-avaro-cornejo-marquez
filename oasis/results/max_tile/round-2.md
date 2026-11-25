# OASIs report: maxTile, round 2

- Date: 2026-11-18 14:54
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
result >= 0 && result <= 2048
```

## Result

**False-positive search:** found a failing test on the correct program.

- Test input: `maxTile(new int[]{4096})`
- The program returns `4096`, which is the correct answer
- The assertion is **false** → a correct run raises an alarm

**Verdict:** false positive → weaken or refine the assertion.

Next step (developer): edit the assertion in `cases/max_tile/case.json` and run the tool again for a new round, or stop here and keep this assertion.
