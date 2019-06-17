package codingBat;

import java.util.Scanner;

public class FindingMaxLengthStringArray {
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		
		//write your code below
		int size = words.length;
		
		String longestWord = words[0];
		for (int i = 1; i < size; i++) {
		  if(words[i].length() >= longestWord.length()){
		    longestWord = words[i];
		  }
		}
		System.out.println(longestWord);
		input.close();
	}
}
