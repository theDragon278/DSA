package SortingAlgorithms;

public class QuickSort {
    private static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static int partition(int[] nums, int low, int high) {
        int pivot = low;
        int i = low;
        int j = high;

        while (i < j) {
            while (i <= high - 1 && nums[i] <= nums[pivot]) {
                i++;
            }
            while (j >= low + 1 && nums[j] > nums[pivot]) {
                j--;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        swap(nums, pivot, j);
        return j;
    }

    public static void quickSortHelper(int nums[], int low, int high) {
        if (low < high) {
            int pIndex = partition(nums, low, high);
            quickSortHelper(nums, low, pIndex - 1);
            quickSortHelper(nums, pIndex + 1, high);
        }
    }

    public static int[] quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
        return nums;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 13, 46, 24, 52, 20, 9 };
        printArray(quickSort(nums));
    }
}
