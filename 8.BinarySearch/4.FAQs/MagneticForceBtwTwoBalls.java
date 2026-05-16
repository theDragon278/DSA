import java.util.*;

public class MagneticForceBtwTwoBalls {
    public static boolean isPositionPossible(int[] position, int n, int minForce, int m) {
        int ballCount = 1;
        int lastPosition = 0;

        for (int i = 1; i < n; i++) {
            if (position[i] - position[lastPosition] >= minForce) {
                ballCount++;
                lastPosition = i;
            }

            if (ballCount >= m) {
                return true;
            }
        }

        return false;
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 1, high = position[n - 1] - position[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPositionPossible(position, n, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] position = { 5, 4, 3, 2, 1, 1000000000 };
        int balls = 2;

        System.out.println(maxDistance(position, balls));
    }
}
