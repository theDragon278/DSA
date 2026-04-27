public class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Array is null or empty");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element exists");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3, 0, 99, -40, 54 };
        System.out.println("Second Largest: " + secondLargestElement(nums));
    }
}