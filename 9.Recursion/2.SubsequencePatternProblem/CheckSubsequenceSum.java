public class CheckSubsequenceSum {
    public static boolean checkSubsequenceSumHelper(int[] nums, int indx, int k) {
        if (k == 0)
            return true;

        if (k < 0 || indx == nums.length)
            return false;

        boolean path1 = checkSubsequenceSumHelper(nums, indx + 1, k - nums[indx]);
        boolean path2 = checkSubsequenceSumHelper(nums, indx + 1, k);

        return path1 || path2;
    }

    public static boolean checkSubsequenceSum(int[] nums, int k) {
        return checkSubsequenceSumHelper(nums, 0, k);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 16;

        System.out.println(checkSubsequenceSum(nums, k));
    }
}
