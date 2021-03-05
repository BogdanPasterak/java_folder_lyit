package Fibonacci;

public class Fibonacci {
    public static int fibonacci(int element) {
        // F0 = 0, F1 = 1
        // an exit condition
        if (element < 1) {
            return 0;
        }
        else if (element == 1) {
            return 1;
        }
        // Fn = Fn-1 + Fn-2
        // double recursive call (head type)
        return fibonacci(element - 1) + fibonacci(element - 2);
    }

}
