package Quick_Merge;

import java.util.Arrays;

public class Mergesort_Test {
    public static void main(String[] args) {
		// Get a random generated array
		int numbers = 1000;
		int[] randomArray = Auxiliary.getRandomArray(numbers);
		int[] sortedArray = Auxiliary.getSortedArray(numbers);
		int[] invertArray = Auxiliary.getInvertArray(numbers);
		int[] testArray;
		long avarge;
		int trials = 10;

		StopWatch time = new StopWatch(true);

		// Random array
		avarge = 0;
		for (int i = 0; i <= trials; i++) {
			testArray = Arrays.copyOf(randomArray, randomArray.length);
			time.reset();
			time.start();
			Quicksort.sort(testArray);
			time.stop();
			if (i > 0) {
				avarge += time.getElapsedTime();
			} else {
				// System.out.println("First  sort  time, random array = " + time.getElapsedTime());
			}
		}
		avarge /= trials;
		System.out.println("Avarage sort time, random array = " + avarge);


		// sorted array 
		avarge = 0;
		for (int i = 0; i <= trials; i++) {
			testArray = Arrays.copyOf(sortedArray, randomArray.length);
			time.reset();
			time.start();
			Quicksort.sort(testArray);
			time.stop();
			if (i > 0) {
				avarge += time.getElapsedTime();
			} else {
				// System.out.println("First  sort  time, sorted array = " + time.getElapsedTime());
			}
		}
		avarge /= trials;
		System.out.println("Avarage sort time, sorted array = " + avarge);


		// invert array
		avarge = 0;
		for (int i = 0; i <= trials; i++) {
			testArray = Arrays.copyOf(invertArray, randomArray.length);
			time.reset();
			time.start();
			Quicksort.sort(testArray);
			time.stop();
			if (i > 0) {
				avarge += time.getElapsedTime();
			} else {
				// System.out.println("First  sort  time, invert array = " + time.getElapsedTime());
			}
		}
		avarge /= trials;
		System.out.println("Avarage sort time, invert array = " + avarge);

    }

}
