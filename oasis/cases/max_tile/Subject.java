public class Subject {

    /**
     * Returns the highest tile of a 2048 board given as a flat array.
     * Empty cells are 0, so an empty board returns 0.
     */
    public static int maxTile(int[] board) {
        int max = 0;
        for (int v : board) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}
