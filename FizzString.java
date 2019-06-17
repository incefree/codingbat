package codingBat;

public class FizzString {

	public static void main(String[] args) {
		/*
		 * 
		 * Given a string str, if the string starts with "f" return "Fizz". If the
		 * string ends with "b" return "Buzz". If both the "f" and "b" conditions are
		 * true, return "FizzBuzz". In all other cases, return the string unchanged.
		 * 
		 */

		
		System.out.println(fizzString("fig"));
		System.out.println(fizzString("dib"));
		System.out.println(fizzString("fib"));
		
		
		
	}

	public static String fizzString(String str) {
		 //return str.startsWith("f") && str.endsWith("b") ? "FizzBuzz" : str.startsWith("f") ? "Fizz" : str.endsWith("b") ? "Buzz" : str;
		 
		if ((str.startsWith("f")) && (str.endsWith("b"))) {
			return "FizzBuzz";
		} else if (str.startsWith("f")) {
			return "Fizz";
		} else if (str.endsWith("b")) {
			return "Buzz";
		}

		else {
			return str;
		}
	}
}
/*

    if(str.length() > 0 && 
        str.charAt(0) == 'f' && str.charAt(str.length() - 1) == 'b')
        return "FizzBuzz";
              
    if(str.length() > 0 && str.charAt(0) == 'f')
        return "Fizz";
                        
    if(str.length() > 0 && str.charAt(str.length() - 1) == 'b')
        return "Buzz";
                                  
    return str;
}




*/