import java.util.*;

public class LongestSubarraySumK {
    // Optimal sol if array has both positive and negative value
    public static int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            int diff = sum - k;

            if (map.containsKey(diff)) {
                int length = i - map.get(diff);
                maxLength = Math.max(maxLength, length);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    // // optimal only for positive values
    // public static int longestSubarray(int[] nums, int k) {
    // int left = 0, right = 0, maxLength = 0;
    // int sum = nums[0];
    // int n = nums.length;

    // while (left <= right && right < n) {
    // if (sum > k) {
    // sum -= nums[left];
    // left++;
    // }

    // if (sum == k) {
    // maxLength = Math.max(maxLength, (right - left + 1));
    // }

    // right++;
    // if (right < n)
    // sum += nums[right];
    // }

    // return maxLength;
    // }

    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println(longestSubarray(nums, k));
    }
}
