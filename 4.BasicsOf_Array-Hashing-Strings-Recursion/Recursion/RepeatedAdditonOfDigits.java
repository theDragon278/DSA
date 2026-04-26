import java.util.Scanner;

public class RepeatedAdditonOfDigits {
    public static int sumOfDigits(int num, int sum) {
        if (num <= 0)
            return sum;

        return sumOfDigits(num / 10, sum + (num % 10));
    }

    public static int repeatedSum(int num) {
        if (num < 10)
            return num;

        int secondNum = sumOfDigits(num, 0);
        return repeatedSum(secondNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Repeated sum of digits of " + num + " is " + repeatedSum(num));
        sc.close();
    }
}
