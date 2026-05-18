public class SearchIn2DMatrix {
    public static boolean searchMatrix(int[][] mat, int target) {
        int m = mat.length, n = mat[0].length;

        int low = 0, high = (m * n - 1);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n, col = mid % n;

            if (mat[row][col] == target) {
                return true;
            } else if (target < mat[row][col]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int target = 8;

        System.out.println(searchMatrix(mat, target));
    }
}
