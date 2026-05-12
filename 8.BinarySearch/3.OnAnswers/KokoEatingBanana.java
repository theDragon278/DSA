import java.util.*;

public class KokoEatingBanana {
    public static int calculateSum(int[] nums, int rate) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + rate - 1) / rate;
        }

        return sum;
    }

    public static int minimumRateToEatBanana(int[] nums, int h) {
        int low = 1, high = Arrays.stream(nums).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = calculateSum(nums, mid);

            if (sum > h) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 15, 6, 3 };
        int h = 8;
        System.out.println(minimumRateToEatBanana(nums, h));
    }
}
