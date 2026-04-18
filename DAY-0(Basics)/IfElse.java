import java.util.*;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 70 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks >= 50 && marks < 70) {
            System.out.println("Grade: C");
        } else if (marks >= 35 && marks < 50) {
            System.out.println("Grade: D");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid marks entered.");
        }

        sc.close();
    }
}