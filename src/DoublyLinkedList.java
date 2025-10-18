public class DoublyLinkedList {
    int value;
    DoublyLinkedList next;
    DoublyLinkedList prev;
    DoublyLinkedList(int value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }
    static void print(DoublyLinkedList node) {
        if (node == null) System.out.println("Node is null");
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
    }
    static void printBackwards(DoublyLinkedList endNode) {
            if (endNode == null) System.out.println("the final node should not be null");
            while (endNode != null) {
                System.out.print(endNode.value + " ");
                endNode = endNode.prev;
            }
        }
}
