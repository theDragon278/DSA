import java.util.*;

public class RatInMaze {
    private static void mazePath(int[][] grid, int row, int col, String dir, List<String> ans, int n) {
        if (row == n - 1 && col == n - 1) {
            ans.add(dir);
            return;
        }

        if (grid[row][col] == 0)
            return;

        grid[row][col] = 0;

        // Up
        if (row > 0 && grid[row - 1][col] == 1)
            mazePath(grid, row - 1, col, dir + "U", ans, n);

        // Down
        if (row < n - 1 && grid[row + 1][col] == 1)
            mazePath(grid, row + 1, col, dir + "D", ans, n);

        // Left
        if (col > 0 && grid[row][col - 1] == 1)
            mazePath(grid, row, col - 1, dir + "L", ans, n);

        // Right
        if (col < n - 1 && grid[row][col + 1] == 1)
            mazePath(grid, row, col + 1, dir + "R", ans, n);

        grid[row][col] = 1;
    }

    private static List<String> findPath(int[][] grid) {
        int n = grid.length;
        List<String> ans = new ArrayList<>();

        if (grid[0][0] == 0 || grid[n - 1][n - 1] == 0)
            return ans;

        mazePath(grid, 0, 0, "", ans, n);

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 0, 0, 0, 0 },
                { 1, 1, 0, 1, 1 },
                { 0, 1, 0, 0, 1 },
                { 0, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1 }
        };

        System.out.println(findPath(grid));
    }
}
