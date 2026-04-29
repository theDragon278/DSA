import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix_I {
    public static List<Integer> spiralOrder(int[][] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        int n = nums.length;
        int m = nums[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        List<Integer> ans = new ArrayList<Integer>();

        while (top <= bottom && left <= right) {
            // left->right
            for (int i = left; i <= right; i++) {
                ans.add(nums[top][i]);
            }
            top++;

            // top->bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(nums[i][right]);
            }
            right--;

            if (top <= bottom) {
                // right->left
                for (int i = right; i >= left; i--) {
                    ans.add(nums[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // bottom->top
                for (int i = bottom; i >= top; i--) {
                    ans.add(nums[i][left]);
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(spiralOrder(nums));
    }
}
