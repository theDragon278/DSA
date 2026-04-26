import java.util.*;

public class SecondHighestOccurringEle {
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

    public static void secondHighestOccurranceElement(int[] arr, int n) {
        int[] hashedArr = arrayHashing(arr, n);
        int largestFreq = 0;
        int secondLargestFreq = 0;
        int ele = -1;
        int secondEle = -1;

        for (int i = 0; i < hashedArr.length; i++) {
            int freq = hashedArr[i];

            // Case 1: new max
            if (freq > largestFreq) {
                secondLargestFreq = largestFreq;
                secondEle = ele;

                largestFreq = freq;
                ele = i;
            }

            // Case 2: second max candidate
            else if (freq > secondLargestFreq && freq < largestFreq) {
                secondLargestFreq = freq;
                secondEle = i;
            }
        }

        System.out.println("The element " + secondEle + " has the second highest frequency of " + secondLargestFreq);
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

        secondHighestOccurranceElement(arr, n);

        sc.close();
    }
}