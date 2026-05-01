public class RepeatingAndMissingNum {
    public static int[] findMissingRepeatingNum(int[] nums) {
        long n = nums.length;
        long nNumSum = (n * (n + 1)) / 2;
        long nNumSquareSum = (n * (n + 1) * (2 * n + 1)) / 6;
        long arrNumSum = 0;
        long arrNumSquareSum = 0;

        for (int i = 0; i < n; i++) {
            arrNumSum += nums[i];
            arrNumSquareSum += ((long) nums[i] * (long) nums[i]);
        }

        long eq1 = arrNumSum - nNumSum; // x-y
        long eq2 = arrNumSquareSum - nNumSquareSum; // (x+y)(x-y)
        eq2 = eq2 / eq1; // x+y

        long repeating = (eq1 + eq2) / 2; // (x+y)+(x-y)/2 => x
        long missing = eq2 - repeating;

        return new int[] { (int) repeating, (int) missing };

    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 5, 4, 1, 1 };
        int[] val = findMissingRepeatingNum(nums);
        printArray(val);
    }
}
