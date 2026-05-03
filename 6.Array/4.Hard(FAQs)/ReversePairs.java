public class ReversePairs {
    private static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low, right = mid + 1, index = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = nums[left++];
        }
        while (right <= high) {
            temp[index++] = nums[right++];
        }

        System.arraycopy(temp, 0, nums, low, high - low + 1);
    }

    private static int countReversePairs(int[] nums, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && nums[i] > 2L * nums[right])
                right++;
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private static int mergeSort(int[] nums, int low, int high) {
        int cnt = 0;
        if (low < high) {

            int mid = low + (high - low) / 2;

            cnt += mergeSort(nums, low, mid);
            cnt += mergeSort(nums, mid + 1, high);
            cnt += countReversePairs(nums, low, mid, high);
            merge(nums, low, mid, high);
        }

        return cnt;
    }

    public static int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 6, 4, 1, 2, 7 };

        System.out.println(reversePairs(nums));
    }
}
