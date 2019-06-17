package codingBat;

public class FrontBack {

	public static void main(String[] args) {

		System.out.println(frontBack("Code"));
		System.out.println(front3("Java"));
		System.out.println(backAround("Hello"));
		System.out.println(or35(8));
		System.out.println(front22("kitten"));
		System.out.println(notString("a cat"));
		
	}
	
	public static String frontBack(String str) {
		// Given a string, return a new string where the first and last chars have been exchanged.
		 if (str.length() <= 1) { // ortada karakter yoksa kendine donsun demek
		   return str;
		 }
		 String mid = str.substring(1, str.length()-1);
		 
		 return str.charAt(str.length()-1) + mid + str.charAt(0);
		}

	
	public static String front3(String str) {
		  if (str.length() < 3) {
		    return str;
		  }
		  String front = str.substring(0, 3);
		  return front.repeat(3);
		}
	
	
	public static String backAround(String str) {
		String last = str.substring(str.length() -1);
		
		return last + str + last;
	}

	
	public static boolean or35(int n) {
		if (n % 5 == 0 || n % 3 == 0) {
			return true;
		}
		return false;
	}

	public static String front22(String str) {
		int num = 2;
		if (num > str.length()) {
			num = str.length();
		}
		String front = str.substring(0, num);
		return front + str + front;
	}
	
	public static String notString(String str) {
		
		if(str.length() >= 3  && str.substring(0, 3).equals("not") )
		
		return str;
		
		return "not " + str;
	}
}
