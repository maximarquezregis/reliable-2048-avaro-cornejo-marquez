package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean13 = board12.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        boolean boolean10 = board8.moveDown();
        boolean boolean11 = board8.moveRight();
        boolean boolean12 = board8.moveLeft();
        boolean boolean13 = board8.isLosingBoard();
        boolean boolean14 = position2.equals((java.lang.Object) board8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, -1)" + "'", str4, "(0, -1)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board9.getEmptyPositions();
        boolean boolean11 = board2.equals((java.lang.Object) positionSet10);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        int int13 = board12.tileAmount();
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
        boolean boolean53 = board51.moveLeft();
        boolean boolean54 = cell24.equals((java.lang.Object) boolean53);
        board12.setCell((int) (short) 10, (int) '4', cell24);
        ar.edu.unrc.game2048.Cell cell58 = board12.getCell((int) (byte) 1, 2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cell58);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        java.lang.String str21 = cell19.toString();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet25 = board24.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell28 = board24.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(board24);
        boolean boolean30 = board24.moveUp();
        boolean boolean31 = board24.moveUp();
        ar.edu.unrc.game2048.Cell cell34 = board24.getCell((int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell35 = cell19.mergeWith(cell34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "." + "'", str21, ".");
        org.junit.Assert.assertNotNull(positionSet25);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(cell34);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean21 = cell13.canMergeWith(cell20);
        java.lang.String str22 = cell13.toString();
        java.lang.String str23 = cell13.toString();
        boolean boolean24 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        boolean boolean43 = cell32.canMergeWith(cell41);
        boolean boolean44 = cell13.canMergeWith(cell41);
        board2.setCell((int) 'a', 3, cell13);
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int49 = board48.getSize();
        boolean boolean50 = board48.moveDown();
        boolean boolean51 = board48.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell54 = board48.getCell(32, (int) (short) 1);
        boolean boolean55 = cell13.equals((java.lang.Object) board48);
        int int56 = board48.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        java.lang.String str26 = cell23.toString();
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str29 = cell28.toString();
        boolean boolean30 = cell28.isEmpty();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        int int35 = board33.getSize();
        boolean boolean36 = board33.isFull();
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass38 = cell37.getClass();
        boolean boolean39 = board33.equals((java.lang.Object) cell37);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board33);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet41 = board33.getEmptyPositions();
        boolean boolean42 = cell28.equals((java.lang.Object) board33);
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell50 = board46.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean51 = cell43.canMergeWith(cell50);
        boolean boolean52 = cell28.canMergeWith(cell50);
        java.lang.String str53 = cell50.toString();
        java.lang.String str54 = cell50.toString();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell55 = cell23.mergeWith(cell50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "32" + "'", str29, "32");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(positionSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "." + "'", str53, ".");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "." + "'", str54, ".");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        boolean boolean15 = board2.isFull();
        boolean boolean16 = board2.moveRight();
        boolean boolean17 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        int int9 = cell7.getValue();
        java.lang.String str10 = cell7.toString();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "." + "'", str10, ".");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(2);
        board4.setCell((int) (byte) 1, 32, cell8);
        java.lang.String str10 = cell8.toString();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        boolean boolean15 = board13.moveDown();
        int int16 = board13.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board13.getEmptyPositions();
        boolean boolean18 = cell8.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Cell cell19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = cell8.canMergeWith(cell19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"value\" because \"other\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2" + "'", str10, "2");
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean13 = board12.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(-1, 10)", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (-1, 10)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        boolean boolean28 = board25.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board34.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell38 = board34.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean39 = cell31.canMergeWith(cell38);
        int int40 = cell38.getValue();
        int int41 = cell38.getValue();
        board25.setCell((int) (short) 1, 0, cell38);
        java.lang.String str43 = cell38.toString();
        ar.edu.unrc.game2048.Cell cell44 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet48 = board47.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell51 = board47.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean52 = cell44.canMergeWith(cell51);
        boolean boolean53 = cell38.canMergeWith(cell51);
        ar.edu.unrc.game2048.Cell cell55 = new ar.edu.unrc.game2048.Cell(2);
        boolean boolean56 = cell38.equals((java.lang.Object) 2);
        boolean boolean57 = cell21.canMergeWith(cell38);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet61 = board60.getEmptyPositions();
        int int62 = board60.getSize();
        boolean boolean63 = board60.isFull();
        ar.edu.unrc.game2048.Cell cell64 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass65 = cell64.getClass();
        boolean boolean66 = board60.equals((java.lang.Object) cell64);
        boolean boolean67 = board60.isFull();
        boolean boolean68 = board60.isFull();
        boolean boolean69 = cell38.equals((java.lang.Object) boolean68);
        boolean boolean71 = cell38.equals((java.lang.Object) "(-1, 10)");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "." + "'", str43, ".");
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertNotNull(positionSet48);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(positionSet61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(cell64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean20 = board19.moveRight();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        int int11 = board10.tileAmount();
        boolean boolean12 = board10.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.isLosingBoard();
        int int10 = board2.getScore();
        boolean boolean11 = board2.hasEmptyCells();
        boolean boolean12 = board2.hasEmptyCells();
        board2.clearBoard();
        boolean boolean14 = board2.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.tileAmount();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, 3);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        int int15 = board13.getSize();
        board13.clearBoard();
        boolean boolean17 = board13.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        int int19 = board13.getScore();
        java.lang.Class<?> wildcardClass20 = board13.getClass();
        boolean boolean21 = position10.equals((java.lang.Object) wildcardClass20);
        int int22 = position10.col;
        boolean boolean23 = board2.equals((java.lang.Object) position10);
        boolean boolean24 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        java.lang.String str12 = cell11.toString();
        boolean boolean13 = cell11.isEmpty();
        boolean boolean14 = cell11.isEmpty();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
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
        ar.edu.unrc.game2048.Cell cell37 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean38 = cell33.canMergeWith(cell37);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean47 = cell39.canMergeWith(cell46);
        java.lang.String str48 = cell39.toString();
        boolean boolean49 = cell37.canMergeWith(cell39);
        boolean boolean50 = position16.equals((java.lang.Object) cell39);
        board11.setCell(1, 32, cell39);
        boolean boolean52 = board11.moveRight();
        int int53 = board11.getSize();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = board13.isLosingBoard();
        board13.clearBoard();
        int int20 = board13.tileAmount();
        boolean boolean21 = board13.isWinningBoard();
        int int22 = board13.tileAmount();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Cell cell26 = board13.getCell(3, 1);
        boolean boolean27 = cell1.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board.Position position30 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean32 = position30.equals((java.lang.Object) 1);
        int int33 = position30.col;
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet37 = board36.getEmptyPositions();
        int int38 = board36.getSize();
        boolean boolean39 = board36.isFull();
        int int40 = board36.tileAmount();
        boolean boolean41 = position30.equals((java.lang.Object) board36);
        boolean boolean42 = board36.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell46 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str47 = cell46.toString();
        boolean boolean48 = cell46.isEmpty();
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        int int53 = board51.getSize();
        boolean boolean54 = board51.isFull();
        ar.edu.unrc.game2048.Cell cell55 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass56 = cell55.getClass();
        boolean boolean57 = board51.equals((java.lang.Object) cell55);
        ar.edu.unrc.game2048.Board board58 = new ar.edu.unrc.game2048.Board(board51);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet59 = board51.getEmptyPositions();
        boolean boolean60 = cell46.equals((java.lang.Object) board51);
        board36.setCell((int) (byte) 1, (int) '4', cell46);
        int int62 = board36.getSize();
        boolean boolean63 = board36.moveLeft();
        boolean boolean64 = board36.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell67 = board36.getCell(0, (int) 'a');
        ar.edu.unrc.game2048.Board board70 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int71 = board70.getSize();
        boolean boolean72 = board70.moveDown();
        int int73 = board70.getScore();
        boolean boolean74 = board70.isFull();
        int int75 = board70.getSize();
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board(board70);
        int int77 = board76.getSize();
        boolean boolean78 = board36.equals((java.lang.Object) int77);
        boolean boolean79 = board36.moveDown();
        java.lang.Class<?> wildcardClass80 = board36.getClass();
        boolean boolean81 = cell1.equals((java.lang.Object) wildcardClass80);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 52 + "'", int33 == 52);
        org.junit.Assert.assertNotNull(positionSet37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "32" + "'", str47, "32");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(positionSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(cell67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 100 + "'", int77 == 100);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(wildcardClass80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell(2, 0);
        java.lang.String str13 = cell12.toString();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "." + "'", str13, ".");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
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
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell26 = board12.getCell((int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (1, -1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveUp();
        boolean boolean5 = board2.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((-1), (int) (short) 100);
        int int3 = position2.row;
        int int4 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        int int15 = board13.getSize();
        board13.clearBoard();
        boolean boolean17 = board13.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean19 = board13.moveRight();
        boolean boolean20 = board13.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell23 = board13.getCell(2, 0);
        board2.setCell((int) '4', (int) '4', cell23);
        boolean boolean25 = cell23.isEmpty();
        java.lang.String str26 = cell23.toString();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int20 = board19.getSize();
        boolean boolean21 = board19.moveDown();
        boolean boolean22 = board19.moveRight();
        boolean boolean23 = board19.moveUp();
        boolean boolean24 = board7.equals((java.lang.Object) board19);
        boolean boolean25 = board19.moveDown();
        boolean boolean26 = board19.moveDown();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        int int22 = cell15.getValue();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean15 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board10.hasEmptyCells();
        boolean boolean12 = board10.isWinningBoard();
        boolean boolean13 = board10.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board3 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet4 = board3.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell7 = board3.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean8 = cell0.canMergeWith(cell7);
        ar.edu.unrc.game2048.Cell cell9 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean10 = cell7.canMergeWith(cell9);
        boolean boolean11 = cell9.isEmpty();
        int int12 = cell9.getValue();
        boolean boolean13 = cell9.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(positionSet4);
        org.junit.Assert.assertNotNull(cell7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveDown();
        int int11 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        boolean boolean15 = board13.moveDown();
        board13.clearBoard();
        boolean boolean17 = board13.hasEmptyCells();
        boolean boolean18 = board13.moveRight();
        int int19 = board13.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean22 = board2.equals((java.lang.Object) board21);
        java.lang.Class<?> wildcardClass23 = board2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.tileAmount();
        boolean boolean6 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int10 = board9.getSize();
        boolean boolean11 = board9.moveDown();
        board9.clearBoard();
        boolean boolean13 = board2.equals((java.lang.Object) board9);
        boolean boolean14 = board2.moveRight();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        board8.clearBoard();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(35, 1)", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (35, 1)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(97, 3);
        ar.edu.unrc.game2048.Cell cell5 = board2.getCell((int) '4', 52);
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(5, 32);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(cell8);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        int int9 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board2.getEmptyPositions();
        boolean boolean11 = board2.moveUp();
        boolean boolean12 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.moveUp();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board9.equals((java.lang.Object) "(0, -1)");
        int int12 = board9.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean9 = board2.moveUp();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.moveRight();
        java.lang.Class<?> wildcardClass12 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(1, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Board is full, no empty positions available.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int65 = board64.getSize();
        boolean boolean66 = board64.moveDown();
        int int67 = board64.getScore();
        boolean boolean68 = board64.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet69 = board64.getEmptyPositions();
        boolean boolean70 = board64.moveUp();
        ar.edu.unrc.game2048.Board board73 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int74 = board73.getSize();
        boolean boolean75 = board73.moveDown();
        int int76 = board73.getScore();
        boolean boolean77 = board73.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet78 = board73.getEmptyPositions();
        boolean boolean79 = board73.moveUp();
        boolean boolean80 = board64.equals((java.lang.Object) board73);
        java.lang.Class<?> wildcardClass81 = board64.getClass();
        boolean boolean82 = board2.equals((java.lang.Object) board64);
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(positionSet69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(positionSet78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(wildcardClass81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', 10);
        board2.clearBoard();
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveUp();
        boolean boolean8 = board2.moveLeft();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        int int4 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        java.lang.String str14 = cell5.toString();
        java.lang.String str15 = cell5.toString();
        boolean boolean16 = cell5.isEmpty();
        boolean boolean17 = cell1.canMergeWith(cell5);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str20 = cell19.toString();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int24 = board23.getSize();
        boolean boolean25 = board23.moveDown();
        boolean boolean26 = board23.moveRight();
        board23.clearBoard();
        boolean boolean28 = cell19.equals((java.lang.Object) board23);
        boolean boolean29 = board23.moveLeft();
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean31 = cell1.equals((java.lang.Object) board23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32" + "'", str20, "32");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        int int9 = board2.getScore();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        java.lang.String str40 = cell13.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "32" + "'", str40, "32");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean8 = board2.moveUp();
        ar.edu.unrc.game2048.Cell cell11 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int12 = cell11.getValue();
        boolean boolean14 = cell11.equals((java.lang.Object) 100);
        board2.setCell((int) '#', 0, cell11);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        board18.clearBoard();
        ar.edu.unrc.game2048.Cell cell24 = board18.getCell(4, (int) (byte) 1);
        boolean boolean25 = board18.moveLeft();
        boolean boolean26 = board18.moveDown();
        int int27 = board18.tileAmount();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board18.getEmptyPositions();
        boolean boolean29 = cell11.equals((java.lang.Object) board18);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) '4', 5);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        int int3 = position2.col;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        boolean boolean3 = cell1.isEmpty();
        int int4 = cell1.getValue();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell5.canMergeWith(cell12);
        java.lang.String str14 = cell5.toString();
        java.lang.String str15 = cell5.toString();
        boolean boolean16 = cell5.isEmpty();
        boolean boolean17 = cell1.canMergeWith(cell5);
        boolean boolean19 = cell1.equals((java.lang.Object) 4);
        int int20 = cell1.getValue();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "." + "'", str14, ".");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell(3, 52);
        ar.edu.unrc.game2048.Board.Position position17 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (byte) 10);
        java.lang.String str18 = position17.toString();
        int int19 = position17.col;
        boolean boolean20 = board2.equals((java.lang.Object) position17);
        java.lang.String str21 = position17.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "(-1, 10)" + "'", str18, "(-1, 10)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "(-1, 10)" + "'", str21, "(-1, 10)");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean69 = board64.isLosingBoard();
        board64.clearBoard();
        int int71 = board64.tileAmount();
        ar.edu.unrc.game2048.Board board74 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int75 = board74.getSize();
        boolean boolean76 = board74.moveDown();
        board74.clearBoard();
        boolean boolean78 = board74.hasEmptyCells();
        boolean boolean79 = board74.moveRight();
        int int80 = board74.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet81 = board74.getEmptyPositions();
        boolean boolean82 = board64.equals((java.lang.Object) board74);
        boolean boolean83 = board64.isLosingBoard();
        boolean boolean84 = board64.isLosingBoard();
        ar.edu.unrc.game2048.Board board85 = new ar.edu.unrc.game2048.Board(board64);
        boolean boolean86 = position22.equals((java.lang.Object) board64);
        int int87 = board64.getScore();
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
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertNotNull(positionSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 1, 3);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        int int12 = cell3.getValue();
        boolean boolean13 = position2.equals((java.lang.Object) int12);
        int int14 = position2.row;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int18 = board17.getSize();
        boolean boolean19 = board17.moveDown();
        board17.clearBoard();
        boolean boolean21 = board17.hasEmptyCells();
        boolean boolean22 = board17.moveRight();
        int int23 = board17.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board17.getEmptyPositions();
        boolean boolean25 = position2.equals((java.lang.Object) board17);
        java.lang.String str26 = position2.toString();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(-1, 1)" + "'", str26, "(-1, 1)");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = board2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        boolean boolean15 = board13.moveDown();
        board13.clearBoard();
        ar.edu.unrc.game2048.Cell cell19 = board13.getCell(4, (int) (byte) 1);
        java.lang.String str20 = cell19.toString();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        int int25 = board23.getSize();
        board23.clearBoard();
        boolean boolean27 = board23.moveDown();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean29 = board23.moveRight();
        boolean boolean30 = board23.isWinningBoard();
        boolean boolean31 = board23.isWinningBoard();
        boolean boolean32 = cell19.equals((java.lang.Object) board23);
        board2.setCell(10, 10, cell19);
        java.lang.String str34 = cell19.toString();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        int int39 = board37.getSize();
        boolean boolean40 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass42 = cell41.getClass();
        boolean boolean43 = board37.equals((java.lang.Object) cell41);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean45 = board44.isLosingBoard();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board44);
        boolean boolean47 = board46.moveLeft();
        boolean boolean48 = cell19.equals((java.lang.Object) board46);
        boolean boolean49 = board46.isWinningBoard();
        java.lang.Class<?> wildcardClass50 = board46.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board2.getEmptyPositions();
        boolean boolean25 = board2.isWinningBoard();
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
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        int int8 = board2.getScore();
        int int9 = board2.getScore();
        boolean boolean10 = board2.moveDown();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(5, 97);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 10, (int) (byte) -1);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 0);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 0)" + "'", str3, "(0, 0)");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(52, (int) (short) 100);
        boolean boolean3 = board2.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(cell6);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(32, (int) (short) 0);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        int int8 = board5.getScore();
        boolean boolean9 = board5.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet10 = board5.getEmptyPositions();
        boolean boolean11 = board5.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int15 = board14.getSize();
        boolean boolean16 = board14.moveDown();
        int int17 = board14.getScore();
        boolean boolean18 = board14.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board14.getEmptyPositions();
        boolean boolean20 = board14.moveUp();
        boolean boolean21 = board5.equals((java.lang.Object) board14);
        boolean boolean22 = board2.equals((java.lang.Object) board5);
        board5.clearBoard();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean9 = board2.isLosingBoard();
        int int10 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        int int8 = board2.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveDown();
        board11.clearBoard();
        ar.edu.unrc.game2048.Cell cell17 = board11.getCell(4, (int) (byte) 1);
        boolean boolean18 = board11.moveLeft();
        int int19 = board11.getScore();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean21 = board2.equals((java.lang.Object) board20);
        boolean boolean22 = board20.moveDown();
        int int23 = board20.getScore();
        boolean boolean24 = board20.moveLeft();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell(0, 3);
        boolean boolean12 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell15 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell22 = board18.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean23 = cell15.canMergeWith(cell22);
        int int24 = cell15.getValue();
        boolean boolean25 = cell15.isEmpty();
        board2.setCell(3, (int) (short) 0, cell15);
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(cell15);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cell value must be a power of two: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveRight();
        boolean boolean11 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell(0, (int) (short) 0);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(cell14);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board7.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell11 = board7.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean12 = cell11.isEmpty();
        boolean boolean13 = position2.equals((java.lang.Object) boolean12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int17 = board16.getSize();
        boolean boolean18 = board16.moveDown();
        board16.clearBoard();
        ar.edu.unrc.game2048.Cell cell22 = board16.getCell(4, (int) (byte) 1);
        boolean boolean23 = board16.moveLeft();
        int int24 = board16.getScore();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean35 = cell27.canMergeWith(cell34);
        java.lang.String str36 = cell27.toString();
        java.lang.String str37 = cell27.toString();
        boolean boolean38 = cell27.isEmpty();
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
        boolean boolean58 = cell27.canMergeWith(cell55);
        board16.setCell((int) 'a', 3, cell27);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean61 = position2.equals((java.lang.Object) board60);
        boolean boolean62 = board60.isLosingBoard();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(cell22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "." + "'", str37, ".");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        boolean boolean30 = board22.moveRight();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet36 = board35.getEmptyPositions();
        int int37 = board35.getSize();
        board35.clearBoard();
        boolean boolean39 = board35.moveDown();
        int int40 = board35.getScore();
        boolean boolean41 = board35.moveDown();
        ar.edu.unrc.game2048.Cell cell44 = board35.getCell(0, 3);
        java.lang.String str45 = cell44.toString();
        board22.setCell((int) (byte) 10, (int) (byte) 10, cell44);
        boolean boolean47 = board22.moveLeft();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int51 = board50.getSize();
        boolean boolean52 = board50.moveDown();
        board50.clearBoard();
        boolean boolean54 = board50.hasEmptyCells();
        boolean boolean55 = board50.moveRight();
        int int56 = board50.getSize();
        int int57 = board50.getScore();
        board50.clearBoard();
        int int59 = board50.tileAmount();
        boolean boolean60 = board22.equals((java.lang.Object) int59);
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
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "." + "'", str45, ".");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 100 + "'", int56 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 4 + "'", int57 == 4);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 3 + "'", int59 == 3);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        boolean boolean22 = cell7.equals((java.lang.Object) (-1.0f));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        board12.clearBoard();
        boolean boolean16 = board12.hasEmptyCells();
        boolean boolean17 = board12.moveRight();
        int int18 = board12.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board12.getEmptyPositions();
        boolean boolean20 = board2.equals((java.lang.Object) board12);
        boolean boolean21 = board2.isLosingBoard();
        boolean boolean22 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board27 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet28 = board27.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell31 = board27.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int35 = board34.getSize();
        boolean boolean36 = board34.moveDown();
        board34.clearBoard();
        boolean boolean38 = board34.moveRight();
        boolean boolean39 = cell31.equals((java.lang.Object) boolean38);
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int43 = board42.getSize();
        boolean boolean44 = board42.moveDown();
        board42.clearBoard();
        ar.edu.unrc.game2048.Cell cell48 = board42.getCell(4, (int) (byte) 1);
        boolean boolean49 = board42.moveLeft();
        int int50 = board42.getScore();
        boolean boolean51 = board42.moveUp();
        int int52 = board42.getScore();
        boolean boolean53 = cell31.equals((java.lang.Object) board42);
        int int54 = cell31.getValue();
        // The following exception was thrown during execution in test generation
        try {
            board2.setCell((int) (byte) 10, 100, cell31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (10, 100) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(positionSet28);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str2 = cell1.toString();
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveDown();
        boolean boolean8 = board5.moveRight();
        board5.clearBoard();
        boolean boolean10 = cell1.equals((java.lang.Object) board5);
        boolean boolean11 = board5.moveLeft();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean13 = board5.hasEmptyCells();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "32" + "'", str2, "32");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell5 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass6 = cell5.getClass();
        boolean boolean7 = board2.equals((java.lang.Object) cell5);
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board((int) ' ', (int) '#');
        board10.clearBoard();
        boolean boolean12 = board2.equals((java.lang.Object) board10);
        boolean boolean13 = board10.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        int int8 = board2.getScore();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        boolean boolean10 = board2.moveDown();
        int int11 = board2.getScore();
        int int12 = board2.tileAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board11.tileAmount();
        int int13 = board11.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.moveLeft();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        boolean boolean37 = cell25.isEmpty();
        ar.edu.unrc.game2048.Board.Position position40 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean42 = position40.equals((java.lang.Object) 1);
        int int43 = position40.col;
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        int int48 = board46.getSize();
        boolean boolean49 = board46.isFull();
        int int50 = board46.tileAmount();
        boolean boolean51 = position40.equals((java.lang.Object) board46);
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean56 = board54.equals((java.lang.Object) 1.0d);
        boolean boolean57 = board54.isLosingBoard();
        boolean boolean58 = board54.moveDown();
        boolean boolean59 = position40.equals((java.lang.Object) board54);
        boolean boolean60 = cell25.equals((java.lang.Object) board54);
        java.lang.String str61 = cell25.toString();
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
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 52 + "'", int43 == 52);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "." + "'", str61, ".");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 100, 4);
        ar.edu.unrc.game2048.Cell cell5 = board2.getCell(97, 4);
        org.junit.Assert.assertNotNull(cell5);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean25 = cell17.canMergeWith(cell24);
        java.lang.String str26 = cell17.toString();
        java.lang.String str27 = cell17.toString();
        boolean boolean28 = cell17.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean37 = cell29.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell45 = board41.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean46 = cell38.canMergeWith(cell45);
        boolean boolean47 = cell36.canMergeWith(cell45);
        boolean boolean48 = cell17.canMergeWith(cell45);
        int int49 = cell45.getValue();
        int int50 = cell45.getValue();
        board11.setCell((int) '4', 4, cell45);
        int int52 = cell45.getValue();
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board56.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean61 = cell53.canMergeWith(cell60);
        java.lang.String str62 = cell53.toString();
        java.lang.String str63 = cell53.toString();
        boolean boolean64 = cell53.isEmpty();
        ar.edu.unrc.game2048.Cell cell65 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet69 = board68.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell72 = board68.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean73 = cell65.canMergeWith(cell72);
        ar.edu.unrc.game2048.Cell cell74 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board77 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet78 = board77.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell81 = board77.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean82 = cell74.canMergeWith(cell81);
        boolean boolean83 = cell72.canMergeWith(cell81);
        boolean boolean84 = cell53.canMergeWith(cell81);
        boolean boolean85 = cell81.isEmpty();
        ar.edu.unrc.game2048.Board board88 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int89 = board88.getSize();
        boolean boolean90 = board88.moveDown();
        board88.clearBoard();
        ar.edu.unrc.game2048.Cell cell94 = board88.getCell(4, (int) (byte) 1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet95 = board88.getEmptyPositions();
        boolean boolean96 = cell81.equals((java.lang.Object) positionSet95);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell97 = cell45.mergeWith(cell81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cannot merge cells: . and .");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "." + "'", str62, ".");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "." + "'", str63, ".");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertNotNull(positionSet69);
        org.junit.Assert.assertNotNull(cell72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cell74);
        org.junit.Assert.assertNotNull(positionSet78);
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(cell94);
        org.junit.Assert.assertNotNull(positionSet95);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int5 = board4.getSize();
        boolean boolean6 = board4.moveDown();
        board4.clearBoard();
        boolean boolean8 = board4.hasEmptyCells();
        boolean boolean9 = board4.moveRight();
        int int10 = board4.getSize();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board4);
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
        java.lang.String str41 = cell32.toString();
        java.lang.String str42 = cell32.toString();
        boolean boolean43 = cell32.isEmpty();
        ar.edu.unrc.game2048.Cell cell44 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board47 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet48 = board47.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell51 = board47.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean52 = cell44.canMergeWith(cell51);
        ar.edu.unrc.game2048.Cell cell53 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board56 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet57 = board56.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell60 = board56.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean61 = cell53.canMergeWith(cell60);
        boolean boolean62 = cell51.canMergeWith(cell60);
        boolean boolean63 = cell32.canMergeWith(cell60);
        boolean boolean64 = cell60.isEmpty();
        boolean boolean65 = cell60.isEmpty();
        ar.edu.unrc.game2048.Board board68 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int69 = board68.getSize();
        boolean boolean70 = board68.moveDown();
        boolean boolean71 = board68.isLosingBoard();
        boolean boolean72 = board68.isLosingBoard();
        int int73 = board68.getScore();
        boolean boolean74 = board68.moveRight();
        ar.edu.unrc.game2048.Cell cell78 = new ar.edu.unrc.game2048.Cell((int) ' ');
        board68.setCell((int) (byte) 10, 0, cell78);
        boolean boolean80 = cell60.equals((java.lang.Object) (byte) 10);
        boolean boolean81 = cell22.canMergeWith(cell60);
        boolean boolean82 = cell22.isEmpty();
        board4.setCell((int) (byte) 1, 0, cell22);
        ar.edu.unrc.game2048.Cell cell84 = cell1.mergeWith(cell22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertNotNull(positionSet36);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "." + "'", str41, ".");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "." + "'", str42, ".");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(cell44);
        org.junit.Assert.assertNotNull(positionSet48);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertNotNull(positionSet57);
        org.junit.Assert.assertNotNull(cell60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(cell84);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board.Position position16 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
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
        ar.edu.unrc.game2048.Cell cell37 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean38 = cell33.canMergeWith(cell37);
        ar.edu.unrc.game2048.Cell cell39 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell46 = board42.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean47 = cell39.canMergeWith(cell46);
        java.lang.String str48 = cell39.toString();
        boolean boolean49 = cell37.canMergeWith(cell39);
        boolean boolean50 = position16.equals((java.lang.Object) cell39);
        board11.setCell(1, 32, cell39);
        boolean boolean53 = cell39.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "." + "'", str48, ".");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        int int3 = position2.row;
        java.lang.String str4 = position2.toString();
        java.lang.String str5 = position2.toString();
        int int6 = position2.row;
        ar.edu.unrc.game2048.Board.Position position9 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int10 = position9.col;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board13.getEmptyPositions();
        boolean boolean20 = position9.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean22 = board21.isWinningBoard();
        boolean boolean23 = position2.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 32)" + "'", str4, "(0, 32)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "(0, 32)" + "'", str5, "(0, 32)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        ar.edu.unrc.game2048.Board board36 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int37 = board36.getSize();
        boolean boolean38 = board36.moveDown();
        boolean boolean39 = board36.isLosingBoard();
        boolean boolean40 = board36.isLosingBoard();
        int int41 = board36.getScore();
        boolean boolean42 = board36.moveRight();
        ar.edu.unrc.game2048.Cell cell46 = new ar.edu.unrc.game2048.Cell((int) ' ');
        board36.setCell((int) (byte) 10, 0, cell46);
        boolean boolean48 = cell28.equals((java.lang.Object) (byte) 10);
        boolean boolean49 = cell28.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.moveRight();
        int int9 = board2.getSize();
        int int10 = board2.tileAmount();
        int int11 = board2.getSize();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean12 = position10.equals((java.lang.Object) 1);
        int int13 = position10.col;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        int int18 = board16.getSize();
        boolean boolean19 = board16.isFull();
        int int20 = board16.tileAmount();
        boolean boolean21 = position10.equals((java.lang.Object) board16);
        boolean boolean22 = board16.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str27 = cell26.toString();
        boolean boolean28 = cell26.isEmpty();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        int int33 = board31.getSize();
        boolean boolean34 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass36 = cell35.getClass();
        boolean boolean37 = board31.equals((java.lang.Object) cell35);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board31);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet39 = board31.getEmptyPositions();
        boolean boolean40 = cell26.equals((java.lang.Object) board31);
        board16.setCell((int) (byte) 1, (int) '4', cell26);
        board2.setCell(1, (int) '#', cell26);
        boolean boolean43 = cell26.isEmpty();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        boolean boolean48 = board46.moveLeft();
        int int49 = board46.getSize();
        boolean boolean50 = cell26.equals((java.lang.Object) board46);
        boolean boolean51 = board46.moveLeft();
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet56 = board55.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell59 = board55.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean60 = cell52.canMergeWith(cell59);
        int int61 = cell52.getValue();
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board69 = new ar.edu.unrc.game2048.Board(board64);
        boolean boolean70 = board64.moveUp();
        boolean boolean72 = board64.equals((java.lang.Object) 100.0d);
        boolean boolean73 = cell52.equals((java.lang.Object) boolean72);
        ar.edu.unrc.game2048.Board board76 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet77 = board76.getEmptyPositions();
        int int78 = board76.getSize();
        boolean boolean79 = board76.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet80 = board76.getEmptyPositions();
        boolean boolean81 = board76.isFull();
        boolean boolean82 = cell52.equals((java.lang.Object) board76);
        int int83 = board76.getScore();
        boolean boolean84 = board76.isWinningBoard();
        boolean boolean85 = board46.equals((java.lang.Object) board76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "32" + "'", str27, "32");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(positionSet56);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(positionSet77);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 100 + "'", int78 == 100);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(positionSet80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
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
        ar.edu.unrc.game2048.Cell cell20 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean28 = cell20.canMergeWith(cell27);
        int int29 = cell27.getValue();
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        int int34 = board32.getSize();
        boolean boolean35 = board32.isFull();
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass37 = cell36.getClass();
        boolean boolean38 = board32.equals((java.lang.Object) cell36);
        boolean boolean39 = cell27.equals((java.lang.Object) cell36);
        ar.edu.unrc.game2048.Cell cell41 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str42 = cell41.toString();
        boolean boolean43 = cell41.isEmpty();
        int int44 = cell41.getValue();
        boolean boolean45 = cell41.isEmpty();
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int49 = board48.getSize();
        boolean boolean50 = board48.moveDown();
        boolean boolean51 = board48.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet58 = board57.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell61 = board57.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean62 = cell54.canMergeWith(cell61);
        int int63 = cell61.getValue();
        int int64 = cell61.getValue();
        board48.setCell((int) (short) 1, 0, cell61);
        boolean boolean66 = board48.isWinningBoard();
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(board48);
        boolean boolean68 = cell41.equals((java.lang.Object) board48);
        boolean boolean69 = cell27.canMergeWith(cell41);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell70 = cell7.mergeWith(cell27);
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
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "32" + "'", str42, "32");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertNotNull(positionSet58);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 32);
        java.lang.String str3 = position2.toString();
        java.lang.String str4 = position2.toString();
        int int5 = position2.col;
        java.lang.String str6 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 32)" + "'", str3, "(0, 32)");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(0, 32)" + "'", str4, "(0, 32)");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(0, 32)" + "'", str6, "(0, 32)");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        boolean boolean30 = board22.moveRight();
        boolean boolean31 = board22.moveDown();
        int int32 = board22.getScore();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        int int7 = board2.tileAmount();
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
        boolean boolean31 = cell25.equals((java.lang.Object) 0.0f);
        java.lang.String str32 = cell25.toString();
        boolean boolean33 = cell25.isEmpty();
        java.lang.String str34 = cell25.toString();
        board2.setCell(32, (int) (byte) 0, cell25);
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertNotNull(positionSet22);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        int int12 = board2.tileAmount();
        boolean boolean13 = board2.moveUp();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board10.hasEmptyCells();
        boolean boolean12 = board10.moveRight();
        board10.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.String str46 = position2.toString();
        int int47 = position2.col;
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
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "(10, -1)" + "'", str46, "(10, -1)");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 1, (int) (byte) -1);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(1, -1)" + "'", str3, "(1, -1)");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board8.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean13 = cell12.isEmpty();
        board2.setCell(4, (int) ' ', cell12);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet18 = board17.getEmptyPositions();
        boolean boolean19 = board17.moveLeft();
        int int20 = board17.getSize();
        boolean boolean21 = board17.isLosingBoard();
        boolean boolean22 = board17.moveLeft();
        boolean boolean23 = board17.moveRight();
        boolean boolean24 = cell12.equals((java.lang.Object) board17);
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(positionSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board5.getEmptyPositions();
        int int7 = board5.getSize();
        board5.clearBoard();
        boolean boolean9 = board5.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board5);
        boolean boolean11 = position2.equals((java.lang.Object) board5);
        int int12 = board5.getSize();
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(52, 4);
        boolean boolean3 = board2.moveDown();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(cell6);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        board18.clearBoard();
        int int22 = board18.tileAmount();
        boolean boolean24 = board18.equals((java.lang.Object) 10.0d);
        int int25 = board18.getScore();
        boolean boolean26 = board2.equals((java.lang.Object) board18);
        boolean boolean27 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        int int12 = board11.getSize();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        int int16 = board14.getSize();
        board14.clearBoard();
        boolean boolean18 = board2.equals((java.lang.Object) board14);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board2.getEmptyPositions();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board2.getEmptyPositions();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(positionSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertNotNull(positionSet20);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveLeft();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveUp();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet15 = board14.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell18 = board14.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int22 = board21.getSize();
        boolean boolean23 = board21.moveDown();
        board21.clearBoard();
        boolean boolean25 = board21.moveRight();
        boolean boolean26 = cell18.equals((java.lang.Object) boolean25);
        board2.setCell((int) '#', (int) '#', cell18);
        boolean boolean28 = cell18.isEmpty();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(positionSet15);
        org.junit.Assert.assertNotNull(cell18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(32, (int) (short) 1);
        boolean boolean9 = board2.moveDown();
        boolean boolean10 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        boolean boolean9 = board2.isLosingBoard();
        boolean boolean10 = board2.moveUp();
        boolean boolean11 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean14 = board2.equals((java.lang.Object) 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.isWinningBoard();
        int int8 = board2.getSize();
        boolean boolean9 = board2.moveUp();
        int int10 = board2.tileAmount();
        boolean boolean11 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        int int7 = board2.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        board8.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(10, (int) (short) 100);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        int int8 = board2.getSize();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        boolean boolean12 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(board2);
        int int14 = board2.getScore();
        boolean boolean15 = board2.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.isLosingBoard();
        int int10 = board2.getScore();
        boolean boolean11 = board2.hasEmptyCells();
        boolean boolean12 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell14 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str15 = cell14.toString();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int19 = board18.getSize();
        boolean boolean20 = board18.moveDown();
        boolean boolean21 = board18.moveRight();
        board18.clearBoard();
        boolean boolean23 = cell14.equals((java.lang.Object) board18);
        boolean boolean24 = board18.moveLeft();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(board18);
        boolean boolean26 = board2.equals((java.lang.Object) board18);
        boolean boolean27 = board18.moveRight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32" + "'", str15, "32");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        int int9 = board2.getSize();
        boolean boolean10 = board2.moveDown();
        boolean boolean11 = board2.isLosingBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        int int7 = board2.getScore();
        int int8 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(52, (int) (short) 100);
        boolean boolean65 = board64.isWinningBoard();
        boolean boolean66 = board64.moveLeft();
        boolean boolean67 = board20.equals((java.lang.Object) boolean66);
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveRight();
        boolean boolean6 = board2.moveUp();
        boolean boolean7 = board2.isFull();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.isFull();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.moveLeft();
        board2.clearBoard();
        boolean boolean10 = board2.isWinningBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean69 = board64.isLosingBoard();
        board64.clearBoard();
        int int71 = board64.tileAmount();
        ar.edu.unrc.game2048.Board board74 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int75 = board74.getSize();
        boolean boolean76 = board74.moveDown();
        board74.clearBoard();
        boolean boolean78 = board74.hasEmptyCells();
        boolean boolean79 = board74.moveRight();
        int int80 = board74.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet81 = board74.getEmptyPositions();
        boolean boolean82 = board64.equals((java.lang.Object) board74);
        boolean boolean83 = board64.isLosingBoard();
        boolean boolean84 = board64.isLosingBoard();
        ar.edu.unrc.game2048.Board board85 = new ar.edu.unrc.game2048.Board(board64);
        boolean boolean86 = position22.equals((java.lang.Object) board64);
        boolean boolean87 = board64.hasEmptyCells();
        boolean boolean88 = board64.moveDown();
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
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2 + "'", int71 == 2);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 100 + "'", int75 == 100);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertNotNull(positionSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.isLosingBoard();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 100, (int) 'a');
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int1 = cell0.getValue();
        boolean boolean3 = cell0.equals((java.lang.Object) 100);
        boolean boolean4 = cell0.isEmpty();
        boolean boolean5 = cell0.isEmpty();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 32);
        java.lang.String str3 = position2.toString();
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        int int8 = board6.getSize();
        boolean boolean9 = board6.isFull();
        int int10 = board6.tileAmount();
        boolean boolean11 = board6.isFull();
        boolean boolean12 = position2.equals((java.lang.Object) board6);
        java.lang.String str13 = position2.toString();
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean18 = board16.equals((java.lang.Object) 1.0d);
        boolean boolean19 = board16.isLosingBoard();
        boolean boolean20 = board16.moveDown();
        ar.edu.unrc.game2048.Cell cell23 = board16.getCell(0, 32);
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int27 = board26.getSize();
        boolean boolean28 = board26.moveDown();
        board26.clearBoard();
        ar.edu.unrc.game2048.Cell cell32 = board26.getCell(4, (int) (byte) 1);
        boolean boolean33 = board26.moveLeft();
        boolean boolean34 = cell23.equals((java.lang.Object) board26);
        boolean boolean35 = position2.equals((java.lang.Object) cell23);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int39 = board38.getSize();
        boolean boolean40 = board38.moveDown();
        int int41 = board38.getScore();
        boolean boolean42 = board38.isWinningBoard();
        boolean boolean43 = board38.isFull();
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board38);
        int int45 = board44.getScore();
        boolean boolean46 = position2.equals((java.lang.Object) board44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(0, 32)" + "'", str3, "(0, 32)");
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(0, 32)" + "'", str13, "(0, 32)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
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
        boolean boolean36 = board8.moveDown();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board2.moveDown();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board11.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        boolean boolean15 = board13.moveDown();
        board13.clearBoard();
        ar.edu.unrc.game2048.Cell cell19 = board13.getCell(4, (int) (byte) 1);
        java.lang.String str20 = cell19.toString();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        int int25 = board23.getSize();
        board23.clearBoard();
        boolean boolean27 = board23.moveDown();
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(board23);
        boolean boolean29 = board23.moveRight();
        boolean boolean30 = board23.isWinningBoard();
        boolean boolean31 = board23.isWinningBoard();
        boolean boolean32 = cell19.equals((java.lang.Object) board23);
        board2.setCell(10, 10, cell19);
        java.lang.String str34 = cell19.toString();
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        int int39 = board37.getSize();
        boolean boolean40 = board37.isFull();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass42 = cell41.getClass();
        boolean boolean43 = board37.equals((java.lang.Object) cell41);
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(board37);
        boolean boolean45 = board44.isLosingBoard();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board44);
        boolean boolean47 = board46.moveLeft();
        boolean boolean48 = cell19.equals((java.lang.Object) board46);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet52 = board51.getEmptyPositions();
        int int53 = board51.getSize();
        boolean boolean54 = board51.isFull();
        ar.edu.unrc.game2048.Cell cell55 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass56 = cell55.getClass();
        boolean boolean57 = board51.equals((java.lang.Object) cell55);
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet61 = board60.getEmptyPositions();
        boolean boolean62 = board51.equals((java.lang.Object) positionSet61);
        boolean boolean63 = cell19.equals((java.lang.Object) board51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(cell19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "." + "'", str20, ".");
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(positionSet52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(cell55);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(positionSet61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 97) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet8 = board2.getEmptyPositions();
        boolean boolean9 = board2.moveDown();
        boolean boolean10 = board2.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(positionSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(1, 32)", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (1, 32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, (int) ' ');
        int int3 = position2.row;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        java.lang.String str22 = cell20.toString();
        ar.edu.unrc.game2048.Board.Position position25 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        int int26 = position25.row;
        boolean boolean27 = cell20.equals((java.lang.Object) position25);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32" + "'", str22, "32");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean11 = board2.equals((java.lang.Object) (-1.0d));
        ar.edu.unrc.game2048.Cell cell14 = board2.getCell(1, (int) (short) 10);
        boolean boolean15 = cell14.isEmpty();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        boolean boolean24 = board2.isWinningBoard();
        boolean boolean25 = board2.moveRight();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) 'a', 32);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) ' ');
        board2.setCell((int) (byte) 10, 0, cell12);
        boolean boolean14 = cell12.isEmpty();
        boolean boolean15 = cell12.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        boolean boolean14 = board12.moveDown();
        board12.clearBoard();
        boolean boolean16 = board12.hasEmptyCells();
        boolean boolean17 = board12.moveRight();
        int int18 = board12.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board12.getEmptyPositions();
        boolean boolean20 = board2.equals((java.lang.Object) board12);
        boolean boolean21 = board2.isLosingBoard();
        int int22 = board2.tileAmount();
        board2.clearBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        int int6 = board4.getSize();
        board4.clearBoard();
        boolean boolean8 = board4.moveLeft();
        boolean boolean9 = cell1.equals((java.lang.Object) board4);
        boolean boolean10 = cell1.isEmpty();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(board13);
        ar.edu.unrc.game2048.Cell cell19 = new ar.edu.unrc.game2048.Cell(2);
        board15.setCell((int) (byte) 1, 32, cell19);
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board23.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell27 = board23.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean28 = cell19.canMergeWith(cell27);
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean37 = cell29.canMergeWith(cell36);
        java.lang.String str38 = cell29.toString();
        java.lang.String str39 = cell29.toString();
        boolean boolean40 = cell29.isEmpty();
        ar.edu.unrc.game2048.Cell cell41 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board44 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet45 = board44.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell48 = board44.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean49 = cell41.canMergeWith(cell48);
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board53 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet54 = board53.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell57 = board53.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean58 = cell50.canMergeWith(cell57);
        boolean boolean59 = cell48.canMergeWith(cell57);
        boolean boolean60 = cell29.canMergeWith(cell57);
        boolean boolean61 = cell57.isEmpty();
        boolean boolean62 = cell57.isEmpty();
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int66 = board65.getSize();
        boolean boolean67 = board65.moveDown();
        boolean boolean68 = board65.isLosingBoard();
        boolean boolean69 = board65.isLosingBoard();
        int int70 = board65.getScore();
        boolean boolean71 = board65.moveRight();
        ar.edu.unrc.game2048.Cell cell75 = new ar.edu.unrc.game2048.Cell((int) ' ');
        board65.setCell((int) (byte) 10, 0, cell75);
        boolean boolean77 = cell57.equals((java.lang.Object) (byte) 10);
        boolean boolean78 = cell19.canMergeWith(cell57);
        int int79 = cell19.getValue();
        ar.edu.unrc.game2048.Cell cell80 = cell1.mergeWith(cell19);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "." + "'", str38, ".");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "." + "'", str39, ".");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertNotNull(positionSet45);
        org.junit.Assert.assertNotNull(cell48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertNotNull(positionSet54);
        org.junit.Assert.assertNotNull(cell57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertNotNull(cell80);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isFull();
        boolean boolean9 = board2.moveDown();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board2.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(0, 3);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveRight();
        boolean boolean8 = board5.moveDown();
        ar.edu.unrc.game2048.Board.Position position13 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean15 = position13.equals((java.lang.Object) 1);
        int int16 = position13.col;
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        int int21 = board19.getSize();
        boolean boolean22 = board19.isFull();
        int int23 = board19.tileAmount();
        boolean boolean24 = position13.equals((java.lang.Object) board19);
        boolean boolean25 = board19.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell29 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str30 = cell29.toString();
        boolean boolean31 = cell29.isEmpty();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board34.getEmptyPositions();
        int int36 = board34.getSize();
        boolean boolean37 = board34.isFull();
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass39 = cell38.getClass();
        boolean boolean40 = board34.equals((java.lang.Object) cell38);
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(board34);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board34.getEmptyPositions();
        boolean boolean43 = cell29.equals((java.lang.Object) board34);
        board19.setCell((int) (byte) 1, (int) '4', cell29);
        board5.setCell(1, (int) '#', cell29);
        boolean boolean46 = position2.equals((java.lang.Object) cell29);
        ar.edu.unrc.game2048.Board.Position position49 = new ar.edu.unrc.game2048.Board.Position(32, 10);
        ar.edu.unrc.game2048.Cell cell50 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass51 = cell50.getClass();
        boolean boolean52 = position49.equals((java.lang.Object) cell50);
        int int53 = position49.row;
        ar.edu.unrc.game2048.Cell cell54 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board57 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet58 = board57.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell61 = board57.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean62 = cell54.canMergeWith(cell61);
        int int63 = cell54.getValue();
        ar.edu.unrc.game2048.Board board66 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet67 = board66.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell70 = board66.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board71 = new ar.edu.unrc.game2048.Board(board66);
        boolean boolean72 = board66.moveUp();
        boolean boolean74 = board66.equals((java.lang.Object) 100.0d);
        boolean boolean75 = cell54.equals((java.lang.Object) boolean74);
        ar.edu.unrc.game2048.Board board78 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet79 = board78.getEmptyPositions();
        int int80 = board78.getSize();
        boolean boolean81 = board78.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet82 = board78.getEmptyPositions();
        boolean boolean83 = board78.isFull();
        boolean boolean84 = cell54.equals((java.lang.Object) board78);
        boolean boolean85 = position49.equals((java.lang.Object) cell54);
        boolean boolean86 = cell29.canMergeWith(cell54);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "32" + "'", str30, "32");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(cell50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 32 + "'", int53 == 32);
        org.junit.Assert.assertNotNull(cell54);
        org.junit.Assert.assertNotNull(positionSet58);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(positionSet67);
        org.junit.Assert.assertNotNull(cell70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(positionSet79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 100 + "'", int80 == 100);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(positionSet82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        boolean boolean24 = board12.isLosingBoard();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(32, 0);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.getSize();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean21 = cell13.canMergeWith(cell20);
        java.lang.String str22 = cell13.toString();
        java.lang.String str23 = cell13.toString();
        boolean boolean24 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        boolean boolean43 = cell32.canMergeWith(cell41);
        boolean boolean44 = cell13.canMergeWith(cell41);
        int int45 = cell41.getValue();
        boolean boolean46 = cell41.isEmpty();
        boolean boolean47 = cell41.isEmpty();
        java.lang.Class<?> wildcardClass48 = cell41.getClass();
        boolean boolean49 = board2.equals((java.lang.Object) cell41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell((int) (short) 10, (int) (short) 1);
        int int9 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, 100);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        boolean boolean8 = board2.isLosingBoard();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        int int20 = board18.getSize();
        boolean boolean21 = board18.isFull();
        ar.edu.unrc.game2048.Board board24 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int25 = board24.getSize();
        boolean boolean26 = board24.moveDown();
        ar.edu.unrc.game2048.Cell cell27 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board30 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet31 = board30.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell34 = board30.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean35 = cell27.canMergeWith(cell34);
        int int36 = cell34.getValue();
        boolean boolean37 = board24.equals((java.lang.Object) int36);
        boolean boolean38 = board18.equals((java.lang.Object) boolean37);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet39 = board18.getEmptyPositions();
        boolean boolean40 = cell1.equals((java.lang.Object) board18);
        org.junit.Assert.assertNotNull(cell2);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertNotNull(cell9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "." + "'", str11, ".");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "." + "'", str12, ".");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(cell27);
        org.junit.Assert.assertNotNull(positionSet31);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(positionSet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.moveLeft();
        int int5 = board2.getSize();
        boolean boolean6 = board2.isLosingBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int13 = board12.getSize();
        ar.edu.unrc.game2048.Board board14 = new ar.edu.unrc.game2048.Board(board12);
        ar.edu.unrc.game2048.Cell cell18 = new ar.edu.unrc.game2048.Cell(2);
        board14.setCell((int) (byte) 1, 32, cell18);
        ar.edu.unrc.game2048.Board board22 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet23 = board22.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell26 = board22.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean27 = cell18.canMergeWith(cell26);
        ar.edu.unrc.game2048.Cell cell28 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean37 = cell29.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell45 = board41.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean46 = cell38.canMergeWith(cell45);
        boolean boolean47 = cell36.canMergeWith(cell45);
        ar.edu.unrc.game2048.Cell cell49 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean50 = cell45.canMergeWith(cell49);
        ar.edu.unrc.game2048.Cell cell51 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board54 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet55 = board54.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell58 = board54.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean59 = cell51.canMergeWith(cell58);
        java.lang.String str60 = cell51.toString();
        boolean boolean61 = cell49.canMergeWith(cell51);
        boolean boolean62 = cell28.canMergeWith(cell49);
        ar.edu.unrc.game2048.Board board65 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int66 = board65.getSize();
        boolean boolean67 = board65.moveDown();
        board65.clearBoard();
        boolean boolean69 = board65.hasEmptyCells();
        boolean boolean70 = board65.moveRight();
        int int71 = board65.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet72 = board65.getEmptyPositions();
        boolean boolean73 = cell49.equals((java.lang.Object) board65);
        boolean boolean74 = cell18.canMergeWith(cell49);
        boolean boolean75 = board2.equals((java.lang.Object) boolean74);
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(positionSet23);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(cell28);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell51);
        org.junit.Assert.assertNotNull(positionSet55);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "." + "'", str60, ".");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 100 + "'", int71 == 100);
        org.junit.Assert.assertNotNull(positionSet72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell((int) ' ');
        int int12 = cell11.getValue();
        boolean boolean13 = cell8.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        int int18 = board16.getSize();
        board16.clearBoard();
        boolean boolean20 = board16.moveDown();
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean22 = board16.moveUp();
        boolean boolean23 = cell11.equals((java.lang.Object) boolean22);
        ar.edu.unrc.game2048.Cell cell25 = new ar.edu.unrc.game2048.Cell(0);
        ar.edu.unrc.game2048.Cell cell26 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell33 = board29.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean34 = cell26.canMergeWith(cell33);
        java.lang.String str35 = cell26.toString();
        java.lang.String str36 = cell26.toString();
        boolean boolean37 = cell26.isEmpty();
        boolean boolean38 = cell25.canMergeWith(cell26);
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int42 = board41.getSize();
        boolean boolean43 = board41.moveDown();
        boolean boolean44 = board41.isLosingBoard();
        boolean boolean45 = board41.isLosingBoard();
        int int46 = board41.getScore();
        boolean boolean47 = board41.moveRight();
        ar.edu.unrc.game2048.Cell cell51 = new ar.edu.unrc.game2048.Cell((int) ' ');
        board41.setCell((int) (byte) 10, 0, cell51);
        boolean boolean53 = cell25.canMergeWith(cell51);
        int int54 = cell51.getValue();
        ar.edu.unrc.game2048.Cell cell55 = cell11.mergeWith(cell51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(cell26);
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertNotNull(cell33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "." + "'", str35, ".");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "." + "'", str36, ".");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertNotNull(cell55);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.isLosingBoard();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board9);
        boolean boolean12 = board11.moveLeft();
        boolean boolean13 = board11.isLosingBoard();
        boolean boolean14 = board11.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        int int10 = board2.getSize();
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board((int) (byte) 10, 100);
        ar.edu.unrc.game2048.Cell cell18 = board15.getCell(2, (int) (byte) 0);
        board2.setCell((int) '4', (int) '#', cell18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(cell18);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) 1);
        int int3 = position2.col;
        java.lang.String str4 = position2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "(100, 1)" + "'", str4, "(100, 1)");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell7 = board2.getCell((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
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
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int38 = board37.getSize();
        boolean boolean39 = board37.moveRight();
        ar.edu.unrc.game2048.Board board42 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet43 = board42.getEmptyPositions();
        int int44 = board42.getSize();
        boolean boolean45 = board42.isFull();
        ar.edu.unrc.game2048.Cell cell46 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass47 = cell46.getClass();
        boolean boolean48 = board42.equals((java.lang.Object) cell46);
        ar.edu.unrc.game2048.Board board49 = new ar.edu.unrc.game2048.Board(board42);
        boolean boolean50 = board37.equals((java.lang.Object) board42);
        ar.edu.unrc.game2048.Cell cell53 = board37.getCell(1, (int) '#');
        boolean boolean54 = board37.isFull();
        ar.edu.unrc.game2048.Board.Position position57 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str58 = position57.toString();
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet62 = board61.getEmptyPositions();
        int int63 = board61.getSize();
        board61.clearBoard();
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int68 = board67.getSize();
        boolean boolean69 = board67.moveDown();
        int int70 = board67.getScore();
        boolean boolean71 = board67.moveRight();
        boolean boolean72 = board61.equals((java.lang.Object) boolean71);
        boolean boolean73 = position57.equals((java.lang.Object) boolean71);
        java.lang.String str74 = position57.toString();
        ar.edu.unrc.game2048.Board board77 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet78 = board77.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell81 = board77.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board82 = new ar.edu.unrc.game2048.Board(board77);
        boolean boolean83 = board77.moveUp();
        boolean boolean84 = position57.equals((java.lang.Object) board77);
        ar.edu.unrc.game2048.Board board87 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet88 = board87.getEmptyPositions();
        int int89 = board87.getSize();
        board87.clearBoard();
        boolean boolean91 = board87.moveDown();
        ar.edu.unrc.game2048.Board board92 = new ar.edu.unrc.game2048.Board(board87);
        boolean boolean93 = board87.moveRight();
        ar.edu.unrc.game2048.Board board94 = new ar.edu.unrc.game2048.Board(board87);
        boolean boolean95 = position57.equals((java.lang.Object) board87);
        boolean boolean96 = board37.equals((java.lang.Object) position57);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet97 = board37.getEmptyPositions();
        boolean boolean98 = board37.isFull();
        boolean boolean99 = cell11.equals((java.lang.Object) boolean98);
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(positionSet43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(cell46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(cell53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "(0, 52)" + "'", str58, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 100 + "'", int63 == 100);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 100 + "'", int68 == 100);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "(0, 52)" + "'", str74, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet78);
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(positionSet88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(positionSet97);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        int int15 = board13.getSize();
        board13.clearBoard();
        boolean boolean17 = board13.moveDown();
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean19 = board13.moveRight();
        boolean boolean20 = board13.isWinningBoard();
        ar.edu.unrc.game2048.Cell cell23 = board13.getCell(2, 0);
        board2.setCell((int) '4', (int) '4', cell23);
        java.lang.String str25 = cell23.toString();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "." + "'", str25, ".");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(35, 32)", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (35, 32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        int int9 = board2.tileAmount();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.tileAmount();
        int int12 = board2.tileAmount();
        java.lang.Class<?> wildcardClass13 = board2.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveDown();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(board2);
        int int8 = board2.getScore();
        int int9 = board2.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(5, (int) (short) 100);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell(0, 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        boolean boolean17 = board15.moveLeft();
        int int18 = board15.getSize();
        boolean boolean19 = board15.moveDown();
        boolean boolean20 = board15.moveUp();
        boolean boolean21 = cell12.equals((java.lang.Object) board15);
        board15.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell8 = board4.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean9 = cell1.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell10.canMergeWith(cell17);
        boolean boolean19 = cell8.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean22 = cell17.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean31 = cell23.canMergeWith(cell30);
        java.lang.String str32 = cell23.toString();
        boolean boolean33 = cell21.canMergeWith(cell23);
        boolean boolean34 = cell0.canMergeWith(cell21);
        int int35 = cell21.getValue();
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet39 = board38.getEmptyPositions();
        int int40 = board38.getSize();
        board38.clearBoard();
        boolean boolean42 = board38.moveDown();
        int int43 = board38.getScore();
        boolean boolean44 = board38.moveDown();
        ar.edu.unrc.game2048.Cell cell47 = board38.getCell(0, 3);
        boolean boolean48 = cell21.canMergeWith(cell47);
        ar.edu.unrc.game2048.Board board51 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int52 = board51.getSize();
        boolean boolean53 = board51.moveDown();
        board51.clearBoard();
        boolean boolean55 = board51.hasEmptyCells();
        boolean boolean56 = board51.moveRight();
        boolean boolean57 = cell47.equals((java.lang.Object) boolean56);
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertNotNull(positionSet39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(cell47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        int int24 = board12.getSize();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        board2.clearBoard();
        int int8 = board2.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int12 = board11.getSize();
        boolean boolean13 = board11.moveDown();
        board11.clearBoard();
        ar.edu.unrc.game2048.Cell cell17 = board11.getCell(4, (int) (byte) 1);
        boolean boolean18 = board11.moveLeft();
        int int19 = board11.getScore();
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean21 = board2.equals((java.lang.Object) board20);
        boolean boolean22 = board20.moveDown();
        int int23 = board20.getScore();
        boolean boolean24 = board20.moveLeft();
        boolean boolean25 = board20.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.getSize();
        int int12 = board2.getSize();
        boolean boolean13 = board2.moveRight();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, (int) (short) -1);
        ar.edu.unrc.game2048.Board board5 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int6 = board5.getSize();
        boolean boolean7 = board5.moveRight();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        int int12 = board10.getSize();
        boolean boolean13 = board10.isFull();
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass15 = cell14.getClass();
        boolean boolean16 = board10.equals((java.lang.Object) cell14);
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(board10);
        boolean boolean18 = board5.equals((java.lang.Object) board10);
        ar.edu.unrc.game2048.Cell cell21 = board5.getCell(1, (int) '#');
        boolean boolean22 = board5.isFull();
        ar.edu.unrc.game2048.Board.Position position25 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        java.lang.String str26 = position25.toString();
        ar.edu.unrc.game2048.Board board29 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet30 = board29.getEmptyPositions();
        int int31 = board29.getSize();
        board29.clearBoard();
        ar.edu.unrc.game2048.Board board35 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int36 = board35.getSize();
        boolean boolean37 = board35.moveDown();
        int int38 = board35.getScore();
        boolean boolean39 = board35.moveRight();
        boolean boolean40 = board29.equals((java.lang.Object) boolean39);
        boolean boolean41 = position25.equals((java.lang.Object) boolean39);
        java.lang.String str42 = position25.toString();
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet46 = board45.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell49 = board45.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(board45);
        boolean boolean51 = board45.moveUp();
        boolean boolean52 = position25.equals((java.lang.Object) board45);
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet56 = board55.getEmptyPositions();
        int int57 = board55.getSize();
        board55.clearBoard();
        boolean boolean59 = board55.moveDown();
        ar.edu.unrc.game2048.Board board60 = new ar.edu.unrc.game2048.Board(board55);
        boolean boolean61 = board55.moveRight();
        ar.edu.unrc.game2048.Board board62 = new ar.edu.unrc.game2048.Board(board55);
        boolean boolean63 = position25.equals((java.lang.Object) board55);
        boolean boolean64 = board5.equals((java.lang.Object) position25);
        ar.edu.unrc.game2048.Board board67 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet68 = board67.getEmptyPositions();
        int int69 = board67.getSize();
        boolean boolean70 = board67.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet71 = board67.getEmptyPositions();
        ar.edu.unrc.game2048.Board board72 = new ar.edu.unrc.game2048.Board(board67);
        boolean boolean73 = board5.equals((java.lang.Object) board67);
        boolean boolean74 = board5.hasEmptyCells();
        boolean boolean75 = position2.equals((java.lang.Object) boolean74);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(cell21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "(0, 52)" + "'", str26, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "(0, 52)" + "'", str42, "(0, 52)");
        org.junit.Assert.assertNotNull(positionSet46);
        org.junit.Assert.assertNotNull(cell49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(positionSet56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 100 + "'", int57 == 100);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(positionSet68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 100 + "'", int69 == 100);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(positionSet71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        int int18 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet9 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board10.hasEmptyCells();
        boolean boolean12 = board10.isWinningBoard();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet13 = board10.getEmptyPositions();
        java.lang.Class<?> wildcardClass14 = positionSet13.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(positionSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet62 = board2.getEmptyPositions();
        boolean boolean63 = board2.isWinningBoard();
        int int64 = board2.tileAmount();
        ar.edu.unrc.game2048.Board board69 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        boolean boolean71 = board69.equals((java.lang.Object) 1.0d);
        boolean boolean72 = board69.isLosingBoard();
        boolean boolean73 = board69.moveDown();
        ar.edu.unrc.game2048.Cell cell76 = board69.getCell(0, 32);
        board2.setCell(0, 0, cell76);
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
        org.junit.Assert.assertNotNull(positionSet62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 3 + "'", int64 == 3);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(cell76);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        boolean boolean36 = board8.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell39 = board8.getCell(0, (int) 'a');
        boolean boolean40 = cell39.isEmpty();
        ar.edu.unrc.game2048.Board board43 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet44 = board43.getEmptyPositions();
        boolean boolean45 = board43.moveDown();
        int int46 = board43.tileAmount();
        boolean boolean47 = board43.moveLeft();
        ar.edu.unrc.game2048.Board board50 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int51 = board50.getSize();
        boolean boolean52 = board50.moveDown();
        board50.clearBoard();
        boolean boolean54 = board43.equals((java.lang.Object) board50);
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(board43);
        boolean boolean56 = cell39.equals((java.lang.Object) board55);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(positionSet44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean8 = board2.equals((java.lang.Object) 10.0d);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell(0, 0);
        ar.edu.unrc.game2048.Board board15 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet16 = board15.getEmptyPositions();
        boolean boolean17 = board15.moveLeft();
        int int18 = board15.getSize();
        boolean boolean19 = board15.moveDown();
        boolean boolean20 = board15.moveUp();
        boolean boolean21 = cell12.equals((java.lang.Object) board15);
        boolean boolean22 = board15.hasEmptyCells();
        board15.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertNotNull(positionSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
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
        int int25 = board17.getScore();
        boolean boolean26 = board17.moveUp();
        int int27 = board17.getScore();
        boolean boolean28 = cell6.equals((java.lang.Object) board17);
        ar.edu.unrc.game2048.Board.Position position31 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        java.lang.String str32 = position31.toString();
        boolean boolean33 = board17.equals((java.lang.Object) position31);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(0, -1)" + "'", str32, "(0, -1)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board2.getEmptyPositions();
        boolean boolean8 = board2.moveUp();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (int) ' ');
        ar.edu.unrc.game2048.Board.Position position5 = new ar.edu.unrc.game2048.Board.Position((int) (short) 0, (-1));
        int int6 = position5.row;
        java.lang.String str7 = position5.toString();
        boolean boolean8 = position2.equals((java.lang.Object) position5);
        java.lang.String str9 = position5.toString();
        ar.edu.unrc.game2048.Board.Position position12 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean14 = position12.equals((java.lang.Object) 1);
        int int15 = position12.col;
        ar.edu.unrc.game2048.Board board18 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet19 = board18.getEmptyPositions();
        int int20 = board18.getSize();
        boolean boolean21 = board18.isFull();
        int int22 = board18.tileAmount();
        boolean boolean23 = position12.equals((java.lang.Object) board18);
        boolean boolean24 = board18.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell28 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str29 = cell28.toString();
        boolean boolean30 = cell28.isEmpty();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        int int35 = board33.getSize();
        boolean boolean36 = board33.isFull();
        ar.edu.unrc.game2048.Cell cell37 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass38 = cell37.getClass();
        boolean boolean39 = board33.equals((java.lang.Object) cell37);
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(board33);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet41 = board33.getEmptyPositions();
        boolean boolean42 = cell28.equals((java.lang.Object) board33);
        board18.setCell((int) (byte) 1, (int) '4', cell28);
        int int44 = board18.getSize();
        boolean boolean45 = board18.moveLeft();
        boolean boolean46 = board18.isLosingBoard();
        boolean boolean47 = position5.equals((java.lang.Object) board18);
        boolean boolean48 = board18.moveDown();
        boolean boolean49 = board18.isFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "(0, -1)" + "'", str7, "(0, -1)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(0, -1)" + "'", str9, "(0, -1)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(positionSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "32" + "'", str29, "32");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(cell37);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(positionSet41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 100 + "'", int44 == 100);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell6 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass7 = cell6.getClass();
        boolean boolean8 = board2.equals((java.lang.Object) cell6);
        ar.edu.unrc.game2048.Board board9 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean10 = board9.isLosingBoard();
        boolean boolean11 = board9.moveRight();
        int int12 = board9.tileAmount();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        int int12 = cell3.getValue();
        boolean boolean13 = position2.equals((java.lang.Object) int12);
        int int14 = position2.row;
        int int15 = position2.col;
        int int16 = position2.row;
        int int17 = position2.row;
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveDown();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell14 = board2.getCell((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (100, 0) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        board2.clearBoard();
        boolean boolean6 = board2.moveLeft();
        boolean boolean7 = board2.isWinningBoard();
        boolean boolean8 = board2.moveDown();
        boolean boolean9 = board2.isFull();
        int int10 = board2.getScore();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(2, 0);
        java.lang.String str3 = position2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(2, 0)" + "'", str3, "(2, 0)");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        boolean boolean16 = board2.moveDown();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell5);
        org.junit.Assert.assertNotNull(positionSet9);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int14 = board13.getSize();
        boolean boolean15 = board13.moveDown();
        boolean boolean16 = board13.moveRight();
        boolean boolean17 = board13.moveUp();
        boolean boolean18 = board2.equals((java.lang.Object) board13);
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(board13);
        boolean boolean20 = board19.isLosingBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (short) 100, (int) (byte) 0);
        boolean boolean3 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        ar.edu.unrc.game2048.Cell cell17 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board20 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet21 = board20.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell24 = board20.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean25 = cell17.canMergeWith(cell24);
        java.lang.String str26 = cell17.toString();
        java.lang.String str27 = cell17.toString();
        boolean boolean28 = cell17.isEmpty();
        ar.edu.unrc.game2048.Cell cell29 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board32 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet33 = board32.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell36 = board32.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean37 = cell29.canMergeWith(cell36);
        ar.edu.unrc.game2048.Cell cell38 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board41 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet42 = board41.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell45 = board41.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean46 = cell38.canMergeWith(cell45);
        boolean boolean47 = cell36.canMergeWith(cell45);
        boolean boolean48 = cell17.canMergeWith(cell45);
        int int49 = cell45.getValue();
        int int50 = cell45.getValue();
        board11.setCell((int) '4', 4, cell45);
        ar.edu.unrc.game2048.Board board52 = new ar.edu.unrc.game2048.Board(board11);
        boolean boolean53 = board52.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertNotNull(positionSet21);
        org.junit.Assert.assertNotNull(cell24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "." + "'", str26, ".");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "." + "'", str27, ".");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(cell29);
        org.junit.Assert.assertNotNull(positionSet33);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertNotNull(positionSet42);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean13 = board12.moveLeft();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board("(0, 32)", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board string must start with '[' and end with ']': (0, 32)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', 0);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Board is full, no empty positions available.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        int int12 = board2.tileAmount();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        boolean boolean6 = board2.hasEmptyCells();
        boolean boolean7 = board2.moveRight();
        int int8 = board2.getSize();
        board2.clearBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board2.getEmptyPositions();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(positionSet11);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        ar.edu.unrc.game2048.Cell cell12 = new ar.edu.unrc.game2048.Cell((int) ' ');
        board2.setCell((int) (byte) 10, 0, cell12);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        ar.edu.unrc.game2048.Board board21 = new ar.edu.unrc.game2048.Board(board16);
        boolean boolean22 = board16.moveUp();
        boolean boolean24 = board16.equals((java.lang.Object) 100.0d);
        boolean boolean25 = cell12.equals((java.lang.Object) boolean24);
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        boolean boolean30 = board28.moveUp();
        ar.edu.unrc.game2048.Board board33 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet34 = board33.getEmptyPositions();
        boolean boolean35 = board33.moveDown();
        int int36 = board33.tileAmount();
        boolean boolean37 = board33.moveLeft();
        ar.edu.unrc.game2048.Board board40 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int41 = board40.getSize();
        boolean boolean42 = board40.moveDown();
        board40.clearBoard();
        boolean boolean44 = board33.equals((java.lang.Object) board40);
        ar.edu.unrc.game2048.Board board45 = new ar.edu.unrc.game2048.Board(board33);
        boolean boolean46 = board28.equals((java.lang.Object) board33);
        boolean boolean47 = cell12.equals((java.lang.Object) boolean46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(positionSet34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell8 = new ar.edu.unrc.game2048.Cell(2);
        board4.setCell((int) (byte) 1, 32, cell8);
        java.lang.String str10 = cell8.toString();
        boolean boolean11 = cell8.isEmpty();
        boolean boolean12 = cell8.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2" + "'", str10, "2");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        int int31 = board2.getScore();
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board34.getEmptyPositions();
        int int36 = board34.getSize();
        board34.clearBoard();
        boolean boolean38 = board34.moveDown();
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(board34);
        boolean boolean40 = board34.moveUp();
        ar.edu.unrc.game2048.Cell cell43 = ar.edu.unrc.game2048.Cell.EMPTY;
        int int44 = cell43.getValue();
        boolean boolean46 = cell43.equals((java.lang.Object) 100);
        board34.setCell((int) '#', 0, cell43);
        board34.clearBoard();
        boolean boolean49 = board2.equals((java.lang.Object) board34);
        int int50 = board34.getScore();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (byte) -1, (int) (short) 0);
        java.lang.Object obj3 = null;
        boolean boolean4 = position2.equals(obj3);
        int int5 = position2.col;
        int int6 = position2.col;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveRight();
        boolean boolean5 = board2.moveDown();
        ar.edu.unrc.game2048.Board.Position position10 = new ar.edu.unrc.game2048.Board.Position(0, (int) '4');
        boolean boolean12 = position10.equals((java.lang.Object) 1);
        int int13 = position10.col;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        int int18 = board16.getSize();
        boolean boolean19 = board16.isFull();
        int int20 = board16.tileAmount();
        boolean boolean21 = position10.equals((java.lang.Object) board16);
        boolean boolean22 = board16.hasEmptyCells();
        ar.edu.unrc.game2048.Cell cell26 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str27 = cell26.toString();
        boolean boolean28 = cell26.isEmpty();
        ar.edu.unrc.game2048.Board board31 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet32 = board31.getEmptyPositions();
        int int33 = board31.getSize();
        boolean boolean34 = board31.isFull();
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        java.lang.Class<?> wildcardClass36 = cell35.getClass();
        boolean boolean37 = board31.equals((java.lang.Object) cell35);
        ar.edu.unrc.game2048.Board board38 = new ar.edu.unrc.game2048.Board(board31);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet39 = board31.getEmptyPositions();
        boolean boolean40 = cell26.equals((java.lang.Object) board31);
        board16.setCell((int) (byte) 1, (int) '4', cell26);
        board2.setCell(1, (int) '#', cell26);
        boolean boolean43 = cell26.isEmpty();
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet47 = board46.getEmptyPositions();
        boolean boolean48 = board46.moveLeft();
        int int49 = board46.getSize();
        boolean boolean50 = cell26.equals((java.lang.Object) board46);
        boolean boolean51 = cell26.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "32" + "'", str27, "32");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(positionSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(positionSet39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(positionSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        boolean boolean16 = board7.moveLeft();
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        boolean boolean10 = board2.moveDown();
        int int11 = board2.tileAmount();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet12 = board2.getEmptyPositions();
        int int13 = board2.getSize();
        board2.clearBoard();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(positionSet12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.tileAmount();
        boolean boolean7 = board2.hasEmptyCells();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet11 = board10.getEmptyPositions();
        boolean boolean12 = board10.moveDown();
        int int13 = board10.tileAmount();
        int int14 = board10.getScore();
        boolean boolean15 = board2.equals((java.lang.Object) board10);
        boolean boolean16 = board2.moveUp();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int20 = board19.getSize();
        boolean boolean21 = board19.moveDown();
        board19.clearBoard();
        ar.edu.unrc.game2048.Cell cell25 = board19.getCell(4, (int) (byte) 1);
        boolean boolean26 = board19.isLosingBoard();
        int int27 = board19.getScore();
        boolean boolean28 = board19.hasEmptyCells();
        boolean boolean29 = board19.hasEmptyCells();
        board19.clearBoard();
        boolean boolean31 = board2.equals((java.lang.Object) board19);
        int int32 = board2.getScore();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(positionSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        int int10 = board2.getScore();
        ar.edu.unrc.game2048.Cell cell13 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell20 = board16.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean21 = cell13.canMergeWith(cell20);
        java.lang.String str22 = cell13.toString();
        java.lang.String str23 = cell13.toString();
        boolean boolean24 = cell13.isEmpty();
        ar.edu.unrc.game2048.Cell cell25 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board28 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet29 = board28.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell32 = board28.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean33 = cell25.canMergeWith(cell32);
        ar.edu.unrc.game2048.Cell cell34 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board37 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet38 = board37.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell41 = board37.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean42 = cell34.canMergeWith(cell41);
        boolean boolean43 = cell32.canMergeWith(cell41);
        boolean boolean44 = cell13.canMergeWith(cell41);
        board2.setCell((int) 'a', 3, cell13);
        ar.edu.unrc.game2048.Board board46 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board.Position position51 = new ar.edu.unrc.game2048.Board.Position((int) (byte) 10, (int) (short) -1);
        ar.edu.unrc.game2048.Cell cell52 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board55 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet56 = board55.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell59 = board55.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean60 = cell52.canMergeWith(cell59);
        ar.edu.unrc.game2048.Cell cell61 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board64 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet65 = board64.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell68 = board64.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean69 = cell61.canMergeWith(cell68);
        boolean boolean70 = cell59.canMergeWith(cell68);
        ar.edu.unrc.game2048.Cell cell72 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean73 = cell68.canMergeWith(cell72);
        ar.edu.unrc.game2048.Cell cell74 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board77 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet78 = board77.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell81 = board77.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean82 = cell74.canMergeWith(cell81);
        java.lang.String str83 = cell74.toString();
        boolean boolean84 = cell72.canMergeWith(cell74);
        boolean boolean85 = position51.equals((java.lang.Object) cell74);
        java.lang.String str86 = cell74.toString();
        board2.setCell(32, 4, cell74);
        java.lang.String str88 = cell74.toString();
        ar.edu.unrc.game2048.Cell cell90 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str91 = cell90.toString();
        boolean boolean92 = cell90.isEmpty();
        int int93 = cell90.getValue();
        boolean boolean94 = cell90.isEmpty();
        boolean boolean95 = cell74.canMergeWith(cell90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(cell13);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertNotNull(cell20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "." + "'", str22, ".");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(cell25);
        org.junit.Assert.assertNotNull(positionSet29);
        org.junit.Assert.assertNotNull(cell32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(cell34);
        org.junit.Assert.assertNotNull(positionSet38);
        org.junit.Assert.assertNotNull(cell41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertNotNull(positionSet56);
        org.junit.Assert.assertNotNull(cell59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(cell61);
        org.junit.Assert.assertNotNull(positionSet65);
        org.junit.Assert.assertNotNull(cell68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(cell74);
        org.junit.Assert.assertNotNull(positionSet78);
        org.junit.Assert.assertNotNull(cell81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "." + "'", str83, ".");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "." + "'", str86, ".");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "." + "'", str88, ".");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "32" + "'", str91, "32");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 32 + "'", int93 == 32);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board((int) ' ', (int) (short) 10);
        boolean boolean3 = board2.moveLeft();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(100, (int) (short) -1);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.isFull();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Cell cell11 = board2.getCell((int) (short) 0, (int) 'a');
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell14 = ar.edu.unrc.game2048.Cell.EMPTY;
        boolean boolean15 = cell13.equals((java.lang.Object) cell14);
        boolean boolean16 = cell13.isEmpty();
        ar.edu.unrc.game2048.Board board19 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet20 = board19.getEmptyPositions();
        ar.edu.unrc.game2048.Board board25 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int26 = board25.getSize();
        boolean boolean27 = board25.moveDown();
        boolean boolean28 = board25.isLosingBoard();
        ar.edu.unrc.game2048.Cell cell31 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board34 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet35 = board34.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell38 = board34.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean39 = cell31.canMergeWith(cell38);
        int int40 = cell38.getValue();
        int int41 = cell38.getValue();
        board25.setCell((int) (short) 1, 0, cell38);
        board19.setCell(4, (int) '#', cell38);
        boolean boolean44 = cell13.canMergeWith(cell38);
        int int45 = cell13.getValue();
        boolean boolean46 = cell11.canMergeWith(cell13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(cell11);
        org.junit.Assert.assertNotNull(cell14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(positionSet20);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(cell31);
        org.junit.Assert.assertNotNull(positionSet35);
        org.junit.Assert.assertNotNull(cell38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(3, (int) (short) 1);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        ar.edu.unrc.game2048.Cell cell0 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell1 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board4 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet5 = board4.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell8 = board4.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean9 = cell1.canMergeWith(cell8);
        ar.edu.unrc.game2048.Cell cell10 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board13 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet14 = board13.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell17 = board13.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean18 = cell10.canMergeWith(cell17);
        boolean boolean19 = cell8.canMergeWith(cell17);
        ar.edu.unrc.game2048.Cell cell21 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean22 = cell17.canMergeWith(cell21);
        ar.edu.unrc.game2048.Cell cell23 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board26 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet27 = board26.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell30 = board26.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean31 = cell23.canMergeWith(cell30);
        java.lang.String str32 = cell23.toString();
        boolean boolean33 = cell21.canMergeWith(cell23);
        boolean boolean34 = cell0.canMergeWith(cell21);
        int int35 = cell21.getValue();
        int int36 = cell21.getValue();
        int int37 = cell21.getValue();
        org.junit.Assert.assertNotNull(cell0);
        org.junit.Assert.assertNotNull(cell1);
        org.junit.Assert.assertNotNull(positionSet5);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertNotNull(positionSet14);
        org.junit.Assert.assertNotNull(cell17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(cell23);
        org.junit.Assert.assertNotNull(positionSet27);
        org.junit.Assert.assertNotNull(cell30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "." + "'", str32, ".");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 32 + "'", int35 == 32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        ar.edu.unrc.game2048.Cell cell5 = board2.getCell(1, 2);
        org.junit.Assert.assertNotNull(cell5);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
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
        boolean boolean13 = board2.isWinningBoard();
        boolean boolean14 = board2.isWinningBoard();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        java.lang.String str9 = cell8.toString();
        ar.edu.unrc.game2048.Cell cell11 = new ar.edu.unrc.game2048.Cell((int) ' ');
        int int12 = cell11.getValue();
        boolean boolean13 = cell8.canMergeWith(cell11);
        ar.edu.unrc.game2048.Board board16 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet17 = board16.getEmptyPositions();
        boolean boolean18 = board16.moveDown();
        int int19 = board16.tileAmount();
        boolean boolean20 = board16.moveLeft();
        ar.edu.unrc.game2048.Board board23 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int24 = board23.getSize();
        boolean boolean25 = board23.moveDown();
        board23.clearBoard();
        boolean boolean27 = board16.equals((java.lang.Object) board23);
        boolean boolean28 = board16.moveRight();
        boolean boolean29 = cell8.equals((java.lang.Object) board16);
        java.lang.String str30 = cell8.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(positionSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "." + "'", str30, ".");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isWinningBoard();
        boolean boolean7 = board2.moveLeft();
        boolean boolean8 = board2.isWinningBoard();
        boolean boolean9 = board2.isFull();
        boolean boolean10 = board2.isWinningBoard();
        int int11 = board2.getSize();
        int int12 = board2.getSize();
        boolean boolean13 = board2.hasEmptyCells();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Board size must be positive: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position((int) (short) -1, 1);
        ar.edu.unrc.game2048.Cell cell3 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board6 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet7 = board6.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell10 = board6.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean11 = cell3.canMergeWith(cell10);
        int int12 = cell3.getValue();
        boolean boolean13 = position2.equals((java.lang.Object) int12);
        int int14 = position2.row;
        ar.edu.unrc.game2048.Board board17 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int18 = board17.getSize();
        boolean boolean19 = board17.moveDown();
        board17.clearBoard();
        boolean boolean21 = board17.hasEmptyCells();
        boolean boolean22 = board17.moveRight();
        int int23 = board17.getSize();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet24 = board17.getEmptyPositions();
        boolean boolean25 = position2.equals((java.lang.Object) board17);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet26 = board17.getEmptyPositions();
        org.junit.Assert.assertNotNull(cell3);
        org.junit.Assert.assertNotNull(positionSet7);
        org.junit.Assert.assertNotNull(cell10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(positionSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(positionSet26);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        int int5 = board2.getScore();
        boolean boolean6 = board2.isFull();
        int int7 = board2.getSize();
        ar.edu.unrc.game2048.Board board8 = new ar.edu.unrc.game2048.Board(board2);
        int int9 = board8.getSize();
        ar.edu.unrc.game2048.Cell cell12 = board8.getCell((int) (byte) 1, (int) '#');
        int int13 = cell12.getValue();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(cell12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        int int6 = board2.getScore();
        boolean boolean7 = board2.moveUp();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        ar.edu.unrc.game2048.Cell cell1 = new ar.edu.unrc.game2048.Cell(2);
        ar.edu.unrc.game2048.Cell cell3 = new ar.edu.unrc.game2048.Cell((int) ' ');
        java.lang.String str4 = cell3.toString();
        ar.edu.unrc.game2048.Board board7 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int8 = board7.getSize();
        boolean boolean9 = board7.moveDown();
        boolean boolean10 = board7.moveRight();
        board7.clearBoard();
        boolean boolean12 = cell3.equals((java.lang.Object) board7);
        int int13 = cell3.getValue();
        boolean boolean14 = cell1.canMergeWith(cell3);
        java.lang.String str15 = cell3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "32" + "'", str4, "32");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32" + "'", str15, "32");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        board2.clearBoard();
        ar.edu.unrc.game2048.Cell cell8 = board2.getCell(4, (int) (byte) 1);
        boolean boolean9 = board2.moveLeft();
        ar.edu.unrc.game2048.Cell cell12 = board2.getCell(10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            ar.edu.unrc.game2048.Cell cell15 = board2.getCell((int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Position (-1, 1) is out of bounds for board size 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(cell8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(cell12);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        boolean boolean33 = cell0.isEmpty();
        java.lang.String str34 = cell0.toString();
        ar.edu.unrc.game2048.Cell cell35 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Cell cell36 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board39 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet40 = board39.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell43 = board39.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean44 = cell36.canMergeWith(cell43);
        ar.edu.unrc.game2048.Cell cell45 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board48 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet49 = board48.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell52 = board48.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean53 = cell45.canMergeWith(cell52);
        boolean boolean54 = cell43.canMergeWith(cell52);
        ar.edu.unrc.game2048.Cell cell56 = new ar.edu.unrc.game2048.Cell((int) ' ');
        boolean boolean57 = cell52.canMergeWith(cell56);
        ar.edu.unrc.game2048.Cell cell58 = ar.edu.unrc.game2048.Cell.EMPTY;
        ar.edu.unrc.game2048.Board board61 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet62 = board61.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell65 = board61.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean66 = cell58.canMergeWith(cell65);
        java.lang.String str67 = cell58.toString();
        boolean boolean68 = cell56.canMergeWith(cell58);
        boolean boolean69 = cell35.canMergeWith(cell56);
        int int70 = cell56.getValue();
        int int71 = cell56.getValue();
        boolean boolean72 = cell0.canMergeWith(cell56);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "." + "'", str34, ".");
        org.junit.Assert.assertNotNull(cell35);
        org.junit.Assert.assertNotNull(cell36);
        org.junit.Assert.assertNotNull(positionSet40);
        org.junit.Assert.assertNotNull(cell43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(cell45);
        org.junit.Assert.assertNotNull(positionSet49);
        org.junit.Assert.assertNotNull(cell52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(cell58);
        org.junit.Assert.assertNotNull(positionSet62);
        org.junit.Assert.assertNotNull(cell65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "." + "'", str67, ".");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 32 + "'", int70 == 32);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 32 + "'", int71 == 32);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(4, (int) (byte) 10);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        java.lang.Class<?> wildcardClass4 = positionSet3.getClass();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        int int3 = board2.getSize();
        boolean boolean4 = board2.moveDown();
        boolean boolean5 = board2.isLosingBoard();
        boolean boolean6 = board2.isLosingBoard();
        int int7 = board2.getScore();
        boolean boolean8 = board2.moveRight();
        boolean boolean9 = board2.isFull();
        ar.edu.unrc.game2048.Cell cell13 = new ar.edu.unrc.game2048.Cell(32);
        java.lang.String str14 = cell13.toString();
        int int15 = cell13.getValue();
        board2.setCell((int) (short) 0, 0, cell13);
        int int17 = board2.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32" + "'", str14, "32");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        boolean boolean4 = board2.hasEmptyCells();
        boolean boolean5 = board2.moveLeft();
        boolean boolean6 = board2.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        ar.edu.unrc.game2048.Board board11 = new ar.edu.unrc.game2048.Board(board2);
        ar.edu.unrc.game2048.Board board12 = new ar.edu.unrc.game2048.Board(board2);
        board12.clearBoard();
        boolean boolean14 = board12.hasEmptyCells();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        ar.edu.unrc.game2048.Cell cell6 = board2.getCell((int) (short) 1, (int) (byte) 10);
        boolean boolean7 = board2.isLosingBoard();
        board2.clearBoard();
        boolean boolean10 = board2.equals((java.lang.Object) (-1));
        boolean boolean11 = board2.isWinningBoard();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertNotNull(cell6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        ar.edu.unrc.game2048.Board.Position position2 = new ar.edu.unrc.game2048.Board.Position(4, 4);
        java.lang.String str3 = position2.toString();
        int int4 = position2.row;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "(4, 4)" + "'", str3, "(4, 4)");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        ar.edu.unrc.game2048.Board board2 = new ar.edu.unrc.game2048.Board(100, (int) (short) 0);
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet3 = board2.getEmptyPositions();
        int int4 = board2.getSize();
        boolean boolean5 = board2.isFull();
        java.util.Set<ar.edu.unrc.game2048.Board.Position> positionSet6 = board2.getEmptyPositions();
        int int7 = board2.getScore();
        int int8 = board2.tileAmount();
        board2.clearBoard();
        ar.edu.unrc.game2048.Board board10 = new ar.edu.unrc.game2048.Board(board2);
        boolean boolean11 = board2.moveRight();
        org.junit.Assert.assertNotNull(positionSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(positionSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }
}

