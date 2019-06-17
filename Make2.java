package codingBat;

import java.util.Arrays;

public class Make2 {

	public static void main(String[] args) {
		int[] a = {4, 5};
		int[] b = {1, 2, 3};
		int[] c = {4};
		System.out.println(Arrays.toString(make2(a, b)));
		System.out.println(Arrays.toString(make2(c, b)));
		
	}
	
	public static int[] make2(int[] a, int[] b) {
		
		int[] newArray = null;
		if(a.length >= 2) {
			newArray = new int[] { a[0], a[1] };
		}
		if(a.length == 1) {
			newArray = new int[] { a[0], b[0] };
		}
		if(a.length == 0) {
			newArray = new int[] { b[0], b[1] };
		}
		  return newArray;
	}
}