import java.util.*;

public class PhoneNumberCombination {
    private static final String[] map = {
            "", "",
            "abc", "def", "ghi",
            "jkl", "mno", "pqrs",
            "tuv", "wxyz"
    };

    private static void helper(String digits, List<String> ans, int index, String current) {
        if (index == digits.length()) {
            ans.add(current);
            return;
        }
        String s = map[digits.charAt(index) - '0'];
        for (int i = 0; i < s.length(); i++) {
            helper(digits, ans, index + 1, current + s.charAt(i));
        }
    }

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;
        helper(digits, ans, 0, "");
        return ans;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);

        for (String combination : result) {
            System.out.print(combination + " ");
        }
    }
}
