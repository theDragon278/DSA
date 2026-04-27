public class LargestElement {
    public static void largestElement(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is null or empty");

        int largest = nums[0];
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
                index = i;
            }
        }

        System.out.println("Largest number: " + largest + ", Index: " + index);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 0, 99, -40 };
        largestElement(nums);
    }
}
