package codingBat;

public class CountXX {

	public static void main(String[] args) {

		System.out.println(countXX("aabcxxaa"));
		
	}
	public static int countXX(String str) {
	  int count = 0;
	  for(int i = 0; i < str.length() -1 ; i++) {
	    if(str.substring(i, i + 2).equals("aa")) 
	    count++;
	  }
	  return count;
	}

}
