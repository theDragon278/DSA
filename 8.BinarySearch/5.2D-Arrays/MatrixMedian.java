public class MatrixMedian {
    public static int findMin(int[][] matrix) {
        int m = matrix.length;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            min = Math.min(min, matrix[i][0]);
        }

        return min;
    }

    public static int findMax(int[][] matrix) {
        int m = matrix.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            max = Math.max(max, matrix[i][matrix[0].length - 1]);
        }

        return max;
    }

    public static int calNumFrequency(int[] nums, int val) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > val) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int calculateSmallerOrEquals(int[][] matrix, int val) {
        int n = matrix.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += calNumFrequency(matrix[i], val);
        }

        return count;
    }

    public static int findMedian(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int req = (n * m) / 2;
        int low = findMin(matrix), high = findMax(matrix);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int smallerOrEquals = calculateSmallerOrEquals(matrix, mid);

            if (smallerOrEquals <= req) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 9 }, { 2, 5, 6 }, { 3, 7, 8 } };
        System.out.println(findMedian(matrix));
    }
}
