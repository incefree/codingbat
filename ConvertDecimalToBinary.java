package codingBat;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDecimalToBinary {

	public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    
	    int decimal = input.nextInt();
	    int[] binary = new int[8];
	    
	    //TODO: Write your code below.
		
		for (int i = 0; decimal > 0; i++) {
			binary[i] = decimal % 2;
			decimal /= 2;
		}
		for (int j = 0; j < binary.length / 2; j++) {
			int temp = binary[j];
			binary[j] = binary[binary.length - 1 - j];
			binary[binary.length - 1 - j] = temp;
		}
			System.out.print(Arrays.toString(binary));
			
			input.close();
		}

	}


