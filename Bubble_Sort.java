import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

class Start {  
    // Bogdan Pasterak L00157106
    // Practical 1. Performance test of two bubble sort algorithms
    public static void main(String args[]){ 


        // Variable
        int [] numbers;
        int [] answer;
        // int [] copyNumber;
        // int comp = 0;
        // ArrayList<Integer> numList;
        // ArrayList<Integer> copyNumList;

        System.out.println("\nBS -> Bubble Sort,  EBS ->Enhanced  Bubble Sort");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("| Data type  |   array   BS  | ArrayList  BS |   array  EBS  | ArrayList EBS |");
        System.out.println("|------------+---------------+---------------+---------------+---------------|");
        numbers = getRandomArray();
        answer = executeAlgorithms(numbers, arrayToArrayList(numbers));
        System.out.println(Arrays.toString(answer));
        System.out.println(getDisplayBigArray(numbers));
        System.out.println(getDisplayBigArrayList(arrayToArrayList(numbers)));


        // // Random distribution
        // numbers = getRandomArray();
        // System.out.println("\n  ---   Random distribution   ---");
        // System.out.println("Original array: " + getDisplayBigArray(numbers));  

        // copyNumber = Arrays.copyOf(numbers, numbers.length);
        // comp = bubbleSort(copyNumber);
        // System.out.println("\nAlghorytm \"Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted  array:  " + getDisplayBigArray(copyNumber));  

        // copyNumber = Arrays.copyOf(numbers, numbers.length);
        // comp = enhancedBubbleSort(copyNumber);
        // System.out.println("\nAlghorytm \"Enhanced Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted  array:  " + getDisplayBigArray(copyNumber));  


        // // Sorted numbers
        // numbers = getSortedArray();
        // System.out.println("\n  ---  Sorted numbers   ---");
        // System.out.println("Original array: " + getDisplayBigArray(numbers));  

        // copyNumber = Arrays.copyOf(numbers, numbers.length);
        // comp = bubbleSort(copyNumber);
        // System.out.println("\nAlghorytm \"Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted  array:  " + getDisplayBigArray(copyNumber));  

        // copyNumber = Arrays.copyOf(numbers, numbers.length);
        // comp = enhancedBubbleSort(copyNumber);
        // System.out.println("\nAlghorytm \"Enhanced Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted  array:  " + getDisplayBigArray(copyNumber));  


        // // Invert numbers
        // numbers = getInvertArray();
        // System.out.println("\n  ---  Invert numbers   ---");
        // System.out.println("Original array: " + getDisplayBigArray(numbers));  

        // copyNumber = Arrays.copyOf(numbers, numbers.length);
        // comp = bubbleSort(copyNumber);
        // System.out.println("\nAlghorytm \"Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted  array:  " + getDisplayBigArray(copyNumber));  

        // copyNumber = Arrays.copyOf(numbers, numbers.length);
        // comp = enhancedBubbleSort(copyNumber);
        // System.out.println("\nAlghorytm \"Enhanced Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted  array:  " + getDisplayBigArray(copyNumber));  


        // System.out.println("\n  ------  ArrayList   ------");

        // // Random distribution
        // numList = getRandomArrayList();
        // System.out.println("\n  ---   Random distribution   ---");
        // System.out.println("Original list: " + getDisplayBigArrayList(numList));  

        // copyNumList = new ArrayList<>(numList);
        // comp = bubbleSortList(copyNumList);
        // System.out.println("\nAlghorytm \"Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted   list:  " + getDisplayBigArrayList(copyNumList));  

        // copyNumList = new ArrayList<>(numList);
        // comp = enhancedBubbleSortList(copyNumList);
        // System.out.println("\nAlghorytm \"Enhanced Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted   list:  " + getDisplayBigArrayList(copyNumList));  

        // // Sorted numbers
        // numList = getSortedList();
        // System.out.println("\n  ---  Sorted numbers   ---");
        // System.out.println("Original list: " + getDisplayBigArrayList(numList));  

        // copyNumList = new ArrayList<>(numList);
        // comp = bubbleSortList(copyNumList);
        // System.out.println("\nAlghorytm \"Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted   list:  " + getDisplayBigArrayList(copyNumList));  

        // copyNumList = new ArrayList<>(numList);
        // comp = enhancedBubbleSortList(copyNumList);
        // System.out.println("\nAlghorytm \"Enhanced Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted   list:  " + getDisplayBigArrayList(copyNumList));  


        // // Invert numbers
        // numList = getInvertList();
        // System.out.println("\n  ---  Invert numbers   ---");
        // System.out.println("Original list: " + getDisplayBigArrayList(numList));  

        // copyNumList = new ArrayList<>(numList);
        // comp = bubbleSortList(copyNumList);
        // System.out.println("\nAlghorytm \"Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted   list:  " + getDisplayBigArrayList(copyNumList));  

        // copyNumList = new ArrayList<>(numList);
        // comp = enhancedBubbleSortList(copyNumList);
        // System.out.println("\nAlghorytm \"Enhanced Bubble Sort\" , Number of comparisons: " + comp);
        // System.out.println("Sorted   list:  " + getDisplayBigArrayList(copyNumList));  


    }  

    public static int[] executeAlgorithms(int[] arr, ArrayList<Integer> list) {

        int[] answer = new int[12];
        long start, stop;
        int[] result;

        // Bubble Sort array
        start = System.currentTimeMillis();
        result = bubbleSortParam(arr);
        stop = System.currentTimeMillis();
        answer[0] = result[0];
        answer[1] = result[1];
        answer[2] = (int)(stop - start);
        // Bubble Sort
        // Array (0-> comparisons, 1-> swap, 2-> time)
        // ArrayList (3-> comparisons, 4-> swap, 5-> time)
        // Enhanced Bubble Sort
        // Array (6-> comparisons, 7-> swap, 8-> time)
        // ArrayList (9-> comparisons, 10-> swap, 11-> time)
    

        return answer;
    }

    // Algorithm Bubble Sort
    public static int bubbleSort (int [] arr) {

        int comparisons = 0;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
        return comparisons;
    }

    // Algorithm Bubble Sort
    public static int[] bubbleSortParam (int [] arr) {

        int comparisons = 0;
        int swaps = 0;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swaps++;
                    swap(arr, i, i + 1);
                }
            }
        }
        int[] answer = {comparisons, swaps};
        return answer;
    }


    // Algorithm Enhanced Bubble Sort
    public static int enhancedBubbleSort (int [] arr) {

        int comparisons = 0;
        boolean sorted;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            sorted = true;
            for (int i = 0; i < arr.length - 1 - pass; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return comparisons;
    }

    // Version for ArrayList
    // Algorithm Bubble Sort
    public static int bubbleSortList (ArrayList<Integer> arr) {

        int comparisons = 0;

        for (int pass = 0; pass < arr.size() - 1; pass++) {
            for (int i = 0; i < arr.size() - 1; i++) {
                comparisons++;
                if (arr.get(i) > arr.get(i + 1)) {
                    swapList(arr, i, i + 1);
                }
            }
        }
        return comparisons;
    }


    // Algorithm Enhanced Bubble Sort
    public static int enhancedBubbleSortList (ArrayList<Integer> arr) {

        int comparisons = 0;
        boolean sorted;

        for (int pass = 0; pass < arr.size() - 1; pass++) {
            sorted = true;
            for (int i = 0; i < arr.size() - 1 - pass; i++) {
                comparisons++;
                if (arr.get(i) > arr.get(i + 1)) {
                    swapList(arr, i, i + 1);
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        return comparisons;
    }



    // swap two element in array
    public static void swap(int [] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // swap two element in ArrayList
    public static void swapList(ArrayList<Integer> arr, int index1, int index2) {
        int temp;
        temp = arr.get(index1);
        arr.set(index1, arr.get(index2));
        arr.set(index2, temp);
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

