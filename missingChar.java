package codingBat;

public class missingChar {

	public static void main(String[] args) {

		// missing char
		
		System.out.println(missingCh("ismet", 3));
	}

	public static  String missingCh(String str, int n) {
		String front =  str.substring(0, n);
		String back =  str.substring(n + 1 , str.length());
		
		return front + back;
		
	}

}
