class Node1 {
    public int data;
    public Node1 next;
    public Node1 prev;

    public Node1(int data, Node1 next, Node1 prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node1(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DeletionDLL {
    public static Node1 convertArrToLL(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        Node1 head = new Node1(arr[0]);
        Node1 mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node1 newNode1 = new Node1(arr[i]);

            mover.next = newNode1;
            newNode1.prev = mover;

            mover = mover.next;
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

    public static Node1 deleteHead(Node1 head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node1 nextNode1 = head.next;
        nextNode1.prev = null;
        head.next = null;

        return nextNode1;
    }

    public static Node1 deleteTail(Node1 head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.prev.next = null;
        temp.prev = null;

        return head;
    }

    public static Node1 deleteKthNode1(Node1 head, int k) {
        if (head == null)
            return null;

        Node1 temp = head;
        int count = 1;

        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null)
            return head;

        if (temp.prev == null) {
            head = temp.next;
            if (head != null)
                head.prev = null;
        } else {
            temp.prev.next = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        temp.next = null;
        temp.prev = null;

        return head;
    }

    public static Node1 deleteNode1K(Node1 head, int k) {
        if (head == null) {
            return null;
        }

        Node1 temp = head;

        while (temp != null) {
            if (temp.data == k) {
                break;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        if (temp.prev == null) {
            head = temp.next;

            if (head != null) {
                head.prev = null;
            }

            temp.next = null;

            return head;
        }

        if (temp.next == null) {
            temp.prev.next = null;
            temp.prev = null;

            return head;
        }

        Node1 front = temp.next;
        Node1 back = temp.prev;

        back.next = front;
        front.prev = back;

        temp.prev = null;
        temp.next = null;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 8, 3, 9 };
        Node1 head = convertArrToLL(arr);

        head = deleteNode1K(head, 9);
        printLL(head);
    }
}
