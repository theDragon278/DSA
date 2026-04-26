import java.util.ArrayList;

public class IsSorted {
    public static boolean helper(ArrayList<Integer> nums, int index) {
        if (index >= nums.size() - 1)
            return true;
        if (nums.get(index) > nums.get(index + 1))
            return false;

        return helper(nums, index + 1);
    }

    public static boolean isSorted(ArrayList<Integer> nums) {
        if (nums.size() <= 1)
            return true;
        return helper(nums, 0);
    }

    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);
        aList.add(6);

        System.out.println(isSorted(aList));
    }
}
