After adding the `repOK()` assertions to `MainCLI`, we discovered an incorrect validation in the following methods
of the `Cell` class: the `repOK()` method and the `Cell()` constructor. Both rejected any value greater than 2048,
under the assumption that the game would terminate automatically as soon as a player reached a winning state.
Upon further analysis, however, we realized that the player may choose to keep playing after winning, meaning that
4096 is in fact a valid cell value — a case our validation failed to account for.

Having identified this issue, we removed the corresponding validations from both methods, along with her tests.

Updated metrics for the `Cell` class following these changes:

**Manual Test Suite vs. Randoop vs. Evosuite**

| Suite | Instructions | Branches | Complexity | Lines | Methods | Classes |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |
| Manual | 98% (1191/1210) | 97% (173/178) | 127/132 | 98% (200/204) | 100% (43/43) | 100% (4/4) |
| Randoop | 99% (1204/1210) | 98% (175/178) | 129/132 | 98% (201/204) | 100% (43/43) | 100% (4/4) |
| Evosuite | 99% (1200/1210) | 96% (172/178) | 126/132 | 97% (199/204) | 100% (43/43) | 100% (4/4) |