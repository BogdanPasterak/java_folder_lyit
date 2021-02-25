package Quadratic_Sorts;

import java.util.ArrayList;

// Bogdan Pasterak L00157106
// Practical 3. Algorithms Selection Sort 
// 25/02/2021

public class Selection_Sort {

    // Algorithm Selection Sort
    public static int[] selectionSort(int[] arr) {

        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            int minimum = pass;
                        
            for (int i = pass + 1; i < arr.length; i++) {
                comparisons++;
                if (arr[i] < arr[minimum])
                    minimum = i;
            }
            if (pass != minimum) {
                swaps++;
                Swap.swap(arr, pass, minimum);
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

    // Version for ArrayList
    public static int[] selectionSortList(ArrayList<Integer> arr) {

        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < arr.size() - 1; pass++) {
            int minimum = pass;
                        
            for (int i = pass + 1; i < arr.size(); i++) {
                comparisons++;
                if (arr.get(i) < arr.get(minimum))
                    minimum = i;
            }
            if (pass != minimum) {
                swaps++;
                Swap.swapList(arr, pass, minimum);
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

}
