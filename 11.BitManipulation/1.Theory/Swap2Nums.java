public static int[] swap(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    return new int[] { a, b };
}

public static void main(String[] args) {
    int a = 5;
    int b = 6;

    System.out.println("Before swap: \na: " + a + " b: " + b);

    int[] result = swap(a, b);
    a = result[0];
    b = result[1];

    System.out.println("After swap: \na: " + a + " b: " + b);
}