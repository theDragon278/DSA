import java.util.*;

public class PerfectNumber {
    public static boolean isPerfectNumber(int n) {
        if (n <= 1) {
            return false;
        }

        int sum = 1;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPerfectNumber(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
        sc.close();
    }
}
