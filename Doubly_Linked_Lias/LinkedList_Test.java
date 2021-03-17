package Doubly_Linked_Lias;

public class LinkedList_Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListIterator iterator = linkedList.listIterator();
        int number;

        // Q 1
        // point 1
        System.out.println("Q 1\nLinked List Example!");

        iterator.add(11);
        iterator.add(22);
        iterator.add(33);
        iterator.add(44);

        // point 2
        System.out.println("Linked list data: " + linkedList);

        // point 3 and 4
        System.out.println("Add 55 to the beginning of the Linked List");
        linkedList.addFirst(55);
        System.out.println("Now the list contains: " + linkedList);

        // 5 and 6, iterator still on the end
        System.out.println("Add 66 to the end of the Linked List");
        iterator.add(66);
        System.out.println("Now the list contains: " + linkedList);

        // 7, 8 => new iterator (2 x next) and set third
        System.out.println("Add 99 at the 3rd location in the List");
        iterator = linkedList.listIterator();
        iterator.next();
        iterator.next();
        iterator.add(99);;
        System.out.println("Now the list contains: " + linkedList);

        // 9 => head of list
        System.out.println("Display the first element on the list  (" + linkedList.getFirst() + ")");

        // 10, using iterator find place with no next (last)
        iterator = linkedList.listIterator();
        number = 0;
        while (iterator.hasNext()) {
            number = (int)iterator.next();
        }
        System.out.println("Display the final element on the list  (" + number + ")");

        // 11, new iterator 3 x next and get fourth
        iterator = linkedList.listIterator();
        for (int i = 0; i < 3; i++)
            iterator.next();
        number = (int)iterator.next();
        System.out.println("Display the element at the 4th position on the list (" + number + ")");

        //12, 13 remove element at the beginning of the list
        iterator = linkedList.listIterator();
        number = (int)iterator.next();
        iterator.remove();
        System.out.println("Remove the element at the beginning of the list: " + number);
        System.out.println("Now the list contains: " + linkedList);
    
        // 14 and 15 remove last one
        iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            number = (int)iterator.next();
        }
        iterator.remove();
        System.out.println("Remove the element at the end of the list: " + number);
        System.out.println("Now the list contains: " + linkedList);

        // 16, 17 remove secound
        iterator = linkedList.listIterator();
        iterator.next();
        number = (int)iterator.next();
        iterator.remove();
        System.out.println("Remove the element at the 2nd position on the list: " + number);
        System.out.println("Now the list contains: " + linkedList);

        // Q 2

        number = linkedList.listLength();
        System.out.println("\nQ 2\nList size = " + number);

    }
}
