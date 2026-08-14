public class ToggleIthBit {
    public static void main(String[] args) {
        int num = 13;
        int i = 1;

        System.out.println(num ^ (1 << i));
    }
}
