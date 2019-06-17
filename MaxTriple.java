package codingBat;

public class MaxTriple {

	public static void main(String[] args) {
// Given an array of ints of odd length
		int[] num = { 1, 2, 3 };
		int[] num2 = { 1, 3, 8, 5, 4};
		System.out.println(maxTriple(num));
		System.out.println(maxTriple(num2));

	}

	public static int maxTriple(int[] nums) {
		
		int max = 0;

		if (nums[0] > nums[(nums.length + 1) / 2 - 1]) {
			max = nums[0];
		} else {
			max = nums[(nums.length + 1) / 2 - 1];
		}
		if (nums[nums.length - 1] > max) {
			max = nums[nums.length - 1];
		}
		return max;

	}
}