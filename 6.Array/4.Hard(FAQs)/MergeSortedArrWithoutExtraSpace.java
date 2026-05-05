public class MergeSortedArrWithoutExtraSpace {
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    // // Pointer for nums1 (end of valid elements)
    // int left = m - 1;

    // // Pointer for nums2 (beginning of valid elements)
    // int right = 0;

    // /* Swap the elements until nums1[left]
    // is smaller than nums2[right]*/
    // while (left >= 0 && right < n) {
    // if (nums1[left] > nums2[right]) {
    // int temp = nums1[left];
    // nums1[left] = nums2[right];
    // nums2[right] = temp;
    // left--;
    // right++;
    // }
    // //break out of loop if nums1[left] > nums2[right]
    // else break;
    // }

    // // Sort nums1 from index 0 to m-1
    // Arrays.sort(nums1, 0, m);

    // // Sort nums2 from start to end
    // Arrays.sort(nums2);

    // // Put the elements of nums2 in nums1
    // for (int i = m; i < m + n; i++) {
    // nums1[i] = nums2[i - m];
    // }
    // }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int indx = m + n - 1;

        while (j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[indx] = nums1[i];
                indx--;
                i--;
            } else if (nums1[i] < nums2[j]) {
                nums1[indx] = nums2[j];
                indx--;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { -5, -2, 4, 5, 0, 0, 0 };
        int[] nums2 = { -3, 1, 8 };
        int m = 4, n = 3;

        merge(nums1, m, nums2, n);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}