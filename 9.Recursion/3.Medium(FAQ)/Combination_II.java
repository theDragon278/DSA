import java.util.*;

public class Combination_II {
    private static void combinationSumHelper(
            int[] candidates,
            int indx,
            List<List<Integer>> ans,
            List<Integer> current,
            int target) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (indx == candidates.length || target < 0) {
            return;
        }

        current.add(candidates[indx]);

        combinationSumHelper(
                candidates,
                indx + 1,
                ans,
                current,
                target - candidates[indx]);

        current.remove(current.size() - 1);

        int next = indx + 1;

        while (next < candidates.length &&
                candidates[next] == candidates[indx]) {
            next++;
        }

        combinationSumHelper(
                candidates,
                next,
                ans,
                current,
                target);
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combinationSumHelper(candidates, 0, ans, current, target);

        return ans;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 1, 2, 7, 6, 1, 5 };
        int target = 8;

        System.out.println(combinationSum(candidates, target));
    }
}
