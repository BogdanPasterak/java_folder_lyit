package Fibonacci;

public class Fibonacci_Test {
    public static void main(String[] args) {

        int fib;
        for (int i = 1; i <= 20; i++) {
            fib = Fibonacci.fibonacci(i);
            System.out.println("Fibonacci number " + i + " = " + fib );
        }
    }
}
