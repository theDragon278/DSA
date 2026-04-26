public class ReverseArray {
    public static int[] helper(int[] arr, int start, int last) {
        if (start >= last)
            return arr;

        int temp = arr[start];
        arr[start] = arr[last];
        arr[last] = temp;

        return helper(arr, start + 1, last - 1);
    }

    public static int[] reverseArray(int[] arr) {
        return helper(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] reversedArray = reverseArray(arr);

        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
