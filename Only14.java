package codingBat;

public class Only14 {

	public static void main(String[] args) {
		// Given an array of integers, return true if every element is a 1 or a 4.
		int[] nums1 = { 1, 4, 2, 4 };
		int[] nums2 = { 1, 4, 1, 4 };
		int[] nums3 = { 1, 1 };
		int[] nums4 = { 4, 4 };
		System.out.println(only14(nums1));
		System.out.println(only14(nums2));
		System.out.println(only14(nums3));
		System.out.println(only14(nums4));
	}

	public static boolean only14(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				return false;
			}
		}
		return true;
	}

}
