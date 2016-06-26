package junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import sortMethods.Quicksort;

public class QuicksortTest {

	@Test
	public void testQuicksort() {
		int[] values = {87,43,2,3,6,8,16,7,90,6,45,2,25,7,8};
		int[] sortedValues = {2,2,3,6,6,7,7,8,8,16,25,43,45,87,90};
		Quicksort qs = new Quicksort();
		qs.sort(values);

		assertEquals(Arrays.toString(values), Arrays.toString(sortedValues));
	}
}