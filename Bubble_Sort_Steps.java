import java.util.Arrays;

public class Bubble_Sort_Steps {
    // Bogdan Pasterak L00157106
    // Practical 1. Performance test of two bubble sort algorithms
    public static void main(String args[]){ 


        // Variable
        int [] numbers = {22, 11, 34, -5, 3, 40, 9, 16, 6};

        System.out.println("Array : " + Arrays.toString(numbers));  
        bubbleSort(numbers);
        System.out.println();

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
            System.out.println("Pass " + (pass + 1) + "  " + Arrays.toString(arr));  
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



        
}
