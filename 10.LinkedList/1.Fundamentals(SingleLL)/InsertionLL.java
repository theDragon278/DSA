class Node2 {
    public int data;
    public Node2 next;

    public Node2(int data, Node2 next) {
        this.data = data;
        this.next = next;
    }

    public Node2(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertionLL {
    public static Node2 convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node2 head = new Node2(arr[0]);
        Node2 mover = head;

        for (int i = 1; i < arr.length; i++) {
            mover.next = new Node2(arr[i]);
            mover = mover.next;
        }

        return head;
    }

    public static Node2 insertAtHead(Node2 head, int val) {
        Node2 temp = new Node2(val, head);

        return temp;
    }

    public static Node2 insertAtTail(Node2 head, int val) {
        if (head == null) {
            return new Node2(val);
        }

        Node2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node2(val);
        return head;
    }

    public static Node2 insertAtK(Node2 head, int k, int val) {

        if (k < 1)
            return head;

        if (k == 1)
            return new Node2(val, head);

        Node2 temp = head;
        int count = 1;

        while (temp != null && count < k - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null)
            return head;

        Node2 node = new Node2(val);
        node.next = temp.next;
        temp.next = node;

        return head;
    }

    public static Node2 insertBeforeVal(Node2 head, int val, int num) {
        if (head == null)
            return null;

        if (head.data == val)
            return new Node2(num, head);

        Node2 prev = head;
        Node2 temp = head.next;

        while (temp != null) {

            if (temp.data == val) {
                Node2 newNode2 = new Node2(num);
                prev.next = newNode2;
                newNode2.next = temp;
                return head;
            }

            prev = temp;
            temp = temp.next;
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

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 9 };
        Node2 head = convertArrToLL(arr);

        head = insertBeforeVal(head, 2, 10);
        printLL(head);
    }
}
