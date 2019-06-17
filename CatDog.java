package codingBat;

public class CatDog {

	public static void main(String[] args) {
		/*
		 * Return true if the string "cat" and "dog" appear the same number of times in
		 * the given string.
		 */
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("1cat1cadodog"));
	}

	public static boolean catDog(String str) {
		int cat = 0;
		int dog = 0;

	for (int i = 0; i < str.length() - 2; i++) {
		//i + 3 to get 3 characters
		if (str.substring(i, i + 3).equals("cat")) {
			cat++;
		}
		if (str.substring(i, i + 3).equals("dog")) {
			dog++;
		}
		/*
		 *  else if(str.charAt(i) == 'd' && str.charAt(i+1)== 'o' && str.charAt(i+2)== 'g'){
        dog++; }
        OR
         if(temp.compareTo("dog")==0)
  		dog++;
		 * 
		 */
		}
		return cat == dog;

	}

}
