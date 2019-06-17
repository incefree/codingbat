package codingBat;

public class Unluck1 {

	public static void main(String[] args) {

		int[] num1 = {1, 3, 4, 5};
		int[] num2 = {2, 1, 3, 4, 5}; 
		int[] num3 = {1, 1, 1};

		System.out.println(unlucky1(num1));
		System.out.println(unlucky1(num2));
		System.out.println(unlucky1(num3));

	}

	public static boolean unlucky1(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		if ((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 1 - 1] == 1 && nums[nums.length - 1] == 3)) {
			return true;
		} else if (nums.length > 2 && nums[1] == 1 && nums[2] == 3) {
			return true;
		} else {
			return false;

		}
	}
}
