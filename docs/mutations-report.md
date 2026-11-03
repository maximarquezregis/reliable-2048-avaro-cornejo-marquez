## Bug found through mutation testing

We found a bug while testing the `Board` constructor with mutated board strings.

The following mutation triggered the bug:

```
--- Trial 28 | UNEXPECTED FAILURE ---
Original: [0]
Mutated : []
Size    : 1
Stderr  : Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index -1 out of bounds for length 0
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
	at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
	at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
	at java.base/java.lang.String.checkIndex(String.java:4822)
	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
	at java.base/java.lang.String.charAt(String.java:1544)
	at ar.edu.unrc.game2048.Board.clearInput(Board.java:168)
	at ar.edu.unrc.game2048.Board.<init>(Board.java:130)
	at ar.edu.unrc.game2048.MainCLI.<init>(MainCLI.java:17)
	at ar.edu.unrc.game2048.MainCLI.main(MainCLI.java:93)
```

The mutation produced the board string `[]`. The `Board` constructor did not validate that the board contained at 
least one cell before attempting to parse it. As a result, the parser attempted to access a character at index `-1`,
causing a `StringIndexOutOfBoundsException`.

The fix is to validate the board string before parsing it and reject `[]` with a controlled validation error.

After fixing the bug, we ran additional fuzzing and mutation tests with a larger number of test cases. 
The implementation correctly rejected the invalid boards generated during these tests, and no additional failures were observed.