package ar.edu.unrc.game2048;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CellTest {
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
    
}