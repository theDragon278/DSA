import java.util.*;

public class ThreeSum {
    // public static List<List<Integer>> threeSum(int[] nums) {
    // Set<List<Integer>> set = new HashSet<>();

    // int n = nums.length;

    // for (int i = 0; i < n - 2; i++) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int j = i + 1; j < n; j++) {
    // int thirdVal = -(nums[i] + nums[j]);
    // if (map.containsKey(thirdVal)) {
    // List<Integer> temp = Arrays.asList(nums[i], nums[j], thirdVal);
    // Collections.sort(temp);
    // set.add(temp);
    // }

    // map.put(nums[j], j);
    // }
    // }

    // return new ArrayList<>(set);
    // }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1])
                        j++;

                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return ans;
    };

    public static void main(String[] args) {
        int[] nums = { 2, -2, 0, 3, -3, 5 };
        System.out.println(threeSum(nums));
    }
}
