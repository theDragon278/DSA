public class NthRootOfNum {
    public static int calculateProduct(int mid, int N, int M) {
        long prod = 1;

        for (int i = 1; i <= N; i++) {
            prod *= mid;
            if (prod > M) {
                return -1;
            }
        }

        if (prod == M)
            return 1;

        return 0;
    }

    public static int NthRoot(int N, int M) {
        int low = 1, high = M;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long value = calculateProduct(mid, N, M);

            if (value == 1) {
                return mid;
            } else if (value == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int N = 3;
        int M = 28;

        System.out.println(NthRoot(N, M));
    }
}
