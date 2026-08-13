package ar.edu.unrc.game2048;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {
    @Test // if a cell has the value 2048, then the board is winning
    public void testIsWinningBoard() {
        Board b = new Board();
        Cell c = new Cell(2048);
        b.setCell(0, 0, c);
        boolean boardWinner = b.isWinningBoard();
        assertEquals(boardWinner, true);
    }
}