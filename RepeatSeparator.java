package codingBat;

public class RepeatSeparator {

	public static void main(String[] args) {
		/*
		 * 
		 * Given two strings, word and a separator sep, return a big string made of
		 * count occurrences of the word, separated by the separator string.
		 * 
		 */

		System.out.println(repeatSeparator("Word", "X", 3));
		System.out.println(repeatSeparator("This", "And", 2));
		System.out.println(repeatSeparator("This", "And", 1));

	}

	public static String repeatSeparator(String word, String sep, int count) {

		String newWord = "";

		for (int i = 0; i < count; i++) {
			if (i < count - 1) {
				newWord += word + sep;

			} else {
				newWord += word;
			}
		}
		return newWord;

	}
}
