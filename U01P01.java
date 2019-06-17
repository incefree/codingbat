package codingBat;

public class U01P01 {
	public static void main(String[] args) {
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
		
		System.out.println("   J    a   v     v  a");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a"); // 1.3 sorusu
		
		System.out.println("a    a^2    a^3");
		System.out.println("1    1      1");
		System.out.println("2    4      8");
		System.out.println("3    9      27"); // 1.4 sorusu
		System.out.println("4    16     64");
		
		System.out.println(9.5 * 4.5 - 2.5 * 3 / 45.5 - 3.5); // 1.5 sorusu
		
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9); // 1.6 sorusu
		
		System.out.println(4 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11)); // 1.7 sorusu 
		System.out.println(4 * (1.0 -1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1 /13));
		
		double radius;
		double area;
		double perimeter; 
		radius = 5.5;
		int a = 2; 
		
		perimeter = a * radius * 3.14159; 
		area = radius * radius * 3.14159;    // 1.8 sorusu
		
		System.out.println("The area for the circle of radius " + radius  + " is " +  area);
		System.out.println("The perimeter for the circle of radius " + radius  + " is " +  perimeter);
		
		double width = 4.5; 
		double height = 7.9; 
		perimeter = 2 * width * height;   // 1.9 sorusu 
		area = width * height; 
		System.out.println("The area of the rectangle is " + area);
		System.out.println("The perimeter of the rectangle is " + perimeter );
		
		/* Average speed in km = 14 km
		 * Time = 45 minutes and 30 seconds
		 * Average speed in miles per hour? 1 hour = 60 minutes
		 * 1 mile = 1.6 km 
		 * Speed = Distance / Time                           1.10 sorusu
		 */ 
		double miles = 14 / 1.6;
		double time = 45.5 / 60;
		double averageSpeed = miles / time;
		System.out.println("The runner's average speed is " + averageSpeed + " miles per hour.");
		/* Population projection 
		 * The U.S. Census Bureau projects population based on the following assumptions:
		 * One birth every 7 seconds.
		 * One death every 13 seconds.
		 * One new immigrant every 45 seconds.
		 * Write a program to display the population for each of the next 5 years. Assume the current population is 312, 032, 486.
		 * One year has 365 days. 
		 */
		int secondsPerYear = 365 * 24 * 60 * 60;
		int population = 312032486;
		
		System.out.println("Year 0 " + population); // 1.11 sorusu
		
		int birth = secondsPerYear / 7;
		int death = secondsPerYear / 13;
		int immigrant = secondsPerYear / 45;
		
		population = population + birth - death + immigrant; 
		
		System.out.println("Year 1 " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year 2 " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year 3 " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year 4 " + population);
		
		population += birth - death + immigrant;
		
		System.out.println("Year 5 " + population);
		
		/* Average speed in km per hour?   1.12 sorusu
		 * 1 miles = 1.6 km 
		 * Speed = Distance / Time
		 * Distance = 24 miles (38.4 km)
		 * Time = 1 hour, 40 minutes and 35 seconds
		 * Put 60.0 instead of 60; otherwise it gives the wrong result. 
		 */
		
		double time1 = ((((60.0 + 40 ) * 60) + 35) / 60) / 60;
		double kilometer = 24 * 1.6;
		System.out.println("Average speed in kilometers per hour " + kilometer / time1);
		
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
		System.out.println("x = " + x + "\ny = " + y);		
		System.out.println((3.4 * 2.623901496861419) + (50.2 * 0.7087397392563978));
		
		double mileS = 100;
		
		final double KILOMETERS_PER_MILE = 1609;
		
		double kilometers = mileS * KILOMETERS_PER_MILE;
		
		System.out.println(kilometers);
		
		float f1 = 12.5F;
		int i = (int)f1;
		System.out.println("f is " + f1);
		System.out.println("i is " + i);
		
	}
		   } 
		
