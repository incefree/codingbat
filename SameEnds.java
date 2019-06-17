package codingBat;

public class SameEnds {

	public static void main(String[] args) {
	int[] num = {5, 6, 45, 99, 13, 5, 6};
	
	System.out.println(sameEnds(num, 1));	
	System.out.println(sameEnds(num, 2));
	System.out.println(sameEnds(num, 3));
			
			
	}
	

	public static boolean sameEnds(int[] nums, int len) {
		for (int i = 0; i < len; i++) {
			if (nums[i] != nums[nums.length - (len) + i]) {
				return false;
			}
		}
		return true;

	}

}
