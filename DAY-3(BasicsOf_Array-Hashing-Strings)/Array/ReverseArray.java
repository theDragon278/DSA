import java.util.*;

public class ReverseArray {
    public static int[] reverseArray(int[] arr, int n) {
        int start = 0;
        int last = n - 1;

        while (start < last) {
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] reversedArr = reverseArray(arr, n);
        System.out.println("The reversed array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArr[i] + " ");
        }

        sc.close();
    }
}
