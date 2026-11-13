import re
import random
import subprocess
from math import isqrt
from typing import List, Tuple, Optional

from fuzzer import CLIRunner, Fuzzer

# ---------------------------------------------------------------------------
# Outcome constants  (mirrors the Fuzzing Book convention)
# ---------------------------------------------------------------------------

PASS = "PASS"       # program exited normally, no errors reported
FAIL = "FAIL"       # program signalled a bug (non-zero exit, assertion error)
UNRESOLVED = "UNRESOLVED"  # e.g. timeout or unexpected error in the runner

# Grammar for generating board strings. The grammar is recursive and can produce boards of varying sizes and cell counts. 
# The starting symbol is <start>, which expands to <board>, which in turn expands to a list of <cells>. 
# Each <cell> can be a digit (0, 2, or 4).
BOARD_GRAMMAR = {
    "<start>": ["<board>"],
    "<board>": ["[<cells>]"],
    "<cells>": ["<cell>", "<cell>,<cell>,<cells>", "<cell>,<cell>,<cell>,<cell>,<cells>", "<cell>,<cells>"], # more possible expansions to increase variety
    "<cell>": ["<digit>"],
    "<digit>": ["0", "2", "4", "8", "16", "32", "64", "128", "256", "512", "1024", "2048"]
}

# ---------------------------------------------------------------------------
# Start symbol
# ---------------------------------------------------------------------------

START_SYMBOL = "<start>"  # every grammar expansion begins from this symbol

# ---------------------------------------------------------------------------
# Nonterminal helpers
# ---------------------------------------------------------------------------

RE_NONTERMINAL = re.compile(r'(<[^<> ]*>)')


def nonterminals(expansion: str) -> List[str]:
    """Return all nonterminals in *expansion*, e.g. nonterminals("[<cells>]") -> ["<cells>"]."""
    return RE_NONTERMINAL.findall(expansion)

# ---------------------------------------------------------------------------
# Expansion errors
# ---------------------------------------------------------------------------

class ExpansionError(Exception):
    """Raised when a term cannot be expanded within the allowed number of trials."""
    pass


# ---------------------------------------------------------------------------
# Runner
# ---------------------------------------------------------------------------

class BoardCLIRunner(CLIRunner):
    """
    Runs the 2048 CLI with an explicit starting board and size.

    Unlike the base CLIRunner (which only feeds moves via stdin), MainCLI
    here also receives the board as args[0] (e.g. "[0,2,4,8,...]") and the
    size as args[1]; only the moves (e.g. "a\\ns\\nq\\n") go through stdin.

    """

    def run(self, inp: str, board: str, size: int) -> Tuple[Optional[subprocess.CompletedProcess], str]:
        try:
            result = subprocess.run(
                self.COMMAND + [board, str(size)],
                input=inp,
                capture_output=True,
                text=True,
                timeout=self.TIMEOUT
            )
        except subprocess.TimeoutExpired:
            return None, UNRESOLVED

        if result.returncode != 0 or result.stderr:
            return result, FAIL

        return result, PASS


# ---------------------------------------------------------------------------
# Simple grammar fuzzer
# ---------------------------------------------------------------------------

def simple_grammar_fuzzer(grammar: dict, start_symbol: str = START_SYMBOL,
                           max_nonterminals: int = 100, max_expansion_trials: int = 100) -> str:
    """
    Produce a string from *grammar*, starting at *start_symbol*.

    At each step, pick a random nonterminal still present in the term and
    replace it with a randomly chosen expansion. Expansions that would grow
    the term beyond *max_nonterminals* open nonterminals are rejected and
    retried, up to *max_expansion_trials* times, to avoid runaway recursion.
    """
    term = start_symbol
    expansion_trials = 0

    while nonterminals(term):
        symbol = random.choice(nonterminals(term))  # pick a nonterminal to expand
        expansion = random.choice(grammar[symbol])   # pick one of its expansions
        new_term = term.replace(symbol, expansion, 1)  # replace only the first occurrence

        if len(nonterminals(new_term)) < max_nonterminals:
            term = new_term          # expansion accepted: keep growing
            expansion_trials = 0     # reset trial counter after a successful step
        else:
            expansion_trials += 1    # expansion rejected: term got too big
            if expansion_trials >= max_expansion_trials:
                raise ExpansionError("Cannot expand " + repr(term))

    return term


# ---------------------------------------------------------------------------
# Board size helper
# ---------------------------------------------------------------------------

def board_size(board: str) -> int:
    """
    Derive the board side length from a board string.

    Strips the surrounding brackets, splits by "," to count the cells, and
    takes the integer square root of that count. Never raises: when the
    cell count is not a perfect square, the returned size simply does not
    match it (e.g. 5 cells -> 2), and that mismatch is deliberately passed
    through to MainCLI, which rejects it with an IllegalArgumentException --
    an expected rejection (see is_expected_rejection), not a bug.
    """
    cells = board.strip()[1:-1].split(",")
    n = len(cells)
    return isqrt(n)


# ---------------------------------------------------------------------------
# GrammarFuzzer
# ---------------------------------------------------------------------------

class GrammarFuzzer(Fuzzer):
    """
    Generates boards from a grammar

    Parameters
    ----------
    grammar : dict
        Grammar used to generate the board string
    """

    def __init__(self, grammar: dict = BOARD_GRAMMAR):
        self.grammar = grammar

    def fuzz(self) -> str:
        """Return a single board string generated from self.grammar."""
        return simple_grammar_fuzzer(self.grammar)

    def board_with_size(self) -> Tuple[str, int]:
        """
        Return a (board, size) pair for a freshly fuzzed board.

        size is derived via board_size()
        """
        board = self.fuzz()
        return board, board_size(board)


# ---------------------------------------------------------------------------
# Expected rejection check
# ---------------------------------------------------------------------------

def is_expected_rejection(result) -> bool:
    """
    True when the run failed only because MainCLI rejected the board for a
    size mismatch (cell count doesn't match size*size).

    This is the correct validation behavior of Board(String, int) for
    invalid input, not a bug: Board is expected to raise an
    IllegalArgumentException in this case, so we should not count it as FAIL.
    """
    if result is None:
        return False
    return (
        result.returncode != 0
        and "IllegalArgumentException" in result.stderr
        and "must match the actual size of the board" in result.stderr
    )


# ---------------------------------------------------------------------------
# Mutations
# ---------------------------------------------------------------------------

class BoardMutator:
    """
    Mutates the fuzzed-generated board by adding, modifying or deleting chars.
    """
    def mutate(self, board: str) -> str:
        if not board:
            return board
        mutation = random.choice([
            self.replace_char,
            self.delete_char,
            self.add_char,
        ])
        return mutation(board)


    def replace_char(self, board: str) -> str:
        if not board:
            return board
        position = random.randrange(len(board))
        char_for_replace = chr(random.randint(32, 126))  # ascii range that only contains chars, numbers and symbols
        return board[:position] + char_for_replace + board[position + 1:]


    def delete_char(self, board: str) -> str:
        if not board:
            return board
        position = random.randrange(len(board))
        return board[:position] + board[position + 1:]


    def add_char(self, board: str) -> str:
        if not board:
            return board
        position = random.randrange(len(board))
        char_to_insert = chr(random.randint(32, 126))
        return board[:position] + char_to_insert + board[position:]

# ---------------------------------------------------------------------------
# Expected mutations rejection check
# ---------------------------------------------------------------------------

def is_expected_mutation_rejection(result) -> bool:
    """
    Return True when MainCLI rejects a mutated board for an expected
    validation error.

    Mutations may produce malformed board syntax or invalid cell values.
    These inputs are correctly rejected by Board through exceptions such as
    NumberFormatException or IllegalArgumentException, so they should not be
    counted as unexpected failures.
    """

    if result is None or result.returncode == 0:
        return False

    stderr = result.stderr

    return (
        "NumberFormatException" in stderr
        or (
            "IllegalArgumentException" in stderr
            and (
                "must start with '[' and end with ']'" in stderr
                or "must match the actual size of the board" in stderr
                or "cannot end with a comma" in stderr
                or "Cell value must be a power of two" in stderr
                or "Board must have at least 1 number" in stderr
            )
        )
    )

# ---------------------------------------------------------------------------
# Mutation runner
# ---------------------------------------------------------------------------

def run_mutation_trials(trials: int = 100):
    runner = BoardCLIRunner()
    fuzzer = GrammarFuzzer()
    mutator = BoardMutator()

    expected_rejections = 0
    unexpected_failures = 0
    accepted = 0
    unresolved = 0

    for i in range(trials):
        original_board, size = fuzzer.board_with_size()
        mutated_board = mutator.mutate(original_board)

        result, outcome = runner.run("q\n", mutated_board, size)

        if outcome == UNRESOLVED:
            unresolved += 1
            status = "UNRESOLVED"
        elif outcome == FAIL and is_expected_mutation_rejection(result):
            expected_rejections += 1
            status = "EXPECTED REJECTION"
        elif outcome == FAIL:
            unexpected_failures += 1
            status = "UNEXPECTED FAILURE"
        else:
            accepted += 1
            status = "ACCEPTED"

        print(f"\n--- Trial {i + 1} | {status} ---")
        print(f"Original: {original_board}")
        print(f"Mutated : {mutated_board}")
        print(f"Size    : {size}")

        if result is not None and result.stderr:
            print(f"Stderr  : {result.stderr.strip()}")

    print("\nSummary:")
    print(f"Expected rejections: {expected_rejections}/{trials}")
    print(f"Unexpected failures: {unexpected_failures}/{trials}")
    print(f"Accepted: {accepted}/{trials}")
    print(f"Unresolved: {unresolved}/{trials}")


# ---------------------------------------------------------------------------
# Main: run the grammar fuzzer and report results
# ---------------------------------------------------------------------------

def main():
    runner = BoardCLIRunner()
    fuzzer = GrammarFuzzer()

    trials = 500
    outcomes = {PASS: 0, FAIL: 0, UNRESOLVED: 0}
    expected_rejections = 0  # counts FAILs reclassified as PASS (size mismatch)

    print(f"Running {trials} grammar fuzzing trials...\n")

    for i in range(trials):
        board, size = fuzzer.board_with_size()
        # input is only "q": we just want to see whether the board is
        # accepted at startup, no moves are needed
        result, outcome = runner.run("q\n", board, size)

        note = None
        if outcome == FAIL and is_expected_rejection(result):
            outcome = PASS
            expected_rejections += 1
            note = "expected rejection (size mismatch)"

        outcomes[outcome] += 1

        print(f"--- Trial {i + 1:>3} | {outcome} ---")
        print(f"Board : {board}")
        print(f"Size  : {size}")

        if note is not None:
            print(f"Note  : {note}")
        elif result is not None:
            print(f"Exit  : {result.returncode}")
            if result.stderr:
                print(f"Stderr: {result.stderr.strip()}")

        print()

    print("=" * 500)
    print("Summary:")
    for outcome, count in outcomes.items():
        print(f"  {outcome:<12}: {count}/{trials}")
    print(f"  (expected rejections counted as PASS: {expected_rejections})")

    print("\nRunning mutation trials...\n")
    run_mutation_trials(500)


if __name__ == "__main__":
    main()

