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
}
