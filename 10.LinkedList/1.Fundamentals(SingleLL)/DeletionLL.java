class Node1 {
    public int data;
    public Node1 next;

    public Node1(int data, Node1 next) {
        this.data = data;
        this.next = next;
    }

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeletionLL {
    public static Node1 convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node1 head = new Node1(arr[0]);
        Node1 mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node1(arr[i]);
            mover = mover.next;
        }

        return head;
    }

    public static Node1 deleteHead(Node1 head) {
        if (head == null) {
            return head;
        }

        head = head.next;
        return head;
    }

    public static Node1 deleteTail(Node1 head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node1 temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    public static Node1 deleteK(Node1 head, int k) {
        if (head == null) {
            return head;
        }

        if (k == 1) {
            return deleteHead(head);
        }

        int count = 0;
        Node1 temp = head;
        Node1 prev = null;

        while (temp != null) {
            count++;

            if (count == k) {
                prev.next = temp.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static Node1 deleteValK(Node1 head, int k) {
        if (head == null) {
            return head;
        }

        if (head.data == k) {
            return deleteHead(head);
        }

        Node1 temp = head;
        Node1 prev = null;

        while (temp != null) {
            if (temp.data == k) {
                prev.next = temp.next;
                break;
            }

            prev = temp;
            temp = temp.next;
        }

        return head;
    }

    public static void printLL(Node1 head) {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 9 };
        Node1 head = convertArrToLL(arr);
        head = deleteValK(head, 6);

        printLL(head);
    }
}
