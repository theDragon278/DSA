public class RowWithMax1s {
    public static int calculateOnes(int[] nums) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return n - ans;
    }

    public static int rowWithMax1s(int[][] mat) {
        int rowIndx = -1, max1s = 0;

        for (int i = 0; i < mat.length; i++) {
            int numOf1s = calculateOnes(mat[i]);

            if (numOf1s > max1s) {
                max1s = numOf1s;
                rowIndx = i;
            }
        }

        return rowIndx;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 1, 1 }, { 0, 0, 1 }, { 1, 1, 1 } };
        System.out.println(rowWithMax1s(nums));
    }
}
