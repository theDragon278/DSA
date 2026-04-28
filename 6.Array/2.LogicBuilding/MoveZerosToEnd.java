public class MoveZerosToEnd {
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void moveZeros(int[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    swap(nums, i, j);
                }
                j++;
            }
        }
        printArray(nums);
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 4, 0, 5, 2 };
        moveZeros(nums);
    }
}
