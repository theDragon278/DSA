public class SqaureRootOfNumber {
    public static int floorSqrt(int n) {
        int low = 0, high = n;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid * mid > n) {
                high = mid - 1;
            } else {
                ans = mid;
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int num = 28;
        System.out.println(floorSqrt(num));
    }
}
