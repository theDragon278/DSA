public class SearchIn2DMatrix_II {
    public static boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;

        int row = 0, col = n - 1;

        while (row < m && col >= 0) {
            if (mat[row][col] == target) {
                return true;
            }
            if (mat[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int target = 5;

        System.out.println(searchMatrix(mat, target));
    }
}
