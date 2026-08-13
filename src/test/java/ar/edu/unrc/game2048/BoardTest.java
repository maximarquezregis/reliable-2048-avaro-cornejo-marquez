package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import ar.edu.unrc.game2048.Board.Position;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;

import static ar.edu.unrc.game2048.Board.*;

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
        assertTrue(board.getScore() >= 4);
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
}