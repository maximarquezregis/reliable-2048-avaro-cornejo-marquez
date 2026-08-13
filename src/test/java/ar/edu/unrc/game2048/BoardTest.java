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

}