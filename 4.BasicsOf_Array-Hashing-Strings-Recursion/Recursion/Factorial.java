import java.util.*;

public class Factorial {
    public static int factorialOfnum(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * factorialOfnum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is " + factorialOfnum(num));

        sc.close();
    }
}
