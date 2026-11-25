public class Subject {

    /**
     * Returns the number of empty cells (value 0) of a 2048 board
     * given as a flat array.
     */
    public static int countEmpty(int[] board) {
        int count = 0;
        for (int v : board) {
            if (v == 0) {
                count++;
            }
        }
        return count;
    }
}
