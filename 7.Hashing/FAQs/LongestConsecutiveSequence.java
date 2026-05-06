import java.util.*;

public class LongestConsecutiveSequence {
    // public static int longestConsecutive(int[] nums) {
    // Arrays.sort(nums);
    // int cnt = 0, lastSmallest = Integer.MIN_VALUE, longest = 1;

    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] - 1 == lastSmallest) {
    // cnt++;
    // lastSmallest = nums[i];
    // } else if (nums[i] != lastSmallest) {
    // cnt = 1;
    // lastSmallest = nums[i];
    // }
    // longest = Math.max(longest, cnt);
    // }

    // return longest;
    // }
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int longest = 1;

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int cnt = 1;
                int x = num;
                while (set.contains(x + 1)) {
                    x += 1;
                    cnt += 1;
                }

                longest = Math.max(longest, cnt);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestConsecutive(nums));
    }
}
