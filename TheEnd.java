package codingBat;

public class TheEnd {

	public static void main(String[] args) {

		
//		theEnd("Hello", true) → "H"
//		theEnd("Hello", false) → "o"
//		theEnd("oh", true) → "o"
		
		System.out.println(theEnd("Hello", true));
		System.out.println(theEnd("Hello", false));
		System.out.println(theEnd("oh", true));
	}

	public static String theEnd(String str, boolean front) {
		if (front == true) {
			return str.substring(0, 1);
		}
		if (front == false) {
			return str.substring(str.length() - 1);
		} else {
			return str.substring(str.length() - 1);
		}
	}

}
