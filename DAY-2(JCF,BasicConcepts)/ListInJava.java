import java.util.*;

public class ListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(0, 0);
        aList.get(2);
        aList.set(1, 10);
        aList.remove(0);
        aList.size();
        // aList.clear();
        System.out.println(aList);

        System.out.println();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("World");
        linkedList.addFirst("Welcome");
        System.out.println(linkedList);

        System.out.println();

        // Last In First Out (LIFO)
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack: " + stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println("Stack after pop: " + stack);
        System.out.println(stack.isEmpty());
    }
}
