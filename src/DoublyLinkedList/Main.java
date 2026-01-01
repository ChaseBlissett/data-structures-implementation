package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList node1 = new DoublyLinkedList(1);
        DoublyLinkedList node2 = new DoublyLinkedList(2);
        DoublyLinkedList node3 = new DoublyLinkedList(3);

        node1.next = node2;

        // Notice how node 2 is pointing to both node1 and node3
        node2.prev = node1;
        node2.next = node3;

        node3.prev = node2;

        System.out.println("Forwards:");
        DoublyLinkedList.print(node1);
        System.out.println("\nBackwards:");
        DoublyLinkedList.printBackwards(node3);

        System.out.println("\n----------------------------------------------\n");
    }
}
