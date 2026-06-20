public class WordSearch {
    private static boolean wordSearch(char[][] board, String word, int indx, int i, int j) {
        if (indx == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || word.charAt(indx) != board[i][j]) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean ans = wordSearch(board, word, indx + 1, i - 1, j) ||
                wordSearch(board, word, indx + 1, i + 1, j) ||
                wordSearch(board, word, indx + 1, i, j - 1) ||
                wordSearch(board, word, indx + 1, i, j + 1);

        board[i][j] = temp;

        return ans;
    }

    private static boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && wordSearch(board, word, 0, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' }
        };
        String word = "ABCCED";

        if (exist(board, word)) {
            System.out.println("Word found!");
        } else {
            System.out.println("Word not found!");
        }
    }
}
