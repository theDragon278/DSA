class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    public static Node convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node(arr[i]);
            mover = mover.next;
        }

        return head;
    }

    public static Node insertAtHead(Node head, int val) {
        Node temp = new Node(val, head);

        return temp;
    }

    public static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(val);
        return head;
    }

    public static Node insertAtK(Node head, int k, int val) {

        if (k < 1)
            return head;

        if (k == 1)
            return new Node(val, head);

        Node temp = head;
        int count = 1;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null)
            return head;

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;

        return head;
    }

    public static Node insertBeforeVal(Node head, int val, int num) {
        if (head == null)
            return null;

        if (head.data == val)
            return new Node(num, head);

        Node prev = head;
        Node temp = head.next;

        while (temp != null) {

            if (temp.data == val) {
                Node newNode = new Node(num);
                prev.next = newNode;
                newNode.next = temp;
                return head;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 9 };
        Node head = convertArrToLL(arr);

        head = insertBeforeVal(head, 2, 10);
        printLL(head);
    }
}
