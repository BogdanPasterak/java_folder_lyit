package Quadratic_Sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

// Bogdan Pasterak L00157106
// Practical 3. Comparison of quadratic type sorting algorithms
// 25/02/2021

public class Quadratic_Sorts {

    public static void main(String args[]) {

        // Variable
        int[] numbers;
        int[] answer;

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
    
    // executes algorithms on a given array
    // @param array of integer
    // @return array of swaps, comparison and times of executed algorithms
    public static int[] executeAlgorithms(int[] arrIn) {

        int[] answer = new int[18];
        StopWatch time = new StopWatch(true);
        int[] result;
        // copies for sort
        int[] arr;
        ArrayList<Integer> list;
        Sort bubble = new Bubble_Sort();
        Sort selection = new Selection_Sort();
        Sort insertion = new Insertion_Sort();


        // Bubble Sort array
        arr = Arrays.copyOf(arrIn, arrIn.length);
        time.start();
        result = bubble.sortArray(arr);
        time.stop();
        answer[0] = result[0];
        answer[1] = result[1];
        answer[2] = (int) (time.getElapsedTime() / 1000);   // micro secound

        // Bubble Sort ArrayList
        list = arrayToArrayList(arrIn);
        time.start();
        result = bubble.sortList(list);
        time.stop();
        answer[3] = result[0];
        answer[4] = result[1];
        answer[5] = (int) (time.getElapsedTime() / 1000);


        // Selection Sort array
        arr = Arrays.copyOf(arrIn, arrIn.length);
        time.start();
        result = selection.sortArray(arr);
        time.stop();
        answer[6] = result[0];
        answer[7] = result[1];
        answer[8] = (int) (time.getElapsedTime() / 1000);

        // Selection Sort ArrayList
        list = arrayToArrayList(arrIn);
        time.start();
        result = selection.sortList(list);
        time.stop();
        answer[9] = result[0];
        answer[10] = result[1];
        answer[11] = (int) (time.getElapsedTime() / 1000);

        // Insertion Sort array
        arr = Arrays.copyOf(arrIn, arrIn.length);
        time.start();
        result = insertion.sortArray(arr);
        time.stop();
        answer[12] = result[0];
        answer[13] = result[1];
        answer[14] = (int) (time.getElapsedTime() / 1000);


        // Insertion Sort ArrayList
        list = arrayToArrayList(arrIn);
        time.start();
        result = insertion.sortList(list);
        time.stop();
        answer[15] = result[0];
        answer[16] = result[1];
        answer[17] = (int) (time.getElapsedTime() / 1000);

        return answer;
    }

    // Header of table
    private static void firstLine() {
        System.out.println("\nBub -> Bubble Sort,   Sel -> Selection Sort,   Ins -> Insertion Sort");
        System.out.println("c -> comparisons, s -> swaps(Sel) or shifts(Ins), t -> elapsed time ( microseconds )\n");
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("| Data type  |   array  Bub  | ArrayList Bub |   array  Sel  | ArrayList Sel |   array  Ins  | ArrayList Ins |");
        System.out.println("|------------+---------------+---------------+---------------+---------------+---------------+---------------|");
    }

    // row of table
    private static void addLine(String type, int[] answer) {
        String s;
        // comparisons
        s = "|            |";
        s += " c= " + formatNumber(answer[0]) + " |";
        s += " c= " + formatNumber(answer[3]) + " |";
        s += " c= " + formatNumber(answer[6]) + " |";
        s += " c= " + formatNumber(answer[9]) + " |";
        s += " c= " + formatNumber(answer[12]) + " |";
        s += " c= " + formatNumber(answer[15]) + " |";
        System.out.println(s);
        // swaps
        s = "|" + type + "|";
        s += " s= " + formatNumber(answer[1]) + " |";
        s += " s= " + formatNumber(answer[4]) + " |";
        s += " s= " + formatNumber(answer[7]) + " |";
        s += " s= " + formatNumber(answer[10]) + " |";
        s += " s= " + formatNumber(answer[13]) + " |";
        s += " s= " + formatNumber(answer[16]) + " |";
        System.out.println(s);
        // elapsed time
        s = "|            |";
        s += " t= " + formatNumber(answer[2]) + " |";
        s += " t= " + formatNumber(answer[5]) + " |";
        s += " t= " + formatNumber(answer[8]) + " |";
        s += " t= " + formatNumber(answer[11]) + " |";
        s += " t= " + formatNumber(answer[14]) + " |";
        s += " t= " + formatNumber(answer[17]) + " |";
        System.out.println(s);
        System.out.println("|------------+---------------+---------------+---------------+---------------+---------------+---------------|");
    }

    // number formatting up to 10 characters with gaps
    private static String formatNumber(int num) {
        String s = String.format("%8d", num);
        s = s.substring(0, 2) + " " + s.substring(2, 5) + " " + s.substring(5);
        return s;
    }


    // generate arrays (10 000 elements)
    // random distribution
    public static int[] getRandomArray() {
        Random rn = new Random();
        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(arr.length);
        }
        return arr;
    }

    // sorted number
    public static int[] getSortedArray() {
        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // invert number
    public static int[] getInvertArray() {
        int[] arr = new int[10000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
        }
        return arr;
    }

    // ArrayList from array
    public static ArrayList<Integer> arrayToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : arr) {
            list.add(i);
        }
        return list;
    }

    // auxiliary function to display large arrays
    public static String getDisplayBigArray(int[] arr) {
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

    public static String getDisplayBigArrayList(ArrayList<Integer> arr) {
        // convert ArrayList to int[]
        int[] ar = arr.stream().mapToInt(i -> i).toArray();

        return getDisplayBigArray(ar);
    }

}
