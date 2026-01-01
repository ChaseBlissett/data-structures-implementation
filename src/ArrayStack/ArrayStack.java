package ArrayStack;

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

    public void print() {
        for (int i = this.array.length -1; i > -1; i--) {
            System.out.println(this.array[i]);
        }
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("\nStack Overflow");
            return;
        }
        array[++top] = x;
    }
    public void pop() {
        if (top == -1) {
            System.out.println("Stack underflow: ArrayStack is already empty");
            return;
        }
        top --;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack underflow: ArrayStack is already empty");
            return -1;
        }
        return array[top];
    }

    public int search(int value) {
        for (int i = top, positionFromTop = 1; i >= 0; i--, positionFromTop++) {
            if (array[i] == value) return positionFromTop;
        }
        return -1;
    }

    public int get(int index) {
        int i = (this.array.length - index);
        return this.array[i];
    }

}
