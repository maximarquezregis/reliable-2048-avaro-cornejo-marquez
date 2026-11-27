package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Trace-generating test suite used with Chicory/Daikon to collect long and diverse
 * executions across {@link Board}, {@link Board.Position}, and {@link Cell}.
 */
public class DaikonTestTrace {

    private static final int HIGH_CELL_VALUE = 4096;
    private static final int[] POWERS_OF_TWO = {
        0, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, Board.WINNING_VALUE, HIGH_CELL_VALUE
    };
    private static final int[] INVALID_CELL_VALUES = {
        -8, -1, 1, 3, 5, 6, 7, 9, 10, 12, 15, 24, 100, 1023, 2047
    };

    private static final int MAX_POSITION_COORD = 4;

    private static final int[] SIMULATED_GAME_SIZES = { 2, 3, 4, 5, 6, 7, 8 };
    private static final int SMALL_BOARD_THRESHOLD = 5;
    private static final int SMALL_BOARD_GAME_COUNT = 4;
    private static final int LARGE_BOARD_GAME_COUNT = 2;
    private static final int SMALL_BOARD_MAX_MOVES = 120;
    private static final int LARGE_BOARD_MAX_MOVES = 160;
    private static final int FULL_OBSERVATION_INTERVAL = 5;
    private static final int SEED_MULTIPLIER = 17;

    private static final int[] DIVERSE_BOARD_SIZES = { 2, 3, 4, 5, 6, 8, 10 };
    private static final int[] MERGE_VALUES = { 2, 4, 8, 16, 64, 256, 1024, Board.WINNING_VALUE };
    private static final int[] CLEAR_BOARD_MERGE_VALUES = { 0, 2, 8, 16, 64, 1024 };
    private static final int[] WINNING_PREP_MERGE_VALUES = { 0, 2, 8, 32, 1024, Board.WINNING_VALUE };
    private static final int[] DIVERSE_SEEDS = { -10, -1, 0, 2, 4, 5, Board.WINNING_VALUE };

    @Test
    public void testBoardSizeOutsideInferredValues() {
        Board board = new Board(6);

        assertEquals(6, board.getSize());
    }

    @Test
    public void testBoardSizeGreaterThanDefaultPlusOne() {
        Board board = new Board(10);

        assertTrue(board.getSize() > Board.DEFAULT_SIZE + 1);
    }

    @Test
    @Ignore("Excluded from Chicory trace: a 2048x2048 grid is too large for dynamic instrumentation")
    public void testBoardSizeCanReachWinningValue() {
        Board board = new Board(Board.WINNING_VALUE);

        assertEquals(Board.WINNING_VALUE, board.getSize());
    }

    @Test
    public void testScoreCanEqualWinningValue() {
        Board board = new Board(4, 1);

        clearBoard(board);
        board.setCell(0, 0, new Cell(1024));
        board.setCell(0, 1, new Cell(1024));

        board.moveLeft();

        assertEquals(Board.WINNING_VALUE, board.getScore());
    }

    @Test
    public void testScoreDoesNotNeedToBeDivisibleByBoardSize() {
        Board board = new Board(5, 1);

        clearBoard(board);
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));

        board.moveLeft();

        assertEquals(4, board.getScore());
    }

    @Test
    public void testCellOperationsAndInvariants() {
        Cell[] cells = new Cell[POWERS_OF_TWO.length];
        for (int index = 0; index < POWERS_OF_TWO.length; index++) {
            int value = POWERS_OF_TWO[index];
            cells[index] = new Cell(value);
            assertEquals(value, cells[index].getValue());
            assertEquals(value == 0, cells[index].isEmpty());
            assertTrue(cells[index].repOk());
            cells[index].hashCode();
            cells[index].toString();
        }

        // Exercise new Cell(0) instances besides Cell.EMPTY so value == 0 is not tied to the singleton reference
        Cell zeroCellA = new Cell(0);
        Cell zeroCellB = new Cell(0);
        assertTrue(zeroCellA.isEmpty());
        assertTrue(zeroCellA.repOk());
        assertTrue(zeroCellA.equals(zeroCellB));
        assertTrue(zeroCellA.equals(Cell.EMPTY));
        assertFalse(zeroCellA.canMergeWith(zeroCellB));
        assertFalse(zeroCellA.canMergeWith(Cell.EMPTY));
        assertFalse(Cell.EMPTY.canMergeWith(Cell.EMPTY));

        for (Cell cell : cells) {
            assertTrue(cell.equals(cell));
            assertTrue(cell.equals(new Cell(cell.getValue())));
            assertFalse(cell.equals(null));
            assertFalse(cell.equals("not-a-cell"));

            for (Cell otherCell : cells) {
                boolean hasSameValue = cell.getValue() == otherCell.getValue();
                assertEquals(hasSameValue, cell.equals(otherCell));

                boolean canMerge = cell.canMergeWith(otherCell);
                assertEquals(!cell.isEmpty() && hasSameValue, canMerge);
                if (canMerge) {
                    Cell merged = cell.mergeWith(otherCell);
                    assertEquals(cell.getValue() * 2, merged.getValue());
                    assertTrue(merged.repOk());
                } else {
                    try {
                        cell.mergeWith(otherCell);
                    } catch (IllegalArgumentException ignored) {
                        // Expected for empty or mismatched cells
                    }
                }
            }
        }

        // Exercise invalid values so Cell.isPowerOf2 observes false returns too
        for (int invalidValue : INVALID_CELL_VALUES) {
            try {
                new Cell(invalidValue);
            } catch (IllegalArgumentException ignored) {
                // Expected for negative values, 1, and non-powers of two
            }
        }
    }

    @Test
    public void testPositionOperationsAndInvariants() {
        // Exercise multiple (row, col) pairs so Daikon does not infer constant row/col values
        for (int row = 0; row <= MAX_POSITION_COORD; row++) {
            for (int col = 0; col <= MAX_POSITION_COORD; col++) {
                Board.Position position = new Board.Position(row, col);
                Board.Position equalPosition = new Board.Position(row, col);

                assertTrue(position.equals(position));
                assertTrue(position.equals(equalPosition));
                assertEquals(position.hashCode(), equalPosition.hashCode());
                position.toString();

                assertFalse(position.equals(null));
                assertFalse(position.equals("not-a-position"));
                assertFalse(position.equals(new Board.Position(row, col + 1)));
                assertFalse(position.equals(new Board.Position(row + 1, col)));
                assertFalse(position.equals(new Board.Position(row + 1, col + 1)));
            }
        }
    }

    @Test
    public void testLongSimulatedGamesAcrossBoardSizes() {
        // Simulate multiple full games across board sizes 2..8 so every method observes diverse sizes and scores
        for (int size : SIMULATED_GAME_SIZES) {
            int gameCount = (size <= SMALL_BOARD_THRESHOLD) ? SMALL_BOARD_GAME_COUNT : LARGE_BOARD_GAME_COUNT;
            int maxMoves = (size <= Board.DEFAULT_SIZE) ? SMALL_BOARD_MAX_MOVES : LARGE_BOARD_MAX_MOVES;

            for (int gameIndex = 1; gameIndex <= gameCount; gameIndex++) {
                Board board = createBoardForSimulation(size, gameIndex);
                observeBoard(board);

                for (int moveStep = 0; moveStep < maxMoves; moveStep++) {
                    applyDirectionalMove(board, (moveStep + gameIndex) % 4);

                    if (moveStep % FULL_OBSERVATION_INTERVAL == 0) {
                        observeBoard(board);
                    } else {
                        board.getScore();
                        board.getSize();
                        board.hasEmptyCells();
                        board.isFull();
                        board.isWinningBoard();
                        board.repOk();
                    }

                    if (board.isLosingBoard()) {
                        observeBoard(board);
                        break;
                    }
                }
            }
        }
    }

    @Test
    public void testDiverseWinningLosingFullAndHighScoreBoards() {
        // Exercise merges, scores > WINNING_VALUE, full/losing boards, and clearBoard() across sizes 2..10
        for (int size : DIVERSE_BOARD_SIZES) {
            for (int mergeValue : MERGE_VALUES) {
                Board board = new Board(size, mergeValue + size);
                clearBoard(board);
                board.setCell(0, 0, new Cell(mergeValue));
                board.setCell(0, 1, new Cell(mergeValue));
                board.moveLeft();

                if (mergeValue == Board.WINNING_VALUE) {
                    // Add a second merge (1024 + 1024) so score reaches 6144 (> WINNING_VALUE)
                    clearBoard(board);
                    board.setCell(0, 0, new Cell(Board.WINNING_VALUE));
                    board.setCell(1, 0, new Cell(1024));
                    board.setCell(1, 1, new Cell(1024));
                    board.moveLeft();
                }

                observeBoard(board);

                // Full checkerboard (no empty cells and no adjacent equal tiles -> losing board)
                fillCheckerboard(board, 2, 4);
                assertTrue(board.isFull());
                assertFalse(board.hasEmptyCells());
                assertTrue(board.isLosingBoard());
                assertFalse(board.moveLeft());
                assertFalse(board.moveRight());
                assertFalse(board.moveUp());
                assertFalse(board.moveDown());
                observeBoard(board);

                // Full board that still has one mergeable pair (isFull == true, isLosingBoard == false)
                board.setCell(size - 1, size - 2, new Cell(8));
                board.setCell(size - 1, size - 1, new Cell(8));
                assertTrue(board.isFull());
                assertFalse(board.hasEmptyCells());
                assertFalse(board.isLosingBoard());
                observeBoard(board);
            }

            if (size >= Board.DEFAULT_SIZE) {
                for (int clearMergeValue : CLEAR_BOARD_MERGE_VALUES) {
                    Board clearTarget = new Board(size, clearMergeValue + 99);
                    clearBoard(clearTarget);
                    if (clearMergeValue > 0) {
                        clearTarget.setCell(0, 0, new Cell(clearMergeValue));
                        clearTarget.setCell(0, 1, new Cell(clearMergeValue));
                        clearTarget.moveLeft();
                    }
                    clearTarget.clearBoard();
                    observeBoard(clearTarget);
                }
            }
        }

        // Winning boards with diverse scores (0, 4, 16, 64, 2048, 4096) and cell values above WINNING_VALUE
        for (int index = 0; index < WINNING_PREP_MERGE_VALUES.length; index++) {
            int size = 2 + (index % 5);
            int prepMergeValue = WINNING_PREP_MERGE_VALUES[index];
            Board winningBoard = new Board(size, index);
            clearBoard(winningBoard);
            if (prepMergeValue > 0) {
                winningBoard.setCell(0, 0, new Cell(prepMergeValue));
                winningBoard.setCell(0, 1, new Cell(prepMergeValue));
                winningBoard.moveLeft();
            }
            winningBoard.setCell(size - 1, size - 1, new Cell(Board.WINNING_VALUE));
            assertTrue(winningBoard.isWinningBoard());
            observeBoard(winningBoard);

            winningBoard.setCell(0, 0, new Cell(HIGH_CELL_VALUE));
            assertEquals(HIGH_CELL_VALUE, winningBoard.getCell(0, 0).getValue());
        }

        // Reach score == WINNING_VALUE and move in all four directions while score == WINNING_VALUE
        for (int directionIndex = 0; directionIndex < 4; directionIndex++) {
            Board board = new Board(Board.DEFAULT_SIZE, directionIndex);
            clearBoard(board);
            board.setCell(1, 1, new Cell(1024));
            boolean isHorizontalMove = (directionIndex == 0 || directionIndex == 2);
            if (isHorizontalMove) {
                board.setCell(1, 2, new Cell(1024));
            } else {
                board.setCell(2, 1, new Cell(1024));
            }
            assertTrue(applyDirectionalMove(board, directionIndex));
            assertEquals(Board.WINNING_VALUE, board.getScore());

            board.setCell(3, 3, new Cell(2));
            board.moveUp();
            board.moveRight();
            board.moveDown();
            board.moveLeft();
        }

        // Losing board with score == 0 across all four no-op move directions
        Board zeroScoreLosingBoard = new Board(Board.DEFAULT_SIZE, 0);
        fillCheckerboard(zeroScoreLosingBoard, 2, 4);
        assertEquals(0, zeroScoreLosingBoard.getScore());
        assertFalse(zeroScoreLosingBoard.moveUp());
        assertFalse(zeroScoreLosingBoard.moveDown());
        assertFalse(zeroScoreLosingBoard.moveLeft());
        assertFalse(zeroScoreLosingBoard.moveRight());
        observeBoard(zeroScoreLosingBoard);

        // Diverse seeds (negative, zero, equal to size, equal to WINNING_VALUE) for Board(int, int)
        for (int seed : DIVERSE_SEEDS) {
            int size = (seed >= 2 && seed <= 5) ? seed : Board.DEFAULT_SIZE;
            Board seededBoard = new Board(size, seed);
            observeBoard(seededBoard);
        }

        // Exercise Board(String, int) across sizes 1..5 (size 1 lowers the observed grid size bound to >= 1)
        Board singleEmptyCellBoard = new Board("[0]", 1);
        assertTrue(singleEmptyCellBoard.hasEmptyCells());
        assertFalse(singleEmptyCellBoard.isFull());
        assertFalse(singleEmptyCellBoard.moveLeft());
        assertFalse(singleEmptyCellBoard.moveRight());
        assertFalse(singleEmptyCellBoard.moveUp());
        assertFalse(singleEmptyCellBoard.moveDown());
        observeBoard(singleEmptyCellBoard);

        Board singleFullCellBoard = new Board("[2]", 1);
        assertTrue(singleFullCellBoard.isFull());
        assertTrue(singleFullCellBoard.isLosingBoard());
        observeBoard(singleFullCellBoard);

        Board singleWinningCellBoard = new Board("[2048]", 1);
        assertTrue(singleWinningCellBoard.isWinningBoard());
        observeBoard(singleWinningCellBoard);

        Board stringBoard2x2 = new Board("[2,4,8,16]", 2);
        observeBoard(stringBoard2x2);
        Board stringBoard3x3 = new Board("[0,2,4,8,16,32,64,128,256]", 3);
        observeBoard(stringBoard3x3);
        Board stringBoard4x4 = new Board("[2,2,4,4,8,8,16,16,32,32,64,64,128,128,256,256]", 4);
        stringBoard4x4.moveLeft();
        observeBoard(stringBoard4x4);
        Board stringBoard5x5 = new Board("[2,0,0,0,0,0,4,0,0,0,0,0,8,0,0,0,0,0,16,0,0,0,0,0,32]", 5);
        stringBoard5x5.moveDown();
        observeBoard(stringBoard5x5);
    }

    private Board createBoardForSimulation(int size, int gameIndex) {
        if (size == Board.DEFAULT_SIZE && gameIndex == 1) {
            return new Board();
        }
        if (gameIndex % 2 == 0) {
            return new Board(size, gameIndex * SEED_MULTIPLIER);
        }
        return new Board(size);
    }

    private boolean applyDirectionalMove(Board board, int directionIndex) {
        switch (directionIndex) {
            case 0:
                return board.moveLeft();
            case 1:
                return board.moveUp();
            case 2:
                return board.moveRight();
            default:
                return board.moveDown();
        }
    }

    private void observeBoard(Board board) {
        int size = board.getSize();
        board.getScore();
        board.tileAmount();
        board.getEmptyPositions();
        board.hasEmptyCells();
        board.isFull();
        board.isWinningBoard();
        board.isLosingBoard();
        board.repOk();
        board.hashCode();
        board.toString();

        board.getCell(0, 0);
        board.getCell(size - 1, size - 1);

        Board copy = new Board(board);
        assertTrue(board.equals(board));
        assertTrue(board.equals(copy));
        assertFalse(board.equals(null));
        assertFalse(board.equals("not-a-board"));

        Board differentBoard = (size == 1)
                ? new Board("[4]", 1)
                : new Board(size, size + 7);
        board.equals(differentBoard);
    }

    /**
     * Fills the board in a checkerboard pattern alternating two distinct values so no
     * two orthogonally adjacent cells are equal (producing a full losing board).
     */
    private void fillCheckerboard(Board board, int evenTileValue, int oddTileValue) {
        int size = board.getSize();
        Cell evenCell = new Cell(evenTileValue);
        Cell oddCell = new Cell(oddTileValue);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                boolean isEvenSquare = (row + col) % 2 == 0;
                board.setCell(row, col, isEvenSquare ? evenCell : oddCell);
            }
        }
    }

    private void clearBoard(Board board) {
        for (int row = 0; row < board.getSize(); row++) {
            for (int col = 0; col < board.getSize(); col++) {
                board.setCell(row, col, Cell.EMPTY);
            }
        }
    }
}
