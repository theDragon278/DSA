public class IsPrime {
    public static boolean helper(int n, int check) {
        if (check * check > n)
            return true;

        if (n % check == 0)
            return false;

        return helper(n, check + 1);
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        return helper(n, 2);
    }

    public static void main(String[] args) {
        int num = 15;
        System.out.println(isPrime(num));
    }
}
