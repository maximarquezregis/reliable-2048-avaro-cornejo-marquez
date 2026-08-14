package ar.edu.unrc.game2048;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unrc.game2048.Board.Position;
import static ar.edu.unrc.game2048.Board.DEFAULT_SIZE;

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

    @Test
    void moveLeftChangeTheBoardTest() {
        assertTrue(board.moveLeft());
    }

    @Test
    void getEmptyPositionsReturnsCorrectListTest() {
        assertTrue(board.getEmptyPositions().size() > 0);

        // Clear the board and see if it is empty
        clearBoard(board);
        assertEquals(16, board.getEmptyPositions().size());
    }

    @Test
    void setCellValueTest() {
        Cell cell = new Cell(2);
        board.setCell(0, 0, cell);
        assertTrue(board.getCell(0, 0).getValue() == 2);
    }

    @Test
    void getScoreTest() {
        assertTrue(board.getScore() >= 0);
    }

    @Test
    void equalsTest() {
        Board anotherBoard = new Board(board);
        assertTrue(board.equals(anotherBoard));
    }

    // Test for Position class
    @Test
    void hashCodeTest() {
        Position pos1 = new Position(1, 2);
        Position pos2 = new Position(1, 2);
        assertEquals(pos1.hashCode(), pos2.hashCode());
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

    @Test
    public void testGetSizeEqual() {
        assertEquals(board.getSize(), 4);
    }

    @Test
    public void testGetSizeNotEqual() {
        assertNotEquals(board.getSize(), 5);
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
    public void testGetCellNotValidRow() {
        // If the row is out of bounds, the `validatePosition` method, 
        // used internally by the `getCell` method, throws an exception
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.getCell(-1, 0);
        });
    }

    @Test 
    public void testGetCellNotValidCol() {
        // If the column is out of bounds, the `validatePosition` method, 
        // used internally by the `getCell` method, throws an exception
        assertThrows(IndexOutOfBoundsException.class, () -> {
            board.getCell(0, 5);
        });
    }

    @Test
    public void testToStringPosition() {
        Position p = new Position(0, 2);
        assertEquals(p.toString(), "(0, 2)");
    }

    // MOVE UP TESTS
    @Test
    public void testMoveUpChangeTheBoard() {
        assertTrue(board.moveUp());
    }

    @Test
    public void testMoveUpMovesTileFromBottomToTop() {
        clearBoard(board);

        board.setCell(DEFAULT_SIZE-1, DEFAULT_SIZE-1, new Cell(2));

        boolean moved = board.moveUp();

        assertTrue(moved);
        assertEquals(2, board.getCell(0,DEFAULT_SIZE-1).getValue());
    }

    @Test
    public void testMoveUpMergesTilesAndIncrementsScore() {
        clearBoard(board);

        // Place two equal tiles so they should merge when moved up
        board.setCell(2, 0, new Cell(2));
        board.setCell(3, 0, new Cell(2));

        boolean moved = board.moveUp();

        // After merging, top cell should be 4 and score increased by 4
        assertTrue(moved);
        assertEquals(4, board.getCell(0, 0).getValue());
        assertTrue(board.getScore() >= 4);
    }
  
    @Test
    public void testMoveUpDoesNotMergeDifferentTiles() {
        clearBoard(board);

        // Place two different tiles in the same column
        board.setCell(2, 0, new Cell(2));
        board.setCell(3, 0, new Cell(32));

        boolean moved = board.moveUp();

        // The tiles should not merge, they should remain in their positions
        assertTrue(moved);
        assertEquals(2, board.getCell(0, 0).getValue());
        assertEquals(32, board.getCell(1, 0).getValue());
    }
  
    // Move DOWN tests
    @Test
    void moveDownChangeTheBoardTest() {
        assertTrue(board.moveDown());
    }

    @Test
    void moveDownMovesTileFromTopToBottomTest() {
        clearBoard(board);

        // Place a single tile at the top of the first column
        board.setCell(0, 0, new Cell(2));

        boolean moved = board.moveDown();

        // Expect the tile to have moved to the bottom of the column
        assertTrue(moved);
        assertEquals(2, board.getCell(board.getSize() - 1, 0).getValue());
    }

    @Test
    void moveDownMergesTilesAndIncrementsScoreTest() {
        clearBoard(board);

        // Place two equal tiles so they should merge when moved down
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(2));

        boolean moved = board.moveDown();

        // After merging, bottom cell should be 4 and score increased by 4
        assertTrue(moved);
        assertEquals(4, board.getCell(board.getSize() - 1, 0).getValue());
        assertTrue(board.getScore() >= 4);
    }

    @Test
    void moveDownDoesNotMergeDifferentTilesTest() {
        clearBoard(board);

        // Place two different tiles in the same column
        board.setCell(0, 0, new Cell(2));
        board.setCell(1, 0, new Cell(4));

        boolean moved = board.moveDown();

        // The tiles should not merge, they should remain in their positions
        assertTrue(moved);
        assertEquals(2, board.getCell(board.getSize() - 2, 0).getValue());
        assertEquals(4, board.getCell(board.getSize() - 1, 0).getValue());
    }

    // Move RIGHT tests
    @Test
    void moveRightChangeTheBoardTest() {
        assertTrue(board.moveRight());
    }

    @Test
    void moveRightTileFromLeftToRightTest() {
        clearBoard(board);

        // Place a tile in a cell
        board.setCell(0, 0, new Cell(2));

        // Move the board right
        board.moveRight();

        // Check that the tile has moved to the rightmost position
        assertEquals(2, board.getCell(0, board.getSize() - 1).getValue());
    }

    @Test
    void moveRightMergesTilesAndIncrementsScoreTest() {
        clearBoard(board);

        // Place two equal tiles so they should merge when moved left
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(2));

        // Move the board right
        board.moveRight();

        // After merging, the rightmost cell should be 4 and score increased by 4
        assertEquals(4, board.getCell(0, board.getSize() - 1).getValue());

    }
    @Test
    void moveRightDoesNotMergeDifferentTilesTest() {
        clearBoard(board);

        // Place two different tiles next to each other
        board.setCell(0, 0, new Cell(2));
        board.setCell(0, 1, new Cell(4));

        // Move the board right
        board.moveRight();

        // The tiles should not merge, they should remain in their positions
        assertEquals(2, board.getCell(0, board.getSize() - 2).getValue());
        assertEquals(4, board.getCell(0, board.getSize() - 1).getValue());
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
     */
    @Test
    public void testIsLosingBoardWithFullBoard() {
        Board grid = new Board();
        grid.clearBoard();

        int gridSize = grid.getSize();

        // create cells with different values so they can't be merged
        ArrayList<Cell> list = new ArrayList<>(gridSize);
        list.add(new Cell(2));
        list.add(new Cell(4));
        list.add(new Cell(8));
        list.add(new Cell(16));

        // insert cells in row 0 and 2 in ascending order
        for (int c = 0; c < gridSize; c++) {
            grid.setCell(0, c, list.get(c));
            grid.setCell(2, c, list.get(c));
        }

        // insert cells in row 1 and 3 in descending order
        for (int c = 0; c < gridSize; c++) {
            grid.setCell(1, c, list.get(gridSize - c - 1));
            grid.setCell(3, c, list.get(gridSize - c - 1));
        }

        assertTrue(grid.isLosingBoard());
    }

    /**
     * Tests the hasEmptyCells method with a grid with empty cells.
     */
    @Test
    public void testHasEmptyCellsWithEmptyCells() {
        Board grid = new Board();
        assertTrue(grid.hasEmptyCells());
    }

    /**
     * Tests the hasEmptyCells method with a grid without empty cells.
     */
    @Test
    public void testHasEmptyCellsWithoutEmptyCells() {
        Board grid = new Board();
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
    @Test
    public void testIsFullWithEmptyCells(){
        Board grid = new Board();
        assertFalse(grid.isFull());
    }

    /**
     * Tests the isFull method with a board that is full.
     */
    @Test
    public void testIsFull(){
        Board grid = new Board();
        Cell cell = new Cell(2);

        for (int r = 0; r < grid.getSize(); r++) {
            for (int c = 0; c < grid.getSize(); c++) {
                grid.setCell(r, c, cell);
            }
        }

        assertTrue(grid.isFull());
    }
  
   // Hashcode Board test
    @Test
    public void testHashcodeBoard() {
        Board b1 = new Board(board);
        Board b2 = new Board(board);
        b2.moveUp();
        assertEquals(b1.hashCode(), board.hashCode()); // b1 is a copy of board, so their hashcodes should be equal
        assertNotEquals(b2.hashCode(), board.hashCode()); // b2 has been modified, so its hashcode should not be equal to the original board's hashcode
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
     * This test verifies that method equals with two Positions with not equal values return false;
     */
    @Test
    public void testEqualsDifferentPositions() {
        Board.Position p1 = new Board.Position(0, 1);
        Board.Position p2 = new Board.Position(2, 3);

        assertFalse(p1.equals(p2));
    }
}
