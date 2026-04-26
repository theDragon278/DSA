import java.util.Scanner;

public class CountDigits {
    public static int digitCount(int n) {
        int count = 0;
        if (n == 0) {
            return 1;
        }
        int num = n;

        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(digitCount(n));

        sc.close();
    }

}
