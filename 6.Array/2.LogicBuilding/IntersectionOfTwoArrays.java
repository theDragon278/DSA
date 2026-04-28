import java.util.ArrayList;

public class IntersectionOfTwoArrays {
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                result.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] intersection = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            intersection[k] = result.get(k);
        }

        return intersection;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 3, 5 };
        int[] nums2 = { 1, 2, 7 };

        System.out.println("Array 1: ");
        printArray(nums1);
        System.out.println();
        System.out.println("Array 2: ");
        printArray(nums2);
        System.out.println();
        System.out.println("Union Array: ");
        printArray(intersectionArray(nums1, nums2));
    }

}
