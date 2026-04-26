import java.util.*;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number(1-10): ");
            int num = sc.nextInt();
            if (num == 10) {
                System.out.println("You entered 10. Exiting the loop.");
                break;
            }
        } while (true);
        sc.close();
    }
}
