import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                return i;
        }
        return -1;
    }

    public static void allOccuranceOfNum(int[] nums, int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = { 2, 3, 4, 5, 3, 2, 4, 1, 5 };
        System.out.print("Enter num to find: ");
        int n = sc.nextInt();

        int index = linearSearch(nums, n);
        if (index > 0) {
            System.out.println("The first occurance of " + n + " is at index " + index);
        } else {
            System.out.println("The number doesn't exsist in the array.");
        }

        System.out.println("All occurances of " + n + ":");
        allOccuranceOfNum(nums, n);

        sc.close();
    }
}
