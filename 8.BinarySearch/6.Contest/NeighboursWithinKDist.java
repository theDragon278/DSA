import java.util.*;

public class NeighboursWithinKDist {
    public static int lowerBound(int[][] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid][0] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int upperBound(int[][] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid][0] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int[] neighboursWithKDistance(int[] nums, int k) {
        int n = nums.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int val = arr[i][0];

            int left = lowerBound(arr, val - k);
            int right = upperBound(arr, val + k);

            int count = right - left;

            ans[arr[i][1]] = count;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 7, 8, 9 };
        int k = 3;
        int[] ans = neighboursWithKDistance(nums, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
