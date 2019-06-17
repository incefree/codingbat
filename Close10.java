package codingBat;

public class Close10 {

	public static void main(String[] args) {
		System.out.println(close10(8, 13));
		System.out.println(close10(13, 8));
		System.out.println(close10(13, 7));
		
	}

	public static int close10(int a, int b) {
		int temp1 = Math.abs(a - 10);
		int temp2 = Math.abs(b - 10);

		if (temp1 == temp2) {
			return 0;
		}
		if (temp1 > temp2) {
			return b;
		} else {
			return a;
		}
	}
}
