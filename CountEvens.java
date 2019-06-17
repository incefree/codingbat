package codingBat;

public class CountEvens {

	public static void main(String[] args) {

		int[] even = { 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(countEvens(even));
		
	}
	public static int countEvens(int[] nums) {
		  int even = 0;
		  for(int count = 0; count < nums.length; count++){
		    if (nums[count] % 2 == 0){
		      even++; 
		    }
		  }
		  return even; 
		}

}
