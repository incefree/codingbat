package codingBat;

public class CountCode {

	public static void main(String[] args) {
		/*
		 * Return the number of times that the string "code" appears anywhere in the
		 * given string, except we'll accept any letter for the 'd', so "cope" and
		 * "cooe" count.
		 * 
		 * 
		 */

		System.out.println(countCode("aaacodebbb"));
		System.out.println(countCode("cozexxcope"));
	}

	public static int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {

				count++;
			}
		}

		return count;
	}
}
