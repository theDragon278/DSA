import java.util.Scanner;

public class LeftRotateArrayByKPlaces {
    public static void rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return;

        int n = nums.length;
        k %= n;

        int[] temp = new int[k];

        for (int i = 0; i < k; i++) {
            temp[i] = nums[i];
        }

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = n - k; i < n; i++) {
            nums[i] = temp[i - (n - k)];
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = { 1, 2, 3, 4, 5 };

        System.out.print("Enter number of rotation: ");
        int rotate = sc.nextInt();

        System.out.println();
        rotateArray(nums, rotate);
        printArray(nums);

        sc.close();
    }
}
