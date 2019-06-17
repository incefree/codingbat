package codingBat;

import java.util.Arrays;
import java.util.Scanner;


public class ReverseArray {

	public static void main(String[] args) {

		// reverse array method 1
		
		int[] inputArray = { 3, 2, 1};
		System.out.println(Arrays.toString(reverse3(inputArray)));

		// reverse array method 2

		Scanner input = new Scanner(System.in);
		int[] numbers = new int[5];

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Please enter a number");
			numbers[i] = input.nextInt();
		}
		reverse(numbers);
		input.close();
		
		// best method
		//ArrayUtils.reverse(inputArray);
		
	}
		// reverse array method 1
		public static int[] reverse3(int[] nums) {
		
			return new int[] { nums[2], nums[1], nums[0] };
			
		}
		// reverse array method 2
		public static void reverse(int[] nums) {
			for (int i = 0; i < nums.length / 2; i++) {
				int temp = nums[i];
				nums[i] = nums[nums.length - 1 - i];
				nums[nums.length - 1 - i] = temp;
			}
			
			System.out.println("Reversed array: " + Arrays.toString(nums));
		
	}
	
}
