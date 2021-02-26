package Recursion;

public class Factorial1 {
    public static int factorial(int val) {

        // 1! and 0! = 1
        if ( val <= 1) {
            return 1;
        }
        // recursion 
        return (val * factorial( val - 1 ));
    }
}
