public class ArrayStack {

    int[] array;
    int capacity;
    // index of the top element
    private int top;

    public ArrayStack(int cap) {
        capacity = cap;
        array = new int[capacity];
        top = -1;
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        array[++top] = x;
    }

}
