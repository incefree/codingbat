package codingBat;

public class Sum13 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 1, 13 };
		System.out.println(sum13(nums));
	}

	public static int sum13(int[] nums) {
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 13) {
				i++;
			}
			else {
				sum += nums[i];
			}
		}
		return sum;
	}
}
