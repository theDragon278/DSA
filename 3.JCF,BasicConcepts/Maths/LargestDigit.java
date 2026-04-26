import java.util.*;

public class LargestDigit {
    public static int largestDigit(int n) {
        int largest = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n /= 10;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = largestDigit(n);
        System.out.println("The largest digit in " + n + " is: " + result);
        sc.close();
    }
}
