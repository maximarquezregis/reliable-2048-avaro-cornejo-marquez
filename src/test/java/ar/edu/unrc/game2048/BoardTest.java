package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;

import static ar.edu.unrc.game2048.Board.*;

class BoardTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board();
    }

    @Test
    void moveDownChangeTheBoardTest() {
        assertTrue(board.moveDown());
    }

    @Test
    void moveLeftChangeTheBoardTest() {
        assertTrue(board.moveLeft());
    }

    @Test
    void getEmptyPositionsReturnsCorrectListTest() {
        assertTrue(board.getEmptyPositions().size() > 0);
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

}