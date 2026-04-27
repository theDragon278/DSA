public class LeftRotateArrayByOne {
    public static void rotateArrayByOne(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int first = nums[0];
        int n = nums.length;
        int i = 0;
        while (i < n - 1) {
            nums[i] = nums[i + 1];
            i++;
        }
        nums[n - 1] = first;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        printArray(nums);
        System.out.println();
        rotateArrayByOne(nums);
        printArray(nums);
    }
}
