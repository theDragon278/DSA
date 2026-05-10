import java.util.Map;

public class MaxPointsOnLine {

    // T = O(N^3)
    // public static int maxPointsOnLine(int[][] nums) {
    // int n = nums.length;
    // if (n <= 2)
    // return n;

    // int count = 0, maxCount = 0;

    // for (int i = 0; i < n; i++) { // (x1, y1)
    // for (int j = i + 1; j < n; j++) { // (x2, y2)
    // count = 2;
    // int dx1 = nums[j][0] - nums[i][0]; // (x2-x1)
    // int dy1 = nums[j][1] - nums[i][1]; // (y2-y1)

    // for (int k = 0; k < n; k++) { // (x3, y3)
    // if (k != i && k != j) {
    // int dx2 = nums[k][0] - nums[j][0]; // (x3-x2)
    // int dy2 = nums[k][1] - nums[j][1]; // (y3-y2)

    // if (dy1 * dx2 == dy2 * dx1)
    // count++;
    // }
    // }
    // maxCount = Math.max(maxCount, count);
    // }
    // }

    // return maxCount;
    // }

    public static int findGcd(int a, int b) {
        if (b == 0)
            return a;

        return findGcd(b, a % b);
    }

    public static int maxPointsOnLine(int[][] points) {
        int n = points.length;
        if (n <= 2)
            return n;

        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            Map<String, Integer> map = new HashMap<>();
            int currentMax = 0;

            for (int j = i + 1; j < n; j++) {
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];

                if (dx == 0) {
                    dy = 1;
                } else if (dy == 0) {
                    dx = 1;
                } else {
                    int gcd = findGcd(Math.abs(dx), Math.abs(dy));

                    dx /= gcd;
                    dy /= gcd;

                    if (dx < 0) {
                        dx *= -1;
                        dy *= -1;
                    }
                }

                String slope = dy + "/" + dx;

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                currentMax = Math.max(currentMax, map.get(slope));
            }

            maxCount = Math.max(maxCount, currentMax + 1);
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[][] nums = { { 0, 1 }, { 2, 3 }, { 4, 5 }, { 1, 2 }, { 3, 4 }, { 2, 2 } };
        System.out.println(maxPointsOnLine(nums));
    }
}
