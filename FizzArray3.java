package codingBat;

import java.util.Arrays;

public class FizzArray3 {
	/*
	 * 
	 * Given start and end numbers, return a new array containing the sequence of
	 * integers from start up to but not including end, so start=5 and end=10 yields
	 * {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.
	 * Note that a length-0 array is valid.
	 * 
	 * 
	 */
	public static void main(String[] args) {

		System.out.println(Arrays.toString(fizzArray3(11, 18)));

	}

	public static int[] fizzArray3(int start, int end) {
		int[] arr = new int[end-start];
		for (int i = start; i < end; i++) {
			arr[i-start] = i;
		}
		return arr;
		
		
		
//		int num = end - start;
//		int[] c = new int[num];
//		for (int i = 0; i < num; i++) {
//			c[i] = start++;
//		}
//		return c;
	}
}
//int[] arr = new int[end - start + 1 ];
//for(int i = start; i <= end; i++){
//  arr[i-start] = i;