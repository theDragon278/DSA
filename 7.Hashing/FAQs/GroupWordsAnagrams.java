import java.util.*;

public class GroupWordsAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if (!map.containsKey(key)) {
                List<String> val = new ArrayList<>();
                val.add(str);
                map.put(key, val);
            } else {
                List<String> val = map.get(key);
                val.add(str);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (List<String> ls : map.values()) {
            ans.add(ls);
        }

        return ans;
    }

    public static void main(String[] args) {
        String[] strs = { "race", "care", "acre", "bake", "beak", "keep" };
        System.out.println(groupAnagrams(strs));
    }
}
