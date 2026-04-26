import java.util.*;

public class SetInJava {
    public static void main(String[] args) {

        // DS that stores unique elements but not necessarily in sorted order
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println("HashSet: " + hashSet); // 1, 2, 3

        System.out.println();

        // DS that stores unique elements in sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(12);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(2);
        System.out.println("TreeSet: " + treeSet); // 2, 4, 6, 12
        System.out.println(treeSet.floor(5)); // Prints the first smaller or equal element to 5, which is 4
        System.out.println(treeSet.ceiling(5)); // Prints the first greater or equal element to 5, which is 6
    }
}
