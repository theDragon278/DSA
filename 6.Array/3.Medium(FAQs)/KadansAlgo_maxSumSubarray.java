public class KadansAlgo_maxSumSubarray {
    public static int maxSumSubarray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 5, -2, 7, -4 };
        System.out.println("Max Sum: " + maxSumSubarray(nums));
    }
}
