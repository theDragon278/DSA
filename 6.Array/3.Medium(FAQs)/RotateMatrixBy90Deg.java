public class RotateMatrixBy90Deg {

    // Brute Force Method T=O(N^2) S=O(N^2)
    // public static void rotateMatrix(int[][] matrix) {
    // int n = matrix.length;
    // int[][] newMatrix = new int[n][n];

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // newMatrix[j][n - i - 1] = matrix[i][j];
    // }
    // }

    // for (int i = 0; i < n; i++) {
    // System.arraycopy(newMatrix[i], 0, matrix[i], 0, n);
    // }
    // }

    public static void swapElements(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void reverseRow(int[] row) {
        int left = 0, right = row.length - 1;

        while (left < right) {
            int temp = row[left];
            row[left] = row[right];
            row[right] = temp;

            left++;
            right--;
        }
    }

    // Optimal Approach T=S(N^2) S=O(1)
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                swapElements(matrix, i, j);
            }
        }

        for (int i = 0; i < n; i++) {
            reverseRow(matrix[i]);
        }
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrix(matrix);

        printMatrix(matrix);
    }
}
