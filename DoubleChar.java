package codingBat;

public class DoubleChar {

	public static void main(String[] args) {
		// Given a string, return a string where for every char in the original, there
		// are two chars.

		String word1 = "The";
		String word2 = "AAbb";
		String word3 = "Hi-There";
		System.out.println(doubleChar(word1));
		System.out.println(doubleChar(word2));
		System.out.println(doubleChar(word3));
	}

	public static String doubleChar(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr += str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return newStr;

	}
}
