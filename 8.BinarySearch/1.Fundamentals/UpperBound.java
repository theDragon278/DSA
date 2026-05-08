public class UpperBound {
    public static int binarySearch(int[] nums, int low, int high, int target) {
        int ans = nums.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target >= nums[mid]) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int upperBound(int[] nums, int x) {
        return binarySearch(nums, 0, nums.length - 1, x);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 8, 15, 19 };
        int x = 9;
        System.out.println(upperBound(nums, x));
    }
}
