import java.util.*;

public class NQueenProblem {
    private static boolean isSafe(List<String> board, int row, int col) {
        int r = row, c = col;

        // checks upper left diagonal
        while (r >= 0 && c >= 0) {
            if (board.get(r).charAt(c) == 'Q')
                return false;

            r--;
            c--;
        }

        r = row;
        c = col;

        // checks top
        while (r >= 0) {
            if (board.get(r).charAt(c) == 'Q')
                return false;

            r--;
        }

        r = row;
        c = col;

        // checks top right diagonal
        while (r >= 0 && c < board.get(0).length()) {
            if (board.get(r).charAt(c) == 'Q')
                return false;

            r--;
            c++;
        }

        return true;
    }

    private static void queenPosition(int row, List<List<String>> ans, List<String> board) {
        if (row == board.size()) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for (int col = 0; col < board.get(0).length(); col++) {
            if (isSafe(board, row, col)) {
                char[] rowArr = board.get(row).toCharArray();
                rowArr[col] = 'Q';
                board.set(row, new String(rowArr));

                queenPosition(row + 1, ans, board);

                rowArr[col] = '.';
                board.set(row, new String(rowArr));
            }
        }
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(".".repeat(n));
        }

        queenPosition(0, ans, board);

        return ans;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solveNQueens(n));
    }
}
