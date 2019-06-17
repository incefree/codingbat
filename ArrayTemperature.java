package codingBat;


public class ArrayTemperature {

	public static void main(String[] args) {

		System.out.println(calculateAverage());
	
	}

	public static double calculateAverage() {

		// int[] A = {1,2,3};

		double[] temperatures = { 74, 73, 72, 80 };

		int size = temperatures.length;
		/*
		 * if ( 4 > size) { System.out.println(temperatures[10]); }
		 */
		double total = 0;
		for (int i = 0; i < size; i++) {
			total += temperatures[i];
		}
		double average = total / size;

		return average;

	}

}
