import java.util.*;

public class SortCharByFreq {

    public static List<Character> frequencySort(String s) {

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        List<Character> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!list.contains(ch)) {
                list.add(ch);
            }
        }

        Collections.sort(list, (a, b) -> {

            if (freq[a] != freq[b]) {
                return freq[b] - freq[a];
            }

            return a - b;
        });

        return list;
    }

    public static void main(String[] args) {
        String s = "tree";

        List<Character> result = frequencySort(s);

        System.out.println(result);
    }
}