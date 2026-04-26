import java.util.*;

public class PrintNum {
    public static void printNum(int n) {
        if (n == 0)
            return;

        printNum(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = sc.nextInt();

        printNum(num);

        sc.close();
    }
}
