import java.util.*;

public class FindDistinctExpressions {
    public static int[] distinctExpressions(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int sum = nums[0];

        calculateExpression(nums, 1, sum, set);

        int[] ans = new int[set.size()];

        int i = 0;
        for (int num : set) {
            ans[i++] = num;
        }

        return ans;
    }

    public static void calculateExpression(int[] nums, int indx, int sum, Set<Integer> set) {
        if (indx == nums.length) {
            set.add(sum);
            return;
        }

        calculateExpression(nums, indx + 1, sum + nums[indx], set);
        calculateExpression(nums, indx + 1, sum - nums[indx], set);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };

        int[] ans = distinctExpressions(nums);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
