package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {

        // SinglyLinkedList.SinglyLinkedList test:
        System.out.println("SinglyLinkedList.SinglyLinkedList:\n");

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
    }
}
