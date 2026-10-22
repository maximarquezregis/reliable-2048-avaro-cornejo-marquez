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

The new trace was generated by Chicory, but it reached a size of approximately `255 MB`. The Daikon execution did not complete because the trace was truncated when the process was interrupted (`Unexpected end of dtrace record`). For this very reason, we cannot claim that the five invariants have disappeared from a new output of Daikon; the confirmed result is that the expanded tests demonstrate that these are spurious invariants and explain how to correct the original conclusion: by increasing the diversity of observed sizes and states before performing the inference again.