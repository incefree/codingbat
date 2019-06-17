package codingBat;

import java.util.Arrays;

public class SwapEnds {

	public static void main(String[] args) {
		int[] num = {5, 6, 7, 8, 9, 10, 11};
		System.out.println(Arrays.toString(swapEnds(num)));
		
	}

	public static int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}
}
