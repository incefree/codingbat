package codingBat;

public class CenteredAverage {
	/*
	 * Return the "centered" average of an array of ints, which we'll say is the
	 * mean average of the values, except ignoring the largest and smallest values
	 * in the array. If there are multiple copies of the smallest value, ignore just
	 * one copy, and likewise for the largest value. Use int division to produce the
	 * final average. You may assume that the array is length 3 or more.
	 * CenteredAverage
	 */
	public static void main(String[] args) {
//		centeredAverage([1, 2, 3, 4, 100]) → 3
//		centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
//		centeredAverage([-10, -4, -2, -4, -2, 0]) → -3

		int[] nums1 = { 1, 2, 3, 4, 100 };
		int[] nums2 = { 1, 1, 5, 5, 10, 8, 7 };
		int[] nums3 = { -10, -4, -2, -4, -2, 0 };
		System.out.println(centeredAverage(nums1));
		System.out.println(centeredAverage(nums2));
		System.out.println(centeredAverage(nums3));

	}

	public static int centeredAverage(int[] nums) {
		int total = 0;
		int max = nums[0];
		int min = nums[0];

		for (int i = 0; i < nums.length; i++) {
			total += nums[i];

			if (max < nums[i])
				max = nums[i];

			if (min > nums[i])
				min = nums[i];

		}

		//return (total - (min + max)) / (nums.length - 2);
		
		total -= min;
		total -= max;
		
		return total / (nums.length-2);
	}
}
