import java.util.*;

public class Combination_I {
    private static void combinationSumHelper(int[] candidates, int indx, List<List<Integer>> ans, List<Integer> current,
            int target) {
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (indx == candidates.length || target < 0)
            return;

        current.add(candidates[indx]);
        combinationSumHelper(candidates, indx, ans, current, target - candidates[indx]);
        current.remove(current.size() - 1);

        combinationSumHelper(candidates, indx + 1, ans, current, target);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combinationSumHelper(candidates, 0, ans, current, target);

        return ans;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 5, 4 };
        int target = 7;

        System.out.println(combinationSum(candidates, target));
    }
}
