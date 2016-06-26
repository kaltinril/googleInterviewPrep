package sortMethods;

import java.util.Arrays;

public class Mergesort {
	private int[] tempArray;
	
	public void sort(int[] data){
		System.out.println(Arrays.toString(data));
		int length = data.length;
		tempArray = new int[length];
		mergesort(data, 0, length - 1);									// Setup the mergesort for the entire array
	}
	
	void mergesort(int[] data, int leftIndex, int rightIndex){
		
		if (leftIndex < rightIndex){
			int middleIndex = leftIndex + (rightIndex - leftIndex) / 2;  // Find the middle point between the right and left index, add on the left index to get the correct position
			
			mergesort(data, leftIndex, middleIndex);					// mergesort the left half
			mergesort(data, middleIndex + 1, rightIndex);				// mergesort the right half
			
			mergeArrays(data, leftIndex, rightIndex, middleIndex);		// Merge the items
		}
	}
	
	void mergeArrays(int[] data, int leftIndex, int rightIndex, int middleIndex){
		System.out.println("Merging from " + leftIndex + " to " + middleIndex + " and from " + (middleIndex+1) + " to " + rightIndex);
		// create a temporary array to use as the reference
		for (int i = leftIndex; i <= rightIndex; i++)
			tempArray[i] = data[i];
		
		// loop over the temp array taking the lower value of the two
		int leftArrayPos = leftIndex;
		int rightArrayPos = middleIndex + 1;
		int insertPosition = leftIndex;
		while(leftArrayPos <= middleIndex && rightArrayPos <= rightIndex){			
			if (tempArray[leftArrayPos] <= tempArray[rightArrayPos]){
				data[insertPosition] = tempArray[leftArrayPos];
				leftArrayPos++;
			}
			else
			{
				data[insertPosition] = tempArray[rightArrayPos];
				rightArrayPos++;											// Move the right array position to look at down
			}
			insertPosition++;												// Move the insert position up one
			System.out.println(Arrays.toString(data));
		}
		
		while(leftArrayPos <= middleIndex){
			data[insertPosition] = tempArray[leftArrayPos];
			leftArrayPos++;
			insertPosition++;
			System.out.println(Arrays.toString(data));
		}
	}
}
