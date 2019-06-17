package codingBat;

public class MatchUp {

	public static void main(String[] args) {

		/*
		 * 
		 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
		 * consider the corresponding element in nums2 (at the same index). Return the
		 * count of the number of times that the two elements
		 *  differ by 2 or less, but are not equal.
		 *  Aradaki fark 2 veya daha az olacak ayni index olcak sekilde 
		 */

		int[] plusOne1 = { 1, 2, 3 };
		int[] plusOne2 = { 2, 3, 5 };

		System.out.println(matchUp(plusOne1, plusOne2));
	}

	public static int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length; i++) {
			int temp = Math.abs(nums1[i] - nums2[i]);
			if (temp > 0 && temp <= 2) {
				count++;
			}
		}
		return count;
	}

}
