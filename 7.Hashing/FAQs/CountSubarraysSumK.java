import java.util.*;

public class CountSubarraysSumK {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int cnt = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int diff = sum - k;

            if (map.containsKey(diff)) {
                cnt += map.get(diff);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        int k = 6;

        System.out.println(subarraySum(nums, k));
    }
}
