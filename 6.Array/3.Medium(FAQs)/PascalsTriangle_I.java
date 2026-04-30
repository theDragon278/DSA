public class PascalsTriangle_I {
    // Given rth row and cth column, return the perticular element
    public static int pascalsTriangleI(int row, int column) {
        int result = 1;
        int r = row - 1, c = column - 1;

        for (int i = 0; i < c; i++) {
            result = result * (r - i);
            result = result / (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int row = 5;
        int column = 3;
        System.out.println(pascalsTriangleI(row, column));
    }
}
