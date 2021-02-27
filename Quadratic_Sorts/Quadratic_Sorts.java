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
        addLine("Random", answer);

        numbers = getSortedArray();
        answer = executeAlgorithms(numbers);
        addLine("Sorted", answer);

        numbers = getInvertArray();
        answer = executeAlgorithms(numbers);
        addLine("Invert", answer);

    }
    
    // executes algorithms on a given array
    // @param array of integer
    // @return array of swaps, comparison and times of executed algorithms
    public static int[] executeAlgorithms(int[] arrIn) {

        int[] answer = new int[24];
        StopWatch time = new StopWatch(true);
        int[] result;
        // copies for sort
        int[] arr;
        ArrayList<Integer> list;
        Sort[] algorythms = {new Bubble_Sort(), new Enhanched_Sort(), new Selection_Sort(), new Insertion_Sort()};
        long averageTime = 0;
        int repete = 10;

        int index = 0;
        for (Sort algorythm : algorythms) {
            
            // Sort Array
            arr = Arrays.copyOf(arrIn, arrIn.length);
            result = algorythm.sortArray(arr);
            averageTime = 0;
            // repete tests , ignored first one
            for (int i = 0; i <= repete; i++) {
                time.start();
                algorythm.sortArrayTime(arr);
                time.stop();
                if ( i > 0)
                    averageTime += time.getElapsedTime();
            }
            answer[index] = result[0];
            answer[index+1] = result[1];
            answer[index+2] = (int) (averageTime / (repete *1000) );   // micro secound
    
            // Sort ArrayList
            list = arrayToArrayList(arrIn);
            result = algorythm.sortList(list);
            averageTime = 0;
            // repete tests , ignored first one
            for (int i = 0; i <= repete; i++) {
                time.start();
                algorythm.sortListTime(list);
                time.stop();
                if ( i > 0)
                    averageTime += time.getElapsedTime();
            }
            answer[index+3] = result[0];
            answer[index+4] = result[1];
            answer[index+5] = (int) (averageTime / (repete *1000) );   // micro secound
            index += 6;
        }

        return answer;
    }

    // Header of table
    private static void firstLine() {
        System.out.println("\nBub -> Bubble Sort, Enh -> Enhanched B. Sort,   Sel -> Selection Sort,   Ins -> Insertion Sort");
        System.out.println("c -> comparisons, s -> swaps(Sel) or shifts(Ins), t -> elapsed time ( microseconds )\n");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        System.out.println("| Data | array Bub  | ArrayL Bub | array Enh  | ArrayL Enh | array Sel  | ArrayL Sel | array Ins  | ArrayL Ins |");
        System.out.println("|------+------------+------------+------------+------------+------------+------------+------------+------------|");
    }

    // row of table
    private static void addLine(String type, int[] answer) {
        String s;
        // comparisons
        s = "|      |";
        for (int i = 0; i < answer.length; i += 3)
            s += " c=" + formatNumber(answer[i]) + " |";
        System.out.println(s);
        // swaps
        s = "|" + type + "|";
        for (int i = 1; i < answer.length; i += 3)
            s += " s=" + formatNumber(answer[i]) + " |";
        System.out.println(s);
        // elapsed time
        s = "|      |";
        for (int i = 2; i < answer.length; i += 3)
            s += " t=" + formatNumber(answer[i]) + " |";
        System.out.println(s);
        System.out.println("|------+------------+------------+------------+------------+------------+------------+------------+------------|");
    }

    // number formatting up to 10 characters with gaps
    private static String formatNumber(int num) {
        String s = String.format("%8d", num);
        // s = s.substring(0, 2) + " " + s.substring(2, 5) + " " + s.substring(5);
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
