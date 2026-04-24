import java.util.*;

public class FreqOfEachNum {
    public static int largestNum(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int[] hashMap(int[] arr, int n) {
        int largestNum = largestNum(arr, n);
        int[] hashArray = new int[largestNum + 1];

        for (int i = 0; i <= n - 1; i++) {
            hashArray[arr[i]]++;
        }

        return hashArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 4, 2, 5, 2, 1, 3, 5 };
        int[] hashArray = hashMap(arr, arr.length);

        System.out.print("Enter number to find it's frequency(0-5): ");
        int num = sc.nextInt();

        System.out.println("Frequency: " + hashArray[num]);

        sc.close();
    }
}
