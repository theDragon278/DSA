public class SearchNumInSortedArr {
    // T = O(logN) S = O(logN)
    // public static int helperSearch(int[] nums, int low, int high, int target) {
    // if (low > high)
    // return -1;

    // int mid = low + (high - low) / 2;

    // if (nums[mid] == target) {
    // return mid;
    // } else if (target < nums[mid]) {
    // return helperSearch(nums, low, mid - 1, target);
    // } else {
    // return helperSearch(nums, mid + 1, high, target);
    // }
    // }

    // T = O(logN) S = O(1)
    public static int helperSearch(int[] nums, int low, int high, int target) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {
        return helperSearch(nums, 0, nums.length - 1, target);
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(nums, target));
    }
}
