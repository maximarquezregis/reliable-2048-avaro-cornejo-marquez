package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.DOWN;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.DOWN + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.DOWN));
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int int0 = ar.edu.unrc.game2048.Board.DEFAULT_SIZE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        ar.edu.unrc.game2048.Board board0 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board1 = new ar.edu.unrc.game2048.Board(board0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"size\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board2.getCell((-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.LEFT;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.LEFT + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.LEFT));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell7.canMergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell18.canMergeWith(cell20);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell9.mergeWith(cell20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board2.getCell(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        ar.edu.unrc.game2048.Board.Direction direction0 = ar.edu.unrc.game2048.Board.Direction.UP;
        org.junit.Assert.assertTrue("'" + direction0 + "' != '" + ar.edu.unrc.game2048.Board.Direction.UP + "'", direction0.equals(ar.edu.unrc.game2048.Board.Direction.UP));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.Class<?> wildcardClass5 = board4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        int int6 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell7.canMergeWith(cell9);
        boolean boolean11 = cell9.isEmpty();
        java.lang.Class<?> wildcardClass12 = cell9.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("hi!", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.Class<?> wildcardClass9 = cell7.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        boolean boolean8 = board2.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        boolean boolean18 = cell7.canMergeWith(cell16);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int22 = board21.getSize();
        boolean boolean23 = board21.moveDown();
        boolean boolean24 = board21.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean35 = cell27.canMergeWith(cell34);
        int int36 = cell34.getValue();
        int int37 = cell34.getValue();
        board21.setCell((int) (short) 1, 0, cell34);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell39 = cell7.mergeWith(cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell10.canMergeWith(cell17);
        int int19 = cell10.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(1, (-1), cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell9 = board2.getCell(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = cell6.isEmpty();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell14 = board10.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean15 = cell14.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell6.mergeWith(cell14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        boolean boolean16 = board2.moveUp();
        boolean boolean17 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell7.canMergeWith(cell9);
        boolean boolean11 = cell9.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        int int21 = cell19.getValue();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        int int26 = board24.getSize();
        boolean boolean27 = board24.isFull();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass29 = cell28.getClass();
        boolean boolean30 = board24.equals((java.lang.Object) cell28);
        boolean boolean31 = cell19.equals((java.lang.Object) cell28);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell32 = cell9.mergeWith(cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean16 = cell15.isEmpty();
        board5.setCell(4, (int) ' ', cell15);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = cell1.mergeWith(cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        int int10 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell11 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = cell7.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ar.edu.unrc.game2048.Cell.isEmpty()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("32", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.Class<?> wildcardClass5 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board2.getCell(32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, 4);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board2.getCell(32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        int int12 = cell3.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = cell1.mergeWith(cell3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.moveRight();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean21 = cell13.canMergeWith(cell20);
        java.lang.String str22 = cell13.toString();
        java.lang.String str23 = cell13.toString();
        // The following exception was thrown during execution in test generation
        try {
            board9.setCell((-1), (int) ' ', cell13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 32) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        java.lang.Class<?> wildcardClass4 = cell1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        int int18 = cell16.getValue();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board21.getEmptyPositions();
        int int23 = board21.getSize();
        boolean boolean24 = board21.isFull();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass26 = cell25.getClass();
        boolean boolean27 = board21.equals((java.lang.Object) cell25);
        boolean boolean28 = cell16.equals((java.lang.Object) cell25);
        int int29 = cell16.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 10, (-1), cell16);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        board2.clearBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass17 = cell16.getClass();
        boolean boolean18 = board12.equals((java.lang.Object) cell16);
        boolean boolean19 = cell7.equals((java.lang.Object) cell16);
        int int20 = cell7.getValue();
        java.lang.Class<?> wildcardClass21 = cell7.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board2.equals((java.lang.Object) positionSet10);
        boolean boolean12 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean23 = cell15.canMergeWith(cell22);
        java.lang.String str24 = cell15.toString();
        java.lang.String str25 = cell15.toString();
        boolean boolean26 = cell15.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) ' ', (int) (short) -1, cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (32, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(".", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell10.canMergeWith(cell17);
        java.lang.String str19 = cell10.toString();
        java.lang.String str20 = cell10.toString();
        // The following exception was thrown during execution in test generation
        try {
            board7.setCell((int) (short) 100, 0, cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "." + "'", str19, ".");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, -1)", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The cell value cannot be: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, -1)" + "'", str5, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell((int) ' ');
        int int12 = cell11.getValue();
        boolean boolean13 = cell8.canMergeWith(cell11);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean22 = cell14.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean24 = cell21.canMergeWith(cell23);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = cell11.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        int int9 = board7.getSize();
        boolean boolean10 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass12 = cell11.getClass();
        boolean boolean13 = board7.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean15 = board2.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Cell cell18 = board2.getCell(1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell21 = board2.getCell((int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveLeft();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board9.getCell(52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(1, 0)", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (1, 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        boolean boolean10 = cell8.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean12 = cell4.canMergeWith(cell11);
        int int13 = cell11.getValue();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        int int18 = board16.getSize();
        boolean boolean19 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass21 = cell20.getClass();
        boolean boolean22 = board16.equals((java.lang.Object) cell20);
        boolean boolean23 = cell11.equals((java.lang.Object) cell20);
        int int24 = cell11.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = cell1.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str19 = position2.toString();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean28 = board22.moveUp();
        boolean boolean29 = position2.equals((java.lang.Object) board22);
        int int30 = board22.getScore();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, 52)" + "'", str19, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.moveRight();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        int int10 = cell7.getValue();
        java.lang.String str11 = cell7.toString();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int15 = board14.getSize();
        boolean boolean16 = board14.moveDown();
        boolean boolean17 = board14.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean28 = cell20.canMergeWith(cell27);
        int int29 = cell27.getValue();
        int int30 = cell27.getValue();
        board14.setCell((int) (short) 1, 0, cell27);
        java.lang.String str32 = cell27.toString();
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet37 = board36.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell40 = board36.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean41 = cell33.canMergeWith(cell40);
        boolean boolean42 = cell27.canMergeWith(cell40);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell43 = cell7.mergeWith(cell40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(positionSet37);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean16 = cell8.canMergeWith(cell15);
        int int17 = cell15.getValue();
        int int18 = cell15.getValue();
        board2.setCell((int) (short) 1, 0, cell15);
        boolean boolean21 = cell15.equals((java.lang.Object) 0.0f);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int25 = board24.getSize();
        boolean boolean26 = board24.moveDown();
        boolean boolean27 = board24.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell37 = board33.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean38 = cell30.canMergeWith(cell37);
        int int39 = cell37.getValue();
        int int40 = cell37.getValue();
        board24.setCell((int) (short) 1, 0, cell37);
        java.lang.String str42 = cell37.toString();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean51 = cell43.canMergeWith(cell50);
        boolean boolean52 = cell37.canMergeWith(cell50);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell53 = cell15.mergeWith(cell37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str19 = position2.toString();
        int int20 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, 52)" + "'", str19, "(0, 52)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (-1));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        int int6 = board4.getSize();
        board4.clearBoard();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = cell1.equals((java.lang.Object) board4);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        boolean boolean15 = board12.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board21.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean26 = cell18.canMergeWith(cell25);
        int int27 = cell25.getValue();
        int int28 = cell25.getValue();
        board12.setCell((int) (short) 1, 0, cell25);
        java.lang.String str30 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board34.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell38 = board34.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean39 = cell31.canMergeWith(cell38);
        boolean boolean40 = cell25.canMergeWith(cell38);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell41 = cell1.mergeWith(cell38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        java.lang.String str20 = cell11.toString();
        java.lang.String str21 = cell11.toString();
        boolean boolean22 = cell11.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = cell1.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(".", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '#', (int) (short) 10);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (int) '#');
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int8 = board7.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell17.isEmpty();
        board7.setCell(4, (int) ' ', cell17);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((-1), (int) '4', cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 52) is out of bounds for board size 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.hasEmptyCells();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.tileAmount();
        board2.clearBoard();
        boolean boolean7 = board2.moveDown();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        board12.clearBoard();
        int int16 = board12.tileAmount();
        boolean boolean18 = board12.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell cell22 = board12.getCell(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 100, 10, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 10) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell22);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Board is full, no empty positions available.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass17 = cell16.getClass();
        boolean boolean18 = board12.equals((java.lang.Object) cell16);
        boolean boolean19 = cell7.equals((java.lang.Object) cell16);
        java.lang.Object obj20 = null;
        boolean boolean21 = cell7.equals(obj20);
        java.lang.Class<?> wildcardClass22 = cell7.getClass();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        boolean boolean18 = cell7.canMergeWith(cell16);
        boolean boolean19 = cell7.isEmpty();
        java.lang.String str20 = cell7.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board2.getCell((int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 52) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("32", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        board12.clearBoard();
        boolean boolean16 = board12.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveRight();
        boolean boolean19 = board12.isWinningBoard();
        boolean boolean20 = board12.isWinningBoard();
        boolean boolean21 = cell8.equals((java.lang.Object) board12);
        int int22 = board12.getScore();
        int int23 = board12.tileAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("32", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.isLosingBoard();
        boolean boolean11 = board9.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 100.0d);
        int int6 = position2.row;
        java.lang.Class<?> wildcardClass7 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 0);
        int int3 = position2.row;
        ar.edu.unrc.game2048.Cell cell5 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str6 = cell5.toString();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int10 = board9.getSize();
        boolean boolean11 = board9.moveDown();
        boolean boolean12 = board9.moveRight();
        board9.clearBoard();
        boolean boolean14 = cell5.equals((java.lang.Object) board9);
        boolean boolean15 = cell5.isEmpty();
        boolean boolean16 = position2.equals((java.lang.Object) boolean15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "32" + "'", str6, "32");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.Class<?> wildcardClass11 = board10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Board is full, no empty positions available.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board2.getSize();
        int int13 = board2.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        boolean boolean16 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell19 = board2.getCell(4, 52);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int23 = board22.getSize();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board22);
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell(2);
        board24.setCell((int) (byte) 1, 32, cell28);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean37 = cell28.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean47 = cell39.canMergeWith(cell46);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell55 = board51.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean56 = cell48.canMergeWith(cell55);
        boolean boolean57 = cell46.canMergeWith(cell55);
        ar.edu.unrc.game2048.Cell cell59 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean60 = cell55.canMergeWith(cell59);
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean69 = cell61.canMergeWith(cell68);
        java.lang.String str70 = cell61.toString();
        boolean boolean71 = cell59.canMergeWith(cell61);
        boolean boolean72 = cell38.canMergeWith(cell59);
        ar.edu.unrc.game2048.Board board75 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int76 = board75.getSize();
        boolean boolean77 = board75.moveDown();
        board75.clearBoard();
        boolean boolean79 = board75.hasEmptyCells();
        boolean boolean80 = board75.moveRight();
        int int81 = board75.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet82 = board75.getEmptyPositions();
        boolean boolean83 = cell59.equals((java.lang.Object) board75);
        boolean boolean84 = cell28.canMergeWith(cell59);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell85 = cell19.mergeWith(cell59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 100 + "'", int81 == 100);
        org.junit.Assert.assertNotNull(positionSet82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        boolean boolean15 = board13.moveDown();
        boolean boolean16 = board13.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean27 = cell19.canMergeWith(cell26);
        int int28 = cell26.getValue();
        int int29 = cell26.getValue();
        board13.setCell((int) (short) 1, 0, cell26);
        java.lang.String str31 = cell26.toString();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean40 = cell32.canMergeWith(cell39);
        boolean boolean41 = cell26.canMergeWith(cell39);
        boolean boolean42 = cell1.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int46 = board45.getSize();
        boolean boolean47 = board45.moveDown();
        boolean boolean48 = board45.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet55 = board54.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell58 = board54.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean59 = cell51.canMergeWith(cell58);
        int int60 = cell58.getValue();
        int int61 = cell58.getValue();
        board45.setCell((int) (short) 1, 0, cell58);
        java.lang.String str63 = cell58.toString();
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet68 = board67.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell71 = board67.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean72 = cell64.canMergeWith(cell71);
        boolean boolean73 = cell58.canMergeWith(cell71);
        int int74 = cell58.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell75 = cell1.mergeWith(cell58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertNotNull(positionSet55);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertNotNull(positionSet68);
        org.junit.Assert.assertNotNull(cell71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        int int3 = position2.row;
        java.lang.Class<?> wildcardClass4 = position2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        board2.setCell((int) ' ', 32, cell12);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean24 = cell16.canMergeWith(cell23);
        java.lang.String str25 = cell16.toString();
        boolean boolean26 = cell12.canMergeWith(cell16);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int28 = cell27.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell29 = cell16.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32" + "'", str13, "32");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isLosingBoard();
        int int8 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, -1)", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        int int3 = position2.row;
        int int4 = position2.row;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int8 = board7.getSize();
        boolean boolean9 = board7.moveDown();
        board7.clearBoard();
        ar.edu.unrc.game2048.Cell cell13 = board7.getCell(4, (int) (byte) 1);
        boolean boolean14 = board7.moveLeft();
        int int15 = board7.getScore();
        boolean boolean16 = board7.moveUp();
        boolean boolean17 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str18 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(0, 32)" + "'", str18, "(0, 32)");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.tileAmount();
        int int6 = board2.getScore();
        boolean boolean7 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        int int20 = cell18.getValue();
        int int21 = cell18.getValue();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        int int26 = board24.getSize();
        boolean boolean27 = cell18.equals((java.lang.Object) board24);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 100, (int) 'a', cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 97) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, -1)", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        int int7 = board2.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("2", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean12 = board10.equals((java.lang.Object) (short) 1);
        boolean boolean13 = board10.moveRight();
        boolean boolean14 = board10.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        int int4 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        int int19 = board17.getSize();
        boolean boolean20 = board17.isFull();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass22 = cell21.getClass();
        boolean boolean23 = board17.equals((java.lang.Object) cell21);
        boolean boolean24 = cell12.equals((java.lang.Object) cell21);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = cell1.mergeWith(cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        int int9 = board2.tileAmount();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell17 = board8.getCell((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell32 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean33 = cell28.canMergeWith(cell32);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) -1, (int) (byte) 0, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board11.tileAmount();
        boolean boolean13 = board11.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board.Position position14 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean16 = position14.equals((java.lang.Object) 1);
        int int17 = position14.col;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        int int22 = board20.getSize();
        boolean boolean23 = board20.isFull();
        int int24 = board20.tileAmount();
        boolean boolean25 = position14.equals((java.lang.Object) board20);
        boolean boolean26 = board20.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str31 = cell30.toString();
        boolean boolean32 = cell30.isEmpty();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        int int37 = board35.getSize();
        boolean boolean38 = board35.isFull();
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass40 = cell39.getClass();
        boolean boolean41 = board35.equals((java.lang.Object) cell39);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(board35);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board35.getEmptyPositions();
        boolean boolean44 = cell30.equals((java.lang.Object) board35);
        board20.setCell((int) (byte) 1, (int) '4', cell30);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 100, (int) ' ', cell30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 32) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "32" + "'", str31, "32");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isLosingBoard();
        int int6 = board2.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        board2.clearBoard();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        ar.edu.unrc.game2048.Cell cell10 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str11 = cell10.toString();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int15 = board14.getSize();
        boolean boolean16 = board14.moveDown();
        board14.clearBoard();
        boolean boolean18 = board14.hasEmptyCells();
        boolean boolean19 = board14.moveRight();
        boolean boolean20 = board14.isLosingBoard();
        boolean boolean21 = cell10.equals((java.lang.Object) board14);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell8.mergeWith(cell10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell18.isEmpty();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        int int25 = board23.getSize();
        boolean boolean26 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass28 = cell27.getClass();
        boolean boolean29 = board23.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board23.getEmptyPositions();
        boolean boolean32 = cell18.equals((java.lang.Object) board23);
        board8.setCell((int) (byte) 1, (int) '4', cell18);
        int int34 = board8.getSize();
        boolean boolean35 = board8.moveLeft();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell38 = board8.getCell(100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board2.equals((java.lang.Object) positionSet10);
        boolean boolean12 = board2.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell0.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveUp();
        boolean boolean20 = board12.equals((java.lang.Object) 100.0d);
        boolean boolean21 = cell0.equals((java.lang.Object) boolean20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        int int26 = board24.getSize();
        boolean boolean27 = board24.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board24.getEmptyPositions();
        boolean boolean29 = board24.isFull();
        boolean boolean30 = cell0.equals((java.lang.Object) board24);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        int int35 = board33.getSize();
        board33.clearBoard();
        boolean boolean37 = board33.moveDown();
        int int38 = board33.getScore();
        boolean boolean39 = board33.moveDown();
        ar.edu.unrc.game2048.Cell cell42 = board33.getCell(0, 3);
        java.lang.String str43 = cell42.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell44 = cell0.mergeWith(cell42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 32);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        boolean boolean8 = board2.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean4 = board2.equals((java.lang.Object) 1.0d);
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell9 = board2.getCell(0, 32);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        boolean boolean31 = cell19.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((-1), (int) (short) 10, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        int int10 = cell7.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        int int15 = board13.getSize();
        boolean boolean16 = cell7.equals((java.lang.Object) board13);
        int int17 = board13.getScore();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board7.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int16 = board15.getSize();
        boolean boolean17 = board15.moveDown();
        boolean boolean18 = board15.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        int int30 = cell28.getValue();
        int int31 = cell28.getValue();
        board15.setCell((int) (short) 1, 0, cell28);
        boolean boolean34 = cell28.equals((java.lang.Object) 0.0f);
        java.lang.String str35 = cell28.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell36 = cell11.mergeWith(cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("32", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean3 = cell1.equals((java.lang.Object) cell2);
        ar.edu.unrc.game2048.Cell cell4 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean12 = cell4.canMergeWith(cell11);
        int int13 = cell11.getValue();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        int int18 = board16.getSize();
        boolean boolean19 = board16.isFull();
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass21 = cell20.getClass();
        boolean boolean22 = board16.equals((java.lang.Object) cell20);
        boolean boolean23 = cell11.equals((java.lang.Object) cell20);
        int int24 = cell11.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = cell1.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell4);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        boolean boolean11 = board5.isLosingBoard();
        boolean boolean12 = board5.isLosingBoard();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board7.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell12.isEmpty();
        board2.setCell(4, (int) ' ', cell12);
        ar.edu.unrc.game2048.Cell cell15 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell12.mergeWith(cell15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ar.edu.unrc.game2048.Cell.isEmpty()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        int int7 = position2.col;
        int int8 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, -1)" + "'", str6, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int17 = board16.getSize();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board16);
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell(2);
        board18.setCell((int) (byte) 1, 32, cell22);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean31 = cell22.canMergeWith(cell30);
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean40 = cell32.canMergeWith(cell39);
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean42 = cell39.canMergeWith(cell41);
        boolean boolean43 = cell41.isEmpty();
        boolean boolean44 = cell22.canMergeWith(cell41);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 10, (int) (byte) 100, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        board5.clearBoard();
        boolean boolean9 = board5.hasEmptyCells();
        boolean boolean10 = board5.moveRight();
        boolean boolean11 = board5.isLosingBoard();
        boolean boolean12 = cell1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean21 = cell13.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = cell20.canMergeWith(cell22);
        boolean boolean24 = cell1.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell34 = cell20.mergeWith(cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        boolean boolean8 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, 4);
        boolean boolean3 = board2.moveRight();
        int int4 = board2.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean4 = board2.equals((java.lang.Object) 1.0d);
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveDown();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean22 = cell14.canMergeWith(cell21);
        int int23 = cell21.getValue();
        boolean boolean24 = board11.equals((java.lang.Object) int23);
        boolean boolean25 = board11.moveUp();
        ar.edu.unrc.game2048.Cell cell28 = board11.getCell(4, 52);
        int int29 = cell28.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board6.setCell(4, (int) (short) 100, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (4, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(10, (int) '#');
        java.lang.String str9 = cell8.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        boolean boolean9 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass11 = cell10.getClass();
        boolean boolean12 = board6.equals((java.lang.Object) cell10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board6.getEmptyPositions();
        boolean boolean15 = cell1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean24 = cell16.canMergeWith(cell23);
        int int25 = cell23.getValue();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        int int30 = board28.getSize();
        boolean boolean31 = board28.isFull();
        ar.edu.unrc.game2048.Cell cell32 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass33 = cell32.getClass();
        boolean boolean34 = board28.equals((java.lang.Object) cell32);
        boolean boolean35 = cell23.equals((java.lang.Object) cell32);
        int int36 = cell23.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell37 = cell1.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("2", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.isLosingBoard();
        int int10 = board2.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(1, 0);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 0)" + "'", str3, "(1, 0)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(2);
        board4.setCell((int) (byte) 1, 32, cell8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell8.canMergeWith(cell16);
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board21.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean26 = cell18.canMergeWith(cell25);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean28 = cell25.canMergeWith(cell27);
        boolean boolean29 = cell27.isEmpty();
        boolean boolean30 = cell8.canMergeWith(cell27);
        java.lang.Object obj31 = null;
        boolean boolean32 = cell8.equals(obj31);
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean51 = cell43.canMergeWith(cell50);
        boolean boolean52 = cell41.canMergeWith(cell50);
        ar.edu.unrc.game2048.Cell cell54 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean55 = cell50.canMergeWith(cell54);
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet60 = board59.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell63 = board59.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean64 = cell56.canMergeWith(cell63);
        java.lang.String str65 = cell56.toString();
        boolean boolean66 = cell54.canMergeWith(cell56);
        boolean boolean67 = cell33.canMergeWith(cell54);
        int int68 = cell54.getValue();
        boolean boolean69 = cell8.equals((java.lang.Object) int68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertNotNull(positionSet60);
        org.junit.Assert.assertNotNull(cell63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "." + "'", str65, ".");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 52)" + "'", str4, "(0, 52)");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, (int) '#');
        boolean boolean3 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.String str9 = cell0.toString();
        java.lang.String str10 = cell0.toString();
        boolean boolean11 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        boolean boolean31 = cell0.canMergeWith(cell28);
        boolean boolean32 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell39 = board35.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int43 = board42.getSize();
        boolean boolean44 = board42.moveDown();
        board42.clearBoard();
        boolean boolean46 = board42.moveRight();
        boolean boolean47 = cell39.equals((java.lang.Object) boolean46);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell48 = cell0.mergeWith(cell39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        boolean boolean10 = cell7.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean12 = board11.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        int int8 = board2.getScore();
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(100, 1)" + "'", str3, "(100, 1)");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board8.isLosingBoard();
        int int10 = board8.getSize();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.String str9 = cell0.toString();
        java.lang.String str10 = cell0.toString();
        boolean boolean11 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        boolean boolean31 = cell0.canMergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell33 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str34 = cell33.toString();
        boolean boolean35 = cell33.isEmpty();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet39 = board38.getEmptyPositions();
        int int40 = board38.getSize();
        boolean boolean41 = board38.isFull();
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass43 = cell42.getClass();
        boolean boolean44 = board38.equals((java.lang.Object) cell42);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board38);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet46 = board38.getEmptyPositions();
        boolean boolean47 = cell33.equals((java.lang.Object) board38);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell55 = board51.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean56 = cell48.canMergeWith(cell55);
        boolean boolean57 = cell33.canMergeWith(cell55);
        int int58 = cell33.getValue();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell59 = cell0.mergeWith(cell33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "32" + "'", str34, "32");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(positionSet39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(positionSet46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean3 = cell1.equals((java.lang.Object) cell2);
        boolean boolean4 = cell1.isEmpty();
        int int5 = cell1.getValue();
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(4);
        java.lang.String str2 = cell1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean4 = board2.equals((java.lang.Object) 1.0d);
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell9 = board2.getCell(0, 32);
        boolean boolean10 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(100, 1)", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (100, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.moveRight();
        int int7 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(100, 1)", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (100, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.Class<?> wildcardClass12 = board11.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, (int) (short) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, -1)" + "'", str5, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board2.getCell((int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.moveRight();
        boolean boolean7 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass6 = cell5.getClass();
        boolean boolean7 = board2.equals((java.lang.Object) cell5);
        boolean boolean8 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.tileAmount();
        boolean boolean9 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        int int9 = board7.getSize();
        boolean boolean10 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass12 = cell11.getClass();
        boolean boolean13 = board7.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean15 = board2.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Cell cell18 = board2.getCell(1, (int) '#');
        int int19 = board2.tileAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell12.isEmpty();
        board2.setCell(4, (int) ' ', cell12);
        board2.clearBoard();
        int int16 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 52);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str19 = position2.toString();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean28 = board22.moveUp();
        boolean boolean29 = position2.equals((java.lang.Object) board22);
        boolean boolean30 = board22.moveLeft();
        boolean boolean31 = board22.moveRight();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, 52)" + "'", str19, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 32) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        ar.edu.unrc.game2048.Cell cell2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = cell1.canMergeWith(cell2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"value\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, 0);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        board2.clearBoard();
        boolean boolean17 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        boolean boolean8 = board2.hasEmptyCells();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        int int19 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean10 = cell2.canMergeWith(cell9);
        int int11 = cell2.getValue();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        boolean boolean20 = board14.moveUp();
        boolean boolean22 = board14.equals((java.lang.Object) 100.0d);
        boolean boolean23 = cell2.equals((java.lang.Object) boolean22);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        int int28 = board26.getSize();
        boolean boolean29 = board26.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board26.getEmptyPositions();
        boolean boolean31 = board26.isFull();
        boolean boolean32 = cell2.equals((java.lang.Object) board26);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell33 = cell1.mergeWith(cell2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 2 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board10.getCell((int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 97) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean21 = cell18.canMergeWith(cell20);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) -1, 1, cell18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 10);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board5.moveLeft();
        int int8 = board5.getSize();
        boolean boolean9 = board5.isLosingBoard();
        int int10 = board5.getSize();
        int int11 = board5.getSize();
        boolean boolean12 = position2.equals((java.lang.Object) int11);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        int int6 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.moveDown();
        boolean boolean12 = board9.moveRight();
        boolean boolean13 = board9.isLosingBoard();
        boolean boolean14 = position2.equals((java.lang.Object) boolean13);
        int int15 = position2.row;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        int int21 = board18.getScore();
        boolean boolean22 = board18.isFull();
        int int23 = board18.getSize();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean25 = board18.isLosingBoard();
        boolean boolean26 = position2.equals((java.lang.Object) boolean25);
        ar.edu.unrc.game2048.Board.Position position29 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean31 = position29.equals((java.lang.Object) 1);
        int int32 = position29.col;
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        int int37 = board35.getSize();
        boolean boolean38 = board35.isFull();
        int int39 = board35.tileAmount();
        boolean boolean40 = position29.equals((java.lang.Object) board35);
        boolean boolean41 = board35.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell45 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str46 = cell45.toString();
        boolean boolean47 = cell45.isEmpty();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet51 = board50.getEmptyPositions();
        int int52 = board50.getSize();
        boolean boolean53 = board50.isFull();
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass55 = cell54.getClass();
        boolean boolean56 = board50.equals((java.lang.Object) cell54);
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(board50);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet58 = board50.getEmptyPositions();
        boolean boolean59 = cell45.equals((java.lang.Object) board50);
        board35.setCell((int) (byte) 1, (int) '4', cell45);
        int int61 = board35.getSize();
        boolean boolean62 = board35.moveLeft();
        boolean boolean63 = board35.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell66 = board35.getCell(0, (int) 'a');
        boolean boolean67 = position2.equals((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 52 + "'", int32 == 52);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "32" + "'", str46, "32");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(positionSet51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(positionSet58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        boolean boolean11 = board2.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean16 = board14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = board14.isLosingBoard();
        boolean boolean18 = board14.moveDown();
        ar.edu.unrc.game2048.Cell cell21 = board14.getCell(0, 32);
        boolean boolean22 = board2.equals((java.lang.Object) 32);
        int int23 = board2.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int10 = board9.getSize();
        boolean boolean11 = board9.moveDown();
        board9.clearBoard();
        boolean boolean13 = board9.moveRight();
        boolean boolean14 = cell6.equals((java.lang.Object) boolean13);
        boolean boolean15 = cell6.isEmpty();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass14 = positionSet13.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(".", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        int int2 = cell1.getValue();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        board5.clearBoard();
        ar.edu.unrc.game2048.Cell cell11 = board5.getCell(4, (int) (byte) 1);
        java.lang.String str12 = cell11.toString();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        int int17 = board15.getSize();
        board15.clearBoard();
        boolean boolean19 = board15.moveDown();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board15);
        boolean boolean21 = board15.moveRight();
        boolean boolean22 = board15.isWinningBoard();
        boolean boolean23 = board15.isWinningBoard();
        boolean boolean24 = cell11.equals((java.lang.Object) board15);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell25 = cell1.mergeWith(cell11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: 32 and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int10 = board9.getSize();
        boolean boolean11 = board9.moveDown();
        board9.clearBoard();
        boolean boolean13 = board9.moveRight();
        boolean boolean14 = cell6.equals((java.lang.Object) boolean13);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int18 = board17.getSize();
        boolean boolean19 = board17.moveDown();
        board17.clearBoard();
        ar.edu.unrc.game2048.Cell cell23 = board17.getCell(4, (int) (byte) 1);
        boolean boolean24 = board17.moveLeft();
        ar.edu.unrc.game2048.Cell cell27 = board17.getCell(10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell28 = cell6.mergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell27);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) (short) 0, (int) 'a');
        boolean boolean12 = cell11.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        boolean boolean16 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell19 = board2.getCell(4, 52);
        boolean boolean21 = cell19.equals((java.lang.Object) (short) 1);
        java.lang.String str22 = cell19.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 0);
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        board2.clearBoard();
        board2.clearBoard();
        int int8 = board2.getSize();
        int int9 = board2.tileAmount();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (int) (short) 10);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveDown();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean4 = board2.equals((java.lang.Object) 1.0d);
        boolean boolean5 = board2.isFull();
        boolean boolean6 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, 4);
        boolean boolean3 = board2.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        boolean boolean18 = cell7.canMergeWith(cell16);
        boolean boolean19 = cell7.isEmpty();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int23 = board22.getSize();
        boolean boolean24 = board22.moveDown();
        boolean boolean25 = board22.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean36 = cell28.canMergeWith(cell35);
        int int37 = cell35.getValue();
        int int38 = cell35.getValue();
        board22.setCell((int) (short) 1, 0, cell35);
        java.lang.String str40 = cell35.toString();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board44.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell48 = board44.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean49 = cell41.canMergeWith(cell48);
        boolean boolean50 = cell35.canMergeWith(cell48);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell51 = cell7.mergeWith(cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        board2.clearBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        int int9 = board2.getScore();
        boolean boolean10 = board2.moveUp();
        boolean boolean11 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        int int14 = board8.tileAmount();
        boolean boolean15 = board8.moveUp();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveUp();
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        boolean boolean16 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell19 = board2.getCell(4, 52);
        int int20 = board2.tileAmount();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = board2.getCell((int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 3) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        int int6 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.moveDown();
        boolean boolean12 = board9.moveRight();
        boolean boolean13 = board9.isLosingBoard();
        boolean boolean14 = position2.equals((java.lang.Object) boolean13);
        int int15 = position2.row;
        int int16 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        int int6 = position2.col;
        int int7 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(2);
        board4.setCell((int) (byte) 1, 32, cell8);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell8.canMergeWith(cell16);
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        ar.edu.unrc.game2048.Cell cell30 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell37 = board33.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean38 = cell30.canMergeWith(cell37);
        boolean boolean39 = cell28.canMergeWith(cell37);
        ar.edu.unrc.game2048.Cell cell41 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean42 = cell37.canMergeWith(cell41);
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean51 = cell43.canMergeWith(cell50);
        java.lang.String str52 = cell43.toString();
        boolean boolean53 = cell41.canMergeWith(cell43);
        boolean boolean54 = position20.equals((java.lang.Object) cell43);
        java.lang.String str55 = cell43.toString();
        ar.edu.unrc.game2048.Cell cell56 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell57 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet61 = board60.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell64 = board60.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean65 = cell57.canMergeWith(cell64);
        ar.edu.unrc.game2048.Cell cell66 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board69 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet70 = board69.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell73 = board69.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean74 = cell66.canMergeWith(cell73);
        boolean boolean75 = cell64.canMergeWith(cell73);
        ar.edu.unrc.game2048.Cell cell77 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean78 = cell73.canMergeWith(cell77);
        ar.edu.unrc.game2048.Cell cell79 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board82 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet83 = board82.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell86 = board82.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean87 = cell79.canMergeWith(cell86);
        java.lang.String str88 = cell79.toString();
        boolean boolean89 = cell77.canMergeWith(cell79);
        boolean boolean90 = cell56.canMergeWith(cell77);
        boolean boolean91 = cell43.equals((java.lang.Object) cell77);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell92 = cell16.mergeWith(cell43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "." + "'", str55, ".");
        org.junit.Assert.assertNotNull(cell56);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertNotNull(positionSet61);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cell66);
        org.junit.Assert.assertNotNull(positionSet70);
        org.junit.Assert.assertNotNull(cell73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(cell79);
        org.junit.Assert.assertNotNull(positionSet83);
        org.junit.Assert.assertNotNull(cell86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "." + "'", str88, ".");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        boolean boolean21 = cell10.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean24 = cell19.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        java.lang.String str34 = cell25.toString();
        boolean boolean35 = cell23.canMergeWith(cell25);
        boolean boolean36 = position2.equals((java.lang.Object) cell25);
        java.lang.String str37 = cell25.toString();
        java.lang.String str38 = cell25.toString();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        java.lang.String str7 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 32)" + "'", str4, "(0, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 32)" + "'", str5, "(0, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, 32)" + "'", str7, "(0, 32)");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value cannot be negative: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int9 = board8.getSize();
        boolean boolean10 = board8.moveDown();
        boolean boolean11 = board8.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean22 = cell14.canMergeWith(cell21);
        int int23 = cell21.getValue();
        int int24 = cell21.getValue();
        board8.setCell((int) (short) 1, 0, cell21);
        board2.setCell(4, (int) '#', cell21);
        int int27 = board2.getScore();
        boolean boolean28 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) (short) 0, (int) 'a');
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean22 = cell19.canMergeWith(cell21);
        boolean boolean23 = cell21.isEmpty();
        java.lang.String str24 = cell21.toString();
        java.lang.String str25 = cell21.toString();
        boolean boolean26 = cell21.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell27 = cell11.mergeWith(cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "." + "'", str24, ".");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        int int3 = position2.row;
        ar.edu.unrc.game2048.Board.Position position6 = new ar.edu.unrc.game2048.Board.Position(10, 1);
        boolean boolean7 = position2.equals((java.lang.Object) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean10 = cell2.canMergeWith(cell9);
        java.lang.String str11 = cell2.toString();
        java.lang.String str12 = cell2.toString();
        boolean boolean13 = cell2.isEmpty();
        boolean boolean14 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean24 = cell16.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        boolean boolean34 = cell23.canMergeWith(cell32);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean37 = cell32.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell45 = board41.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean46 = cell38.canMergeWith(cell45);
        java.lang.String str47 = cell38.toString();
        boolean boolean48 = cell36.canMergeWith(cell38);
        boolean boolean49 = cell15.canMergeWith(cell36);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int53 = board52.getSize();
        boolean boolean54 = board52.moveDown();
        board52.clearBoard();
        boolean boolean56 = board52.hasEmptyCells();
        boolean boolean57 = board52.moveRight();
        int int58 = board52.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet59 = board52.getEmptyPositions();
        boolean boolean60 = cell36.equals((java.lang.Object) board52);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell61 = cell1.mergeWith(cell36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "." + "'", str47, ".");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 100 + "'", int58 == 100);
        org.junit.Assert.assertNotNull(positionSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass9 = positionSet8.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        int int3 = position2.col;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        int int6 = board4.getSize();
        board4.clearBoard();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = cell1.equals((java.lang.Object) board4);
        boolean boolean10 = board4.isWinningBoard();
        board4.clearBoard();
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveDown();
        boolean boolean6 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveRight();
        boolean boolean14 = board11.moveDown();
        ar.edu.unrc.game2048.Board.Position position19 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean21 = position19.equals((java.lang.Object) 1);
        int int22 = position19.col;
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board25.getEmptyPositions();
        int int27 = board25.getSize();
        boolean boolean28 = board25.isFull();
        int int29 = board25.tileAmount();
        boolean boolean30 = position19.equals((java.lang.Object) board25);
        boolean boolean31 = board25.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell35 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str36 = cell35.toString();
        boolean boolean37 = cell35.isEmpty();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet41 = board40.getEmptyPositions();
        int int42 = board40.getSize();
        boolean boolean43 = board40.isFull();
        ar.edu.unrc.game2048.Cell cell44 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass45 = cell44.getClass();
        boolean boolean46 = board40.equals((java.lang.Object) cell44);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board40);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet48 = board40.getEmptyPositions();
        boolean boolean49 = cell35.equals((java.lang.Object) board40);
        board25.setCell((int) (byte) 1, (int) '4', cell35);
        board11.setCell(1, (int) '#', cell35);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) -1, (int) ' ', cell35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 32) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "32" + "'", str36, "32");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(positionSet48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The cell value cannot be: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell18.isEmpty();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        int int25 = board23.getSize();
        boolean boolean26 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass28 = cell27.getClass();
        boolean boolean29 = board23.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board23.getEmptyPositions();
        boolean boolean32 = cell18.equals((java.lang.Object) board23);
        board8.setCell((int) (byte) 1, (int) '4', cell18);
        int int34 = board8.getSize();
        int int35 = board8.tileAmount();
        int int36 = board8.getScore();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 100.0d);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        board8.clearBoard();
        boolean boolean12 = board8.moveDown();
        int int13 = board8.getScore();
        boolean boolean14 = board8.isFull();
        boolean boolean15 = board8.isWinningBoard();
        boolean boolean16 = position2.equals((java.lang.Object) board8);
        int int17 = board8.tileAmount();
        boolean boolean18 = board8.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        int int3 = position2.row;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        int int5 = board2.getSize();
        boolean boolean6 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass3 = position2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.moveDown();
        boolean boolean10 = board2.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        int int9 = board2.tileAmount();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board2.getCell((int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 52) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 32)", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        boolean boolean6 = board2.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        board12.clearBoard();
        boolean boolean16 = board12.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveRight();
        boolean boolean19 = board12.isWinningBoard();
        boolean boolean20 = board12.isWinningBoard();
        boolean boolean21 = cell8.equals((java.lang.Object) board12);
        boolean boolean22 = board12.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board12.getEmptyPositions();
        boolean boolean24 = board12.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        board2.clearBoard();
        board2.clearBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell10 = board2.getCell(0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        boolean boolean9 = board2.isLosingBoard();
        boolean boolean10 = board2.moveLeft();
        int int11 = board2.tileAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass17 = cell16.getClass();
        boolean boolean18 = board12.equals((java.lang.Object) cell16);
        boolean boolean19 = cell7.equals((java.lang.Object) cell16);
        int int20 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int27 = board26.getSize();
        boolean boolean28 = board26.moveDown();
        boolean boolean29 = board26.moveRight();
        board26.clearBoard();
        boolean boolean31 = cell22.equals((java.lang.Object) board26);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int35 = board34.getSize();
        boolean boolean36 = board34.moveDown();
        boolean boolean37 = board34.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board43.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell47 = board43.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean48 = cell40.canMergeWith(cell47);
        int int49 = cell47.getValue();
        int int50 = cell47.getValue();
        board34.setCell((int) (short) 1, 0, cell47);
        java.lang.String str52 = cell47.toString();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board56.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean61 = cell53.canMergeWith(cell60);
        boolean boolean62 = cell47.canMergeWith(cell60);
        boolean boolean63 = cell22.canMergeWith(cell47);
        boolean boolean64 = cell22.isEmpty();
        boolean boolean65 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell67 = new ar.edu.unrc.game2048.Cell((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell68 = cell7.mergeWith(cell67);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32" + "'", str23, "32");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean9 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        board2.clearBoard();
        boolean boolean13 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass17 = cell16.getClass();
        boolean boolean18 = board12.equals((java.lang.Object) cell16);
        boolean boolean19 = cell7.equals((java.lang.Object) cell16);
        int int20 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int27 = board26.getSize();
        boolean boolean28 = board26.moveDown();
        boolean boolean29 = board26.moveRight();
        board26.clearBoard();
        boolean boolean31 = cell22.equals((java.lang.Object) board26);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int35 = board34.getSize();
        boolean boolean36 = board34.moveDown();
        boolean boolean37 = board34.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board43.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell47 = board43.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean48 = cell40.canMergeWith(cell47);
        int int49 = cell47.getValue();
        int int50 = cell47.getValue();
        board34.setCell((int) (short) 1, 0, cell47);
        java.lang.String str52 = cell47.toString();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board56.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean61 = cell53.canMergeWith(cell60);
        boolean boolean62 = cell47.canMergeWith(cell60);
        boolean boolean63 = cell22.canMergeWith(cell47);
        boolean boolean64 = cell22.isEmpty();
        boolean boolean65 = cell7.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int69 = board68.getSize();
        ar.edu.unrc.game2048.Board board70 = new ar.edu.unrc.game2048.Board(board68);
        ar.edu.unrc.game2048.Cell cell74 = new ar.edu.unrc.game2048.Cell(2);
        board70.setCell((int) (byte) 1, 32, cell74);
        java.lang.String str76 = cell74.toString();
        ar.edu.unrc.game2048.Board board79 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet80 = board79.getEmptyPositions();
        boolean boolean81 = board79.moveDown();
        int int82 = board79.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet83 = board79.getEmptyPositions();
        boolean boolean84 = cell74.equals((java.lang.Object) board79);
        boolean boolean85 = cell7.equals((java.lang.Object) cell74);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32" + "'", str23, "32");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "2" + "'", str76, "2");
        org.junit.Assert.assertNotNull(positionSet80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(positionSet83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        int int7 = board5.getSize();
        boolean boolean8 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass10 = cell9.getClass();
        boolean boolean11 = board5.equals((java.lang.Object) cell9);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        boolean boolean16 = board5.equals((java.lang.Object) positionSet15);
        boolean boolean17 = position2.equals((java.lang.Object) boolean16);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.String str9 = cell0.toString();
        java.lang.String str10 = cell0.toString();
        boolean boolean11 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        boolean boolean31 = cell0.canMergeWith(cell28);
        int int32 = cell28.getValue();
        ar.edu.unrc.game2048.Cell cell33 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet37 = board36.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell40 = board36.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean41 = cell33.canMergeWith(cell40);
        ar.edu.unrc.game2048.Cell cell42 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet46 = board45.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell49 = board45.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean50 = cell42.canMergeWith(cell49);
        boolean boolean51 = cell40.canMergeWith(cell49);
        boolean boolean52 = cell40.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell53 = cell28.mergeWith(cell40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertNotNull(positionSet37);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell42);
        org.junit.Assert.assertNotNull(positionSet46);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int9 = board8.getSize();
        boolean boolean10 = board8.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        int int20 = cell18.getValue();
        boolean boolean21 = board8.equals((java.lang.Object) int20);
        boolean boolean22 = board2.equals((java.lang.Object) boolean21);
        boolean boolean23 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) ' ', (int) (short) -1);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        int int19 = position2.col;
        java.lang.String str20 = position2.toString();
        java.lang.String str21 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(0, 52)" + "'", str20, "(0, 52)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0, 52)" + "'", str21, "(0, 52)");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(52, (int) (byte) 10);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        java.lang.String str12 = cell3.toString();
        java.lang.String str13 = cell3.toString();
        boolean boolean14 = position2.equals((java.lang.Object) str13);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("4", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        boolean boolean8 = board2.isFull();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.tileAmount();
        board2.clearBoard();
        boolean boolean7 = board2.moveDown();
        java.lang.Class<?> wildcardClass8 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        int int8 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        boolean boolean15 = board13.moveRight();
        boolean boolean16 = board13.moveDown();
        ar.edu.unrc.game2048.Board.Position position21 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean23 = position21.equals((java.lang.Object) 1);
        int int24 = position21.col;
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        int int29 = board27.getSize();
        boolean boolean30 = board27.isFull();
        int int31 = board27.tileAmount();
        boolean boolean32 = position21.equals((java.lang.Object) board27);
        boolean boolean33 = board27.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell37 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str38 = cell37.toString();
        boolean boolean39 = cell37.isEmpty();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        int int44 = board42.getSize();
        boolean boolean45 = board42.isFull();
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass47 = cell46.getClass();
        boolean boolean48 = board42.equals((java.lang.Object) cell46);
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board42);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet50 = board42.getEmptyPositions();
        boolean boolean51 = cell37.equals((java.lang.Object) board42);
        board27.setCell((int) (byte) 1, (int) '4', cell37);
        board13.setCell(1, (int) '#', cell37);
        boolean boolean54 = cell37.isEmpty();
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet58 = board57.getEmptyPositions();
        boolean boolean59 = board57.moveLeft();
        int int60 = board57.getSize();
        boolean boolean61 = cell37.equals((java.lang.Object) board57);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 100, (int) (byte) 100, cell37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "32" + "'", str38, "32");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(positionSet50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(positionSet58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean4 = board2.equals((java.lang.Object) 1.0d);
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.moveLeft();
        boolean boolean11 = board9.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board2.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.isLosingBoard();
        boolean boolean11 = board9.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board9.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        int int3 = position2.col;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        boolean boolean21 = cell10.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean24 = cell19.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        java.lang.String str34 = cell25.toString();
        boolean boolean35 = cell23.canMergeWith(cell25);
        boolean boolean36 = position2.equals((java.lang.Object) cell25);
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int40 = board39.getSize();
        boolean boolean41 = board39.moveDown();
        boolean boolean42 = board39.moveRight();
        board39.clearBoard();
        board39.clearBoard();
        boolean boolean45 = position2.equals((java.lang.Object) board39);
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet49 = board48.getEmptyPositions();
        int int50 = board48.getSize();
        boolean boolean51 = board48.isFull();
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass53 = cell52.getClass();
        boolean boolean54 = board48.equals((java.lang.Object) cell52);
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet58 = board57.getEmptyPositions();
        boolean boolean59 = board48.equals((java.lang.Object) positionSet58);
        boolean boolean60 = position2.equals((java.lang.Object) boolean59);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(positionSet58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, 3);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        int int6 = position2.row;
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board9.moveDown();
        boolean boolean12 = board9.moveRight();
        boolean boolean13 = board9.isLosingBoard();
        boolean boolean14 = position2.equals((java.lang.Object) boolean13);
        int int15 = position2.row;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        int int21 = board18.getScore();
        boolean boolean22 = board18.isFull();
        int int23 = board18.getSize();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean25 = board18.isLosingBoard();
        boolean boolean26 = position2.equals((java.lang.Object) boolean25);
        int int27 = position2.col;
        java.lang.String str28 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 52 + "'", int27 == 52);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "(0, 52)" + "'", str28, "(0, 52)");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, (int) (short) 0);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int13 = cell12.getValue();
        boolean boolean15 = cell12.equals((java.lang.Object) 100);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = cell11.mergeWith(cell12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 52);
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        boolean boolean11 = cell1.isEmpty();
        java.lang.String str12 = cell1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32" + "'", str12, "32");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        boolean boolean9 = board6.isFull();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass11 = cell10.getClass();
        boolean boolean12 = board6.equals((java.lang.Object) cell10);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board6);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board6.getEmptyPositions();
        boolean boolean15 = cell1.equals((java.lang.Object) board6);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean24 = cell16.canMergeWith(cell23);
        boolean boolean25 = cell1.canMergeWith(cell23);
        boolean boolean26 = cell1.isEmpty();
        ar.edu.unrc.game2048.Cell cell27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = cell1.canMergeWith(cell27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"value\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(2, (int) 'a');
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        int int9 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = cell6.isEmpty();
        boolean boolean8 = cell6.isEmpty();
        int int9 = cell6.getValue();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) (short) 0, (int) 'a');
        boolean boolean12 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        int int7 = board2.getSize();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean14 = board12.equals((java.lang.Object) 1.0d);
        boolean boolean15 = board12.isLosingBoard();
        boolean boolean16 = board12.moveDown();
        ar.edu.unrc.game2048.Cell cell19 = board12.getCell(0, 32);
        board2.setCell((int) '#', 3, cell19);
        ar.edu.unrc.game2048.Cell cell21 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell22 = cell19.mergeWith(cell21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ar.edu.unrc.game2048.Cell.isEmpty()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell19);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) ' ');
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, 32)" + "'", str3, "(1, 32)");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(100, 1)", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (100, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        int int9 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(-1, -1)", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (-1, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        boolean boolean11 = board2.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = board15.isLosingBoard();
        board15.clearBoard();
        boolean boolean23 = board15.equals((java.lang.Object) (-1));
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board15.getEmptyPositions();
        boolean boolean25 = board2.equals((java.lang.Object) positionSet24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean10 = cell2.canMergeWith(cell9);
        java.lang.String str11 = cell2.toString();
        java.lang.String str12 = cell2.toString();
        boolean boolean13 = cell2.isEmpty();
        boolean boolean14 = cell1.canMergeWith(cell2);
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean23 = cell15.canMergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell22.canMergeWith(cell24);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = cell2.mergeWith(cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 32);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        board2.setCell((int) ' ', 32, cell12);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean24 = cell16.canMergeWith(cell23);
        java.lang.String str25 = cell16.toString();
        boolean boolean26 = cell12.canMergeWith(cell16);
        java.lang.String str27 = cell16.toString();
        java.lang.Class<?> wildcardClass28 = cell16.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32" + "'", str13, "32");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.tileAmount();
        boolean boolean9 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, 3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("32", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell((int) ' ');
        int int12 = cell11.getValue();
        boolean boolean13 = cell8.canMergeWith(cell11);
        boolean boolean14 = cell11.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, (int) (short) 100);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        int int14 = board8.tileAmount();
        boolean boolean15 = board8.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(1, 32)", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (1, 32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str19 = position2.toString();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean28 = board22.moveUp();
        boolean boolean29 = position2.equals((java.lang.Object) board22);
        int int30 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, 52)" + "'", str19, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (int) ' ');
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        boolean boolean9 = board2.moveDown();
        boolean boolean10 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.moveRight();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveRight();
        boolean boolean15 = board12.moveDown();
        ar.edu.unrc.game2048.Board.Position position20 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean22 = position20.equals((java.lang.Object) 1);
        int int23 = position20.col;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        int int28 = board26.getSize();
        boolean boolean29 = board26.isFull();
        int int30 = board26.tileAmount();
        boolean boolean31 = position20.equals((java.lang.Object) board26);
        boolean boolean32 = board26.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str37 = cell36.toString();
        boolean boolean38 = cell36.isEmpty();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        int int43 = board41.getSize();
        boolean boolean44 = board41.isFull();
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass46 = cell45.getClass();
        boolean boolean47 = board41.equals((java.lang.Object) cell45);
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board41);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet49 = board41.getEmptyPositions();
        boolean boolean50 = cell36.equals((java.lang.Object) board41);
        board26.setCell((int) (byte) 1, (int) '4', cell36);
        board12.setCell(1, (int) '#', cell36);
        boolean boolean53 = cell36.isEmpty();
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board56.getEmptyPositions();
        boolean boolean58 = board56.moveLeft();
        int int59 = board56.getSize();
        boolean boolean60 = cell36.equals((java.lang.Object) board56);
        board2.setCell((int) (short) 0, (int) (short) 0, cell36);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "32" + "'", str37, "32");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveDown();
        boolean boolean14 = board11.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell17 = board11.getCell(32, (int) (short) 1);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int21 = board20.getSize();
        boolean boolean22 = board20.moveDown();
        board20.clearBoard();
        ar.edu.unrc.game2048.Cell cell26 = board20.getCell(4, (int) (byte) 1);
        boolean boolean27 = board20.moveLeft();
        ar.edu.unrc.game2048.Cell cell30 = board20.getCell(10, (int) (byte) 1);
        boolean boolean31 = cell17.canMergeWith(cell30);
        boolean boolean32 = board2.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(1, 0)", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (1, 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        int int3 = position2.row;
        int int4 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(10, (int) '#');
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) ' ', (int) '#');
        boolean boolean12 = board2.equals((java.lang.Object) board11);
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        board2.clearBoard();
        boolean boolean17 = board2.moveUp();
        boolean boolean18 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveRight();
        int int11 = board2.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board14);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board14.getEmptyPositions();
        boolean boolean21 = board2.equals((java.lang.Object) positionSet20);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(32, (int) (short) 1);
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board.Position position12 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str13 = position12.toString();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        int int18 = board16.getSize();
        board16.clearBoard();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int23 = board22.getSize();
        boolean boolean24 = board22.moveDown();
        int int25 = board22.getScore();
        boolean boolean26 = board22.moveRight();
        boolean boolean27 = board16.equals((java.lang.Object) boolean26);
        boolean boolean28 = position12.equals((java.lang.Object) boolean26);
        int int29 = position12.col;
        boolean boolean30 = board2.equals((java.lang.Object) int29);
        boolean boolean31 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0, 52)" + "'", str13, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 52 + "'", int29 == 52);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(32, 2);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.row;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 52)" + "'", str6, "(0, 52)");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int10 = board9.getSize();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board11.equals((java.lang.Object) (short) -1);
        boolean boolean14 = board2.equals((java.lang.Object) board11);
        boolean boolean15 = board2.isWinningBoard();
        java.lang.Class<?> wildcardClass16 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board2.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean14 = board2.moveRight();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.hasEmptyCells();
        board8.clearBoard();
        boolean boolean16 = board8.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass17 = cell16.getClass();
        boolean boolean18 = board12.equals((java.lang.Object) cell16);
        boolean boolean19 = cell7.equals((java.lang.Object) cell16);
        int int20 = cell7.getValue();
        ar.edu.unrc.game2048.Cell cell22 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str23 = cell22.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int27 = board26.getSize();
        boolean boolean28 = board26.moveDown();
        boolean boolean29 = board26.moveRight();
        board26.clearBoard();
        boolean boolean31 = cell22.equals((java.lang.Object) board26);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int35 = board34.getSize();
        boolean boolean36 = board34.moveDown();
        boolean boolean37 = board34.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell40 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board43.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell47 = board43.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean48 = cell40.canMergeWith(cell47);
        int int49 = cell47.getValue();
        int int50 = cell47.getValue();
        board34.setCell((int) (short) 1, 0, cell47);
        java.lang.String str52 = cell47.toString();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board56.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean61 = cell53.canMergeWith(cell60);
        boolean boolean62 = cell47.canMergeWith(cell60);
        boolean boolean63 = cell22.canMergeWith(cell47);
        boolean boolean64 = cell22.isEmpty();
        boolean boolean65 = cell7.canMergeWith(cell22);
        int int66 = cell22.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32" + "'", str23, "32");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell40);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 32 + "'", int66 == 32);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        board2.clearBoard();
        board2.clearBoard();
        int int8 = board2.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        int int15 = board13.getSize();
        board13.clearBoard();
        boolean boolean17 = board13.moveDown();
        int int18 = board13.getScore();
        boolean boolean19 = board13.moveDown();
        ar.edu.unrc.game2048.Cell cell22 = board13.getCell(0, 3);
        java.lang.String str23 = cell22.toString();
        int int24 = cell22.getValue();
        boolean boolean25 = cell22.isEmpty();
        boolean boolean26 = cell22.isEmpty();
        boolean boolean27 = cell22.isEmpty();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean36 = cell28.canMergeWith(cell35);
        int int37 = cell35.getValue();
        int int38 = cell35.getValue();
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        int int43 = board41.getSize();
        boolean boolean44 = cell35.equals((java.lang.Object) board41);
        boolean boolean45 = cell22.canMergeWith(cell35);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) -1, (int) (byte) 0, cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveUp();
        boolean boolean9 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell((int) '4', (int) 'a');
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, 5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        java.lang.Class<?> wildcardClass19 = position2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        int int10 = board2.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell(0, 0);
        java.lang.Class<?> wildcardClass13 = cell12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 100.0d);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        board8.clearBoard();
        boolean boolean12 = board8.moveDown();
        int int13 = board8.getScore();
        boolean boolean14 = board8.isFull();
        boolean boolean15 = board8.isWinningBoard();
        boolean boolean16 = position2.equals((java.lang.Object) board8);
        boolean boolean17 = board8.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        boolean boolean18 = cell7.canMergeWith(cell16);
        boolean boolean19 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str24 = cell23.toString();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int28 = board27.getSize();
        boolean boolean29 = board27.moveDown();
        boolean boolean30 = board27.moveRight();
        board27.clearBoard();
        boolean boolean32 = cell23.equals((java.lang.Object) board27);
        int int33 = cell23.getValue();
        boolean boolean34 = cell21.canMergeWith(cell23);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell35 = cell7.mergeWith(cell23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "32" + "'", str24, "32");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        boolean boolean12 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell15 = board2.getCell(1, (int) (short) 1);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell15);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board2.equals((java.lang.Object) positionSet10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(positionSet12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell7.canMergeWith(cell9);
        boolean boolean11 = cell9.isEmpty();
        java.lang.String str12 = cell9.toString();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int16 = board15.getSize();
        boolean boolean17 = board15.moveDown();
        boolean boolean18 = board15.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        int int30 = cell28.getValue();
        int int31 = cell28.getValue();
        board15.setCell((int) (short) 1, 0, cell28);
        java.lang.String str33 = cell28.toString();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        boolean boolean43 = cell28.canMergeWith(cell41);
        java.lang.String str44 = cell41.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell45 = cell9.mergeWith(cell41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "." + "'", str44, ".");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isWinningBoard();
        boolean boolean6 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        boolean boolean21 = cell10.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean24 = cell19.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        java.lang.String str34 = cell25.toString();
        boolean boolean35 = cell23.canMergeWith(cell25);
        boolean boolean36 = position2.equals((java.lang.Object) cell25);
        java.lang.String str37 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean47 = cell39.canMergeWith(cell46);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell55 = board51.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean56 = cell48.canMergeWith(cell55);
        boolean boolean57 = cell46.canMergeWith(cell55);
        ar.edu.unrc.game2048.Cell cell59 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean60 = cell55.canMergeWith(cell59);
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean69 = cell61.canMergeWith(cell68);
        java.lang.String str70 = cell61.toString();
        boolean boolean71 = cell59.canMergeWith(cell61);
        boolean boolean72 = cell38.canMergeWith(cell59);
        boolean boolean73 = cell25.equals((java.lang.Object) cell59);
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int77 = board76.getSize();
        boolean boolean78 = board76.moveDown();
        board76.clearBoard();
        ar.edu.unrc.game2048.Cell cell82 = board76.getCell(4, (int) (byte) 1);
        boolean boolean83 = board76.moveLeft();
        ar.edu.unrc.game2048.Cell cell86 = board76.getCell(10, (int) (byte) 1);
        ar.edu.unrc.game2048.Board board89 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int90 = board89.getSize();
        boolean boolean91 = board89.moveDown();
        board89.clearBoard();
        int int93 = board89.tileAmount();
        boolean boolean95 = board89.equals((java.lang.Object) 10.0d);
        int int96 = board89.getScore();
        int int97 = board89.tileAmount();
        boolean boolean98 = cell86.equals((java.lang.Object) int97);
        boolean boolean99 = cell59.canMergeWith(cell86);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(cell82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(cell86);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 100 + "'", int90 == 100);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 3 + "'", int93 == 3);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 3 + "'", int97 == 3);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 10, (int) (byte) 1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass4 = cell3.getClass();
        boolean boolean5 = board2.equals((java.lang.Object) cell3);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Board is full, no empty positions available.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        boolean boolean16 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell19 = board2.getCell(4, 52);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int23 = board22.getSize();
        boolean boolean24 = board22.moveDown();
        boolean boolean25 = board22.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean36 = cell28.canMergeWith(cell35);
        int int37 = cell35.getValue();
        int int38 = cell35.getValue();
        board22.setCell((int) (short) 1, 0, cell35);
        java.lang.String str40 = cell35.toString();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board44.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell48 = board44.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean49 = cell41.canMergeWith(cell48);
        boolean boolean50 = cell35.canMergeWith(cell48);
        java.lang.String str51 = cell48.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell52 = cell19.mergeWith(cell48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isFull();
        board2.clearBoard();
        boolean boolean10 = board2.moveRight();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) 'a');
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.moveDown();
        boolean boolean9 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int20 = board19.getSize();
        boolean boolean21 = board19.moveDown();
        board19.clearBoard();
        boolean boolean23 = board19.moveRight();
        boolean boolean24 = cell16.equals((java.lang.Object) boolean23);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int28 = board27.getSize();
        boolean boolean29 = board27.moveDown();
        board27.clearBoard();
        ar.edu.unrc.game2048.Cell cell33 = board27.getCell(4, (int) (byte) 1);
        boolean boolean34 = board27.moveLeft();
        int int35 = board27.getScore();
        boolean boolean36 = board27.moveUp();
        int int37 = board27.getScore();
        boolean boolean38 = cell16.equals((java.lang.Object) board27);
        board2.setCell(4, 32, cell16);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        int int4 = position2.row;
        int int5 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveRight();
        int int11 = board2.getSize();
        int int12 = board2.getSize();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        int int9 = board2.getScore();
        boolean boolean10 = board2.isFull();
        int int11 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', 2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        boolean boolean8 = board2.moveDown();
        boolean boolean9 = board2.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.isLosingBoard();
        int int10 = board2.tileAmount();
        int int11 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', 2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell5 = board2.getCell((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (97, 10) is out of bounds for board size 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (byte) 10);
        java.lang.String str3 = position2.toString();
        int int4 = position2.col;
        int int5 = position2.row;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = board8.isLosingBoard();
        board8.clearBoard();
        boolean boolean16 = board8.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board8);
        int int18 = board8.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board8.getEmptyPositions();
        boolean boolean20 = position2.equals((java.lang.Object) positionSet19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, 10)" + "'", str3, "(-1, 10)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell(0, 0);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean21 = cell13.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean23 = cell20.canMergeWith(cell22);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell24 = cell12.mergeWith(cell22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        int int9 = board2.getScore();
        boolean boolean10 = board2.isWinningBoard();
        boolean boolean11 = board2.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean12 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(10, (int) (short) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board((int) ' ', (int) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        boolean boolean7 = board2.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell10.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean20 = cell17.canMergeWith(cell19);
        java.lang.String str21 = cell19.toString();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(0, (int) (short) 100, cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        int int11 = board2.tileAmount();
        boolean boolean12 = board2.hasEmptyCells();
        boolean boolean13 = board2.moveLeft();
        int int14 = board2.getSize();
        java.lang.Class<?> wildcardClass15 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell7.canMergeWith(cell9);
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        int int20 = cell18.getValue();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        int int25 = board23.getSize();
        boolean boolean26 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass28 = cell27.getClass();
        boolean boolean29 = board23.equals((java.lang.Object) cell27);
        boolean boolean30 = cell18.equals((java.lang.Object) cell27);
        int int31 = cell18.getValue();
        boolean boolean32 = cell9.canMergeWith(cell18);
        java.lang.String str33 = cell18.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board8.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int10 = board9.getSize();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean13 = board11.equals((java.lang.Object) (short) -1);
        boolean boolean14 = board2.equals((java.lang.Object) board11);
        boolean boolean15 = board11.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell18 = board11.getCell((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(-1, -1)", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (-1, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        board2.clearBoard();
        board2.clearBoard();
        int int8 = board2.getSize();
        java.lang.Class<?> wildcardClass9 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, (int) (short) 0);
        boolean boolean12 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell21 = board17.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean22 = cell14.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean31 = cell23.canMergeWith(cell30);
        boolean boolean32 = cell21.canMergeWith(cell30);
        ar.edu.unrc.game2048.Cell cell34 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean35 = cell30.canMergeWith(cell34);
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell43 = board39.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean44 = cell36.canMergeWith(cell43);
        java.lang.String str45 = cell36.toString();
        boolean boolean46 = cell34.canMergeWith(cell36);
        boolean boolean47 = cell13.canMergeWith(cell34);
        int int48 = cell34.getValue();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        int int53 = board51.getSize();
        board51.clearBoard();
        boolean boolean55 = board51.moveDown();
        int int56 = board51.getScore();
        boolean boolean57 = board51.moveDown();
        ar.edu.unrc.game2048.Cell cell60 = board51.getCell(0, 3);
        boolean boolean61 = cell34.canMergeWith(cell60);
        ar.edu.unrc.game2048.Cell cell63 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str64 = cell63.toString();
        boolean boolean65 = cell63.isEmpty();
        ar.edu.unrc.game2048.Cell cell66 = cell34.mergeWith(cell63);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell67 = cell11.mergeWith(cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 32 + "'", int48 == 32);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "32" + "'", str64, "32");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(cell66);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        board12.clearBoard();
        boolean boolean16 = board12.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveRight();
        boolean boolean19 = board12.isWinningBoard();
        boolean boolean20 = board12.isWinningBoard();
        boolean boolean21 = cell8.equals((java.lang.Object) board12);
        int int22 = cell8.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean16 = cell8.canMergeWith(cell15);
        int int17 = cell15.getValue();
        int int18 = cell15.getValue();
        board2.setCell((int) (short) 1, 0, cell15);
        java.lang.String str20 = cell15.toString();
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell15.canMergeWith(cell28);
        boolean boolean31 = cell28.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        boolean boolean11 = board2.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean16 = board14.equals((java.lang.Object) 1.0d);
        boolean boolean17 = board14.isLosingBoard();
        boolean boolean18 = board14.moveDown();
        ar.edu.unrc.game2048.Cell cell21 = board14.getCell(0, 32);
        boolean boolean22 = board2.equals((java.lang.Object) 32);
        boolean boolean23 = board2.hasEmptyCells();
        boolean boolean24 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        int int7 = board5.getSize();
        boolean boolean8 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass10 = cell9.getClass();
        boolean boolean11 = board5.equals((java.lang.Object) cell9);
        boolean boolean12 = board5.isFull();
        boolean boolean13 = board5.isFull();
        boolean boolean14 = position2.equals((java.lang.Object) boolean13);
        int int15 = position2.col;
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        int int10 = cell7.getValue();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        int int15 = board13.getSize();
        boolean boolean16 = cell7.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean25 = cell17.canMergeWith(cell24);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean34 = cell26.canMergeWith(cell33);
        boolean boolean35 = cell24.canMergeWith(cell33);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell36 = cell7.mergeWith(cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) ' ');
        int int3 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.hasEmptyCells();
        int int11 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        int int9 = board7.getSize();
        boolean boolean10 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass12 = cell11.getClass();
        boolean boolean13 = board7.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean15 = board2.equals((java.lang.Object) board7);
        boolean boolean16 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.moveRight();
        java.lang.Class<?> wildcardClass7 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        board5.clearBoard();
        boolean boolean9 = board5.hasEmptyCells();
        boolean boolean10 = board5.moveRight();
        int int11 = board5.getSize();
        int int12 = board5.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board5.getEmptyPositions();
        boolean boolean14 = position2.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Cell cell17 = board5.getCell((int) 'a', 10);
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int21 = board20.getSize();
        boolean boolean22 = board20.moveDown();
        boolean boolean23 = board20.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell26 = board20.getCell(32, (int) (short) 1);
        ar.edu.unrc.game2048.Board.Position position29 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int30 = position29.row;
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        boolean boolean35 = board33.moveDown();
        int int36 = board33.getScore();
        boolean boolean37 = position29.equals((java.lang.Object) int36);
        boolean boolean38 = cell26.equals((java.lang.Object) int36);
        boolean boolean39 = cell17.canMergeWith(cell26);
        ar.edu.unrc.game2048.Cell cell40 = null;
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell41 = cell26.mergeWith(cell40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"ar.edu.unrc.game2048.Cell.isEmpty()\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        boolean boolean14 = cell11.isEmpty();
        boolean boolean15 = cell11.isEmpty();
        boolean boolean16 = cell11.isEmpty();
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean25 = cell17.canMergeWith(cell24);
        int int26 = cell24.getValue();
        int int27 = cell24.getValue();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        int int32 = board30.getSize();
        boolean boolean33 = cell24.equals((java.lang.Object) board30);
        boolean boolean34 = cell11.canMergeWith(cell24);
        ar.edu.unrc.game2048.Cell cell36 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str37 = cell36.toString();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int41 = board40.getSize();
        boolean boolean42 = board40.moveDown();
        boolean boolean43 = board40.moveRight();
        board40.clearBoard();
        boolean boolean45 = cell36.equals((java.lang.Object) board40);
        boolean boolean46 = cell36.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell47 = cell11.mergeWith(cell36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "32" + "'", str37, "32");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.moveRight();
        boolean boolean7 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        int int14 = cell12.getValue();
        boolean boolean15 = board2.equals((java.lang.Object) int14);
        board2.clearBoard();
        int int17 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int21 = board20.getSize();
        boolean boolean22 = board20.moveRight();
        boolean boolean23 = board20.moveDown();
        ar.edu.unrc.game2048.Board.Position position28 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean30 = position28.equals((java.lang.Object) 1);
        int int31 = position28.col;
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board34.getEmptyPositions();
        int int36 = board34.getSize();
        boolean boolean37 = board34.isFull();
        int int38 = board34.tileAmount();
        boolean boolean39 = position28.equals((java.lang.Object) board34);
        boolean boolean40 = board34.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell44 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str45 = cell44.toString();
        boolean boolean46 = cell44.isEmpty();
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet50 = board49.getEmptyPositions();
        int int51 = board49.getSize();
        boolean boolean52 = board49.isFull();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass54 = cell53.getClass();
        boolean boolean55 = board49.equals((java.lang.Object) cell53);
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(board49);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board49.getEmptyPositions();
        boolean boolean58 = cell44.equals((java.lang.Object) board49);
        board34.setCell((int) (byte) 1, (int) '4', cell44);
        board20.setCell(1, (int) '#', cell44);
        boolean boolean61 = board2.equals((java.lang.Object) board20);
        int int62 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "32" + "'", str45, "32");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(positionSet50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(wildcardClass54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int9 = board8.getSize();
        boolean boolean10 = board8.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = cell11.canMergeWith(cell18);
        int int20 = cell18.getValue();
        boolean boolean21 = board8.equals((java.lang.Object) int20);
        boolean boolean22 = board2.equals((java.lang.Object) boolean21);
        int int23 = board2.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        board12.clearBoard();
        boolean boolean16 = board12.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveRight();
        boolean boolean19 = board12.isWinningBoard();
        boolean boolean20 = board12.isWinningBoard();
        boolean boolean21 = cell8.equals((java.lang.Object) board12);
        boolean boolean22 = board12.moveRight();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board12.getEmptyPositions();
        boolean boolean24 = board12.moveRight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 10, (int) (short) 1);
        int int3 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(10, -1)" + "'", str3, "(10, -1)");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveRight();
        int int9 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        boolean boolean9 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str14 = cell13.toString();
        boolean boolean15 = cell13.isEmpty();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        int int20 = board18.getSize();
        boolean boolean21 = board18.isFull();
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass23 = cell22.getClass();
        boolean boolean24 = board18.equals((java.lang.Object) cell22);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board18);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board18.getEmptyPositions();
        boolean boolean27 = cell13.equals((java.lang.Object) board18);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell35 = board31.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean36 = cell28.canMergeWith(cell35);
        boolean boolean37 = cell13.canMergeWith(cell35);
        java.lang.String str38 = cell13.toString();
        board2.setCell(0, (int) (byte) 10, cell13);
        boolean boolean40 = cell13.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32" + "'", str14, "32");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "32" + "'", str38, "32");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(3, 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean9 = board2.moveUp();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.moveDown();
        boolean boolean12 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(10, (int) '#');
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board((int) ' ', (int) '#');
        boolean boolean12 = board2.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Cell cell15 = board2.getCell((int) ' ', (int) (short) 1);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        board18.clearBoard();
        ar.edu.unrc.game2048.Cell cell24 = board18.getCell(4, (int) (byte) 1);
        boolean boolean25 = board18.moveLeft();
        ar.edu.unrc.game2048.Cell cell28 = board18.getCell(10, (int) (byte) 1);
        boolean boolean29 = cell28.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell30 = cell15.mergeWith(cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        boolean boolean20 = position2.equals((java.lang.Object) "");
        java.lang.String str21 = position2.toString();
        int int22 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(0, 52)" + "'", str21, "(0, 52)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        int int8 = board2.tileAmount();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(3, 1);
        boolean boolean12 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board10.moveDown();
        boolean boolean12 = board10.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, 4);
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        java.lang.String str14 = cell5.toString();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean23 = cell15.canMergeWith(cell22);
        ar.edu.unrc.game2048.Cell cell24 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean25 = cell22.canMergeWith(cell24);
        boolean boolean26 = cell5.canMergeWith(cell24);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (short) 100, 0, cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.moveDown();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean4 = board2.equals((java.lang.Object) 1.0d);
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell9 = board2.getCell(0, 32);
        java.lang.String str10 = cell9.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        int int11 = board2.getSize();
        boolean boolean12 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, -1)", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        java.lang.Class<?> wildcardClass11 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.moveRight();
        boolean boolean7 = board2.moveLeft();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell10 = board2.getCell((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell10);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        boolean boolean12 = board2.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board2.getCell((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell11 = board8.getCell(10, (int) (short) 1);
        int int12 = cell11.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean9 = board2.hasEmptyCells();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell12 = board2.getCell((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        int int9 = board7.getSize();
        boolean boolean10 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass12 = cell11.getClass();
        boolean boolean13 = board7.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean15 = board2.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Cell cell18 = board2.getCell(1, (int) '#');
        boolean boolean19 = board2.isFull();
        ar.edu.unrc.game2048.Board.Position position22 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str23 = position22.toString();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        int int28 = board26.getSize();
        board26.clearBoard();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int33 = board32.getSize();
        boolean boolean34 = board32.moveDown();
        int int35 = board32.getScore();
        boolean boolean36 = board32.moveRight();
        boolean boolean37 = board26.equals((java.lang.Object) boolean36);
        boolean boolean38 = position22.equals((java.lang.Object) boolean36);
        java.lang.String str39 = position22.toString();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean48 = board42.moveUp();
        boolean boolean49 = position22.equals((java.lang.Object) board42);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet53 = board52.getEmptyPositions();
        int int54 = board52.getSize();
        board52.clearBoard();
        boolean boolean56 = board52.moveDown();
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(board52);
        boolean boolean58 = board52.moveRight();
        ar.edu.unrc.game2048.Board board59 = new ar.edu.unrc.game2048.Board(board52);
        boolean boolean60 = position22.equals((java.lang.Object) board52);
        boolean boolean61 = board2.equals((java.lang.Object) position22);
        int int62 = position22.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(0, 52)" + "'", str23, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "(0, 52)" + "'", str39, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(positionSet53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        int int11 = board2.getSize();
        boolean boolean12 = board2.moveRight();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(3, (int) '#');
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass4 = positionSet3.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.moveLeft();
        int int13 = board10.getSize();
        boolean boolean14 = board10.isLosingBoard();
        boolean boolean15 = board10.moveLeft();
        int int16 = board10.getSize();
        boolean boolean17 = board2.equals((java.lang.Object) board10);
        boolean boolean18 = board10.moveUp();
        boolean boolean19 = board10.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        int int10 = board9.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 52)", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 52)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        int int11 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(2);
        boolean boolean14 = cell1.canMergeWith(cell13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        board6.clearBoard();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        int int15 = board12.getScore();
        boolean boolean16 = board12.moveRight();
        boolean boolean17 = board6.equals((java.lang.Object) boolean16);
        boolean boolean18 = position2.equals((java.lang.Object) boolean16);
        java.lang.String str19 = position2.toString();
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board22);
        boolean boolean28 = board22.moveUp();
        boolean boolean29 = position2.equals((java.lang.Object) board22);
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        int int34 = board32.getSize();
        board32.clearBoard();
        boolean boolean36 = board32.moveDown();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean38 = board32.moveRight();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board32);
        boolean boolean40 = position2.equals((java.lang.Object) board32);
        int int41 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 52)" + "'", str3, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(0, 52)" + "'", str19, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Board is full, no empty positions available.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        int int7 = board2.tileAmount();
        boolean boolean8 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("32", 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, (int) (short) 0);
        boolean boolean12 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass6 = cell5.getClass();
        boolean boolean7 = board2.equals((java.lang.Object) cell5);
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveUp();
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 100, (int) (byte) 100);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        boolean boolean18 = cell7.canMergeWith(cell16);
        ar.edu.unrc.game2048.Cell cell20 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean21 = cell16.canMergeWith(cell20);
        ar.edu.unrc.game2048.Cell cell22 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board25.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell29 = board25.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean30 = cell22.canMergeWith(cell29);
        java.lang.String str31 = cell22.toString();
        boolean boolean32 = cell20.canMergeWith(cell22);
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        int int37 = board35.getSize();
        board35.clearBoard();
        boolean boolean39 = board35.moveDown();
        int int40 = board35.getScore();
        boolean boolean41 = board35.moveDown();
        ar.edu.unrc.game2048.Cell cell44 = board35.getCell(0, 3);
        java.lang.String str45 = cell44.toString();
        int int46 = cell44.getValue();
        boolean boolean47 = cell44.isEmpty();
        boolean boolean48 = cell44.isEmpty();
        boolean boolean49 = cell44.isEmpty();
        java.lang.String str50 = cell44.toString();
        boolean boolean51 = cell22.canMergeWith(cell44);
        java.lang.String str52 = cell44.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertNotNull(positionSet26);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "." + "'", str31, ".");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "." + "'", str50, ".");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "." + "'", str52, ".");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int6 = position5.row;
        java.lang.String str7 = position5.toString();
        boolean boolean8 = position2.equals((java.lang.Object) position5);
        java.lang.String str9 = position5.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        boolean boolean15 = board12.isLosingBoard();
        boolean boolean16 = board12.isLosingBoard();
        boolean boolean17 = position5.equals((java.lang.Object) board12);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int23 = board22.getSize();
        boolean boolean24 = board22.moveDown();
        boolean boolean25 = board22.isLosingBoard();
        boolean boolean26 = board22.isLosingBoard();
        int int27 = board22.getScore();
        boolean boolean28 = board22.moveRight();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int34 = board33.getSize();
        boolean boolean35 = board33.moveDown();
        board33.clearBoard();
        ar.edu.unrc.game2048.Cell cell39 = board33.getCell(4, (int) (byte) 1);
        java.lang.String str40 = cell39.toString();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board43.getEmptyPositions();
        int int45 = board43.getSize();
        board43.clearBoard();
        boolean boolean47 = board43.moveDown();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(board43);
        boolean boolean49 = board43.moveRight();
        boolean boolean50 = board43.isWinningBoard();
        boolean boolean51 = board43.isWinningBoard();
        boolean boolean52 = cell39.equals((java.lang.Object) board43);
        board22.setCell(10, 10, cell39);
        board12.setCell((int) (byte) 1, (int) (byte) 10, cell39);
        java.lang.Class<?> wildcardClass55 = cell39.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, -1)" + "'", str7, "(0, -1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, -1)" + "'", str9, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "." + "'", str40, ".");
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        java.lang.String str12 = cell11.toString();
        int int13 = cell11.getValue();
        boolean boolean14 = cell11.isEmpty();
        boolean boolean15 = cell11.isEmpty();
        boolean boolean16 = cell11.isEmpty();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int20 = board19.getSize();
        boolean boolean21 = board19.moveDown();
        int int22 = board19.getScore();
        boolean boolean23 = board19.isFull();
        int int24 = board19.getSize();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean31 = board29.equals((java.lang.Object) 1.0d);
        boolean boolean32 = board29.isLosingBoard();
        boolean boolean33 = board29.moveDown();
        ar.edu.unrc.game2048.Cell cell36 = board29.getCell(0, 32);
        board19.setCell((int) '#', 3, cell36);
        boolean boolean38 = cell11.canMergeWith(cell36);
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        int int43 = board41.getSize();
        board41.clearBoard();
        boolean boolean45 = board41.moveDown();
        int int46 = board41.getScore();
        boolean boolean47 = board41.moveDown();
        boolean boolean48 = board41.moveLeft();
        boolean boolean49 = cell36.equals((java.lang.Object) board41);
        int int50 = cell36.getValue();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, 1);
        int int3 = position2.col;
        int int4 = position2.col;
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', 2);
        int int3 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(positionSet4);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell0.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveUp();
        boolean boolean20 = board12.equals((java.lang.Object) 100.0d);
        boolean boolean21 = cell0.equals((java.lang.Object) boolean20);
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        int int26 = board24.getSize();
        boolean boolean27 = board24.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board24.getEmptyPositions();
        boolean boolean29 = board24.isFull();
        boolean boolean30 = cell0.equals((java.lang.Object) board24);
        int int31 = cell0.getValue();
        java.lang.String str32 = cell0.toString();
        int int33 = cell0.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell2 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell9 = board5.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean10 = cell2.canMergeWith(cell9);
        java.lang.String str11 = cell2.toString();
        java.lang.String str12 = cell2.toString();
        boolean boolean13 = cell2.isEmpty();
        boolean boolean14 = cell1.canMergeWith(cell2);
        int int15 = cell1.getValue();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board18);
        ar.edu.unrc.game2048.Cell cell24 = new ar.edu.unrc.game2048.Cell(2);
        board20.setCell((int) (byte) 1, 32, cell24);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell24.canMergeWith(cell32);
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean44 = cell41.canMergeWith(cell43);
        boolean boolean45 = cell43.isEmpty();
        boolean boolean46 = cell24.canMergeWith(cell43);
        java.lang.Object obj47 = null;
        boolean boolean48 = cell24.equals(obj47);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        int int53 = board51.getSize();
        board51.clearBoard();
        boolean boolean55 = board51.moveDown();
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int59 = board58.getSize();
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board58);
        boolean boolean62 = board60.equals((java.lang.Object) (short) -1);
        boolean boolean63 = board51.equals((java.lang.Object) board60);
        boolean boolean64 = board51.isWinningBoard();
        boolean boolean65 = board51.moveLeft();
        boolean boolean66 = cell24.equals((java.lang.Object) boolean65);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell67 = cell1.mergeWith(cell24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board.Position position12 = new ar.edu.unrc.game2048.Board.Position(32, 10);
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass14 = cell13.getClass();
        boolean boolean15 = position12.equals((java.lang.Object) cell13);
        int int16 = position12.row;
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean25 = cell17.canMergeWith(cell24);
        int int26 = cell17.getValue();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(board29);
        boolean boolean35 = board29.moveUp();
        boolean boolean37 = board29.equals((java.lang.Object) 100.0d);
        boolean boolean38 = cell17.equals((java.lang.Object) boolean37);
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        int int43 = board41.getSize();
        boolean boolean44 = board41.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board41.getEmptyPositions();
        boolean boolean46 = board41.isFull();
        boolean boolean47 = cell17.equals((java.lang.Object) board41);
        boolean boolean48 = position12.equals((java.lang.Object) cell17);
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(10, (int) (byte) -1, cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell13 = board2.getCell((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (0, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(10, -1)", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (10, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(-1, -1)", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (-1, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.moveUp();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveRight();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        boolean boolean21 = cell10.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell23 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean24 = cell19.canMergeWith(cell23);
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        java.lang.String str34 = cell25.toString();
        boolean boolean35 = cell23.canMergeWith(cell25);
        boolean boolean36 = position2.equals((java.lang.Object) cell25);
        java.lang.String str37 = cell25.toString();
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean47 = cell39.canMergeWith(cell46);
        ar.edu.unrc.game2048.Cell cell48 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell55 = board51.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean56 = cell48.canMergeWith(cell55);
        boolean boolean57 = cell46.canMergeWith(cell55);
        ar.edu.unrc.game2048.Cell cell59 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean60 = cell55.canMergeWith(cell59);
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean69 = cell61.canMergeWith(cell68);
        java.lang.String str70 = cell61.toString();
        boolean boolean71 = cell59.canMergeWith(cell61);
        boolean boolean72 = cell38.canMergeWith(cell59);
        boolean boolean73 = cell25.equals((java.lang.Object) cell59);
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int77 = board76.getSize();
        boolean boolean78 = board76.moveDown();
        boolean boolean79 = board76.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell82 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board85 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet86 = board85.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell89 = board85.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean90 = cell82.canMergeWith(cell89);
        int int91 = cell89.getValue();
        int int92 = cell89.getValue();
        board76.setCell((int) (short) 1, 0, cell89);
        boolean boolean95 = cell89.equals((java.lang.Object) 0.0f);
        java.lang.String str96 = cell89.toString();
        boolean boolean97 = cell89.isEmpty();
        boolean boolean98 = cell59.canMergeWith(cell89);
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "." + "'", str70, ".");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(cell82);
        org.junit.Assert.assertNotNull(positionSet86);
        org.junit.Assert.assertNotNull(cell89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 0 + "'", int92 == 0);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "." + "'", str96, ".");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("4", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (int) (short) 10);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.moveUp();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        java.lang.Class<?> wildcardClass6 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) '4', 4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Board.Direction direction10 = ar.edu.unrc.game2048.Board.Direction.RIGHT;
        java.lang.Class<?> wildcardClass11 = direction10.getClass();
        boolean boolean12 = board2.equals((java.lang.Object) wildcardClass11);
        int int13 = board2.getSize();
        int int14 = board2.getSize();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + direction10 + "' != '" + ar.edu.unrc.game2048.Board.Direction.RIGHT + "'", direction10.equals(ar.edu.unrc.game2048.Board.Direction.RIGHT));
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        int int13 = board2.tileAmount();
        boolean boolean14 = board2.hasEmptyCells();
        boolean boolean15 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveUp();
        boolean boolean9 = board2.moveLeft();
        java.lang.Class<?> wildcardClass10 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (short) -1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(-1, -1)" + "'", str3, "(-1, -1)");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, 10);
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(32, 10)" + "'", str4, "(32, 10)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, (int) (byte) 0);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        board5.clearBoard();
        boolean boolean9 = board5.hasEmptyCells();
        boolean boolean10 = board5.moveRight();
        int int11 = board5.getSize();
        int int12 = board5.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board5.getEmptyPositions();
        boolean boolean14 = position2.equals((java.lang.Object) board5);
        boolean boolean15 = board5.isFull();
        boolean boolean16 = board5.moveDown();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.isWinningBoard();
        boolean boolean10 = board2.hasEmptyCells();
        boolean boolean11 = board2.moveLeft();
        boolean boolean12 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean12 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        boolean boolean11 = board2.moveUp();
        boolean boolean12 = board2.isWinningBoard();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board2.getCell((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 10) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board8.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.isLosingBoard();
        boolean boolean10 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        boolean boolean15 = board12.isFull();
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass17 = cell16.getClass();
        boolean boolean18 = board12.equals((java.lang.Object) cell16);
        boolean boolean19 = cell7.equals((java.lang.Object) cell16);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str22 = cell21.toString();
        boolean boolean23 = cell21.isEmpty();
        int int24 = cell21.getValue();
        boolean boolean25 = cell21.isEmpty();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int29 = board28.getSize();
        boolean boolean30 = board28.moveDown();
        boolean boolean31 = board28.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        int int43 = cell41.getValue();
        int int44 = cell41.getValue();
        board28.setCell((int) (short) 1, 0, cell41);
        boolean boolean46 = board28.isWinningBoard();
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(board28);
        boolean boolean48 = cell21.equals((java.lang.Object) board28);
        boolean boolean49 = cell7.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell50 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = cell21.canMergeWith(cell50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"value\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell10.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell19 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean27 = cell19.canMergeWith(cell26);
        boolean boolean28 = cell17.canMergeWith(cell26);
        ar.edu.unrc.game2048.Cell cell30 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean31 = cell26.canMergeWith(cell30);
        boolean boolean32 = cell8.canMergeWith(cell30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str19 = cell18.toString();
        boolean boolean20 = cell18.isEmpty();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        int int25 = board23.getSize();
        boolean boolean26 = board23.isFull();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass28 = cell27.getClass();
        boolean boolean29 = board23.equals((java.lang.Object) cell27);
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board23.getEmptyPositions();
        boolean boolean32 = cell18.equals((java.lang.Object) board23);
        board8.setCell((int) (byte) 1, (int) '4', cell18);
        boolean boolean34 = board8.moveUp();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board8.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32" + "'", str19, "32");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(positionSet35);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        int int9 = board7.getSize();
        boolean boolean10 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass12 = cell11.getClass();
        boolean boolean13 = board7.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean15 = board2.equals((java.lang.Object) board7);
        ar.edu.unrc.game2048.Cell cell18 = board2.getCell(1, (int) '#');
        boolean boolean19 = board2.isFull();
        boolean boolean20 = board2.moveUp();
        boolean boolean21 = board2.isWinningBoard();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        java.lang.String str7 = cell6.toString();
        ar.edu.unrc.game2048.Cell cell8 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell15 = board11.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean16 = cell8.canMergeWith(cell15);
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean18 = cell15.canMergeWith(cell17);
        boolean boolean19 = cell17.isEmpty();
        java.lang.String str20 = cell17.toString();
        java.lang.String str21 = cell17.toString();
        boolean boolean22 = cell17.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell23 = cell6.mergeWith(cell17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        boolean boolean12 = board2.hasEmptyCells();
        int int13 = board2.getSize();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        int int21 = board18.getScore();
        boolean boolean22 = board18.isFull();
        int int23 = board18.getSize();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(board18);
        int int25 = board24.getSize();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(100, (int) (short) 100, cell28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(cell28);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveRight();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean12 = board11.isFull();
        int int13 = board11.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board2.getSize();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean14 = board2.moveRight();
        boolean boolean15 = board2.isWinningBoard();
        boolean boolean16 = board2.moveRight();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        boolean boolean8 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.moveRight();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        boolean boolean12 = board2.hasEmptyCells();
        boolean boolean13 = board2.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (byte) -1);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', 2);
        int int3 = board2.getScore();
        boolean boolean4 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.String str9 = cell0.toString();
        java.lang.String str10 = cell0.toString();
        boolean boolean11 = cell0.isEmpty();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean19 = board14.isLosingBoard();
        board14.clearBoard();
        boolean boolean22 = board14.equals((java.lang.Object) (-1));
        boolean boolean23 = board14.moveUp();
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean28 = board26.equals((java.lang.Object) 1.0d);
        boolean boolean29 = board26.isLosingBoard();
        boolean boolean30 = board26.moveDown();
        ar.edu.unrc.game2048.Cell cell33 = board26.getCell(0, 32);
        boolean boolean34 = board14.equals((java.lang.Object) 32);
        boolean boolean35 = board14.hasEmptyCells();
        boolean boolean36 = cell0.equals((java.lang.Object) boolean35);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        boolean boolean11 = board2.moveUp();
        int int12 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board2.getEmptyPositions();
        boolean boolean14 = board2.moveLeft();
        boolean boolean15 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell18 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet22 = board21.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell25 = board21.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean26 = cell18.canMergeWith(cell25);
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean35 = cell27.canMergeWith(cell34);
        boolean boolean36 = cell25.canMergeWith(cell34);
        boolean boolean37 = cell25.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell(52, (int) (byte) 100, cell25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (52, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        int int14 = board12.getSize();
        board12.clearBoard();
        boolean boolean16 = board12.moveDown();
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board12);
        boolean boolean18 = board12.moveRight();
        boolean boolean19 = board12.isWinningBoard();
        boolean boolean20 = board12.isWinningBoard();
        boolean boolean21 = cell8.equals((java.lang.Object) board12);
        int int22 = board12.getScore();
        boolean boolean23 = board12.hasEmptyCells();
        boolean boolean24 = board12.moveLeft();
        boolean boolean25 = board12.hasEmptyCells();
        board12.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, -1)", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, -1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        board5.clearBoard();
        boolean boolean9 = board5.hasEmptyCells();
        boolean boolean10 = board5.moveRight();
        boolean boolean11 = board5.isLosingBoard();
        boolean boolean12 = cell1.equals((java.lang.Object) board5);
        int int13 = board5.getSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean12 = board10.equals((java.lang.Object) (short) 1);
        boolean boolean13 = board10.isWinningBoard();
        int int14 = board10.tileAmount();
        boolean boolean15 = board10.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(32, (int) (short) 1);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveDown();
        board11.clearBoard();
        ar.edu.unrc.game2048.Cell cell17 = board11.getCell(4, (int) (byte) 1);
        boolean boolean18 = board11.moveLeft();
        ar.edu.unrc.game2048.Cell cell21 = board11.getCell(10, (int) (byte) 1);
        boolean boolean22 = cell8.canMergeWith(cell21);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int26 = board25.getSize();
        boolean boolean27 = board25.moveDown();
        board25.clearBoard();
        int int29 = board25.tileAmount();
        boolean boolean31 = board25.equals((java.lang.Object) 10.0d);
        boolean boolean32 = board25.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board25.getEmptyPositions();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int39 = board38.getSize();
        boolean boolean40 = board38.moveDown();
        boolean boolean41 = board38.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell44 = board38.getCell(32, (int) (short) 1);
        ar.edu.unrc.game2048.Board.Position position47 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int48 = position47.row;
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        boolean boolean53 = board51.moveDown();
        int int54 = board51.getScore();
        boolean boolean55 = position47.equals((java.lang.Object) int54);
        boolean boolean56 = cell44.equals((java.lang.Object) int54);
        board25.setCell(4, 10, cell44);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet61 = board60.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell64 = board60.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean65 = board60.isLosingBoard();
        board60.clearBoard();
        int int67 = board60.tileAmount();
        boolean boolean69 = board60.equals((java.lang.Object) (-1.0d));
        ar.edu.unrc.game2048.Cell cell72 = board60.getCell(1, (int) (short) 10);
        boolean boolean73 = cell44.canMergeWith(cell72);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell74 = cell21.mergeWith(cell44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(positionSet61);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(cell72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(32);
        java.lang.String str2 = cell1.toString();
        java.lang.String str3 = cell1.toString();
        java.lang.String str4 = cell1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32" + "'", str3, "32");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(32, 10)", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (32, 10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveDown();
        int int11 = board2.tileAmount();
        boolean boolean12 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean4 = position2.equals((java.lang.Object) 1);
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        boolean boolean11 = board8.isFull();
        int int12 = board8.tileAmount();
        boolean boolean13 = position2.equals((java.lang.Object) board8);
        boolean boolean14 = board8.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell17 = board8.getCell((int) 'a', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(cell17);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        boolean boolean5 = position2.equals((java.lang.Object) 100.0d);
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        int int10 = board8.getSize();
        board8.clearBoard();
        boolean boolean12 = board8.moveDown();
        int int13 = board8.getScore();
        boolean boolean14 = board8.isFull();
        boolean boolean15 = board8.isWinningBoard();
        boolean boolean16 = position2.equals((java.lang.Object) board8);
        int int17 = position2.row;
        int int18 = position2.col;
        int int19 = position2.row;
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean28 = cell20.canMergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean30 = cell27.canMergeWith(cell29);
        boolean boolean31 = cell29.isEmpty();
        java.lang.String str32 = cell29.toString();
        java.lang.String str33 = cell29.toString();
        int int34 = cell29.getValue();
        boolean boolean35 = position2.equals((java.lang.Object) int34);
        int int36 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "." + "'", str33, ".");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(positionSet8);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str13 = cell12.toString();
        boolean boolean14 = cell12.isEmpty();
        board2.setCell((int) ' ', 32, cell12);
        ar.edu.unrc.game2048.Cell cell16 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell23 = board19.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean24 = cell16.canMergeWith(cell23);
        java.lang.String str25 = cell16.toString();
        boolean boolean26 = cell12.canMergeWith(cell16);
        int int27 = cell12.getValue();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32" + "'", str13, "32");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (int) (short) 10);
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean4 = board3.isFull();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(10, (int) (short) 1);
        boolean boolean8 = board3.equals((java.lang.Object) (short) 1);
        boolean boolean9 = board3.moveUp();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell(52, 2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.isLosingBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        int int9 = board7.getSize();
        boolean boolean10 = board7.isFull();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass12 = cell11.getClass();
        boolean boolean13 = board7.equals((java.lang.Object) cell11);
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board7);
        boolean boolean15 = board2.equals((java.lang.Object) board7);
        boolean boolean16 = board7.isWinningBoard();
        boolean boolean17 = board7.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.String str9 = cell0.toString();
        java.lang.String str10 = cell0.toString();
        boolean boolean11 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        boolean boolean31 = cell0.canMergeWith(cell28);
        int int32 = cell28.getValue();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int36 = board35.getSize();
        boolean boolean37 = board35.moveDown();
        boolean boolean38 = board35.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board44.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell48 = board44.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean49 = cell41.canMergeWith(cell48);
        int int50 = cell48.getValue();
        int int51 = cell48.getValue();
        board35.setCell((int) (short) 1, 0, cell48);
        java.lang.String str53 = cell48.toString();
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet58 = board57.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell61 = board57.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean62 = cell54.canMergeWith(cell61);
        boolean boolean63 = cell48.canMergeWith(cell61);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell64 = cell28.mergeWith(cell48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertNotNull(positionSet58);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board8.isLosingBoard();
        boolean boolean10 = board8.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board12.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell16 = board12.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean17 = cell9.canMergeWith(cell16);
        boolean boolean18 = cell7.canMergeWith(cell16);
        boolean boolean19 = cell7.isEmpty();
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str22 = cell21.toString();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int26 = board25.getSize();
        boolean boolean27 = board25.moveDown();
        boolean boolean28 = board25.moveRight();
        board25.clearBoard();
        boolean boolean30 = cell21.equals((java.lang.Object) board25);
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int34 = board33.getSize();
        boolean boolean35 = board33.moveDown();
        boolean boolean36 = board33.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean47 = cell39.canMergeWith(cell46);
        int int48 = cell46.getValue();
        int int49 = cell46.getValue();
        board33.setCell((int) (short) 1, 0, cell46);
        java.lang.String str51 = cell46.toString();
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet56 = board55.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell59 = board55.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean60 = cell52.canMergeWith(cell59);
        boolean boolean61 = cell46.canMergeWith(cell59);
        boolean boolean62 = cell21.canMergeWith(cell46);
        boolean boolean63 = cell7.canMergeWith(cell46);
        int int64 = cell46.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(cell16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "." + "'", str51, ".");
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(positionSet56);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int6 = position5.row;
        java.lang.String str7 = position5.toString();
        boolean boolean8 = position2.equals((java.lang.Object) position5);
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board11.getEmptyPositions();
        int int13 = board11.getSize();
        board11.clearBoard();
        boolean boolean15 = board11.moveDown();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean17 = board11.moveRight();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean19 = position5.equals((java.lang.Object) board11);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        int int24 = board22.getSize();
        board22.clearBoard();
        boolean boolean26 = board22.moveRight();
        int int27 = board22.getScore();
        boolean boolean28 = board11.equals((java.lang.Object) int27);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, -1)" + "'", str7, "(0, -1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        int int9 = board2.getScore();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        boolean boolean11 = board2.moveUp();
        int int12 = board2.getScore();
        boolean boolean13 = board2.isFull();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell16 = board2.getCell((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 52) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        int int7 = board5.getSize();
        boolean boolean8 = board5.isFull();
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass10 = cell9.getClass();
        boolean boolean11 = board5.equals((java.lang.Object) cell9);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean13 = board12.moveLeft();
        boolean boolean14 = position2.equals((java.lang.Object) board12);
        int int15 = position2.row;
        java.lang.String str16 = position2.toString();
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "(-1, 1)" + "'", str16, "(-1, 1)");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isLosingBoard();
        int int9 = board2.getSize();
        int int10 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        java.lang.String str9 = cell0.toString();
        java.lang.String str10 = cell0.toString();
        boolean boolean11 = cell0.isEmpty();
        ar.edu.unrc.game2048.Cell cell12 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell19 = board15.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean20 = cell12.canMergeWith(cell19);
        ar.edu.unrc.game2048.Cell cell21 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean29 = cell21.canMergeWith(cell28);
        boolean boolean30 = cell19.canMergeWith(cell28);
        boolean boolean31 = cell0.canMergeWith(cell28);
        boolean boolean32 = cell28.isEmpty();
        boolean boolean33 = cell28.isEmpty();
        int int34 = cell28.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }
}

