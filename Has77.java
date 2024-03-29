package codingBat;

public class Has77 {

	public static void main(String[] args) {
		/*
		 * Given an array of integers, return true if the array contains two 7's next to
		 * each other, or there are two 7's separated by one element, such as with {7,
		 * 1, 7}.
		 * Has77
		 */
		
//		has77([1, 7, 7]) → true
//		has77([1, 7, 1, 7]) → true
//		has77([1, 7, 1, 1, 7]) → false
		
		int[] nums1 = { 1, 7, 7 };
		int[] nums2 = { 1, 7, 1, 1, 7 };
		
		System.out.println(has77(nums1));
		System.out.println(has77(nums2));
	}

	public static boolean has77(int[] nums) {
		//two 7's 
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 7 && nums[i + 1] == 7) {
				return true;
			}
		}

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i] == 7 && nums[i + 2] == 7) {
				return true;
			}
		}
		return false;
	}
}
