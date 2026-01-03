package Queue;

public class ArrayQueue {
    int[] array;
    int lastIndex;
    int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        lastIndex = 0;
        array = new int[capacity];
    }

    public void offer(int value) {
        if (lastIndex >= capacity) return;
        this.array[lastIndex] = value;
        lastIndex++;
    }

    // O(n) just to remove the first index
    public int poll() {
        int firstValue = this.array[0];
        int[] finalArray = new int[array.length - 1];
        for (int i = 1, j = 0; i < array.length; i++, j++) {
            finalArray[j] = array[i];
        }
        this.array = finalArray;
        return firstValue;
    }

    public int peek() {
        return this.array[0];
    }

    public void print() {
        for (int num : this.array) System.out.print(num + " ");
    }

}
