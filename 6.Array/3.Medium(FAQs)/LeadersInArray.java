import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static List<Integer> leadersInArray(int[] nums) {
        int n = nums.length;
        List<Integer> leaders = new ArrayList<Integer>();

        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] > max) {
                max = nums[i];
                leaders.add(nums[i]);
            }
        }

        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 3, 1, 2 };
        System.out.println(leadersInArray(nums));
    }
}
