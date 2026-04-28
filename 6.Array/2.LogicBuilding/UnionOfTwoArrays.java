import java.util.ArrayList;
// import java.util.TreeSet;

public class UnionOfTwoArrays {
    // T(NlogN) S(N) where N = m+n
    // public static int[] unionArray(int[] nums1, int[] nums2) {
    // TreeSet<Integer> set = new TreeSet<>();

    // for (int num : nums1) {
    // set.add(num);
    // }
    // for (int num : nums2) {
    // set.add(num);
    // }

    // int[] arrayUnion = new int[set.size()];

    // int i = 0;
    // for (int num : set) {
    // arrayUnion[i++] = num;
    // }

    // return arrayUnion;
    // }

    // T(m+n) S(m+n)
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            int val;

            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                val = nums2[j++];
            } else {
                val = nums1[i];
                i++;
                j++;
            }

            if (result.size() == 0 || result.get(result.size() - 1) != val) {
                result.add(val);
            }
        }

        while (i < nums1.length) {
            int val = nums1[i++];
            if (result.size() == 0 || result.get(result.size() - 1) != val) {
                result.add(val);
            }
        }

        while (j < nums2.length) {
            int val = nums2[j++];
            if (result.size() == 0 || result.get(result.size() - 1) != val) {
                result.add(val);
            }
        }

        int[] union = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            union[k] = result.get(k);
        }

        return union;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 1, 2 };
        int[] nums2 = { 1, 2, 2 };

        System.out.println("Array 1: ");
        printArray(nums1);
        System.out.println();
        System.out.println("Array 2: ");
        printArray(nums2);
        System.out.println();
        System.out.println("Union Array: ");
        printArray(unionArray(nums1, nums2));
    }
}
