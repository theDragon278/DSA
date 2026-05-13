import java.util.*;

public class AggressiveCows_BinarySearch {
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
        int low = 1, high = nums[n - 1] - nums[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canCowsBePlaced(nums, n, mid, k)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 3, 4, 7, 10, 9 };
        int k = 4;

        System.out.println(aggressiveCows(nums, k));
    }
}
