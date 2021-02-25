package Quadratic_Sorts;

import java.util.ArrayList;

// Bogdan Pasterak L00157106
// Practical 1. Algorythm Bubble Sort
// 25/02/2021

public class Bubble_Sort {  

    // Algorithm Enhanced Bubble Sort
    // @param reference of array
    // @return modified arrays
    // @return array[2] {number of comparisons and swaps}
    public static int[] bubbleSortArray (int [] arr) {

        int comparisons = 0;
        int swaps = 0;
        boolean sorted;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            sorted = true;
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swaps++;
                    Swap.swap(arr, i, i + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

    // Version for ArrayList
    public static int[] BubbleSortList (ArrayList<Integer> list) {

        int comparisons = 0;
        int swaps = 0;
        boolean sorted;

        for (int pass = 0; pass < list.size() - 1; pass++) {
            sorted = true;
            for (int i = 0; i < list.size() - 1 - pass; i++) {
                comparisons++;
                if (list.get(i) > list.get(i + 1)) {
                    swaps++;
                    Swap.swapList(list, i, i + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

}

