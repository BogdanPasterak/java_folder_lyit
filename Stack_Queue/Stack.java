package Stack_Queue;

import java.util.Arrays;

public class Stack extends Exception {

    private static final long serialVersionUID = 1L;
    private final int MAXSIZE;
    private int[] stack;
    private int top;

    // constructor
    public Stack(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        stack = new int[MAXSIZE];
        this.top = -1;
    }

    // add int to stack
    public void push(int elementToPush) throws Exception {
        if ( ! isFull()) {
            top++;
            stack[top] = elementToPush;
        }
        else {
            throw new Exception("full stack");
        }
    }

    // get from stack
    public int pop() throws Exception {
        if ( ! isEmpty()) {
            return stack[top--];
        }
        else {
            throw new Exception("empty stack");
        }
    }

    // under flow ?
    public boolean isEmpty() {
        return (top == -1);
    }

    // over flow ?
    public boolean isFull() {
        return (top == MAXSIZE - 1);
    }

    // get but doesn't pop it
    public int peek() throws Exception {
        if ( ! isEmpty()) {
            return stack[top];
        }
        else {
            throw new Exception("empty stack");
        }
    }

    // return number of element on stack
    public int size () {
        return top + 1;
    }

    @Override
    public String toString() {
        String message = "";

        if ( isFull()) {
            message = "full stack: ";
        } else {
            message = "stack: ";
        }

        // sub array
        int[] arrayToPrint = new int[top + 1];
        System.arraycopy(stack, 0, arrayToPrint, 0, top + 1);
        // added to message
        message += Arrays.toString(arrayToPrint);

        return message;
    }

}