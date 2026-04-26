public class RotatingString {
    // Brute Force Method
    // public static boolean isValidRotate(String s, String goal) {
    // if (s.length() != goal.length())
    // return false;

    // for (int i = 0; i < s.length(); i++) {
    // if (s.charAt(i) == goal.charAt(0)) {
    // if ((s.substring(i) + s.substring(0, i)).equals(goal)) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // Optimal Solution
    public static boolean isValidRotate(String s, String goal) {
        if (s.length() != goal.length())
            return false;

        String doubleS = s + s;
        return doubleS.contains(goal);

    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";

        System.out.println(isValidRotate(s, goal));
    }

}
