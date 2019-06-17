package codingBat;

import java.util.Arrays;

public class Pre4 {
	/*
	 * Given a non-empty array of ints, return a new array containing the elements
	 * from the original array that come before the first 4 in the original array.
	 * The original array will contain at least one 4. Note that it is valid in java
	 * to create an array of length 0.
	 * Pre4
	 */
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 4, 1}; // 1, 2
		int[] arr2 = {3, 1, 4}; // 3, 1
		int[] arr3 = {1, 4, 4}; // 1
		
		System.out.println(Arrays.toString(pre4(arr1)));
		System.out.println(Arrays.toString(pre4(arr2)));
		System.out.println(Arrays.toString(pre4(arr3)));
		
		
	}
	public static int[] pre4(int[] nums) {
		int index = 0;
		int[] noFour;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 4) {
				index = i;
				break;
			}
		}
		noFour = new int[index];
		for (int i = 0; i < index; i++) {
			noFour[i] = nums[i];
			
		}
		return noFour;
	}
}

//int index = 0;
//while(nums[index] != 4)
//    index++;
//          
//int[] arr = new int[index];
//              
//for(int i = 0; i < index; i++)
//    arr[i] = nums[i];
//                        
//return arr;