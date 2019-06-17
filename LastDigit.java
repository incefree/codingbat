package codingBat;

public class LastDigit {

	public static void main(String[] args) {
		System.out.println(lastDigit(7, 17));
		System.out.println(lastDigit(6, 17));
		System.out.println(lastDigit(3, 113));
		//Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
	}
	public static boolean lastDigit(int a, int b) {
	
		String strA = Integer.toString(a);
		String strB = Integer.toString(b);

		if (strA.charAt(strA.length() - 1) == strB.charAt(strB.length() - 1)) {
			return true;
		}

		return false;
//		  int modA = a % 10;
//		  int modB = b % 10;
//		  if (modA == modB)
//		    return true;
//		  else
//		    return false;
	}
}
