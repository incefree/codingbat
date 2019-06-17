package codingBat;

public class MaringaleStrategy {

	public static void main(String[] args) {
		
		System.out.println(martinGale(400));
	}

	public static int martinGale(int money) {

		
		int target = 1200;
		int bet = 10;
		
		while (money > bet) { // while (money>bet && money<target)
			boolean win = play();
			
			if (win) {
				money += bet;
				bet = 10;
			} else {
				money -= bet;
				bet *= 2;
			}
			if (money >= target) {
				break;
			}
		}
		return money;
	}

	private static boolean play() {
		int money = 5;
		int bet = 10;
		if (money < bet) {
			return false;
		}
		return true;
	}

}
