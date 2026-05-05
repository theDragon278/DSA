public class MaximumProductSubarray {
    public static int maxProduct(int[] nums) {
        int prefixProd = 1;
        int suffixProd = 1;
        int maxProd = Integer.MIN_VALUE;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (prefixProd == 0)
                prefixProd = 1;
            if (suffixProd == 0)
                suffixProd = 1;

            prefixProd = prefixProd * nums[i];
            suffixProd = suffixProd * nums[n - i - 1];
            maxProd = Math.max(maxProd, Math.max(prefixProd, suffixProd));
        }

        return maxProd;
    }

    public static void main(String[] args) {
        int[] nums = { 1, -2, 3, 4, -4, -3 };
        System.out.println("Max product: " + maxProduct(nums));
    }
}
