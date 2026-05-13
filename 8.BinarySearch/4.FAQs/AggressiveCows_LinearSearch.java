import java.util.*;

public class AggressiveCows_LinearSearch {
    public static boolean canCowsBePlaced(int[] nums, int n, int dist, int cows) {
        int cowCount = 1;
        int currStall = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] - nums[currStall] >= dist) {
                cowCount++;
                currStall = i;
            }
            if (cowCount >= cows)
                return true;
        }

        return false;
    }

    public static int aggressiveCows(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = nums[n - 1];
        int min = nums[0];

        for (int i = 1; i <= max - min; i++) {
            if (canCowsBePlaced(nums, n, i, k)) {
                continue;
            } else {
                return (i - 1);
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 4, 7, 10, 9 };
        int k = 4;

        System.out.println(aggressiveCows(nums, k));
    }
}
