package codingBat;

public class BigDiff {
	/*
	 * Given an array length 1 or more of ints, return the difference between the
	 * largest and smallest values in the array. Note: the built-in Math.min(v1, v2)
	 * and Math.max(v1, v2) methods return the smaller or larger of two values.
	 */
	public static void main(String[] args) {

//		bigDiff([10, 3, 5, 6]) → 7
//		bigDiff([7, 2, 10, 9]) → 8
//		bigDiff([2, 10, 7, 2]) → 8
		
		int[] nums1 = {10, 3, 5, 6};
		int[] nums2 = {7, 2, 10, 9};
		int[] nums3 = {2, 10, 7, 2};
		
		System.out.println(bigDiff(nums1));
		System.out.println(bigDiff(nums2));
		System.out.println(bigDiff(nums3));
		
	}
	public static int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
			if (min > nums[i]) {
				min = nums[i];
			}
		}
		
		return Math.abs(max - min);
		  
	}
}


//int min = nums[0];
//int max = nums[0];
//  
//for(int i = 1; i < nums.length; i++) {
//    min = Math.min(min, nums[i]);
//    max = Math.max(max, nums[i]);
//}
//                
//return max - min;
