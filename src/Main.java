public class Main {
    public static void main(String[] args) {

        // SinglyLinkedList test:

        System.out.println("SinglyLinkedList:\n");

        SinglyLinkedList node = new SinglyLinkedList(1);
        node.next = new SinglyLinkedList(2);
        node.next.next = new SinglyLinkedList(3);

        SinglyLinkedList.printSinglyLinkedList(node);
        System.out.println("\n" + node.value);
        /* Because this method changes what the node object points to
         * in the line:       node = node.next;
         *
         * the node object in main doesn't actually get changed at all.
         * This is because java creates a copy of the node object in the method call
         * and that copy points to the same address as the node object, but when you call
         * node = node.next
         * your actually changing what the copy points to, in turn making any changes to it
         * separate from the node object
         *
         * Java works this way with method calls; when a variable is passed into a method call, a copy
         * is always initialized. When it is an object or reference type variable, java will still
         * copy that object, and that copy of the object will point to the same address of the object
         * passed in the method which makes it act like both the copy and actual value are the same.
         * If you change what the copy is pointing to in the method definition, then it will be
         * separate from the actual value.
         */

        System.out.println("\n----------------------------------------------\n");

        System.out.println("DoublyLinkedList:\n");

        // DoublyLinkedList test:
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
        System.out.println("CircularLinkedList:\n");

        SinglyLinkedList circularLinkedListNode1 = new SinglyLinkedList(1);
        SinglyLinkedList circularLinkedListNode2 = new SinglyLinkedList(2);
        SinglyLinkedList circularLinkedListNode3 = new SinglyLinkedList(3);
        SinglyLinkedList circularLinkedListNode4 = new SinglyLinkedList(4);
        SinglyLinkedList circularLinkedListNode5 = new SinglyLinkedList(5);
        SinglyLinkedList circularLinkedListNode6 = new SinglyLinkedList(6);
        circularLinkedListNode1.next = circularLinkedListNode2;
        circularLinkedListNode2.next = circularLinkedListNode3;
        circularLinkedListNode3.next = circularLinkedListNode4;
        circularLinkedListNode4.next = circularLinkedListNode5;
        circularLinkedListNode5.next = circularLinkedListNode6;
        circularLinkedListNode6.next = circularLinkedListNode1;

        SinglyLinkedList.printCircularLinkedList(circularLinkedListNode1);

    }
}