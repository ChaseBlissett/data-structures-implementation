package Queue;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;
    }

    public void print() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    // Last points to the end so looping through is unnecessary
    public void offer(int value) {
        if (this.tail == null) {
            this.head = new Node(value);
            this.tail = head;
        }
        else {
            Node node = new Node(value);
            tail.next = node;
            tail = node;
        }
    }

    public int poll() {
        Node firstElement = this.head;
        if (this.head == null) return -1;

        else if (this.head.next == null) {
            head = null;
            tail = null;
            return firstElement.data;
        }
        else {
            this.head = head.next;
            return firstElement.data;
        }
    }

    public int peek() {
        if (this.head == null) return -1;
        return head.data;
    }

    public int getTail() {
        if (tail == null) return -1;
        return tail.data;
    }

}
