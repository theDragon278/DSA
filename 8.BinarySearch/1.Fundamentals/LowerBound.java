public class LowerBound {
    // public static int binarySearch(int[] nums, int low, int high, int target, int
    // ans) {
    // if (low > high)
    // return ans;

    // int mid = low + (high - low) / 2;

    // if (target <= nums[mid]) {
    // ans = binarySearch(nums, low, mid - 1, target, mid);
    // } else {
    // ans = binarySearch(nums, mid + 1, high, target, ans);
    // }

    // return ans;
    // }

    public static int binarySearch(int[] nums, int low, int high, int target, int ans) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target <= nums[mid]) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int lowerBound(int[] nums, int x) {
        int ans = nums.length;
        return binarySearch(nums, 0, nums.length - 1, x, ans);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 8, 15, 19 };
        int x = 9;
        System.out.println(lowerBound(nums, x));
    }
}
