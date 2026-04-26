import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        int fact = 1;
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            int result = factorial(n);
            System.out.println("The factorial of " + n + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
