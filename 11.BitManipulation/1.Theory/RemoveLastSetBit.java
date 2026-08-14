public class RemoveLastSetBit {
    public static void main(String[] args) {
        int num = 40;

        System.out.println(num & num - 1);
    }
}