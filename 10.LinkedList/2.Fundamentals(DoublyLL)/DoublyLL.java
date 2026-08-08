class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLL {
    public static Node convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);

            mover.next = newNode;
            newNode.prev = mover;

            mover = mover.next;
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

    public static Node insertBeforeHead(Node head, int num) {
        Node newNode = new Node(num, head, null);
        if (head != null) {
            head.prev = newNode;
        }

        return newNode;
    }

    public static Node insertBeforeTail(Node head, int num) {
        if (head == null) {
            return new Node(num);
        }

        if (head.next == null) {
            Node newNode = new Node(num, head, null);
            head.prev = newNode;
            return newNode;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node prevNode = temp.prev;
        Node newNode = new Node(num, temp, prevNode);

        prevNode.next = newNode;
        temp.prev = newNode;

        return head;
    }

    public static Node insertBeforeKthNode(Node head, int k, int num) {
        if (head == null) {
            return null;
        }

        int count = 1;
        Node temp = head;
        while (temp != null) {
            if (count == k) {
                break;
            }

            count++;
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        if (temp.prev == null) {
            Node newNode = new Node(num, temp, null);
            temp.prev = newNode;

            return newNode;
        }

        Node prevNode = temp.prev;
        Node newNode = new Node(num, temp, prevNode);

        prevNode.next = newNode;
        temp.prev = newNode;

        return head;
    }

    public static Node insertBeforeNodeK(Node head, int val, int num) {
        if (head == null) {
            return null;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                break;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        if (temp.prev == null) {
            Node newNode = new Node(num, temp, null);
            temp.prev = newNode;

            return newNode;
        }

        Node prevNode = temp.prev;
        Node newNode = new Node(num, temp, prevNode);

        prevNode.next = newNode;
        temp.prev = newNode;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 9 };
        Node head = convertArrToLL(arr);

        head = insertBeforeNodeK(head, 8, 10);
        printLL(head);
    }
}
