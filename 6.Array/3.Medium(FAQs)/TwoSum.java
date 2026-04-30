import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] indexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                indexes[0] = map.get(diff);
                indexes[1] = i;
                return indexes;
            } else {
                map.put(nums[i], i);
            }
        }

        return new int[] { -1, -1 };
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 6, 2, 10, 3 };
        int target = 7;
        int[] indexes = twoSum(nums, target);
        System.out.println("The indexes are: ");
        printArray(indexes);
    }
}
