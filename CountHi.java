package codingBat;

public class CountHi {

	public static void main(String[] args) {
		// Return the number of times that the string "hi" appears anywhere in the given
		// string.

	// Different example 
		
		int count = 0;
	
			do {
				count++;
			} while (count < 2);
			
		System.out.println(count);
		//----------------------------
		String hi = "ABChi hi";
		String hi1 = "abc hi ho";
		String hi2 = " AA hi BBB ih hihi";
		System.out.println(countHi(hi));
		System.out.println(countHi(hi1));
		System.out.println(countHi(hi2));
	

	}

	public static int countHi(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
				count++;
			}
		}
		return count;
	}

}
