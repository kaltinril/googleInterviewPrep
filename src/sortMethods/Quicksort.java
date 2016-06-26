package sortMethods;

import java.util.Arrays;

// References:
// https://en.wikipedia.org/wiki/Quicksort
// Data Structures and Algorithms in Java (Adam Drozdek, Third Edition)
// https://www.amazon.com/Data-Structures-Algorithms-Java-Drozdek/dp/9814239232
// http://eduk8tech.com/apcs/Data%20Structures%20and%20Algorithms%20in%20Java.pdf
// http://www.java2novice.com/java-sorting-algorithms/quick-sort/

public class Quicksort {
		
	void swap(int[] data, int e1, int e2){
		int temp = data[e1];
		data[e1] = data[e2];
		data[e2] = temp;
	}
	
	// *********************************
	// HOARE implementation of QuickSort
	// *********************************
	
	// This implementation recursively pick the middle element,
	// swap it with the first, check the lowest and highest element positions values
	// slowly creeping up and down the array until the element positions overlap
	// Any elements that are found that are out of place are swapped
	// Effectively putting lower values on the left and higher values on the right
	// Values are not actually sorted until the recursive steps get down to only 2 or 3 elements
	void quicksort(int[] data, int first, int last){
		int lower = first + 1, upper = last;						// lower is the second element from the left
		
		swap(data, first, (first + last)/2);						// first will be swapped with the "middle" element index position
		
		int bound = data[first];									// Store the first element in the range to use in comparisons
				
		System.out.println(Arrays.toString(data));
		
		while (lower <= upper){										// Loop until lower and upper overlap
			while (bound > data[lower])								// "Lower is less than bound" Check the bound value against each value from the left
				lower++;											// stop once we've found one greater than the bound
			while (bound < data[upper])								// "Upper is greater than bound" Check the bound value against each value from the right
				upper--;											// stop once we've found one less than the bound
			if (lower < upper)										// Make sure we didn't pass over and overlap already
			{
				System.out.println(Arrays.toString(data) + " " + lower + " " + first + " " + upper);
				swap(data, lower++, upper--);						// Swap the element found that is less than bound with the element found greater than bound, move position anchors
				
			}
				else lower++;										// Move lower anchor past the lower element that was greater than bound so we can swap the bound to after it
		}
		
		System.out.println(Arrays.toString(data) + " " + upper + " " + first);
		
		swap(data, upper, first);									// Put the pivot or "bound" back to the correct position at the far right of the subarray
		if (first < upper-1)										// Recursively sort the left half subarray
			quicksort(data, first, upper-1);
		if (upper+1 < last)											// Recursively sort the right half subarray
			quicksort(data, upper+1, last);
		
		System.out.println(Arrays.toString(data));
	}
	
	public void sort(int[] data){
		System.out.println(Arrays.toString(data));
		if (data == null)											//data is null
			return;
		
		if (data.length < 2)										//no reason to sort if there is only 1 element
			return;
		
		int maxPos = 0;
		
		for (int i = 1;i < data.length; i++)						// Loop over the entire array-1 once to find the maximum
			if (data[maxPos] < data[i]) 				// -1 means less than with the compareTo method
				maxPos = i;											// found a new maximum value position
		
		swap(data, data.length-1, maxPos);
		quicksort(data, 0, data.length-2);							// Recursively sort each sub-array, minus 2 because java has 0 lower bounds on arrays and max element is already sorted
	}
}
