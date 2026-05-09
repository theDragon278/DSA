public class FirstAndLastOccurrence {
    public static int firstOccurence(int[] nums, int low, int high, int target) {
        int indx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                indx = mid;
                high = mid - 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indx;
    }

    public static int lastOccurence(int[] nums, int low, int high, int target) {
        int indx = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) {
                indx = mid;
                low = mid + 1;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indx;
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = firstOccurence(nums, 0, nums.length - 1, target);
        int last = lastOccurence(nums, 0, nums.length - 1, target);

        return new int[] { first, last };
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;

        int[] ans = searchRange(nums, target);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
