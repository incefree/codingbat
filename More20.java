package codingBat;

public class More20 {

	public static void main(String[] args) {
    //Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
		
		System.out.println(more20(20));
		System.out.println(more20(21));
	}

	public static boolean more20(int n) {
		return (n != 0 && (n - 1) % 20 == 0 || (n - 2) % 20 == 0);
	}

}
