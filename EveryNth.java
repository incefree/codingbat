package codingBat;

public class EveryNth {

	public static void main(String[] args) {

		System.out.println(everyNth("Miracle", 2) ); //"Mrce"
		System.out.println(everyNth("abcdefg", 2)); //"aceg"
		System.out.println(everyNth("abcdefg", 3) ); //"adg"
		
		
	}
	
	public static String everyNth(String str, int n) {

		String ch = "";
		for (int i = 0; i < str.length(); i+= n) {
			ch += str.charAt(i);
		}
		return ch;
	}

}
