import java.util.*;

public class FindNumOfRotation {
    public static int findKRotation(ArrayList<Integer> arr) {
        int low = 0, high = arr.size() - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr.get(mid) > arr.get(high)) {
                low = mid + 1;
            }

            else {
                high = mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 0, 1, 2, 3));
        System.out.println(findKRotation(arr));
    }
}
