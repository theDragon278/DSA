public class PowerOfNum {
    public static double myPow(double x, int n) {
        double ans = 1;
        long pow = n;
        if (n < 0) {
            x = 1 / x;
            pow = -1 * (long) n;
        }

        while (pow > 0) {
            if (pow % 2 == 1) {
                ans = ans * x;
                pow = pow - 1;
            } else {
                x = x * x;
                pow = pow / 2;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        System.out.println(myPow(x, n));
    }
}
