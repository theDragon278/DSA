import java.util.*;

public class MinimumInRotatedSortedArray {
    public static int findMin(ArrayList<Integer> arr) {
        int low = 0, high = arr.size() - 1;
        int currentMin = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr.get(low) <= arr.get(high)) {
                currentMin = Math.min(currentMin, arr.get(low));
                break;
            }

            if (arr.get(low) <= arr.get(mid)) {
                currentMin = Math.min(currentMin, arr.get(low));
                low = mid + 1;
            } else {
                currentMin = Math.min(currentMin, arr.get(mid));
                high = mid - 1;
            }
        }

        return currentMin;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 4, 5, 1, 2));
        System.out.println(findMin(arr));
    }
}
