package codingBat;

public class In1020 {

	public static void main(String[] args) {

		System.out.println(in1020(12, 18));
		System.out.println(stringBits("hxaxpxpxy")); // bir harf alir bir almaz
		System.out.println(stringSplosion("Code") );
	}

	public static boolean in1020(int a, int b) {
		if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
			return true;
		} else {
			return false;
		}
	}

	public static String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i += 2) {
			result += str.charAt(i); //str.substring(i, i + 1); 

		}
		return result;
	}

	public static String stringSplosion(String str) {
		  String front = "";
		  for(int i = 0; i < str.length(); i++) {
		  front += str.substring(0, i + 1); 
		}
		return front;
		}

}
