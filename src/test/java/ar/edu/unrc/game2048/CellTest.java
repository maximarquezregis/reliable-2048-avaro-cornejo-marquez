package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    /**
     * Test method mergeWith
     * mergeWith invocated with equal cells must return a new cell with the initial cell value doubled.
     */
    @Test
    public void testMergeWithSameValue() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);
        Cell expected = new Cell(4);

        Cell result = cell1.mergeWith(cell2);

        assertEquals(expected, result);
    }

    /**
     * Test method mergeWith
     * mergeWith invocated with not equal cells must return a new cell with the initial cell value doubled.
     */
    @Test
    public void testMergeWithDifferentValue() {
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(3);

        assertThrows(IllegalArgumentException.class, () -> {
            Cell result = cell1.mergeWith(cell2);
        });
    }

    /**
     * Test method equals
     * equals with the same cell
     */
    @Test
    public void testEqualsWithSameCell(){
        Cell cell1 = new Cell(2);

        assertTrue(cell1.equals(cell1));
    }

    /**
     * Test method equals
     * equals with other equal cell
     */
    @Test
    public void testEqualsWithEqualCell(){
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(2);

        assertTrue(cell1.equals(cell2));
    }

    /**
     * Test method equals
     * equals with other not equal cell
     */
    @Test
    public void testEqualsWithNotEqualCell(){
        Cell cell1 = new Cell(2);
        Cell cell2 = new Cell(4);

        assertFalse(cell1.equals(cell2));
    }

    /**
     * Test method toString
     * toString with 0
     */
    @Test
    public void testToStringWith0(){
        Cell cell1 = new Cell(0);

        assertEquals(".", cell1.toString());
    }

    /**
     * Test method toString
     * toString with 2
     */
    @Test
    public void testToStringWith2(){
        Cell cell1 = new Cell(2);

        assertEquals("2", cell1.toString());
    }
}