class Node2 {
    public int data;
    public Node2 next;
    public Node2 prev;

    public Node2(int data, Node2 next, Node2 prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node2(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class InsertionDLL {
    public static Node2 convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node2 head = new Node2(arr[0]);
        Node2 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node2 newNode2 = new Node2(arr[i]);

            mover.next = newNode2;
            newNode2.prev = mover;

            mover = mover.next;
        }

        return head;
    }

    public static void printLL(Node2 head) {
        Node2 temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node2 insertBeforeHead(Node2 head, int num) {
        Node2 newNode2 = new Node2(num, head, null);
        if (head != null) {
            head.prev = newNode2;
        }

        return newNode2;
    }

    public static Node2 insertBeforeTail(Node2 head, int num) {
        if (head == null) {
            return new Node2(num);
        }

        if (head.next == null) {
            Node2 newNode2 = new Node2(num, head, null);
            head.prev = newNode2;
            return newNode2;
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node2 prevNode2 = temp.prev;
        Node2 newNode2 = new Node2(num, temp, prevNode2);

        prevNode2.next = newNode2;
        temp.prev = newNode2;

        return head;
    }

    public static Node2 insertBeforeKthNode2(Node2 head, int k, int num) {
        if (head == null) {
            return null;
        }

        int count = 1;
        Node2 temp = head;
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
            Node2 newNode2 = new Node2(num, temp, null);
            temp.prev = newNode2;

            return newNode2;
        }

        Node2 prevNode2 = temp.prev;
        Node2 newNode2 = new Node2(num, temp, prevNode2);

        prevNode2.next = newNode2;
        temp.prev = newNode2;

        return head;
    }

    public static Node2 insertBeforeNode2K(Node2 head, int val, int num) {
        if (head == null) {
            return null;
        }

        Node2 temp = head;
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
            Node2 newNode2 = new Node2(num, temp, null);
            temp.prev = newNode2;

            return newNode2;
        }

        Node2 prevNode2 = temp.prev;
        Node2 newNode2 = new Node2(num, temp, prevNode2);

        prevNode2.next = newNode2;
        temp.prev = newNode2;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 9 };
        Node2 head = convertArrToLL(arr);

        head = insertBeforeNode2K(head, 8, 10);
        printLL(head);
    }
}
