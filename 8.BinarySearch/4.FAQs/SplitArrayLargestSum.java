public class SplitArrayLargestSum {
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
        }

        return max;
    }

    public static int findSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static int countSubarrays(int[] nums, int maxSum) {
        int subarrayCount = 1, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum + nums[i] <= maxSum) {
                sum += nums[i];
            } else {
                subarrayCount++;
                sum = nums[i];
            }
        }

        return subarrayCount;
    }

    public static int largestSubarraySumMinimized(int[] nums, int m) {
        if (m > nums.length)
            return -1;

        int low = findMax(nums);
        int high = findSum(nums);
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (countSubarrays(nums, mid) <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;

        System.out.println(largestSubarraySumMinimized(nums, k));
    }
}
