import java.util.*;

public class PalindromePartitioning {
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        }

        return true;
    }

    private static void partitionHelper(String s, int indx, List<String> curr, List<List<String>> ans) {
        if (indx == s.length()) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = indx; i < s.length(); i++) {
            if (isPalindrome(s, indx, i)) {
                curr.add(s.substring(indx, i + 1));
                partitionHelper(s, i + 1, curr, ans);
                curr.remove(curr.size() - 1);
            }
        }
    }

    private static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        partitionHelper(s, 0, curr, ans);

        return ans;
    }

    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(partition(s));
    }
}
