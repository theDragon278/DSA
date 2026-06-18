import java.util.*;

public class Subset_II {
    private static void subsetsWithDupHelper(int[] nums, int indx, List<Integer> current,
            List<List<Integer>> ans) {
        if (indx == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        current.add(nums[indx]);
        subsetsWithDupHelper(nums, indx + 1, current, ans);
        current.remove(current.size() - 1);

        int next = indx + 1;
        while (next < nums.length && nums[next] == nums[indx]) {
            next++;
        }
        subsetsWithDupHelper(nums, next, current, ans);

    }

    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        subsetsWithDupHelper(nums, 0, current, ans);

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        System.out.println(subsetsWithDup(nums));
    }
}
