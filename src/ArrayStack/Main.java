package ArrayStack;

public class Main {
    public static void main(String[] args){
        System.out.println("ArrayStack.ArrayStack:\n");

        ArrayStack arrayStack = new ArrayStack(3);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);

        arrayStack.print();

        System.out.println("element at index 2: " + arrayStack.get(2));

        System.out.print("This will be a stack overflow: ");
        arrayStack.push(5);
        System.out.println();

        System.out.println("Top element: " + arrayStack.peek());
        System.out.printf("Position from top of one: " + arrayStack.search(1));

        System.out.println("\n----------------------------------------------");
    }
}
