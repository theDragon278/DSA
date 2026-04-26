import java.util.Scanner;

public class Fibonacci {
    public static int finalFibNum(int num, int f0, int f1) {
        if (num == 0)
            return f0;

        return finalFibNum(num - 1, f1, f0 + f1);
    }

    public static int fib(int num) {
        return finalFibNum(num, 0, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        System.out.println(fib(num));
        sc.close();
    }
}