"""
Harness that combines the move fuzzer (fuzzer.py) with the board grammar
fuzzer (grammar_fuzzer.py): each trial fuzzes a starting board/size pair
and a move sequence.
"""

import sys
from math import isqrt
from typing import Tuple

from fuzzer import RandomFuzzer, PASS, FAIL, UNRESOLVED
from grammar_fuzzer import GrammarFuzzer, BoardCLIRunner, is_expected_rejection


def pad_board(board: str) -> Tuple[str, int]:
    """
    Pad *board* with trailing "0" cells so its cell count becomes a perfect
    square, returning the rebuilt board string and its resulting size.

    If the board is already square, it is returned unchanged.
    """
    cells = board.strip()[1:-1].split(",")
    n = len(cells)
    k = isqrt(n)
    if k * k < n:
        k += 1

    cells += ["0"] * (k * k - n)
    return "[" + ",".join(cells) + "]", k


def run_harness(trials: int = 10000, show_moves: bool = False, pad_boards: bool = False):
    grammar = GrammarFuzzer()
    moves_fuzzer = RandomFuzzer(min_length=100, max_length=5000)
    runner = BoardCLIRunner()

    outcomes = {PASS: 0, FAIL: 0, UNRESOLVED: 0}
    expected_rejections = 0  # FAILs reclassified as expected board rejections

    print(f"Running {trials} harness trials...\n")

    for i in range(trials):
        board, size = grammar.board_with_size()
        if pad_boards:
            board, size = pad_board(board)
        moves = moves_fuzzer.fuzz()
        result, outcome = runner.run(moves, board, size)

        status = outcome
        if outcome == FAIL and is_expected_rejection(result):
            expected_rejections += 1
            status = "EXPECTED REJECTION"
        else:
            outcomes[outcome] += 1

        print(f"--- Trial {i + 1:>3} | {status} ---")
        print(f"Board : {board}")
        print(f"Size  : {size}")

        if show_moves:
            # print(f"Moves : {moves.replace(chr(10), ' ').strip()}")          

            if result is not None:
                print(f"Exit  : {result.returncode}")
                if result.stdout:
                    print(f"Output: {result.stdout.strip()}")

        if outcome == FAIL and status != "EXPECTED REJECTION" and result is not None and result.stderr:
            print(f"Stderr: {result.stderr.strip()}")

        print()

    print("=" * 50)
    print("Summary:")
    print(f"  PASS                : {outcomes[PASS]}/{trials}")
    print(f"  FAIL                : {outcomes[FAIL]}/{trials}")
    print(f"  UNRESOLVED          : {outcomes[UNRESOLVED]}/{trials}")
    print(f"  Expected rejections : {expected_rejections}/{trials}")


def main():
    run_harness(show_moves="--show-moves" in sys.argv,
        pad_boards="--pad-boards" in sys.argv)


if __name__ == "__main__":
    main()
