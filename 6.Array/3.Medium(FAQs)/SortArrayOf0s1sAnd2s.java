public class SortArrayOf0s1sAnd2s {
    public static void swapNums(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortZeroOneTwo(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException();

        int n = nums.length;

        int low = 0, mid = 0, high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                if (low != mid) {
                    swapNums(nums, low, mid);
                }
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swapNums(nums, mid, high);
                high--;
            }
        }
    }

    public static void printArrays(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 };

        System.out.println("Sorted array: ");
        sortZeroOneTwo(nums);
        printArrays(nums);
    }
}
