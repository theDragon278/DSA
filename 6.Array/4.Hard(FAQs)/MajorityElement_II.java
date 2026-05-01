import java.util.*;

public class MajorityElement_II {
    // public static List<Integer> majorityElementII(int[] nums) {
    // List<Integer> ans = new ArrayList<>();
    // HashMap<Integer, Integer> map = new HashMap<>();
    // int n = nums.length;
    // int min = (int) (n / 3) + 1;

    // for (int i = 0; i < n; i++) {
    // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

    // if (map.get(nums[i]) == min) {
    // ans.add(nums[i]);
    // }

    // if (ans.size() == 2) {
    // break;
    // }
    // }

    // return ans;
    // }

    public static List<Integer> majorityElementII(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();

        int n = nums.length;
        int count1 = 0, count2 = 0;
        int ele1 = 0, ele2 = 0;
        int min = (int) (nums.length / 3) + 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] == ele1) {
                count1++;
            } else if (nums[i] == ele2) {
                count2++;
            } else if (count1 == 0) {
                ele1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                ele2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        int actualCount1 = 0, actualCount2 = 0;
        for (int num : nums) {
            if (num == ele1)
                actualCount1 += 1;
            else if (num == ele2)
                actualCount2 += 1;
        }

        if (actualCount1 >= min)
            ans.add(ele1);
        if (ele2 != ele1 && actualCount2 >= min)
            ans.add(ele2);

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 1, 1, 3, 2 };
        System.out.println(majorityElementII(nums));
    }
}
