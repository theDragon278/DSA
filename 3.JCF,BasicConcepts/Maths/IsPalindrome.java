import java.util.*;

public class IsPalindrome {
    public static boolean isPalindrome(int n) {
        int originalNum = n;
        int reversedNum = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
        sc.close();
    }
}
