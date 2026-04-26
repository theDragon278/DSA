import java.util.*;

public class MapInJava {
    public static void main(String[] args) {

        // maps only store unique keys but can have duplicate values.

        // stores elements in key-value pair but not necessarily in order.
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(274, "Aditya");
        hashMap.put(278, "Ambarish");
        hashMap.put(300, "Ankesh");
        System.out.println(hashMap);

        // stores elements in key-value pair and maintains these elements in sorted
        // order.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(274, "Aditya");
        treeMap.put(278, "Ambarish");
        treeMap.put(300, "Ankesh");
        System.out.println(treeMap);
    }
}
