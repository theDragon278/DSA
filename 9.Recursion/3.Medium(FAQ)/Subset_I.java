import java.util.*;

public class Subset_I {
    private static void subsetSumHelper(int[] nums, int indx, int sum, List<Integer> ans) {
        if (indx == nums.length) {
            ans.add(sum);
            return;
        }

        subsetSumHelper(nums, indx + 1, sum + nums[indx], ans);
        subsetSumHelper(nums, indx + 1, sum, ans);
    }

    private static List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        subsetSumHelper(nums, 0, 0, ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3 };
        System.out.println(subsetSums(nums));
    }
}
