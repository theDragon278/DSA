public class FloorAndCeilSortedArray {

    // Greatest element <= target
    public static int getFloorValue(int[] nums, int low, int high, int target) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target >= nums[mid]) {
                ans = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Smallest element >= target
    public static int getCeilingValue(int[] nums, int low, int high, int target) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target <= nums[mid]) {
                ans = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int[] getFloorAndCeil(int[] nums, int x) {

        int floor = getFloorValue(nums, 0, nums.length - 1, x);

        int ceiling = getCeilingValue(nums, 0, nums.length - 1, x);

        return new int[] { floor, ceiling };
    }

    public static void main(String[] args) {

        int[] nums = { 3, 4, 4, 7, 8, 10 };

        int x = 5;

        int[] ans = getFloorAndCeil(nums, x);

        System.out.println("Floor = " + ans[0]);
        System.out.println("Ceil = " + ans[1]);
    }
}