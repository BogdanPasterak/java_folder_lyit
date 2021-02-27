package Quadratic_Sorts;

import java.util.ArrayList;

// Bogdan Pasterak L00157106
// Practical 3. Algorithms Selection Sort 
// 25/02/2021

public class Selection_Sort implements Sort {

    // Algorithm Selection Sort
    @Override
    public int[] sortArray(int[] arr) {

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
    @Override
    public int[] sortList(ArrayList<Integer> list) {

        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < list.size() - 1; pass++) {
            int minimum = pass;
                        
            for (int i = pass + 1; i < list.size(); i++) {
                comparisons++;
                if (list.get(i) < list.get(minimum))
                    minimum = i;
            }
            if (pass != minimum) {
                swaps++;
                Swap.swapList(list, pass, minimum);
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

    @Override
    public void sortArrayTime(int[] arr) {

        for (int pass = 0; pass < arr.length - 1; pass++) {
            int minimum = pass;
                        
            for (int i = pass + 1; i < arr.length; i++) {
                if (arr[i] < arr[minimum])
                    minimum = i;
            }
            if (pass != minimum) {
                Swap.swap(arr, pass, minimum);
            }
        }
    }

    @Override
    public void sortListTime(ArrayList<Integer> list) {

        for (int pass = 0; pass < list.size() - 1; pass++) {
            int minimum = pass;
                        
            for (int i = pass + 1; i < list.size(); i++) {
                if (list.get(i) < list.get(minimum))
                    minimum = i;
            }
            if (pass != minimum) {
                Swap.swapList(list, pass, minimum);
            }
        }
    }
    
}
