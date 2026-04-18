import java.util.*;

class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("All are equal");
        } else if (a == b) {
            System.out.println("a and b are equal");
            if (a > c) {
                System.out.println("a and b are greater than c");
            } else if (a < c) {
                System.out.println("c is greater than a and b");
            } else {
                System.out.println("a, b and c are equal");
            }
        } else if (b == c) {
            System.out.println("b and c are equal");
            if (b > a) {
                System.out.println("b and c are greater than a");
            } else if (b < a) {
                System.out.println("a is greater than b and c");
            } else {
                System.out.println("a, b and c are equal");
            }
        } else if (a == c) {
            System.out.println("a and c are equal");
            if (a > b) {
                System.out.println("a and c are greater than b");
            } else if (a < b) {
                System.out.println("b is greater than a and c");
            } else {
                System.out.println("a, b and c are equal");
            }
        } else {

            if (a > b) {
                if (a > c) {
                    System.out.println("a is greatest");
                } else {
                    System.out.println("c is greatest");
                }
            } else {
                if (b > c) {
                    System.out.println("b is greatest");
                } else {
                    System.out.println("c is greatest");
                }
            }
        }
        sc.close();
    }
}