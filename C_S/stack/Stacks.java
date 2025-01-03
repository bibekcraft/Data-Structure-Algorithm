
public class Stacks {
    char[] stk;
    int top = -1; // Top should be initialized to -1 when the stack is empty.
    int size;

    Stacks(int size) {
        stk = new char[size];
        this.size = size;
    }

    // Push method to add elements to the stack.
    void push(char data) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stk[++top] = data; // Increment top before assigning the data
        }
    }

    // Pop method to remove elements from the stack.
    char pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return "e";
        }

        return stk[top--]; // Return the top element and decrement top
    }

    // Method to check if the stack is full.
    boolean isFull() {
        return top == size - 1; // Stack is full when top is size - 1
    }

    // Method to check if the stack is empty.
    boolean isEmpty() {
        return top == -1; // Stack is empty when top is -1
    }

    // Optional: Method to peek at the top element without removing it.
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -9999;
        }
        return stk[top];
    }
}
