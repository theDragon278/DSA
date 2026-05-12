import java.util.*;

public class FindSmallestDivisor {
    public static int calculateSum(int[] nums, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }

        return sum;
    }

    public static int smallestDivisor(int[] nums, int limit) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = calculateSum(nums, mid);

            if (sum > limit) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int limit = 8;

        System.out.println(smallestDivisor(nums, limit));
    }
}
