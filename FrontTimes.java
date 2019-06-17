package codingBat;

public class FrontTimes {

	public static void main(String[] args) {

		System.out.println(frontTimes("Chocolate", 2));
		System.out.println(frontTimes("Chocolate", 3));
		System.out.println(frontTimes("Abc", 3));
		System.out.println(frontTimes("", 4));
		System.out.println(frontTimes("A", 4));
	}

	public static String frontTimes(String str, int n) {
		String front = "";
		if (str.length() < 3) {
			for (int i = 0; i < n; i++) {
				front += str;
			}
			return front;
		} else {
			for (int i = 0; i < n; i++) {
				front += str.substring(0, 3);
			}
			return front;
		}
	}
}
