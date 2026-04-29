public class RearrangeArrayBySign {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int i = 0, j = 1;
        for (int num : nums) {
            if (num >= 0) {
                ans[i] = num;
                i += 2;
            } else {
                ans[j] = num;
                j += 2;
            }
        }

        return ans;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, -1, -3, -4 };
        printArray(rearrangeArray(nums));
    }
}
