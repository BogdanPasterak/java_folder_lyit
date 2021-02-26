package Prac_1_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Bogdan Pasterak L00157106
// Practical 2. Performance test of insertion and selection sort algorithms
// 08/02/2021

public class Insertion_Selection {

    public static void main(String args[]){ 


        // Variable
        int [] numbers;
        int [] answer;
    
        firstLine();
        numbers = getRandomArray();
        answer = executeAlgorithms(numbers);
        addLine("Random Dist.", answer);

        numbers = getSortedArray();
        answer = executeAlgorithms(numbers);
        addLine("   Sorted   ", answer);

        numbers = getInvertArray();
        answer = executeAlgorithms(numbers);
        addLine("   Invert   ", answer);

    }  

    private static void firstLine() {
        System.out.println("\nSel -> Selection Sort,   Ins -> Insertion Sort");
        System.out.println("c -> comparisons, s -> swaps(Sel) or shifts(Ins), t -> Time\n");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("| Data type  |   array  Sel  | ArrayList Sel |   array  Ins  | ArrayList Ins |");
        System.out.println("|------------+---------------+---------------+---------------+---------------|");
    }

    private static void addLine(String type, int[] answer) {
        String s;
        // comparisons
        s = "|            |";
        s += " c= " + formatNumber(answer[0]) + " |";
        s += " c= " + formatNumber(answer[3]) + " |";
        s += " c= " + formatNumber(answer[6]) + " |";
        s += " c= " + formatNumber(answer[9]) + " |";
        System.out.println(s);
        // swaps
        s = "|" + type + "|";
        s += " s= " + formatNumber(answer[1]) + " |";
        s += " s= " + formatNumber(answer[4]) + " |";
        s += " s= " + formatNumber(answer[7]) + " |";
        s += " s= " + formatNumber(answer[10]) + " |";
        System.out.println(s);
        // swaps
        s = "|            |";
        s += " t= " + formatNumber(answer[2]) + " |";
        s += " t= " + formatNumber(answer[5]) + " |";
        s += " t= " + formatNumber(answer[8]) + " |";
        s += " t= " + formatNumber(answer[11]) + " |";
        System.out.println(s);
        System.out.println("|------------+---------------+---------------+---------------+---------------|");
    }

    private static String formatNumber(int num) {
        String s = String.format("%8d", num);
        s = s.substring(0, 2) + " " + s.substring(2, 5) + " " + s.substring(5);
        return s;
    }

    public static int[] executeAlgorithms(int[] arrIn) {

        int[] answer = new int[12];
        long start, stop;
        int[] result;
        int[] arr;
        ArrayList<Integer> list;

        // Selection Sort array
        arr = Arrays.copyOf(arrIn, arrIn.length);
        start = System.currentTimeMillis();
        result = selectionSort(arr);
        stop = System.currentTimeMillis();
        answer[0] = result[0];
        answer[1] = result[1];
        answer[2] = (int)(stop - start);

        // Selection Sort ArrayList
        list = arrayToArrayList(arrIn);
        start = System.currentTimeMillis();
        result = selectionSortList(list);
        stop = System.currentTimeMillis();
        answer[3] = result[0];
        answer[4] = result[1];
        answer[5] = (int)(stop - start);
        

        // Insertion Sort array
        arr = Arrays.copyOf(arrIn, arrIn.length);
        start = System.currentTimeMillis();
        result = insertionSort(arr);
        stop = System.currentTimeMillis();
        answer[6] = result[0];
        answer[7] = result[1];
        answer[8] = (int)(stop - start);
    
        // Insertion Sort ArrayList
        list = arrayToArrayList(arrIn);
        start = System.currentTimeMillis();
        result = insertionSortList(list);
        stop = System.currentTimeMillis();
        answer[9] = result[0];
        answer[10] = result[1];
        answer[11] = (int)(stop - start);
    
        return answer;
    }

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
                swap(arr, pass, minimum);
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }

    // Algorithm Insertion Sort
    public static int[] insertionSort(int[] arr) {

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
                shift(arr, i, arr[i - 1]);
                i--;
            }
            // insert the element if not the same
            if ( i != pass) {
                shifts++;
                shift(arr, i, next);
            }
        }
        int[] answer = {comparisons, shifts};
        return answer;
    }

    // Version for ArrayList

    // Algorithm Selection Sort
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
                swapList(arr, pass, minimum);
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }


    // Algorithm Insertion Sort 
    public static int[] insertionSortList(ArrayList<Integer> arr) {

        int comparisons = 0;
        int shifts = 0;

        for (int pass = 1; pass < arr.size(); pass++) {
            int next = arr.get(pass);
            // find the insertion location while moving all larger element up
            int i = pass;
            // minimum one comparison (while loop)
            comparisons++;
            while (i > 0 && arr.get(i - 1) > next) {
                comparisons++;
                shifts++;
                shiftList(arr, i, arr.get(i - 1));
                i--;
            }
            // insert the element if not the same
            if ( i != pass) {
                shifts++;
                shiftList(arr, i, next);
            }
        }
        int[] answer = {comparisons, shifts};
        return answer;
    }


    // swap two element in array
    public static void swap(int [] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // shift element to position in array
    public static void shift(int [] arr, int index, int value) {
        arr[index] = value;
    }

    // swap two element in ArrayList
    public static void swapList(ArrayList<Integer> arr, int index1, int index2) {
        Integer temp;
        temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
    }

    // shift element to position in array
    public static void shiftList(ArrayList<Integer> arr, int index, Integer value) {
        arr.set(index, value);
    }

    // generate arrays (10 000 elements)
    // random distribution
    public static int[] getRandomArray() {
        Random rn = new Random();
        int [] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(arr.length);
        }
        return arr;
    }

    // sorted number
    public static int[] getSortedArray() {
        int [] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // invert number
    public static int[] getInvertArray() {
        int [] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
        }
        return arr;
    }

    // generate ArrayLists (10 000 elements)
    // random distribution
    public static ArrayList<Integer> getRandomArrayList() {
        Random rn = new Random();
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10000; i++) {
            arr.add(rn.nextInt(10000));
        }
        return arr;
    }

    // sorted number
    public static ArrayList<Integer> getSortedList() {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10000; i++) {
            arr.add(i);
        }
        return arr;
    }

    // invert number
    public static ArrayList<Integer> getInvertList() {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10000; i++) {
            arr.add(10000 - 1 - i);
        }
        return arr;
    }

    public static ArrayList<Integer> arrayToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            list.add(i);
        };
        return list;
    }

    // auxiliary function to display large arrays 
    public static String getDisplayBigArray (int[] arr) {
        String s = "";

        if (arr.length < 30) {
            s = Arrays.toString(arr);
        } else {
            s += "[" + arr[0] + ", " + arr[1] + ", " + arr[2] + ", ";
            s += arr[3] + ", " + arr[4] + ", " + arr[5] + ", " + arr[6] + ",   ...   ";
            s += arr[arr.length / 2 - 2] + ", " + arr[arr.length / 2 - 1] + ", ";
            s += arr[arr.length / 2] + ", " + arr[arr.length / 2 + 1] + ",   ...   ";
            s += arr[arr.length - 6] + ", " + arr[arr.length - 5] + ", ";
            s += arr[arr.length - 4] + ", " + arr[arr.length - 3] + ", ";
            s += arr[arr.length - 2] + ", " + arr[arr.length - 1] + "]";
        }
        return s;
    } 

    public static String getDisplayBigArrayList (ArrayList<Integer> arr) {
        // convert ArrayList to int[]
        int[] ar = arr.stream().mapToInt(i -> i).toArray();

        return getDisplayBigArray(ar);
    }

}
