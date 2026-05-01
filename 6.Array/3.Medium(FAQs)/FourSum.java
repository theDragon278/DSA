import java.util.*;

public class FourSum {
    // public static List<List<Integer>> fourSum(int[] nums, int target) {
    // HashSet<List<Integer>> set = new HashSet<>();
    // int n = nums.length;

    // for (int i = 0; i < n - 3; i++) {
    // for (int j = i + 1; j < n - 2; j++) {
    // HashMap<Integer, Integer> map = new HashMap<>();
    // for (int k = j + 1; k < n; k++) {
    // int fourthVal = target - (nums[i] + nums[j] + nums[k]);
    // if (map.containsKey(fourthVal)) {
    // List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], fourthVal);
    // Collections.sort(temp);
    // set.add(temp);
    // }

    // map.put(nums[k], k);
    // }
    // }
    // }

    // return new ArrayList<>(set);
    // }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;

                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 3, 5, 7, 9 };
        int target = 7;
        System.out.println(fourSum(nums, target));
    }
}
