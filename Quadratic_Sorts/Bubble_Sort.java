package Quadratic_Sorts;

import java.util.ArrayList;

// Bogdan Pasterak L00157106
// Practical 1. Algorythm Bubble Sort
// 25/02/2021

public class Bubble_Sort implements Sort {  

    // Algorithm Enhanced Bubble Sort
    // @param reference of array
    // @return modified arrays
    // @return array[2] {number of comparisons and swaps}
    @Override
    public int[] sortArray (int [] arr) {

        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swaps++;
                    Swap.swap(arr, i, i + 1);
                }
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

    // Version for ArrayList
    @Override
    public int[] sortList (ArrayList<Integer> list) {

        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < list.size() - 1; pass++) {
            for (int i = 0; i < list.size() - 1; i++) {
                comparisons++;
                if (list.get(i) > list.get(i + 1)) {
                    swaps++;
                    Swap.swapList(list, i, i + 1);
                }
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

}

