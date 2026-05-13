public class BookAllocationProblem_BS {
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
        if (m > nums.length)
            return -1;

        int low = findMax(nums);
        int high = findSum(nums);
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (countStudent(nums, mid) <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 25, 46, 28, 49, 24 };
        int m = 4;

        System.out.println(findPages(nums, m));
    }
}
