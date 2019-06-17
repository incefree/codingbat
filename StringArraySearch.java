package codingBat;

public class StringArraySearch {

	public static void main(String[] args) {
		
		String[] names = {"Anja Clever", "Kimberli Johnson", "Edmond", "Shenna", "Edythe", "Sherrell North Wiseman", "Lindsay", 
				 "Randee", "Janell", "Jeremy", "Solomon South Smartman"};
												
		System.out.println(findLongestName(names));
		
	}

	public static  String findLongestName(String [] names) {
		
		//int data[] = new int[10]; 
		// data[10] = {10,20,30,40,50,60,71,80,90,91};
		

		int size = names.length;
				
		String longestName = names[0];
				
		for (int i = 1; i < size; i++) {
			
			if(names[i].length() >= longestName.length()) {
				longestName = names [i];
			}
			
		}
		
		
		
		return longestName;

		
		
	}

}
