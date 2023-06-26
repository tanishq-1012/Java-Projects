//Question-1 Implement a stack using an array in Java. 
//Include the necessary methods such as push, pop, and isEmpty.

public class Stack {
	private int maxSize;  
    private int top;      
    private int[] stackArray;  

    public Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element: " + value);
        } else {
            top++;
            stackArray[top] = value;
            System.out.println("Pushed element: " + value);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        } else {
            int poppedElement = stackArray[top];
            top--;
            System.out.println("Popped element: " + poppedElement);
            return poppedElement;
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.push(50);
        stack.push(60);
        stack.push(70); 
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); 
    }
}
