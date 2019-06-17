package codingBat;

public class ModThree {

	public static void main(String[] args) {
		// Given an array of integers, return true if the array contains either 3 even
		// or 3 odd values all next to each other.
		// ModThree

		int[] nums = { 3, 5, 7, 10 };
		int[] nums2 = { 4, 5, 6, 7 };
		System.out.println(modThree(nums));
		System.out.println(modThree(nums2));

	}

	public static boolean modThree(int[] nums) {
		  int odd = 0;
		  int even = 0;
		   
		  for (int i = 0; i < nums.length; i++) {
		    if (nums[i] % 2 == 0) {
		      even++;
		      if (odd < 3) odd = 0;
		    }
		    else {
		      odd++;
		      if (even < 3) even = 0;
		    }
		  }
		  return (odd == 3 || even == 3);
	}
}
	
	
	
//	for (int i = 0; i < nums.length - 2; i++) {
//		if (nums[i] % 2 == 0) {
//			if (nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
//				return true;
//			}
//		} else if (nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
//			return true;
//		}
//	}
//
//	return false;
//}