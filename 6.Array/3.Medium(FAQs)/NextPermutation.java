public class NextPermutation {
    public static void swapNums(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            swapNums(nums, start, end);
            start++;
            end--;
        }
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverseArray(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > index; i++) {
            if (nums[i] > nums[index]) {
                swapNums(nums, index, i);
                break;
            }
        }

        reverseArray(nums, index + 1, n - 1);
    }

    public static void printArrays(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPermutation(nums);
        printArrays(nums);
    }
}
