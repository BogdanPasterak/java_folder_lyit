package Quadratic_Sorts;

import java.util.ArrayList;

public class Swap {

    // swap two element in array
    protected static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // swap two element in ArrayList
    protected static void swapList(ArrayList<Integer> arr, int index1, int index2) {
        int temp;
        temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    // shift element to position in array
    protected static void shift(int[] arr, int index, int value) {
        arr[index] = value;
    }

    // shift element to position in ArrayList
    public static void shiftList(ArrayList<Integer> arr, int index, Integer value) {
        arr.set(index, value);
    }

}
