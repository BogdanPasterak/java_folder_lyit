package Stack_Queue;

public class Queue_Test {
    public static void main(String[] args) {

        Queue queue = new Queue(5);

        try {
            //add
            System.out.println(queue);
            queue.insert('b');
            System.out.println("Output 1 => " + queue);
            queue.insert('a');
            System.out.println("Output 2 => " + queue);
            queue.insert('c');
            System.out.println("Output 3 => " + queue);
            queue.insert('d');
            System.out.println("Output 4 => " + queue);
            queue.insert('Z');
            System.out.println("Output 5 => " + queue);
            //test Exception owerfolw
            // queue.insert('A');
            // System.out.println("Output Error => " + queue);
            // top
            char top = queue.queueTop();
            System.out.println("Output 6 => queueTop: [" + top + "]");
            System.out.println("Output 7 => " + queue);
            // remove
            char removed = queue.remove();            
            System.out.println("Output 8 => remove: [" + removed + "]");
            // final
            System.out.println("Output 9 => " + queue);
            int size = queue.size();
            System.out.println("Output 10 => Final Size of Queue = " + size);
            // more test
            // queue.insert('Q');
            // System.out.println("Output 11 => " + queue);
            // removed = queue.remove();
            // System.out.println("Output 12 => remove: [" + removed + "]");
            // System.out.println("Output 13 => " + queue);
            // removed = queue.remove();
            // System.out.println("Output 14 => remove: [" + removed + "]");
            // removed = queue.remove();
            // System.out.println("Output 15 => remove: [" + removed + "]");
            // removed = queue.remove();
            // System.out.println("Output 16 => remove: [" + removed + "]");
            // removed = queue.remove();
            // System.out.println("Output 17 => remove: [" + removed + "]");
            // System.out.println("Output 18 => " + queue);
            // // underflow
            // removed = queue.remove();
        } catch (Exception e) {
            System.out.println("Exception => " +  e.getMessage());
        }

    }
}
