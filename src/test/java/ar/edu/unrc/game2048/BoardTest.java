package ar.edu.unrc.game2048;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
import ar.edu.unrc.game2048.Board.Position;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    void clearBoard(Board b) {
        // Clear board to a controlled state
        for (int r = 0; r < b.getSize(); r++) {
            for (int c = 0; c < b.getSize(); c++) {
                b.setCell(r, c, Cell.EMPTY);
            }
        }
    }

    /**
     * Board sizes used by parameterized tests
     */
    static int[] sizes() {
        return new int[]{4, 5, 6, 8, 10, 13, 15, 20, 25, 30, 40, 50, 100, 200, 500, 1000};
    }

    /**
     * Fill a board with 2s and 4s
     */
    private void fillCheckerboard(Board b) {
        int size = b.getSize();
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                int value = ((r + c) % 2 == 0) ? 2 : 4;
                b.setCell(r, c, new Cell(value));
            }
        }
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void moveLeftChangeTheBoardTest(int size) {
        Board b = new Board(size);
        clearBoard(b);
        b.setCell(0, size - 1, new Cell(2));
        b.setCell(1, size - 2, new Cell(2));
        assertTrue(b.moveLeft());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void getEmptyPositionsReturnsCorrectListTest(int size) {
        Board b = new Board(size);
        assertTrue(b.getEmptyPositions().size() > 0);

        // Clear the board and see if it is empty
        clearBoard(b);
        assertEquals(size * size, b.getEmptyPositions().size());
    }

    @Test
    void setCellValueTest() {
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);
        assertTrue(board.getCell(0, 0).getValue() == 2);
    }

    @Test
    void setCellValueNullCellThrowsException() {
        // If the cell is null, the `validatePosition` method, used internally by the `setCell` method, throws an exception
        assertThrows(IllegalArgumentException.class, () -> {
            board.setCell(0, 0, null);
        });
    }

    /**
     * Tests the `setCell` method with an invalid position.
     *
     * This test ensures that the `setCell` method throws an `IndexOutOfBoundsException`
     * when attempting to set a cell at an invalid position.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    void setCellWithInvalidPosition(int size) {
        Board b = new Board(size);
        IndexOutOfBoundsException exception = assertThrows(
                IndexOutOfBoundsException.class,
                () -> b.setCell(-1, -1, new Cell(2))
        );

        assertEquals(
                String.format(
                        "Position (%d, %d) is out of bounds for board size %d",
                        -1, -1, b.getSize()
                ),
                exception.getMessage()
        );
    }

    @Test
    void getScoreTest() {
        assertTrue(board.getScore() >= 0);
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void equalsTest(int size) {
        Board b = new Board(size);
        Board anotherBoard = new Board(b);
        assertTrue(b.equals(anotherBoard));
    }

    @Test
    void equalsSameReferenceTest() {
        assertTrue(board.equals(board));
    }

    @Test
    void equalsDifferentClassTest() {
        assertFalse(board.equals(new Object()));
    }

    @Test
    void equalsNullTest() {
        assertFalse(board.equals(null));
    }

    @Test
    void equalsDifferentSizeBoardTest(){
        Board differentSizeBoard = new Board(5);
        assertFalse(board.equals(differentSizeBoard));
    }

    // Test for Position class
    @Test
    void hashCodeTest() {
        Position pos1 = new Position(1, 2);
        Position pos2 = new Position(1, 2);
        Position pos3 = new Position(1, 1);
        assertEquals(pos1.hashCode(), pos2.hashCode());
        assertNotEquals(pos3.hashCode(), pos1.hashCode());
    }

    @Test
    public void testIsWinningBoard() {
        Cell c = new Cell(2048);
        board.setCell(0, 0, c);
        assertTrue(board.isWinningBoard());
    }

    @Test
    public void testNotIsWinningBoard() {
        assertFalse(board.isWinningBoard());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testGetSizeEqual(int size) {
        Board b = new Board(size);
        assertEquals(b.getSize(), size);
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testGetSizeNotEqual(int size) {
        Board b = new Board(size);
        assertNotEquals(b.getSize(), size + 1);
    }

    // Board constructor tests

    @Test
    public void testBoardConstructorSizeNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Board b = new Board(-1);
        });
    }

    @Test
    public void testBoardConstructorSizeZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Board b = new Board(0);
        });
    }

    @Test
    public void testGetCellValidPosition() {
        clearBoard(board);
        Cell c = new Cell(8);
        board.setCell(0, 0, c);
        assertTrue(board.getCell(0, 0).getValue() == 8);
        assertFalse(board.getCell(0, 1).getValue() == 8);
    }

    @Test
    public void testGetCellNotValidRowNegative() {
        // If the row is out of bounds, the `validatePosition` method,
        // used internally by the `getCell` method, throws an exception
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.getCell(-1, 0);
        });
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testGetCellNotValidRowSize(int size) {
        // If the row is out of bounds, the `validatePosition` method,
        // used internally by the `getCell` method, throws an exception
        Board b = new Board(size);
        IndexOutOfBoundsException exception = assertThrows(
            IndexOutOfBoundsException.class,
            () -> b.getCell(b.getSize(), 0)
        );

        assertEquals(
            String.format(
                "Position (%d, %d) is out of bounds for board size %d",
                b.getSize(), 0, b.getSize()
            ),
            exception.getMessage()
        );
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testGetCellNotValidRowGreaterSize(int size) {
        // If the row is out of bounds, the `validatePosition` method,
        // used internally by the `getCell` method, throws an exception
        Board b = new Board(size);
        IndexOutOfBoundsException exception = assertThrows(
            IndexOutOfBoundsException.class,
            () -> b.getCell(b.getSize()+1, 0)
        );

        assertEquals(
            String.format(
                "Position (%d, %d) is out of bounds for board size %d",
                b.getSize()+1, 0, b.getSize()
            ),
            exception.getMessage()
        );
    }


    @ParameterizedTest
    @MethodSource("sizes")
    public void testGetCellNotValidColSize(int size) {
        // If the column is out of bounds, the `validatePosition` method,
        // used internally by the `getCell` method, throws an exception
        Board b = new Board(size);
        IndexOutOfBoundsException exception = assertThrows(
            IndexOutOfBoundsException.class,
            () -> b.getCell(0, b.getSize())
        );

        assertEquals(
            String.format(
                "Position (%d, %d) is out of bounds for board size %d",
                0, b.getSize(), b.getSize()
            ),
            exception.getMessage()
        );
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testGetCellNotValidColGreaterSize(int size) {
        // If the column is out of bounds, the `validatePosition` method,
        // used internally by the `getCell` method, throws an exception
        Board b = new Board(size);
        IndexOutOfBoundsException exception = assertThrows(
            IndexOutOfBoundsException.class,
            () -> b.getCell(0, b.getSize()+1)
        );

        assertEquals(
            String.format(
                "Position (%d, %d) is out of bounds for board size %d",
                0, b.getSize()+1, b.getSize()
            ),
            exception.getMessage()
        );
    }


    @Test
    public void testGetCellNotValidColNegative() {
        // If the column is out of bounds, the `validatePosition` method,
        // used internally by the `getCell` method, throws an exception
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.getCell(0, -1);
        });
    }


    @Test
    public void testToStringPosition() {
        Position p = new Position(0, 2);
        assertEquals(p.toString(), "(0, 2)");
    }

    // MOVE UP TESTS
    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveUpChangeTheBoard(int size) {
        Board b = new Board(size);
        clearBoard(b);
        b.setCell(size - 2, 0, new Cell(2));
        b.setCell(size - 1, 1, new Cell(4));
        assertTrue(b.moveUp());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveUpMovesTileFromBottomToTop(int size) {
        Board b = new Board(size);
        clearBoard(b);

        b.setCell(size - 1, size - 1, new Cell(2));

        boolean moved = b.moveUp();

        assertTrue(moved);
        assertEquals(2, b.getCell(0, size - 1).getValue());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveUpMovesTileFromBottomToTopNotMoved(int size) {
        Board b = new Board(size);
        clearBoard(b);

        b.setCell(0, 0, new Cell(2));

        boolean moved = b.moveUp();

        assertFalse(moved);
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveUpMergesTilesAndIncrementsScore(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place two equal tiles so they should merge when moved up
        b.setCell(size - 2, 0, new Cell(2));
        b.setCell(size - 1, 0, new Cell(2));

        boolean moved = b.moveUp();

        // After merging, top cell should be 4 and score increased by 4
        assertTrue(moved);
        assertEquals(4, b.getCell(0, 0).getValue());
        assertTrue(b.getScore() >= 4);
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveUpDoesNotMergeDifferentTiles(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place two different tiles in the same column
        b.setCell(size - 2, 0, new Cell(2));
        b.setCell(size - 1, 0, new Cell(32));

        boolean moved = b.moveUp();

        // The tiles should not merge, they should remain in their positions
        assertTrue(moved);
        assertEquals(2, b.getCell(0, 0).getValue());
        assertEquals(32, b.getCell(1, 0).getValue());
    }

    // Move DOWN tests
    @ParameterizedTest
    @MethodSource("sizes")
    void moveDownChangeTheBoardTest(int size) {
        Board b = new Board(size);
        clearBoard(b);
        b.setCell(0, 0, new Cell(2));
        b.setCell(1, 1, new Cell(4));
        assertTrue(b.moveDown());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void moveDownMovesTileFromTopToBottomTest(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place a single tile at the top of the first column
        b.setCell(0, 0, new Cell(2));

        boolean moved = b.moveDown();
        // Expect the tile to have moved to the bottom of the column
        assertTrue(moved);
        assertEquals(2, b.getCell(b.getSize() - 1, 0).getValue());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void moveDownMergesTilesAndIncrementsScoreTest(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place two equal tiles so they should merge when moved down
        b.setCell(0, 0, new Cell(2));
        b.setCell(1, 0, new Cell(2));

        boolean moved = b.moveDown();

        // After merging, bottom cell should be 4 and score increased by 4
        assertTrue(moved);
        assertEquals(4, b.getCell(b.getSize() - 1, 0).getValue());
        assertTrue(b.getScore() >= 4);
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void moveDownDoesNotMergeDifferentTilesTest(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place two different tiles in the same column
        b.setCell(0, 0, new Cell(2));
        b.setCell(1, 0, new Cell(4));

        boolean moved = b.moveDown();

        // The tiles should not merge, they should remain in their positions
        assertTrue(moved);
        assertEquals(2, b.getCell(b.getSize() - 2, 0).getValue());
        assertEquals(4, b.getCell(b.getSize() - 1, 0).getValue());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveDownMovesTileFromTopToBottomNotMoved(int size) {
        Board b = new Board(size);
        clearBoard(b);

        b.setCell(size - 1, 1, new Cell(2));

        boolean moved = b.moveDown();

        assertFalse(moved);
    }

    // Move RIGHT tests
    @ParameterizedTest
    @MethodSource("sizes")
    void moveRightChangeTheBoardTest(int size) {
        Board b = new Board(size);
        clearBoard(b);
        b.setCell(0, 0, new Cell(2));
        b.setCell(1, 1, new Cell(4));
        assertTrue(b.moveRight());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void moveRightTileFromLeftToRightTest(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place a tile in a cell
        b.setCell(0, 0, new Cell(2));

        // Move the board right
        b.moveRight();

        // Check that the tile has moved to the rightmost position
        assertEquals(2, b.getCell(0, b.getSize() - 1).getValue());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    void moveRightMergesTilesAndIncrementsScoreTest(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place two equal tiles so they should merge when moved left
        b.setCell(0, 0, new Cell(2));
        b.setCell(0, 1, new Cell(2));

        // Move the board right
        b.moveRight();

        // After merging, the rightmost cell should be 4 and score increased by 4
        assertEquals(4, b.getCell(0, b.getSize() - 1).getValue());

    }
    @ParameterizedTest
    @MethodSource("sizes")
    void moveRightDoesNotMergeDifferentTilesTest(int size) {
        Board b = new Board(size);
        clearBoard(b);

        // Place two different tiles next to each other
        b.setCell(0, 0, new Cell(2));
        b.setCell(0, 1, new Cell(4));

        // Move the board right
        b.moveRight();

        // The tiles should not merge, they should remain in their positions
        assertEquals(2, b.getCell(0, b.getSize() - 2).getValue());
        assertEquals(4, b.getCell(0, b.getSize() - 1).getValue());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveRightMovesTileFromLeftToRightNotMoved(int size) {
        Board b = new Board(size);
        clearBoard(b);

        b.setCell(1, size - 1, new Cell(2));

        boolean moved = b.moveRight();

        assertFalse(moved);
    }

    /**
     * Tests the moveLeft method.
     * Verifies that the total number of non-empty cells matches the expected,
     * that is the initial tiles plus the newly random generated tile.
     */
    @Test
    public void testMoveLeftPlusNewCellAmount() {
        Board grid = new Board();
        grid.clearBoard();

        grid.setCell(1, 1, new Cell(2));
        grid.setCell(3, 2, new Cell(4));
        grid.setCell(0, 3, new Cell(8));


        int tileAmountExpected = 4; // the three that already exists plus the new random tile
        grid.moveLeft();

        assertEquals(tileAmountExpected, grid.tileAmount());
    }

    /**
     * Tests the moveLeft method.
     * Verifies that the total number of not empty cells matches the expected, that
     * is the initial tiles plus the newly random generated tile minus one (because
     * two tiles were merged).
     */
    @Test
    public void testMoveLeftWithMergeAmount() {
        Board grid = new Board();
        grid.clearBoard();

        grid.setCell(1, 1, new Cell(2));
        grid.setCell(1, 2, new Cell(2)); // this cell should merge with the upper one
        grid.setCell(0, 3, new Cell(8));

        int tileAmountExpected = 3;
        grid.moveLeft();

        assertEquals(tileAmountExpected, grid.tileAmount());
    }

    @ParameterizedTest
    @MethodSource("sizes")
    public void testMoveLeftMovesTileFromRightToLeftNotMoved(int size) {
        Board b = new Board(size);
        clearBoard(b);

        b.setCell(1, 0, new Cell(2));

        boolean moved = b.moveLeft();

        assertFalse(moved);
    }

    @Test
    public void testNotEmptyPositions(){
        assertThrows(IllegalStateException.class, () -> {
            Board b = new Board(1);
        });
    }

    /**
     * Tests the isLosingBoard method when the board contains only empty cells.
     */
    @Test
    public void testIsLosingBoardWithEmptyCells() {
        Board grid = new Board();

        assertFalse(grid.isLosingBoard());
    }

    /**
     * Tests the isLosingBoard method when the board is full and another move can't be made.
     * Uses a 2/4 checkerboard pattern (value = ((r + c) % 2 == 0) ? 2 : 4) so that no
     * horizontal or vertical neighbors share the same value, regardless of board size
     * (avoids overflowing powers of two on larger boards).
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testIsLosingBoardWithFullBoard(int size) {
        Board grid = new Board(size);
        clearBoard(grid);

        fillCheckerboard(grid);

        assertTrue(grid.isLosingBoard());
    }

    /**
     * Tests the isLosingBoard method when the board is full but has a mergeable pair.
     * Starts from the same checkerboard pattern as testIsLosingBoardWithFullBoard and
     * overwrites one cell so it matches its horizontal neighbor, creating a merge
     * opportunity; isLosingBoard should then return false.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testIsLosingBoardWithNotFullBoard(int size) {
        Board grid = new Board(size);
        clearBoard(grid);

        fillCheckerboard(grid);

        // Overwrite a cell so it matches its horizontal neighbor, creating a mergeable pair
        Cell neighbor = grid.getCell(0, size - 2);
        grid.setCell(0, size - 1, neighbor);

        assertFalse(grid.isLosingBoard());
    }

    /**
     * Tests the isLosingBoard method when the board is full but has a mergeable pair.
     * Mirrors testIsLosingBoardWithNotFullBoard but creates the mergeable pair vertically
     * instead of horizontally.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testIsLosingBoardWithNotFullBoard2(int size) {
        Board grid = new Board(size);
        clearBoard(grid);

        fillCheckerboard(grid);

        // Overwrite a cell so it matches its vertical neighbor, creating a mergeable pair
        Cell neighbor = grid.getCell(size - 2, 0);
        grid.setCell(size - 1, 0, neighbor);

        assertFalse(grid.isLosingBoard());
    }

    /**
     * Tests the hasEmptyCells method with a grid with empty cells.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testHasEmptyCellsWithEmptyCells(int size) {
        Board grid = new Board(size);
        assertTrue(grid.hasEmptyCells());
    }

    /**
     * Tests the hasEmptyCells method with a grid without empty cells.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testHasEmptyCellsWithoutEmptyCells(int size) {
        Board grid = new Board(size);
        Cell cell = new Cell(2);

        for (int r = 0; r < grid.getSize(); r++) {
            for (int c = 0; c < grid.getSize(); c++) {
                grid.setCell(r, c, cell);
            }
        }

        assertFalse(grid.hasEmptyCells());
    }

    /**
     * Tests the isFull method with a board that contains empty cells.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testIsFullWithEmptyCells(int size){
        Board grid = new Board(size);
        assertFalse(grid.isFull());
    }

    /**
     * Tests the isFull method with a board that is full.
     */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testIsFull(int size){
        Board grid = new Board(size);
        Cell cell = new Cell(2);

        for (int r = 0; r < grid.getSize(); r++) {
            for (int c = 0; c < grid.getSize(); c++) {
                grid.setCell(r, c, cell);
            }
        }

        assertTrue(grid.isFull());
    }

    /**
     * Verifies the hashcode method.
     *
     * The test creates a board, which is a copy of another board, and compares their hashcodes.
     * Must be equal.
    */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testHashcodeBoardEquals(int size) {
        Board b = new Board(size);
        Board b1 = new Board(b);
        assertEquals(b1.hashCode(), b.hashCode()); // b1 is a copy of b, so their hashcodes should be equal
    }

    /**
     * Verifies the hashcode method.
     *
     * The test creates a board, which is a copy of another board, and compares their hashcodes.
     * Then, it modifies the copy and checks that their hashcodes are not equal anymore.
    */
    @ParameterizedTest
    @MethodSource("sizes")
    public void testHashcodeBoardNotEqual(int size) {
        Board b = new Board(size);
        Board b2 = new Board(b);
        boolean moved = b2.moveUp(); // If, by coincidence, the pieces were already on row 0, board b would remain the same, and the hashcodes would also be the same.
        if (moved) {
            assertNotEquals(b2.hashCode(), b.hashCode());
        } else {
            // If the moveUp() didn't change the board, we can force a change by adding a new cell
            b2.setCell(b.getSize() - 1, b.getSize() - 1, new Cell(2));
            assertNotEquals(b2.hashCode(), b.hashCode());
        }
    }

    /**
     * Verifies the string representation of the board.
     *
     * The test creates a new blank board, adds two cells in specified positions,
     * and compares with an example string representation of that board.
     */
    @Test
    public void testToStringEquals() {
        String expected = "Score: 0\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |    2|     |    2|\n" +
                "+-----+-----+-----+-----+\n";

        Board grid = new Board();
        grid.clearBoard();
        Cell cell = new Cell(2);

        grid.setCell(3, 1, cell);
        grid.setCell(3, 3, cell);

        assertEquals(expected, grid.toString());
    }

    /**
     * Verifies the string representation of the board.
     *
     * The test creates a new blank board, adds two cells in specified positions,
     * and compares with an example string representation of another board (they shouldn't
     * be equal).
     */
    @Test
    public void testToStringNotEquals() {
        String notExpected = "Score: 0\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |    2|     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |    2|\n" +
                "+-----+-----+-----+-----+\n";

        Board grid = new Board();
        grid.clearBoard();
        Cell cell = new Cell(2);

        grid.setCell(3, 1, cell);
        grid.setCell(3, 3, cell);

        assertNotEquals(notExpected, grid.toString());
    }

    /**
     * Verifies the `repOk` method of the `Board` class.
     *
     * This test ensures that the internal representation of a `Board` object
     * satisfies its class invariants.
     */
    @Test
    public void testRepOk() {
        Board grid = new Board();
        grid.clearBoard();

        int gridSize = grid.getSize();

        ArrayList<Cell> list = new ArrayList<>(gridSize);
        list.add(new Cell(2));
        list.add(new Cell(4));
        list.add(new Cell(8));
        list.add(new Cell(16));

        for (int c = 0; c < gridSize; c++) {
            grid.setCell(0, c, list.get(c));
            grid.setCell(2, c, list.get(c));
        }

        for (int c = 0; c < gridSize; c++) {
            grid.setCell(1, c, list.get(gridSize - c - 1));
            grid.setCell(3, c, list.get(gridSize - c - 1));
        }

        grid.setCell(2,3, Cell.EMPTY);

        assertTrue(grid.repOk());
    }

    /**
     * Tests the equals method of the `Board.Position` class.
     *
     * This test verifies that method equals with two Positions with equal values return true;
     */
    @Test
    public void testEqualsPositions() {
        Board.Position p1 = new Board.Position(0, 1);
        Board.Position p2 = new Board.Position(0, 1);

        assertTrue(p1.equals(p2));
    }

    /**
     * Tests the equals method of the `Board.Position` class.
     *
     * This test verifies method equals with the same Position returns true;
     */
    @Test
    public void testSamePosition() {
        Board.Position p1 = new Board.Position(0, 1);

        assertTrue(p1.equals(p1));
    }

    /**
     * Tests the equals method of the `Board.Position` class.
     *
     * This test verifies method equals with a null value returns false;
     */
    @Test
    public void testNullPosition() {
        Board.Position p1 = new Board.Position(0, 1);

        assertFalse(p1.equals(null));
    }

    /**
     * Tests the equals method of the `Board.Position` class.
     *
     * This test verifies method equals with a different class value returns false;
     */
    @Test
    public void testDifferentClassPosition() {
        Board.Position p1 = new Board.Position(0, 1);
        Integer n = 8;

        assertFalse(p1.equals(n));
    }

    /**
     * Tests the equals method of the `Board.Position` class.
     *
     * This test verifies that method equals with two Positions with not equal values return false;
     */
    @Test
    public void testEqualsDifferentPositions() {
        Board.Position p1 = new Board.Position(0, 1);
        Board.Position p2 = new Board.Position(2, 3);

        assertFalse(p1.equals(p2));
    }

    /**
     * Tests the equals method of the `Board.Position` class.
     *
     * This test verifies that method equals with two Positions with not equal values return false;
     */
    @Test
    public void testEqualsDifferentPositions2() {
        Board.Position p1 = new Board.Position(0, 1);
        Board.Position p2 = new Board.Position(0, 3);

        assertFalse(p1.equals(p2));
    }

    @Test
    public void testConstructorBoardWithSeed() {
        Board board = new Board(DEFAULT_SIZE, 0);
        assertEquals(board.getCell(1, DEFAULT_SIZE - 1).getValue(), 2);
    }

    /**
     * Tests the constructor of the `Board` class with an invalid size.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when a zero size is provided.
     *
     * @throws IllegalArgumentException if the size is zero
     */
    @Test
    public void testConstructorBoardWithSeedNotValidZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(0, 0);
        });
    }

    /**
     * Tests the constructor of the `Board` class with an invalid size.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when a negative size is provided.
     *
     * @throws IllegalArgumentException if the size is negative
     */
    @Test
    public void testConstructorBoardWithSeedNotValidZNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(-1, 0);
        });
    }

    /**
     * Tests the constructor of the `Board` class with a string representation.
     *
     * This test verifies that the constructor correctly creates a board from a string representation.
     */
    @Test
    public void testConstructorBoardWithStringRepresentation() {
        String boardString = "[0,0,0,0,4,2,0,0,0,0,0,0,2,2,2,2]";
        int size = DEFAULT_SIZE;
        Board board = new Board(boardString, size);
        assertEquals(board.toString(),
        "Score: 0\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|    4|    2|     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|    2|    2|    2|    2|\n" +
                "+-----+-----+-----+-----+\n");
    }

    /**
     * Tests the constructor of the `Board` class with a string representation of all zeros.
     *
     * This test verifies that the constructor correctly creates a board from a string representation of all zeros.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationZero() {
        String boardString = "[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]";
        int size = DEFAULT_SIZE;
        Board board = new Board(boardString, size);
        assertEquals(board.toString(),
        "Score: 0\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n" +
                "|     |     |     |     |\n" +
                "+-----+-----+-----+-----+\n");
    }

    /**
     * Tests the constructor of the `Board` class with an invalid size.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when a negative size is provided.
     *
     * @throws IllegalArgumentException if the size is negative
     */
    @Test
    public void testConstructorBoardWithStringRepresentationInvalidSize() {
        String boardString = "[2,0,0,2,0,0,4,0,0,2,0,4,0,0,0,0]";
        int size = -1;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
     * Tests the constructor of the `Board` class with a string representation that doesn't match the size.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when the string representation doesn't match the size.
     *
     * @throws IllegalArgumentException if the string representation doesn't match the size
     */
    @Test
    public void testConstructorBoardWithStringRepresentationNotMatch() {
        String boardString = "[2,0,0,2,0,0,4,0,0,2,0,4,0,0,0,0]";
        int size = 14;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
    * Tests the constructor of the `Board` class with a string representation that has an invalid comma.
    *
    * This test verifies that the constructor throws an `IllegalArgumentException` when the string representation has an invalid comma.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationInvalidComma() {
        String boardString = "[2,0,0,2,0,0,4,0,0,2,0,4,0,0,0,0,]";
        int size = 4;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
    * Tests the constructor of the `Board` class with a string representation that has an invalid double comma.
    *
    * This test verifies that the constructor throws an `NumberFormatException` when the string representation has an invalid double comma.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationInvalidDoubleComma() {
        String boardString = "[2,0,0,2,0,0,4,0,0,2,0,4,0,0,0,,0]";
        int size = 4;
        assertThrows(NumberFormatException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
     * Tests the constructor of the `Board` class with a string representation that is missing the closing bracket.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when the string representation is missing the closing bracket.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationWithoutEndBracket() {
        String boardString = "[2,0,0,2,0,0,4,0,0,2,0,4,0,0,0";
        int size = 4;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
     * Tests the constructor of the `Board` class with a string representation that is missing the closing bracket.
     *
     * This test verifies that the constructor throws an `IllegalStateException` when the string representation is missing the closing bracket.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationWithoutBeginBracket() {
        String boardString = "2,0,0,2,0,0,4,0,0,2,0,4,0,0,0]";
        int size = 4;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
     * Tests the constructor of the `Board` class with a string representation that is missing the closing bracket.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when the string representation is missing the closing bracket.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationWithAnInvalidNumber() {
        String boardString = "2,0,0,2,0,0,4,0,0,2,0,4,0,0,0,8]";
        int size = 4;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }

    /**
     * Tests the constructor of the `Board` class with a string representation that is empty.
     *
     * This test verifies that the constructor throws an `IllegalArgumentException` when the string representation is empty.
     */
    @Test
    public void testConstructorBoardWithStringRepresentationEmpty() {
        String boardString = "[]";
        int size = 4;
        assertThrows(IllegalArgumentException.class, () -> {
            Board board = new Board(boardString, size);
        });
    }
}
