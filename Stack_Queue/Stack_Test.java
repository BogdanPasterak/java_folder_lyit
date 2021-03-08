package Stack_Queue;

public class Stack_Test {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        try {
            System.out.println(stack);
            stack.push(42);
            System.out.println("Output 1 => " + stack);
            stack.push(66);
            System.out.println("Output 2 => " + stack);
            stack.push(99);
            System.out.println("Output 3 => " + stack);
            stack.pop();
            System.out.println("Output 4 => " + stack);
            stack.pop();
            System.out.println("Output 5 => " + stack);
            stack.pop();
            System.out.println("Output 6 => " + stack);
            stack.pop();
        } catch (Exception e) {
            System.out.println("Output 7 => " +  e.getMessage());
        }

    }
}
