import java.util.ArrayList;

public class ReverseCharArray {

    public static ArrayList<Character> reverseCharArray(ArrayList<Character> s) {
        helper(s, 0, s.size() - 1);
        return s;
    }

    private static void helper(ArrayList<Character> s, int start, int last) {
        if (start >= last)
            return;

        char temp = s.get(start);
        s.set(start, s.get(last));
        s.set(last, temp);

        helper(s, start + 1, last - 1);
    }

    public static void main(String[] args) {
        ArrayList<Character> charArray = new ArrayList<>();
        charArray.add('h');
        charArray.add('e');
        charArray.add('l');
        charArray.add('l');
        charArray.add('o');

        System.out.println(reverseCharArray(charArray));
    }
}