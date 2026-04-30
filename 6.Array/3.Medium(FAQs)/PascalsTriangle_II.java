
public class PascalsTriangle_II {
    public static int[] pascalsTriangleII(int r) {
        int[] ans = new int[r + 1];

        int value = 1;
        ans[0] = 1;
        for (int i = 1; i <= r; i++) {
            value = value * (r - i + 1);
            value = value / i;
            ans[i] = value;
        }

        return ans;
    }

    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int rowIndex = 5;
        int[] ans = pascalsTriangleII(rowIndex);
        printArray(ans);
    }
}
