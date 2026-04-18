class Sum {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class ParameterizedMethods {
    public static void main(String[] args) {
        Sum sum = new Sum();
        int result = sum.sum(5, 10);
        System.out.println("The sum is: " + result);
    }
}
