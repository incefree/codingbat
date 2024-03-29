package codingBat;

import java.util.Arrays;

public class NotAlone {

	public static void main(String[] args) {

		/*
		 * We'll say that an element in an array is "alone" if there are values before
		 * and after it, and those values are different from it. Return a version of the
		 * given array where every instance of the given value which is alone is
		 * replaced by whichever value to its left or right is larger.
		 * NotAlone
		 */

//		notAlone([1, 2, 3], 2) → [1, 3, 3]
//		notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
//		notAlone([3, 4], 3) → [3, 4]

		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 1, 2, 3, 2, 5, 2 };
		int[] nums3 = { 3, 4 };

		System.out.println(Arrays.toString(notAlone(nums1, 2)));
		System.out.println(Arrays.toString(notAlone(nums2, 2)));
		System.out.println(Arrays.toString(notAlone(nums3, 3)));
	}

	public static int[] notAlone(int[] nums, int val) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (i > 0 && nums[i] == val && nums[i - 1] != val && nums[i + 1] != val) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
		return nums;

	}
}

