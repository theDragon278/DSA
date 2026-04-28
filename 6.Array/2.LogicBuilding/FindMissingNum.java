public class FindMissingNum {
    public static int missingNum(int[] nums) {
        if (nums.length == 0)
            return -1;

        int n = nums.length;
        int[] hashArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hashArray[nums[i]] = 1;
        }

        for (int i = 0; i < hashArray.length; i++) {
            if (hashArray[i] == 0)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 3, 1, 4 };
        System.out.println(missingNum(nums));
    }
}
