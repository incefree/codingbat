package codingBat;

import java.util.Arrays;

public class FizzArray {

	public static void main(String[] args) {
		/*
		 * 
		 * Given a number n, create and return a new int array of length n, containing
		 * the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return
		 * a length 0 array.
		 * 
		 */

		System.out.println(Arrays.toString(fizzArray(10)));

	}

	public static int[] fizzArray(int n) {

		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}

}
