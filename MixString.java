package codingBat;

public class MixString {

	public static void main(String[] args) {

		/*
		 * Given two strings, a and b, create a bigger string made of the first char of
		 * a, the first char of b, the second char of a, the second char of b, and so
		 * on. Any leftover chars go at the end of the result.
		 */
		
//		mixString("abc", "xyz") → "axbycz"
//		mixString("Hi", "There") → "HTihere"
//		mixString("xxxx", "There") → "xTxhxexre"
		
		System.out.println(mixString("abc", "xyz"));
		System.out.println(mixString("Hi", "There"));
		System.out.println(mixString("xxxx", "There"));
		
	}
	
	public static String mixString(String a, String b) {
		int max = Math.max(a.length(), b.length());
		String str = "";

		for (int i = 0; i < max; i++) {
			if (i < a.length())
				str += a.charAt(i);
			if (i < b.length())
				str += b.charAt(i);
		}
		return str;

	}

}
