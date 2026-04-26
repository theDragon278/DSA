import java.util.*;

public class QueueInJava {
    public static void main(String[] args) {

        // First In First Out (FIFO)
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(2);
        queue.offer(6);
        queue.offer(9);
        queue.offer(10);
        System.out.println("Queue: " + queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println("Queue after poll: " + queue);
        System.out.println(queue.isEmpty());

        System.out.println();

        /*
         * stores elements by implementing Min-Heap DS. So when we peek or poll, it will
         * return the minimum element in the queue.
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(5);
        priorityQueue.offer(2);
        priorityQueue.offer(8);
        System.out.println("Priority Queue: " + priorityQueue);
        System.out.println(priorityQueue.peek());
        priorityQueue.poll();
        System.out.println("Priority Queue after poll: " + priorityQueue);

    }
}
