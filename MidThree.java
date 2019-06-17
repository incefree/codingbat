package codingBat;

import java.util.Arrays;

public class MidThree {

	public static void main(String[] args) {
		/*
		 * Given an array of ints of odd length, return a new array length 3 containing
		 * the elements from the middle of the array. The array length will be at least
		 * 3.
		 */
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = { 8, 6, 7, 5, 3, 0, 9};
		int[] num3 = { 1, 2, 3};
		System.out.println( Arrays.toString(midThree(num1)));
		System.out.println( Arrays.toString(midThree(num2)));
		System.out.println( Arrays.toString(midThree(num3)));
		
	}

	public static int[] midThree(int[] nums) {
		 int[] a = new int[3];
		  if(nums.length >= 3) {
			  a[0] = nums[(nums.length/2) - 1];
		        a[1] = nums[nums.length/2];
		        a[2] = nums[(nums.length/2) + 1];
		  }
		
		
		return a;
	
	}
}
