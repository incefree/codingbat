package codingBat;

public class CramersRule {

	public static void main(String[] args) {

		
		/* Display the value for x and y    Cramer's rule  1.13 sorusu
		 * 3.4x + 50.2y = 44.5
		 * 2.1x + .55y = 5.9
		 * ax + by = e
		 * cx + dy = f
		 * x = (ed - bf) / (ad - bc)
		 * y = (af - ec) / (ad - bc)
		 */
		
		double A = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = .55;
		double e = 44.5;
		double f = 5.9;
		double x = ((e * d) - (b * f)) / ((A * d) - (b * c));
		double y = ((A * f) - (e * c)) / ((A * d) - (b * c)); 
		
		//System.out.println("x = " + x + "\ny = " + y);		
		System.out.println("x = " + (int) (x * 100) / 100.0 + "\ny = " + y);
		System.out.println((3.4 * 2.623901496861419) + (50.2 * 0.7087397392563978)); // dogrulamak icin
		
		float x1 =  14.5f; 
		float y1 = 7F;
		System.out.println(x1 / y1);
		
	
		
		int subwayTrain = 5;

		switch (subwayTrain) {

		case 1:
			System.out.println("This is a South Ferry bound train!");
			break;
		case 5:
			System.out.println("This is a Brooklyn bound train!");
			break;
		case 7:
			System.out.println("This is a Queens bound train!");
			break;
		default:
			System.out.println("I'm not sure where that train goes...");

		}
		System.out.println(15 % 27);
	}

}
