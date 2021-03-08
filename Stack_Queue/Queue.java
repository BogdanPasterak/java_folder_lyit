package Stack_Queue;

import java.util.Arrays;

public class Queue extends Exception {
    
    private static final long serialVersionUID = 1L;
    private final int MAXSIZE;
    private char[] queue;
    private int head;
    private int tail;
    private int noElements;

    // constructor
    public Queue(int MAXSIZE) {
        this.MAXSIZE = MAXSIZE;
        queue = new char[MAXSIZE];
        head = 0;
        tail = -1;
        noElements = 0;
    }

    // add char to queue
    public void insert(char elementToInsert) throws Exception {
        if ( ! isFull()) {
            tail = ++tail % MAXSIZE; // (tail + 1) % MAXSIZE
            queue[tail] = elementToInsert;
            noElements++;
        }
        else {
            throw new Exception("full queue");
        }
    }

    // get from queue
    public char remove() throws Exception {
        if ( ! isEmpty()) {
            char itemToRemove = queue[head];
            head = ++head % MAXSIZE;
            noElements--;
            return itemToRemove;
        }
        else {
            throw new Exception("empty queue");
        }
    }

    // under flow ?
    public boolean isEmpty() {
        return (noElements == 0);
    }

    // over flow ?
    public boolean isFull() {
        return (noElements == MAXSIZE);
    }

    // get but doesn't pop it
    public char queueTop() throws Exception {
        if ( ! isEmpty()) {
            return queue[head];
        }
        else {
            throw new Exception("empty queue");
        }
    }

    // return number of element on queue
    public int size () {
        return noElements;
    }

    @Override
    public String toString() {
        String message = "Queue: ";
        
        // sub array
        char[] arrayToPrint = new char[noElements];
        for (int i = 0; i < noElements; i++) {
            arrayToPrint[i] = queue[(head + i) % MAXSIZE];
        }
        // added to message
        message += Arrays.toString(arrayToPrint);

        return message;
    }

}
