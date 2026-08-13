package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

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