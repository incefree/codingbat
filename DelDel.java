package codingBat;

public class DelDel {
// Warmup-1 > delDel 
	public static void main(String[] args) {
		/*
		 * string, if the string "del" appears starting at index 1, return a string
		 * where that "del" has been deleted. Otherwise, return the string unchanged
		 */

//		delDel("adelbc") → "abc"
//		delDel("adelHello") → "aHello"
//		delDel("adedbc") → "adedbc"
	
	
	}
	
	public static String delDel(String str) {

		
		if(str.startsWith("de", 1))
			return str.charAt(0) + str.substring(4, str.length());
		
		return str;
		  
	}
	
	

}
