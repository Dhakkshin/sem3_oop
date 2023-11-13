package Exp9a;

// Stack interface
interface Stack {
    void push(int element);
    int pop();
    boolean isEmpty();
}

// Implementation of Stack interface
class StackTest implements Stack {
    private int[] stack;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public StackTest() {
        stack = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int element) {
        if (top == stack.length - 1) {
            // If the size is too small, create a new array
            int[] newStack = new int[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
        }
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

