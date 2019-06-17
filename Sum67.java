package codingBat;

public class Sum67 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 6, 99, 99, 7}; 
		
		System.out.println(sum67(nums));
	}

	public static int sum67(int[] nums) {
		int sum = 0;
		boolean sixMode = false;
		for (int i = 0; i < nums.length; i++) {
			if (sixMode) {
				if (nums[i] == 7)
					sixMode = false;
			} else if (nums[i] == 6) {
				sixMode = true;
			} else {
				sum += nums[i];
			}
		}
		return sum;
	}
}