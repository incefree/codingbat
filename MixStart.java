package codingBat;

public class MixStart {

	public static void main(String[] args) {
		System.out.println(mixStart("mix snacks") );
		System.out.println(mixStart("pix snacks"));
		System.out.println(mixStart("piz snacks"));
	}

	public static boolean mixStart(String str) {
		if(str.length() > 2) {
		if (str.startsWith("mix") || str.substring(1, 3).equals("ix")) 
			return true;
		}
		return false;
	}
}
