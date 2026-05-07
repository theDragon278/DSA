import java.util.*;

public class SubarraysSumDivisibleByK {
    public static int subarraySumDivisbleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = sum % k;
            rem = (rem + k) % k;

            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 1 };
        int k = 3;

        System.out.println(subarraySumDivisbleByK(nums, k));
    }
}
