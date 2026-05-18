public class FindPeakElementII {
    public static int[] calculateMaxInCol(int[][] mat, int col) {
        int m = mat.length;
        int max = Integer.MIN_VALUE;
        int maxIndxRow = -1;

        for (int i = 0; i < m; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                maxIndxRow = i;
            }
        }

        return new int[] { maxIndxRow, col };
    }

    public static int[] findPeak(int[][] mat) {
        int n = mat[0].length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int prevElement = -1;
            int nextElement = -1;

            int[] maxElementIndx = calculateMaxInCol(mat, mid);
            int maxElement = mat[maxElementIndx[0]][mid];

            if (mid - 1 >= 0) {
                prevElement = mat[maxElementIndx[0]][mid - 1];
            }
            if (mid + 1 < n) {
                nextElement = mat[maxElementIndx[0]][mid + 1];
            }

            if (prevElement < maxElement && maxElement > nextElement) {
                return maxElementIndx;
            } else if (prevElement > maxElement) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[][] mat = { { 10, 20, 15 }, { 21, 30, 14 }, { 7, 16, 32 } };
        int[] peakElement = findPeak(mat);

        for (int num : peakElement) {
            System.out.print(num + " ");
        }
    }
}
