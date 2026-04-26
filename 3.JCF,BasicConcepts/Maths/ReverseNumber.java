public class ReverseNumber {
    public static int reverseNumber(int n) {
        int reversedNum = 0;
        while (n > 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }

        return reversedNum;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Reversed number: " + reverseNumber(n));
    }
}
