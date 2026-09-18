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