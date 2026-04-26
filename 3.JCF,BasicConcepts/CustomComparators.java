import java.util.*;

public class CustomComparators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(23);
        list.add(67);

        /*
         * Concept of custom comparators for sorting in descending order:
         * 1. if o1 < o2 => return positive value (meaning o2 should come before o1, so
         * swap them)
         * 2. if o1 > o2 => return negative value (meaning o1 should come before o2, so
         * no need to swap them)
         * 3. if o1 == o2 => return 0
         */

        // Collections.sort(list, new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2.compareTo(o1); // Sort in descending order
        // }
        // });
        Collections.sort(list, (o1, o2) -> o2.compareTo(o1)); // Using lambda expression
        System.out.println("List: " + list);
    }
}
