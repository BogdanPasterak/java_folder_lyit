package Quadratic_Sorts;

import java.util.ArrayList;

// Bogdan Pasterak L00157106
// Practical 3. Algorithms Insertion Sort 
// 25/02/2021

public class Insertion_Sort implements Sort {

    // Algorithm Insertion Sort
    @Override
    public int[] sortArray(int[] arr) {

        int comparisons = 0;
        int shifts = 0;

        for (int pass = 1; pass < arr.length; pass++) {
            int next = arr[pass];
            // find the insertion location while moving all larger element up
            int i = pass;
            // minimum one comparison (while loop)
            comparisons++;
            while (i > 0 && arr[i - 1] > next) {
                comparisons++;
                shifts++;
                Swap.shift(arr, i, arr[i - 1]);
                i--;
            }
            // insert the element if not the same
            if ( i != pass) {
                shifts++;
                Swap.shift(arr, i, next);
            }
        }
        int[] answer = {comparisons, shifts};
        return answer;
    }

    // Version for ArrayList
    @Override
    public int[] sortList(ArrayList<Integer> list) {

        int comparisons = 0;
        int shifts = 0;

        for (int pass = 1; pass < list.size(); pass++) {
            int next = list.get(pass);
            // find the insertion location while moving all larger element up
            int i = pass;
            // minimum one comparison (while loop)
            comparisons++;
            while (i > 0 && list.get(i - 1) > next) {
                comparisons++;
                shifts++;
                Swap.shiftList(list, i, list.get(i - 1));
                i--;
            }
            // insert the element if not the same
            if ( i != pass) {
                shifts++;
                Swap.shiftList(list, i, next);
            }
        }
        int[] answer = {comparisons, shifts};
        return answer;
    }


}
