package ar.edu.unrc.game2048;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class DaikonTestTrace {

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

    private void clearBoard(Board board) {
        for (int row = 0; row < board.getSize(); row++) {
            for (int column = 0; column < board.getSize(); column++) {
                board.setCell(row, column, Cell.EMPTY);
            }
        }
    }
}