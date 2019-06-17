package codingBat;

public class MakeBricks {

	public static void main(String[] args) {
		/*
		 * 
		 * We want to make a row of bricks that is goal inches long. We have a number of
		 * small bricks (1 inch each) and big bricks (5 inches each). Return true if it
		 * is possible to make the goal by choosing from the given bricks. This is a
		 * little harder than it looks and can be done without any loops.
		 * 
		 */

		System.out.println(makeBricks(3, 1, 8));
		System.out.println(makeBricks(3, 1, 9));
		System.out.println(makeBricks(3, 2, 10));

	}

	public static boolean makeBricks(int small, int big, int goal) {

		if (goal > small + (big * 5) ) {

			return false;
		}
		if (goal % 5 >  small) {
			return false;
		}

		return true;
	}

}
