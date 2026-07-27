import java.util.*;

public class CombinationXOR {
    public static List<List<Integer>> combinationXor(int[] nums, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        dfs(nums, 0, 0, k, curr, ans);

        return ans;
    }

    public static void dfs(int[] nums, int indx, int currentXor, int k, List<Integer> curr, List<List<Integer>> ans) {
        if (indx == nums.length) {
            if (!curr.isEmpty() && currentXor == k) {
                ans.add(new ArrayList<>(curr));
            }

            return;
        }

        curr.add(nums[indx]);
        dfs(nums, indx + 1, currentXor ^ nums[indx], k, curr, ans);
        curr.remove(curr.size() - 1);

        dfs(nums, indx + 1, currentXor, k, curr, ans);
    }

    public static void main(String[] args) {
        int[] nums = { 57, 21, 8, 52, 41, 73 };
        int k = 57;

        System.out.println(combinationXor(nums, k));
    }
}
