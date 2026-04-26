public class SumOfEleInArray {
    public static int helper(int[] arr, int n) {
        if (n == arr.length)
            return 0;

        return arr[n] + helper(arr, n + 1);
    }

    public static int sumOfElements(int arr[]) {
        return helper(arr, 0);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Sum of elements: " + sumOfElements(arr));
    }
}
