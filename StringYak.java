package codingBat;

public class StringYak {

	public static void main(String[] args) {

		System.out.println(stringYak("pakyak"));
		System.out.println(altPairs("kitten"));
		System.out.println(stringX("xabxxxcdx"));

		int[] nums = { 6, 7, 3, 4, 6, 6 }; // ya 6 6 olmali ya 6 7

		System.out.println(array667(nums));

		int[] nums2 = { 1, 1, 1, 2, 2, 2, 1 };

		System.out.println(noTriples(nums2));

		int[] nums3 = { 2, 7, 1 };

		System.out.println(has271(nums3));

	}

	public static String stringYak(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
				i += 2;
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}

	public static String altPairs(String str) {

		String result = "";
		for (int i = 0; i < str.length(); i += 4) {
			int end = i + 2;
			if (end > str.length()) {
				end = str.length();
			}
			result += str.substring(i, end);
		}
		return result;
	}

	public static String stringX(String str) {

		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!(i > 0 && i < str.length() - 1 && str.substring(i, i + 1).equals("x"))) {
				result += str.substring(i, i + 1);
			}
		}
		return result;
	}

	public static int array667(int[] nums) {

		int count = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 6) {
				if (nums[i + 1] == 6 || nums[i + 1] == 7) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean noTriples(int[] nums) {
		for (int i = 0; i < nums.length - 2; i++) {
			int first = nums[i];
			if (nums[i + 1] == first && nums[i + 2] == first) {
				return false;
			}
		}
		return true;
	}

	public static boolean has271(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			int value = nums[i];
			if (nums[i + 1] == (value + 5) && Math.abs(nums[i + 2] - (value - 1)) <= 2) {
				return true;
			}
		}
		return false;
	}
}
