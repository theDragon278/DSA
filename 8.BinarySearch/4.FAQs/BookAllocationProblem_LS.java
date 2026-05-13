public class BookAllocationProblem_LS {
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static int findSum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }

    public static int countStudent(int[] nums, int maxPages) {
        int student = 1, pagesCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (pagesCount + nums[i] <= maxPages) {
                pagesCount += nums[i];
            } else {
                student++;
                pagesCount = nums[i];
            }
        }

        return student;
    }

    public static int findPages(int[] nums, int m) {
        int low = findMax(nums);
        int high = findSum(nums);

        for (int i = low; i <= high; i++) {
            int stuCount = countStudent(nums, i);
            if (stuCount <= m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 25, 46, 28, 49, 24 };
        int m = 4;

        System.out.println(findPages(nums, m));
    }
}
