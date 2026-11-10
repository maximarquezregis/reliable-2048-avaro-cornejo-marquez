public class Subject {

    /**
     * Slides a 2048 row to the left and merges equal adjacent tiles
     * (each tile merges at most once). Empty cells are 0.
     * Example: [2, 2, 4, 0] -> [4, 4, 0, 0]
     */
    public static int[] mergeRowLeft(int[] row) {
        int[] result = new int[row.length];
        int pos = 0;
        int last = 0;
        for (int v : row) {
            if (v == 0) continue;
            if (v == last) {
                result[pos - 1] = v * 2;
                last = 0;
            } else {
                result[pos++] = v;
                last = v;
            }
        }
        return result;
    }
}
