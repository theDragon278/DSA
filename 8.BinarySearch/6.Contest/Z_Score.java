import java.util.*;

public class Z_Score {
    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canAchieve(int[] marks, int num, int k) {
        int target = num * k;
        int indx = lowerBound(marks, target);

        int count = marks.length - indx;

        return count >= num;
    }

    public static int zScore(int[] marks, int k) {
        Arrays.sort(marks);
        int n = marks.length;
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            int subjects = n - i;

            if (marks[i] >= subjects * k) {
                ans = subjects;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] marks = { 62, 69, 79, 85, 45 };
        int k = 20;

        System.out.println(zScore(marks, k));
    }
}
