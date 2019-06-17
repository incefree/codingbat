package codingBat;

public class ComboString {

	public static void main(String[] args) {

		System.out.println(comboString("Hello", "hi") );
		System.out.println(comboString("hi", "Hello"));
		
	}
	public static String comboString(String a, String b) {
		String newWord = ""; 
		if(a.length() > b.length()){
		  newWord = b.substring(0, b.length()) + a.substring(0, a.length()) + b.substring(0, b.length());
		    
		  } else if (a.length() < b.length()) {
			  newWord = a.substring(0, a.length()) + b.substring(0, b.length()) + a.substring(0, a.length());  
		  } else {
			  newWord = "";
		  }
		return newWord;
		  
}
}
