public class ReverseString {
    public static String reverseString(String s) {
        char[] str = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;

            start++;
            end--;
        }

        return new String(str);
    }

    public static void main(String[] args) {
        String s = "Hello";

        String reversed = reverseString(s);

        System.out.println("Reverse of " + s + " is " + reversed);
    }

}
