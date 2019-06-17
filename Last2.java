package codingBat;

public class Last2 {

	public static void main(String[] args) {

		System.out.println(last2("177171"));
		int[] nums = { 9, 7, 9, 5, 9, 7, 9 };
		// int count = arrayCount9(nums);
		System.out.println(arrayCount9(nums));
		int[] nums2 = { 9, 3, 9, 5, 8 };
		System.out.println(arrayFront9(nums2));

	}

	public static int last2(String str) {
		if (str.length() < 2) {
			return 0;
		}
		String end = str.substring(str.length() - 2);
		int count = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals(end)) {
				count++;
			}
		}
		return count;
	}

	public static int arrayCount9(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;

	}

	public static boolean arrayFront9(int[] nums2) {
		int len = nums2.length;
		if (len > 4) {
			len = 4;
		}
		for (int i = 0; i < len; i++) {
			if (nums2[i] == 9) {
				return true;
			}
		}
		return false;
	}

}
