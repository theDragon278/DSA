public class SetIthBit {
    public static void main(String[] args) {
        int num = 9;
        int i = 2;

        System.out.println(num | (1 << i));
    }
}
