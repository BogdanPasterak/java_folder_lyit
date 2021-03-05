package Quick_Merge;

public class Mergesort {

	
	public static void sort(int[] myArray){
		int []tempArray = new int[myArray.length];
		mergeSort(myArray,tempArray,0,myArray.length-1);
	}
	
	private static void mergeSort(int[] myArray, int []tempArray,int lowerIndex,int upperIndex){
		if(lowerIndex == upperIndex){
			return;
		}else{
			int midPt = (lowerIndex+upperIndex)/2;
			mergeSort(myArray, tempArray, lowerIndex, midPt);
			mergeSort(myArray, tempArray, midPt+1, upperIndex);
			merge(myArray, tempArray,lowerIndex,midPt+1,upperIndex);
		}
	}
	
	private static void merge(int[] myArray, int []tempArray,int lowerIndexCursor,int higerIndex,int upperIndex){
		int tempIndex=0;
		int lowerIndex = lowerIndexCursor;
		int midIndex = higerIndex-1;
		int totalItems = upperIndex-lowerIndex+1;
      // While neither array is empty
		while(lowerIndex <= midIndex && higerIndex <= upperIndex){
      // Compare the items of the two arrays and copy the smaller item into to third temp array
			if(myArray[lowerIndex] < myArray[higerIndex]){
				tempArray[tempIndex++] = myArray[lowerIndex++];
			}else{
				tempArray[tempIndex++] = myArray[higerIndex++];
			}
		}
		
		while(lowerIndex <= midIndex){
			tempArray[tempIndex++] = myArray[lowerIndex++];
		}
		while(higerIndex <= upperIndex){
			tempArray[tempIndex++] = myArray[higerIndex++];
		}
		
		for(int i=0;i<totalItems;i++){
			myArray[lowerIndexCursor+i] = tempArray[i];
		}
	}
	
}