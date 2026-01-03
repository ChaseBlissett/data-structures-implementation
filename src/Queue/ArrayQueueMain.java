package Queue;

public class ArrayQueueMain {
    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(5);
        for (int i = 0; i < 5; i ++) queue.offer(i);

        System.out.println("\nArrayQueue: ");
        queue.print();
        System.out.println();

        System.out.println("\nFirst element: " + queue.peek());

        System.out.println("\nPolling " + queue.poll());
        System.out.println("Queue after polling:");
        queue.print();

    }
}
