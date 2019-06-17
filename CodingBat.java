package codingBat;

public class CodingBat {

	public static void main(String[] args) {
		
		
		System.out.println(doubleX("axxbb"));
		System.out.println(doubleX("axaxax"));
		System.out.println(doubleX("xxxxx"));
		System.out.println(doubleX("abcdx"));
		
		
		
	}

	private static boolean doubleX(String str) {
		
		int i = str.indexOf("x");
		if (i + 1 >= str.length()) {
			return false; 
		}
		return str.substring(i + 1, i + 2).equals("x");
	}
	
	 // Another approach -- .startsWith() simplifies the logic
	  // String x = str.substring(i);
	  // return x.startsWith("xx");

}
