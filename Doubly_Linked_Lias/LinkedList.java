package Doubly_Linked_Lias;

import java.util.NoSuchElementException;

/**
 * A linked list is a sequence of nodes with efficient element insertion and
 * removal. This class contains a subset of the methods of the standard
 * java.util.LinkedList class.
 */

public class LinkedList {
    private Node position;
    // private Node previous;
    private Node first;
    private Node last;
    private int counter;

    /** Constructs an empty linked list. */
    public LinkedList() {
        first = null;
        last = null;
        counter = 0;
    }

    /**
     * Returns the first element in the linked list.
     * 
     * @return the first element in the linked list
     */
    public Object getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return first.data;
    }

    /**
     * Returns the last element in the linked list.
     * 
     * @return the last element in the linked list
     */
    public Object getLast() {
        if (last == null)
            throw new NoSuchElementException();
        return last.data;
    }

    /**
     * Removes the first element in the linked list.
     * 
     * @return the removed element
     */
    public Object removeFirst() {
        if (first == null)
            throw new NoSuchElementException();
        Object element = first.data;
        if (position == first)
            position = null;
        first = first.next;
        if (first != null)
            first.previous = null;
        else
            last = null;
        counter--;
        return element;
    }

    /**
     * Removes the last element in the linked list.
     * 
     * @return the removed element
     */
    public Object removeLast() {
        if (last == null)
            throw new NoSuchElementException();

        if (last == first) 
            return removeFirst();
        
        Object element = last.data;
        if (position == last)
            position = last.previous;
        last = last.previous;
        if (last != null)
            last.next = null;
        counter--;
        return element;
    }

    /**
     * Adds an element to the front of the linked list.
     * 
     * @param element the element to add
     */
    public void addFirst(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        // if list is empty set last too
        if (first == null) {
            last = newNode;
            first = newNode;
        } else {
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
        counter++;
    }

    /**
     * Adds an element to the end of the linked list.
     * 
     * @param element the element to add
     */
    public void addLast(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        // if list is empty set first too
        if (last == null) {
            last = newNode;
            first = newNode;
        } else {
            newNode.previous = last;
            last.next = newNode;
            last = newNode;
        }
        counter++;
    }

    @Override
    public String toString() {
        String answer = "LinkedList = [ ";

        ListIterator iterator = listIterator();
        // add all element casting to string
        while (iterator.hasNext()) {
            answer += iterator.next().toString() + " ";
        }

        return answer + "]";
    }

    /**
     * Returns an iterator for iterating through this list.
     * 
     * @return an iterator for iterating through this list
     */
    public ListIterator listIterator() {
        return new LinkedListIterator();
    }

    /**
     * Return number of elements in the list.
     * 
     * @return number of elements in the list.
     */
    public int listLength() {
        // // count list
        // int counter = 0;
        // ListIterator iterator = listIterator();

        // while (iterator.hasNext()) {
        //     counter++;
        //     iterator.next();
        // }
        // return counter;

        // // or count when add, addFirst, remove or removeFirst elements 
        return counter;
    }

    private class Node {
        public Object data;
        public Node next;
        public Node previous;

        public String getDataStr() {
            return ((data == null) ? "null" : String.format("%4d", (int)data));
        }

        @Override
        public String toString() {
            String s = "Node [ data = " + getDataStr();
            s += ",  prev = ";
            s += (previous == null) ? "NULL" : previous.getDataStr();
            s += ",  next = ";
            s += (next == null) ? "NULL" : next.getDataStr();
            s += " ]";
            return s;
        }
    }

    private class LinkedListIterator implements ListIterator {
        /**
         * Constructs an iterator that points to the front of the linked list.
         */
        public LinkedListIterator() {
            position = null;
            // previous = null;
        }

        /**
         * Moves the iterator past the next element.
         * 
         * @return the traversed element
         */
        public Object next() {
            if (!hasNext())
                throw new NoSuchElementException();
            // previous = position;
            // Remember for remove
            if (position == null)
                position = first;
            else
                position = position.next;
            return position.data;
        }

        /**
         * Tests if there is an element after the iterator position.
         * 
         * @return true if there is an element after the // iterator position
         */
        public boolean hasNext() {
            if (position == null)
                return first != null;
            else
                return position.next != null;
        }

        /**
         * Moves the iterator before the previous element.
         * 
         * @return the traversed element
         */
        @Override
        public Object previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            
            position = position.previous;
            return position.data;
        }

        /**
         * Tests if there is an element before the iterator position.
         * 
         * @return true if there is an element before the iterator position
         */
        @Override
        public boolean hasPrevious() {
            if (position == null || position.previous == null)
                return false;
            else
                return true;
        }

        /**
         * Adds an element before the iterator position and moves the iterator past the
         * inserted element.
         * 
         * @param element the element to add
         */
        public void add(Object element) {
            // first
            if (position == null) {
                addFirst(element);
                position = first;
            } else {
                // last
                if (position.next == null) {
                    addLast(element);
                    position = last;
                } else {
                    Node newNode = new Node();
                    newNode.data = element;
                    newNode.next = position.next;
                    newNode.previous = position;
                    position.next.previous = newNode;
                    position.next = newNode;
                    position = newNode;
                    counter++;
                }
            }
            // previous = position;
        }

        /**
         * Removes the element on current position
         * anny time if avaliable
         */
        public void remove() {
            if (position == null)
                throw new IllegalStateException();
            else if (position == first) {
                removeFirst();
            } else if (position == last) {
                removeLast();
            } else {
                position.previous.next = position.next;
                position.next.previous = position.previous;
                position = position.previous;
                counter--;
            }
        }

        /**
         * Sets the last traversed element to a different value.
         * 
         * @param element the element to set
         */
        public void set(Object element) {
            if (position == null)
                throw new NoSuchElementException();
            position.data = element;
        }

        @Override
        public String toString() {

            return "Iterator [ " + position + " ]" ;
        }

    }

    public void printNodes() {
        System.out.println(" ----- Doubly Linked List, size = " + listLength() + " -----");
        if (first != null) {
            Node temp = first;
            do {
                System.out.println(temp);
                if (temp == position)
                    System.out.println("position ----------------------------------------");
                temp = temp.next;                
            } while (temp != null);
        }
        System.out.println(" ----------------- END -------------------");
    }
}