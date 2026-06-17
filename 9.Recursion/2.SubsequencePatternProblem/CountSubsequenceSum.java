public class CountSubsequenceSum {
    public static int countSubsequenceSumHelper(int[] nums, int indx, int k) {
        if (indx == nums.length) {
            return (k == 0) ? 1 : 0;
        }

        int include = countSubsequenceSumHelper(nums, indx + 1, k - nums[indx]);
        int exclude = countSubsequenceSumHelper(nums, indx + 1, k);

        return include + exclude;
    }

    public static int countSubsequenceSum(int[] nums, int k) {
        return countSubsequenceSumHelper(nums, 0, k);
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 10, 5, 1, 3 };
        int k = 5;

        System.out.println(countSubsequenceSum(nums, k));
    }
}
