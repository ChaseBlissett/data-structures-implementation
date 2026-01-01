package SinglyLinkedList;

public class CircularLinkedListMain {
    public static void main(String[] args) {
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

        // There needs to be its own logic so this doesn't print forever
        SinglyLinkedList.printCircularLinkedList(circularLinkedListNode1);
    }
}
