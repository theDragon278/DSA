import java.util.*;

public class SumOfNum {
    public static int sumOfnum(int n) {
        if (n == 1)
            return 1;

        return n + sumOfnum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.println("Sum of " + num + " numbers is " + sumOfnum(num));

        sc.close();
    }
}
