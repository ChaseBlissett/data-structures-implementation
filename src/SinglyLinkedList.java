public class SinglyLinkedList {
    int value;
    SinglyLinkedList next;
    SinglyLinkedList(int value) {
        this.value = value;
        this.next = null;
    }

    public static void printSinglyLinkedList(SinglyLinkedList node) {
        if (node == null) System.out.println("Linked List is null");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }

    public static void printCircularLinkedList(SinglyLinkedList head) {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        SinglyLinkedList current = head;
        do {
            System.out.print(current.value + " ");
            current = current.next;
        } while (current != head);

    }
}
