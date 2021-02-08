import java.util.Arrays;

public class Sort_Steps {
    // Bogdan Pasterak L00157106
    // Practical 1. Performance test of two bubble sort,
    // insertion and selection sort algorithms
    public static void main(String args[]) {

        // Variable
        // int[] numbers = { 22, 11, 34, -5, 3, 40, 9, 16, 6 };
        int[] numbers = { 9,8,7,6,5,4,3,2,1 };

        System.out.println("Array : " + Arrays.toString(numbers));
        bubbleSort(numbers);
        // enhancedBubbleSort(numbers);
        // insertionSort(numbers);
        // selectionSort(numbers);
        System.out.println();

    }

    // Algorithm Bubble Sort
    public static int bubbleSort(int[] arr) {

        int comparisons = 0;

        for (int pass = 0; pass < arr.length - 1; pass++) {
            for (int i = 0; i < arr.length - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
            System.out.println("Pass " + (pass + 1) + "  " + Arrays.toString(arr));
        }
        return comparisons;
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
            System.out.println("Pass " + (pass + 1) + "  " + Arrays.toString(arr));
            if (sorted) {
                break;
            }
        }
        return comparisons;
    }

    public static int insertionSort(int[] list) {

        int comparisons = 0;

        for (int i = 1; i < list.length; i++) {
            int next = list[i];
            // find the insertion location while moving all larger element up
            int j = i;
            comparisons++;
            while (j > 0 && list[j - 1] > next) {
                comparisons++;
                list[j] = list[j - 1];
                j--;
            }
            // insert the element
            list[j] = next;
            System.out.println("Pass " + (i) + "  " + Arrays.toString(list));
        }
        return comparisons;
    }

    public static int selectionSort(int[] arr) {

        int comparisons = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minimum = i;
                        
            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;
                if (arr[j] < arr[minimum])
                    minimum = j;
            }
            swap(arr, i, minimum);
            System.out.println("Pass " + (i + 1) + "  " + Arrays.toString(arr));
        }
        return comparisons;
    }

    // swap two element in array
    public static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
