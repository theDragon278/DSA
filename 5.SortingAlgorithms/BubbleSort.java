package SortingAlgorithms;

public class BubbleSort {
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void bubbleSort(int[] nums) {
        if (nums == null || nums.length <= 1)
            return;

        for (int i = nums.length - 1; i > 0; i--) {
            boolean swapped = false;

            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        printArray(nums);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        bubbleSort(arr);
    }
}
