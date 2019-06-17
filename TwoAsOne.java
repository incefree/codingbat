package codingBat;

public class TwoAsOne {

	public static void main(String[] args) {
		// Given three ints, a b c, return true if it is possible to add two of the ints
		System.out.println(twoAsOne(1, 2, 3));
		System.out.println(twoAsOne(3, 1, 2));
		System.out.println(twoAsOne(3, 2, 2));
		
		
	}
	public static boolean twoAsOne(int a, int b, int c) {
		return (a + b == c)  || (a + c == b) || (c + b == a);
	}
}
