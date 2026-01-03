package Queue;

public class QueueMain {
    public static void main(String[] args) {

        Queue queue = new Queue();
        for (int i = 1; i < 6; i++) queue.offer(i);

        System.out.println("\nQueue:");
        queue.print();
        System.out.println("\n\nFront element: " + queue.poll());

        System.out.println("\nQueue after removing front element:");
        queue.print();

        System.out.println("\n\nqueue.peek(): " + queue.peek());
    }
}
