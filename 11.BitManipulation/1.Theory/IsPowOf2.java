import java.util.Scanner;

public class IsPowOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        if ((num & num - 1) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
