package Test_Origin_List;

import java.util.*;

public class List_Test {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        Iterator<Integer> it1 = list.iterator();
        Iterator<Integer> it2 = list.iterator();

        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it1.next());
        System.out.println(it2.next());
        list.add(1, 22);
        System.out.println(list);
        System.out.println(it2.next());
        // System.out.println(it2.next());
        it1.remove();
        System.out.println(it2.next());
        it2.remove();
        // it1.remove();
        System.out.println(list);

    }
}
