public class IsPalindrome {
    public static boolean helper(String s, int start, int last) {
        if (start >= last)
            return true;

        if (s.charAt(start) != s.charAt(last))
            return false;

        return helper(s, start + 1, last - 1);
    }

    public static boolean isPalindrome(String s) {
        return helper(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        String str = "hanNah";
        System.out.println(isPalindrome(str));
    }
}
