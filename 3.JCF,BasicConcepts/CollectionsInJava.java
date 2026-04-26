import java.util.*;

public class CollectionsInJava {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(23);
        list.add(67);
        System.out.println("List: " + list);
        Collections.sort(list);
        System.out.println("List in ascending order: " + list);
        Collections.reverse(list);
        System.out.println("List in descending order: " + list);
        System.out.println("Minimum element: " + Collections.min(list));
        System.out.println("Maximum element: " + Collections.max(list));
    }
}
