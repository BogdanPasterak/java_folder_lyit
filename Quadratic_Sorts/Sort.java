package Quadratic_Sorts;

import java.util.ArrayList;

interface Sort {
    // Algorithm Sort Array of int
    // @param reference of array
    // @return modified arrays
    // @return array[2] {number of comparisons and swaps}
    public int[] sortArray(int [] arr);

    // ArrayList version
    public int[] sortList(ArrayList<Integer> list);

    // time-measuring version
    public void sortArrayTime(int [] arr);
    public void sortListTime(ArrayList<Integer> list);

}