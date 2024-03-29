package codingBat;

public class Has12 {

	public static void main(String[] args) {
		/*
		 * Given an array of integers, return true if there is a 1 in the array with a 2
		 * somewhere later in the array.
		 */
		
//		has12([1, 3, 2]) → true
//		has12([3, 1, 2]) → true
//		has12([3, 1, 4, 5, 2]) → true
		
		
		int[] nums = {3, 1, 4, 5, 2};
		int[] nums2 = {1, 1, 3, 4, 5};
		System.out.println(has12(nums));
		System.out.println(has12(nums2));
	}

	public static boolean has12(int[] nums) {
		boolean found1 = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				found1 = true;
			}
			if (found1 && nums[i] == 2) {
				return true;
			}
		}

		return false;
	}
}
