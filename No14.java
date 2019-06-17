package codingBat;

public class No14 {

	public static void main(String[] args) {
		// Given an array of integers, return true if it contains no 1's or it contains
		// no 4's.

		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] nums3 = { 2, 3, 4 };
		System.out.println(no14(nums1));
		System.out.println(no14(nums2));
		System.out.println(no14(nums3));
	}

	public static boolean no14(int[] nums) {
		int oneCount = 0;
		int fourCount = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				oneCount++;
			}
			if (nums[i] == 4) {
				fourCount++;
			}

		}
		return oneCount == 0 || fourCount == 0;
	}
}
