package codingBat;

import java.util.Arrays;

public class ArraySearch {

	public static void main(String[] args) {

		System.out.println(search());

		int nums[] = { 1, 2, 3, 4, 5 };
		// return true if the sequence of numbers 1, 2, 3 appears in the array
		System.out.println(array123(nums));

		System.out.println(stringMatch("xxcaazz", "xxbaaz"));

		System.out.println(stringX("xabxxxcdx"));

		int nums2[] = { 1, 2, 3, 1 };

		System.out.println(sameFirstLast(nums2));

		int[] makePi = makePi();

		System.out.println(Arrays.toString(makePi));

		int a[] = { 1, 2, 3 };
		int b[] = { 7, 3 };

		System.out.println(commonEnd(a, b));

		// Find the maximum number and repeat it
		int[] findMax = { 11, 5, 9 };
		System.out.println(Arrays.toString(maxEnd3(findMax)));

		// Find the maximum number and repeat it
		int[] findMax2 = { 11, 5, 9 };
		System.out.println(sum2(findMax2));

		// Find the MIDDLE NUMBER
		int[] x = { 4, 5, 6 };
		int[] y = { 3, 8, 0 };
		System.out.println(Arrays.toString(middleWay(x, y)));

		// return a new array length 2 containing the first and last elements
		int[] makeEnds = { 7, 4, 6, 2 };
		System.out.println(Arrays.toString(makeEnds(makeEnds)));

		// return true if it contains a 2 or a 3
		int[] hasNums = { 2, 5 };
		System.out.println(has23(hasNums));
		
		//return a new array with double the length where its last element is the same as the original array
		int[] num = { 4, 5, 6};
		System.out.println(Arrays.toString(makeLast(num)));

	}

	public static double search() {

		double[] speed = { 7.85, 7.32, 4.9, 6.22, 5.4, 7.3, 5.19 };
		int size = speed.length;
		double min = speed[0];
		for (int i = 0; i < size; i++) {
			if (speed[i] < min) {
				min = speed[i];
			}
		}
		return min;
	}

	public static boolean array123(int[] nums) {
		for (int i = 0; i < (nums.length - 2); i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
				return true;
		}
		return false;
	}

	public static int stringMatch(String a, String b) {
		int len = Math.min(a.length(), b.length());
		int count = 0;

		for (int i = 0; i < len - 1; i++) {
			String aSub = a.substring(i, i + 2);
			String bSub = b.substring(i, i + 2);
			if (aSub.equals(bSub)) {
				count++;
			}
		}
		return count;
	}

	public static String stringX(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	public static boolean sameFirstLast(int[] nums) {
		return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
	}

	public static int[] makePi() {
		int[] makePi = { 3, 1, 4 };
		return makePi;
	}

	public static boolean commonEnd(int[] a, int[] b) {
		if ((a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1])) {
			return true;
		}
		return false;
	}

	// Find the maximum number and repeat it
	public static int[] maxEnd3(int[] nums) {
		int max = Math.max(nums[0], nums[2]);
		nums[0] = max;
		nums[1] = max;
		nums[2] = max;

		return nums;
	}

	public static int sum2(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		if (nums.length == 0) {
			return 0;
		}

		return nums[0] + nums[1];
	}

	// Find the MIDDLE NUMBER

	public static int[] middleWay(int[] a, int[] b) {
		int[] middleArray = new int[] { a[1], b[1] };
		return middleArray;
	}

	// return a new array length 2 containing the first and last elements
	public static int[] makeEnds(int[] nums) {
		int[] makeEnds = new int[] { nums[0], nums[nums.length - 1] };
		return makeEnds;
	}

	// return true if it contains a 2 or a 3
	public static boolean has23(int[] nums) {
		if ((nums[0] == 2 || nums[0] == 3) || (nums[1] == 3 || nums[1] == 2)) {
			return true;
		} else {
			return false;
		}
	}

	//return a new array with double the length where its last element is the same as the original array
	public static int[] makeLast(int[] nums) {
		int len = nums.length;
		int[] myArray = new int[len * 2];
		myArray[myArray.length - 1] = nums[len - 1];
		return myArray;
	}
}
