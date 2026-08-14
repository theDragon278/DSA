public class IsIthBitSet {
    public static boolean rightShift(int num, int i) {
        return ((num >> i) & 1) == 1;
    }

    public static boolean leftShift(int num, int i) {
        return (num & (1 << i)) != 0;
    }

    public static void main(String[] args) {
        int num = 13;
        int i = 2;

        if (rightShift(num, i)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
