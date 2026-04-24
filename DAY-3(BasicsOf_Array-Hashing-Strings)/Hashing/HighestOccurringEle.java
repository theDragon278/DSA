import java.util.*;

public class HighestOccurringEle {
    public static int largestNum(int[] arr, int n) {
        int largest = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        return largest;
    }

    public static int[] arrayHashing(int[] arr, int n) {
        int largestNum = largestNum(arr, n);
        int[] hashedArr = new int[largestNum + 1];

        for (int i = 0; i < n; i++) {
            hashedArr[arr[i]]++;
        }

        return hashedArr;
    }

    public static void highestOccurranceElement(int[] arr, int n) {
        int[] hashedArr = arrayHashing(arr, n);
        int largestFreq = 0;
        int ele = -1;

        for (int i = 0; i < hashedArr.length; i++) {
            if (hashedArr[i] > largestFreq ||
                    (hashedArr[i] == largestFreq && i < ele)) {
                largestFreq = hashedArr[i];
                ele = i;
            }
        }

        System.out.println("The element " + ele + " has the highest frequency of " + largestFreq);

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

        highestOccurranceElement(arr, n);

        sc.close();
    }
}