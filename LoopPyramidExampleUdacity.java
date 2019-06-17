package codingBat;

public class LoopPyramidExampleUdacity {

	public static void main(String[] args) {
		
		
		System.out.println(countBlocks(3));
		 
	}

	private static int countBlocks(int levels) {
		
		int i;
		int total = 0;
		for(i = 1; i <= levels; i++) {
		    total += i * i;
		    }
		    
		
		return total; 
	}

}
