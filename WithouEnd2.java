package codingBat;

public class WithouEnd2 {

	public static void main(String[] args) {

//		withouEnd2("Hello") → "ell"
//		withouEnd2("abc") → "b"
//		withouEnd2("ab") → ""
		
		
//		String str = "I am learning java";
//		int firstA = str.indexOf('a');
//		System.out.println(firstA);
//		int secondA = str.indexOf('a', firstA + 1);
//		System.out.println(secondA);
//		int thirdA = str.indexOf('a', secondA + 1);
//		System.out.println(thirdA);
		
		
		System.out.println(withouEnd2("Hello"));
		System.out.println(withouEnd2("abc") );
		System.out.println(withouEnd2("ab"));
		
		
	}
	
	public static String withouEnd2(String str) {
		if(str.length()>1)
		return str.substring(1, str.length()-1);
		else
		return "";		  
	}
	

}
