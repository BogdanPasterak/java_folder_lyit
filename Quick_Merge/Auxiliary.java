package Quick_Merge;

import java.util.Arrays;
import java.util.Random;

public class Auxiliary {
        // generate arrays (10 000 elements)
    // random distribution
    public static int[] getRandomArray(int size) {
        Random rn = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(arr.length);
        }
        return arr;
    }

    // sorted number
    public static int[] getSortedArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    // invert number
    public static int[] getInvertArray(int size) {
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - 1 - i;
        }
        return arr;
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


}
