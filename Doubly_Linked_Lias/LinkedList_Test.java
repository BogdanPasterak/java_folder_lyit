package Doubly_Linked_Lias;

import java.util.NoSuchElementException;

public class LinkedList_Test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ListIterator iterator;
        int number, testIn, size;
        int counter = 0;
        String test;

        System.out.println("START");

        // linkedList.printNodes();
        // System.out.println(linkedList);

        // GET FIRST and LAST

        // test empty list getFirst
        test = "Empty list => getFirst() ";
        try {
            number = (int)linkedList.getFirst();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (NoSuchElementException e) {
            // linkedList.addFirst(2); // test of test ;)
            size = linkedList.listLength();
            if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            }
            System.out.println("Pass " + test);
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // linkedList.printNodes();

        // test empty list getLast
        test = "Empty list => getLast() ";
        try {
            number = (int)linkedList.getLast();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (NoSuchElementException e) {
            size = linkedList.listLength();
            if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            }
            System.out.println("Pass " + test);
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // test one element getFirst
        iterator = linkedList.listIterator();
        testIn = 11;
        iterator.add(testIn);
        test = "List [ "+testIn+" ] => getFirst() ";
        try {
            number = (int)linkedList.getFirst();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 1) {
                System.err.println(test + "FALSE ! Size list should be 1 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // test one element getLast
        // iterator = linkedList.listIterator();
        // testIn = 12;
        // iterator.add(testIn);
        // no change from previous
        test = "List [ "+testIn+" ] => getLast() ";
        try {
            number = (int)linkedList.getLast();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 1) {
                System.err.println(test + "FALSE ! Size list should be 1 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // test two element getFirst
        // iterator = linkedList.listIterator();
        testIn = 20;
        iterator.add(testIn);
        test = "List [ 11 "+testIn+" ] => getFirst() ";
        try {
            number = (int)linkedList.getFirst();
            size = linkedList.listLength();
            if ( 11 != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 2) {
                System.err.println(test + "FALSE ! Size list should be 2 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // test two element getLast
        // no change from previous
        test = "List [ 11 "+testIn+" ] => getLast() ";
        try {
            number = (int)linkedList.getLast();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 2) {
                System.err.println(test + "FALSE ! Size list should be 2 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // test three element getFirst
        // iterator = linkedList.listIterator();
        testIn = 38;
        iterator.add(testIn);
        test = "List [ 11 20 "+testIn+" ] => getFirst() ";
        try {
            number = (int)linkedList.getFirst();
            size = linkedList.listLength();
            if ( 11 != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // test three element getLast
        // no change from previous
        test = "List [ 11 20 "+testIn+" ] => getLast() ";
        try {
            number = (int)linkedList.getLast();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // NEXT and PREVIOUS

        // move beyond list
        test = "Position last => next() ";
        try {
            number = (int)iterator.next();
            // number = (int)linkedList.getFirst();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (NoSuchElementException e) {
            size = linkedList.listLength();
            if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // move back
        test = "Position 3 => previous() ";
        testIn = 20;
        try {
            number = (int)iterator.previous();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // move back
        test = "Position 2 => previous() ";
        testIn = 11;
        try {
            number = (int)iterator.previous();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // move beyond list
        test = "Position 1 => previous() ";
        try {
            iterator.previous();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (NoSuchElementException e) {
            size = linkedList.listLength();
            if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // move back
        test = "Position 1 => next() ";
        testIn = 20;
        try {
            number = (int)iterator.next();
            size = linkedList.listLength();
            if ( testIn != number) {
                System.err.println(test + "FALSE ! Wrong value, is "+number+" should be "+testIn+" -------");
                counter++;
            } else if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // REMOVE

        // remove inside
        test = "Position 2 => remove() ";
        try {
            iterator.remove();
            size = linkedList.listLength();
            if (size != 2) {
                System.err.println(test + "FALSE ! Size list should be 2 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // remove first
        test = "Position 1 => remove() ";
        try {
            iterator.remove();
            size = linkedList.listLength();
            if (size != 1) {
                System.err.println(test + "FALSE ! Size list should be 1 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }


        // remove if null iterator
        test = "Position null => remove() ";
        try {
            iterator.remove();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (IllegalStateException e) {
            size = linkedList.listLength();
            if (size != 1) {
                System.err.println(test + "FALSE ! Size list should be 1 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + " -------------------");
            counter++;
        }

        // remove last
        test = "Position last => remove() ";
        iterator.add(3);
        iterator.next();
        try {
            iterator.remove();
            size = linkedList.listLength();
            if (size != 1) {
                System.err.println(test + "FALSE ! Size list should be 1 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // remove last one
        test = "Position first/last => remove() ";
        try {
            iterator.remove();
            size = linkedList.listLength();
            if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // ADD

        // add 3 elements
        test = "Position 0 => add(1),add(2),add(3) ";
        try {
            iterator.add(1);
            iterator.add(2);
            iterator.add(3);
            size = linkedList.listLength();
            if (size != 3) {
                System.err.println(test + "FALSE ! Size list should be 3 but it is " + size + " -----");
                counter++;
            } else {
                if (   (int)linkedList.getFirst() != 1
                    || (int)linkedList.getLast() != 3
                    || (int)iterator.previous() != 2 ) {
                    System.err.println(test + "FALSE [ 1 2 3 ] but it is " + linkedList + " -----");
                    counter++;
                } else {
                    System.out.println("Pass " + test);
                }
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // List REMOVE

        // removeFirst
        test = "List [ 1 2 3 ] => removeFirst() ";
        try {
            number = (int)linkedList.removeFirst();
            size = linkedList.listLength();
            if (number != 1) {
                System.err.println(test + "FALSE ! Value should be 1 but it is " + number + " -----");
                counter++;
            } else if (size != 2) {
                System.err.println(test + "FALSE ! Size list should be 2 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // removeLast
        test = "List [ 2 3 ] => removeLast() ";
        try {
            number = (int)linkedList.removeLast();
            size = linkedList.listLength();
            if (number != 3) {
                System.err.println(test + "FALSE ! Value should be 3 but it is " + number + " -----");
                counter++;
            } else if (size != 1) {
                System.err.println(test + "FALSE ! Size list should be 1 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // removeLast
        test = "List [ 2 ] => removeLast() ";
        try {
            number = (int)linkedList.removeLast();
            size = linkedList.listLength();
            if (number != 2) {
                System.err.println(test + "FALSE ! Value should be 2 but it is " + number + " -----");
                counter++;
            } else if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // removeFirst
        iterator.add(5);
        test = "List [ 5 ] => removeFirst() ";
        try {
            number = (int)linkedList.removeFirst();
            size = linkedList.listLength();
            if (number != 5) {
                System.err.println(test + "FALSE ! Value should be 5 but it is " + number + " -----");
                counter++;
            } else if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (NoSuchElementException e) {
            System.err.println(test + "NoSuchElementException ! -------------------");
            counter++;
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + "-------------------");
            counter++;
        }

        // remove from empty list
        test = "List [ ] => removeFirst() ";
        try {
            linkedList.removeFirst();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (NoSuchElementException e) {
            size = linkedList.listLength();
            if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + " -------------------");
            counter++;
        }

        // remove from empty list
        test = "List [ ] => removeLast() ";
        try {
            linkedList.removeLast();
            System.err.println(test + "FALSE ! No Error !! ---------------------");
            counter++;
        } catch (NoSuchElementException e) {
            size = linkedList.listLength();
            if (size != 0) {
                System.err.println(test + "FALSE ! Size list should be 0 but it is " + size + " -----");
                counter++;
            } else {
                System.out.println("Pass " + test);
            }
        } catch (Exception e) {
            System.err.println(test + e.getMessage() + " -------------------");
            counter++;
        }

        iterator.add(16);
        iterator.add(8);
        iterator.add(68);
        iterator.previous();

        System.out.println();
        linkedList.printNodes();
        System.out.println();
        System.out.println(iterator);
        System.out.println();
        System.out.println("Errors " + counter);

        // Quick test with display
        // System.out.println("Add (2)");
        // iterator.add(2);
        // linkedList.printNodes();
        // System.out.println("Add (5)");
        // iterator.add(5);
        // linkedList.printNodes();
        // // to front
        // iterator = linkedList.listIterator();
        // System.out.println("Set and Add (8)");
        // iterator.add(8);
        // linkedList.printNodes();
        // number = (int)(iterator.next());
        // System.out.println("next -> " + number);
        // linkedList.printNodes();
        // iterator.add(11);
        // System.out.println("Add (11)");
        // linkedList.printNodes();
        // number = (int)(iterator.next());
        // System.out.println("next -> " + number);
        // linkedList.printNodes();
        // number = (int)(iterator.previous());
        // System.out.println("previous -> " + number);
        // linkedList.printNodes();
        // System.out.println("Remove ()");
        // iterator.remove();
        // linkedList.printNodes();
        // System.out.println("Remove ()");
        // iterator.remove();
        // linkedList.printNodes();
        // System.out.println("Remove ()");
        // iterator.remove();
        // linkedList.printNodes();
        // System.out.println("Remove ()");
        // iterator.remove();
        // linkedList.printNodes();


        // // Q 1
        // // point 1
        // System.out.println("Q 1\nLinked List Example!");

        // iterator.add(11);
        // iterator.add(22);
        // iterator.add(33);
        // iterator.add(44);

        // // point 2
        // System.out.println("Linked list data: " + linkedList);

        // // point 3 and 4
        // System.out.println("Add 55 to the beginning of the Linked List");
        // linkedList.addFirst(55);
        // System.out.println("Now the list contains: " + linkedList);

        // // 5 and 6, iterator still on the end
        // System.out.println("Add 66 to the end of the Linked List");
        // iterator.add(66);
        // System.out.println("Now the list contains: " + linkedList);

        // // 7, 8 => new iterator (2 x next) and set third
        // System.out.println("Add 99 at the 3rd location in the List");
        // iterator = linkedList.listIterator();
        // iterator.next();
        // iterator.next();
        // iterator.add(99);;
        // System.out.println("Now the list contains: " + linkedList);

        // // 9 => head of list
        // System.out.println("Display the first element on the list  (" + linkedList.getFirst() + ")");

        // // 10, using iterator find place with no next (last)
        // iterator = linkedList.listIterator();
        // number = 0;
        // while (iterator.hasNext()) {
        //     number = (int)iterator.next();
        // }
        // System.out.println("Display the final element on the list  (" + number + ")");

        // // 11, new iterator 3 x next and get fourth
        // iterator = linkedList.listIterator();
        // for (int i = 0; i < 3; i++)
        //     iterator.next();
        // number = (int)iterator.next();
        // System.out.println("Display the element at the 4th position on the list (" + number + ")");

        // //12, 13 remove element at the beginning of the list
        // iterator = linkedList.listIterator();
        // number = (int)iterator.next();
        // iterator.remove();
        // System.out.println("Remove the element at the beginning of the list: " + number);
        // System.out.println("Now the list contains: " + linkedList);
    
        // // 14 and 15 remove last one
        // iterator = linkedList.listIterator();
        // while (iterator.hasNext()) {
        //     number = (int)iterator.next();
        // }
        // iterator.remove();
        // System.out.println("Remove the element at the end of the list: " + number);
        // System.out.println("Now the list contains: " + linkedList);

        // // 16, 17 remove secound
        // iterator = linkedList.listIterator();
        // iterator.next();
        // number = (int)iterator.next();
        // iterator.remove();
        // System.out.println("Remove the element at the 2nd position on the list: " + number);
        // System.out.println("Now the list contains: " + linkedList);

        // // Q 2

        // number = linkedList.listLength();
        // System.out.println("\nQ 2\nList size = " + number);

    }
}
