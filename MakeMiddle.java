package codingBat;

import java.util.Arrays;

public class MakeMiddle {

	public static void main(String[] args) {

		int[] num1 = { 1, 2, 3, 4 };
		int[] num2 = { 7, 1, 2, 3, 4, 9 };
		int[] num3 = { 1, 2 };
		System.out.println(Arrays.toString(makeMiddle(num1)));
		System.out.println(Arrays.toString(makeMiddle(num2)));
		System.out.println(Arrays.toString(makeMiddle(num3)));
	}

	public static int[] makeMiddle(int[] nums) {

		//return new int[] { nums[nums.length / 2 - 1], nums[nums.length / 2] };
		
		int[] newNums = new int[2];
		newNums[0] = nums[(nums.length / 2) - 1];
		newNums[1] = nums[nums.length / 2];
		
		return newNums; 
	}

}
