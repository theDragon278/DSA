public class CommonSubstring {
    public static String commonSubstring(String[] str) {
        if (str == null || str.length == 0)
            return "";

        String first = str[0];
        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);

            for (int j = 1; j < str.length; j++) {
                if (i >= str[j].length() || str[j].charAt(i) != ch) {
                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {
        String[] str = { "dog", "cat", "animal", "monkey" };
        System.out.println("Longest Common string is " + commonSubstring(str));
    }
}
