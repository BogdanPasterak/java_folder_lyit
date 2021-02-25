package Quadratic_Sorts;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubble_Sort_Test {
    public static void main(String[] args) {
        int[] inv = {5,4,3,2,1,0};
        int[] rnd = {2,5,1,0,3,4};
        int[] test;

        Sort bubble = new Bubble_Sort();
        StopWatch time = new StopWatch(true);

        int startInv = 0;
        int startRnd = 0;

        for (int i = 0; i < 5; i++) {

            test = Arrays.copyOf(rnd, 6);
            time.start();
            bubble.sortArray(test);
            time.stop();
            int stopRnd = (int) time.getElapsedTime();
            System.out.println("Random = " + stopRnd + "  change = " + (stopRnd - startRnd));
            startRnd = stopRnd;        

            test = Arrays.copyOf(inv, 6);
            time.start();
            bubble.sortArray(test);
            time.stop();
            int stopInv = (int) time.getElapsedTime();
            System.out.println("Invert = " + stopInv + "  change = " + (stopInv - startInv) );
            startInv = stopInv;        
    
        }


    }
}
