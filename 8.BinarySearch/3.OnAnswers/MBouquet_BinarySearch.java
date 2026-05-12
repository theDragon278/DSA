public class MBouquet_BinarySearch {
    public static int maxElement(int[] nums, int n) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static int minElement(int[] nums, int n) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
        }

        return min;
    }

    public static boolean calculateBouquet(int[] nums, int days, int k, int m) {
        int count = 0;
        int countBouquet = 0;

        for (int num : nums) {
            if (num <= days) {
                count++;
            } else {
                countBouquet += count / k;
                count = 0;
            }
        }

        countBouquet += count / k;

        return (countBouquet >= m) ? true : false;
    }

    public static int roseGarden(int n, int[] nums, int k, int m) {
        if (k * m > n)
            return -1;

        int low = minElement(nums, n);
        int high = maxElement(nums, n);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (calculateBouquet(nums, mid, k, m)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int n = 8, m = 2, k = 3;

        System.out.println(roseGarden(n, nums, k, m));
    }
}
