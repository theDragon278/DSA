public class CountInversions {
    public static long merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, index = 0;
        long cnt = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
                cnt += (mid - left + 1);
            }
        }

        while (left <= mid) {
            temp[index++] = nums[left++];
        }
        while (right <= high) {
            temp[index++] = nums[right++];
        }

        System.arraycopy(temp, 0, nums, low, high - low + 1);

        return cnt;
    }

    public static long mergeSort(int[] nums, int low, int high) {
        long cnt = 0;
        if (low < high) {

            int mid = low + (high - low) / 2;

            cnt += mergeSort(nums, low, mid);
            cnt += mergeSort(nums, mid + 1, high);
            cnt += merge(nums, low, mid, high);
        }

        return cnt;
    }

    public static long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 7, 1, 3, 5 };
        System.out.println("Number of inversions: " + numberOfInversions(nums));
    }
}
