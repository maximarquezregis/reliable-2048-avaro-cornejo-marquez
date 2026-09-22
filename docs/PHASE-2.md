# Phase 2 Documentation

In the `fuzz()` method implementation, we construct the fuzzed string of a random size between `min_length` and 
`max_length`, and the keys are all equally likely. This approach may finish the game before reaching a winning or losing
state, this could be avoided if we generate a considerately longer fuzzed string.

The algorithm first selects the output string's size, which is selected randomly between `min_length` and `max_length`.
```
output_length = random.randint(self.min_length, self.max_length)
```

Then it iterates `output_length` times appending a randomly selected key from `KEYS` list. 
```
for _ in range(output_length - 1):
            insert_key = KEYS[random.randint(0, len(KEYS) - 1)] # randomly chosen input
            output += insert_key + '\n'
```

Finally, it appends the `QUIT` symbol (q) and returns the fuzzed string.
```
output += QUIT + '\n'
        return output
```

We tested the game considerately many times with the fuzzer, and all trials ended correctly (the program never crashed).
The summary insights throwed by `fuzzer.py` were: 

```
==================================================
Summary:
  PASS        : 300/300
  FAIL        : 0/300
  UNRESOLVED  : 0/300
```

Subsequently, taking advantage of the `repOk()` methods implemented in the `Cell` and `Board` classes, we added
`repOk()` assertions to `MainCLI` in order to verify that the board always remains in a valid state after each move.
We additionally re-ran the fuzzer with a range of different `min_length` and `max_length` values passed to
`RandomFuzzer`. Under none of these configurations did we observe an error, a failed assertion, or any inconsistency
in the resulting board states.

### 2.5 Record and Commit

The fuzzer did not find any crashes or assertion failures in the CLI. All generated
inputs were processed normally and the board remained valid according to `repOK()`.
We also tested different input lengths, but none of them produced an unexpected
termination or a timeout.

While reviewing the invariants, we found a validation problem in the `Cell` class.
The constructor and `repOK()` rejected values greater than `2048`, even though the
player can continue playing after reaching the winning tile. Therefore, a value such
as `4096` is valid and should not be rejected. We removed those validations and the
tests that expected values greater than `2048` to be invalid.

This problem was not detected by the fuzzer as a crash, because it required creating
a specific cell value rather than only sending random moves through the CLI. The
fuzzer was useful for checking the complete interaction with the game and for
verifying the representation invariant after each move. EvoSuite and Randoop were
more useful for exercising individual methods of `Board` and `Cell`, and they
produced higher and more targeted coverage for those classes. On the other hand,
they did not test the CLI flow in the same way as the fuzzer.

For this reason, we consider that the three techniques complement each other. The
fuzzer is useful for finding failures in the external interface, while EvoSuite and
Randoop are better suited for exploring the internal classes and generating unit
tests. In this phase, combining random input with `repOK()` gave us more confidence
that the board stayed in a valid state during normal gameplay.
