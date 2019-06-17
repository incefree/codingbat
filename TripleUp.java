package codingBat;

public class TripleUp {

	public static void main(String[] args) {
		/*
		 * Return true if the array contains, somewhere, three increasing adjacent
		 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
		 * TripleUp
		 */
		
//		tripleUp([1, 4, 5, 6, 2]) → true
//		tripleUp([1, 2, 3]) → true
//		tripleUp([1, 2, 4]) → false
		
		int[] nums1 = { 1, 4, 5, 6, 2 };
		int[] nums2 = { 1, 2, 3};
		int[] nums3 = { 1, 2, 4 };
		
		System.out.println(tripleUp(nums1));
		System.out.println(tripleUp(nums2));
		System.out.println(tripleUp(nums3));
		
	}

	public static boolean tripleUp(int[] nums) {

		for (int i = 0; i <= nums.length-3; i++) {
			if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2)
				return true;
		}
		return false;
	}
	
}
