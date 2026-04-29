public class MajorityElement_I {

    // Better than BruteForce T=O(N) S=O(N)
    // public static int majorityElement(int[] nums) {
    // HashMap<Integer, Integer> map = new HashMap<>();

    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    // }

    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    // if (entry.getValue() > nums.length / 2) {
    // return entry.getKey();
    // }
    // }

    // return -1;
    // }

    // Optimal Approach T=O(N) S=O(1)
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ele = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = nums[i];
            }
            if (nums[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele) {
                count1++;
            }
        }

        if (count1 > n / 2) {
            return ele;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        System.out.println(majorityElement(nums));
    }
}
