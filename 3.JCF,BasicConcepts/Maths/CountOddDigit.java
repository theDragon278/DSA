public class CountOddDigit {
    public static int countOddDigits(int n) {
        int count = 0;
        if (n == 0) {
            return 0;
        }

        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 1234567890;
        System.out.println("Number of odd digits in " + n + " is: " + countOddDigits(n));
    }
}
