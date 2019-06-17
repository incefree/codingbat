package codingBat;

public class FirstHalf {

	public static void main(String[] args) {
		// Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
	}
	public static String firstHalf(String str) {
		  int count = str.length() ;
		  int firstHalf = count / 2; 
		  return str.substring(0, firstHalf); 
		}

}
