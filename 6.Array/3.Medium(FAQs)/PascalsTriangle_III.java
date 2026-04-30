import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_III {
    public static List<Integer> getRow(int r) {
        List<Integer> ans = new ArrayList<>();

        long value = 1;
        ans.add(1);
        for (int i = 1; i <= r; i++) {
            value = value * (r - i + 1);
            value = value / i;
            ans.add((int) value);
        }

        return ans;
    }

    public static List<List<Integer>> pascalsTriangleIII(int r) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < r; i++) {
            List<Integer> temp = getRow(i);
            ans.add(temp);
        }

        return ans;
    }

    public static void main(String[] args) {
        int rowNum = 6;
        System.out.println(pascalsTriangleIII(rowNum));
    }
}
