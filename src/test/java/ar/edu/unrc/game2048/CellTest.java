package ar.edu.unrc.game2048;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Cell Tests")
class CellTest {

    @Test
    @DisplayName("should create empty cell with value 0")
    void testEmptyCell() {
        Cell cell = new Cell(0);
        assertTrue(cell.isEmpty());
        assertEquals(0, cell.getValue());
        assertEquals(Cell.EMPTY, cell);
    }

    @Test
    @DisplayName("should create valid power-of-two cells")
    void testValidCell() {
        Cell cell2 = new Cell(2);
        assertFalse(cell2.isEmpty());
        assertEquals(2, cell2.getValue());
    }

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

    @Test
    public void testGetValueCommon() {
        Cell c = new Cell(8);
        int valueRoutine = c.getValue();
        assertEquals(valueRoutine, 8);
    }

    @Test
    public void testGetValueZero() {
        Cell c = new Cell(0);
        assertTrue(c.isEmpty());
    }

    @Test
    public void testCanMergeFalse() {
        Cell c1 = new Cell(4);
        Cell c2 = new Cell(8);
        boolean canMerge = c1.canMergeWith(c2);
        assertFalse(canMerge);
    }

    @Test
    public void testCanMergeTrue() {
        Cell c1 = new Cell(8);
        Cell c2 = new Cell(8);
        boolean canMerge = c1.canMergeWith(c2);
        assertTrue(canMerge);
    }

    @Test
    public void testCanMergeOneCellEmpty() {
        Cell c1 = new Cell(0);
        Cell c2 = new Cell(8);
        boolean canMerge = c1.canMergeWith(c2);
        assertFalse(canMerge);
    }

    @Test
    public void isEmptyTrue() {
        Cell c = new Cell(0);
        assertTrue(c.isEmpty());
    }

    @Test
    public void isEmptyFalse() {
        Cell c = new Cell(2);
        assertFalse(c.isEmpty());
    }

    @Test
    public void hashCodeTest() {
        Cell c1 = new Cell(2);
        Cell c2 = new Cell(2);
        assertEquals(c1.hashCode(), c2.hashCode());
    }

    @Test
    public void hashCodeTestDifferent() {
        Cell c1 = new Cell(2);
        Cell c2 = new Cell(4);
        assertNotEquals(c1.hashCode(), c2.hashCode());
    }
}
