package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
      
    // Hashcode Board test
    @Test
    public void testHashcodeBoard() {
        Board b1 = new Board(board);
        Board b2 = new Board(board);
        b2.moveUp();
        assertEquals(b1.hashCode(), board.hashCode()); // b1 is a copy of board, so their hashcodes should be equal
        assertNotEquals(b2.hashCode(), board.hashCode()); // b2 has been modified, so its hashcode should not be equal to the original board's hashcode
    }
  
}
