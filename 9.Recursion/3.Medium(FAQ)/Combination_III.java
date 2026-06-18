import java.util.*;

public class Combination_III {
    private static void combinationSumHelper(int k, int count, int num, int n, List<Integer> current,
            List<List<Integer>> ans) {
        if (count == k) {
            if (n == 0) {
                ans.add(new ArrayList<>(current));
            }
            return;
        }

        if (num > 9 || n < 0) {
            return;
        }

        current.add(num);
        combinationSumHelper(k, count + 1, num + 1, n - num, current, ans);
        current.remove(current.size() - 1);

        combinationSumHelper(k, count, num + 1, n, current, ans);
    }

    private static List<List<Integer>> combinationSum(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        combinationSumHelper(k, 0, 1, n, current, ans);

        return ans;
    }

    public static void main(String[] args) {
        int k = 3;
        int n = 9;

        System.out.println(combinationSum(k, n));
    }
}
