package Quick_Merge;

public class Quicksort {

	public static void sort(int[] a){
		int left = 0;
		int right = a.length-1;
			
		quickSort(a, left, right);
	}
	
	// This method is used to sort the array using quicksort algorithm.
	// It takes the left and the right end of the array as the two cursors.

	private static void quickSort(int[] a, int left,int right){
		
		// If both cursor scanned the complete array quicksort exits
		if(left >= right)
			return;
		
		// For simplicity, we took the rightmost item of the array as a pivot 
		// int pivot = a[right];
		int pivot = a[(right + left) / 2];
		// int pivot = a[(int)(Math.random() * (right - left) + left)];
		int partition = partition(a, left, right, pivot);
		
		// Recursively, calls the quicksort with the different left and right parameters of the sub-array
		quickSort(a, left, partition-1);
		quickSort(a, partition+1, right);
	}
	
	// This method is used to partition the given array and returns the integer which points to the sorted pivot index

	private static int partition(int[] a,int left,int right,int pivot){
		int leftCursor = left-1;
		int rightCursor = right;
		while(leftCursor < rightCursor){
                while(a[++leftCursor] < pivot);
                while(rightCursor > 0 && a[--rightCursor] > pivot);
			if(leftCursor >= rightCursor){
				break;
			}else{
				swap(a, leftCursor, rightCursor);
			}
		}
		swap(a, leftCursor, right);
		return leftCursor;
	}
	
	// This method is used to swap the values between the two given index

	public static void swap(int[] a,int left,int right){
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	
	
}
