public class ArrayStack {

    int[] array;
    int capacity;
    // index of the top element
    private int top;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    void print() {
        for (int i = 0; i <= this.top; i++) {
            System.out.print(this.array[i] + " ");
        }
    }

    void push(int x) {
        if (top == capacity - 1) {
            System.out.println("\nStack Overflow");
            return;
        }
        array[++top] = x;
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack underflow: ArrayStack is already empty");
            return;
        }
        top --;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack underflow: ArrayStack is already empty");
            return -1;
        }
        return array[top];
    }

}
