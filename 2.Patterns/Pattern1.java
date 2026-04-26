import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= rows - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
