import java.util.Arrays;

public class IsAnagram {
    // Brute Force Method
    // public static int[] createHashArray(String str) {
    // int[] arrayHash = new int[256];

    // for (int i = 0; i < str.length(); i++) {
    // arrayHash[str.charAt(i)]++;
    // }

    // return arrayHash;
    // }

    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;

    // int[] sHash = createHashArray(s);
    // int[] tHash = createHashArray(t);

    // for (int i = 0; i < sHash.length; i++) {
    // if (sHash[i] != tHash[i])
    // return false;
    // }

    // return true;
    // }

    // Sorting Method
    // public static boolean isAnagram(String s, String t) {
    // if (s.length() != t.length())
    // return false;

    // char[] sChar = s.toCharArray();
    // Arrays.sort(sChar);
    // char[] tChar = t.toCharArray();
    // Arrays.sort(tChar);

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] hash = new int[256];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
            hash[t.charAt(i)]--;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
