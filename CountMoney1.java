package codingBat;

import java.util.Scanner;

public class CountMoney1 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("The ammount you enter:"); // print ayrintisina dikkat et!
		
		double ammount = input.nextDouble();
		
		int remainingAmmount = (int) (ammount * 100);
		
		int aNumberOfDollars = remainingAmmount / 100;
		remainingAmmount %= 100;
		
		int aNumberOfQuarters = remainingAmmount / 25;
		remainingAmmount %= 25;
		
		int aNumberOfDimes = remainingAmmount / 10;
		remainingAmmount %= 10;
		
		int aNumberOfNickels = remainingAmmount / 5;
		remainingAmmount %= 5;
		
		int pennies = remainingAmmount;
		
		System.out.println("The ammount you enter: " + ammount + " For Example $11.56");
		System.out.println("The ammount of Dollars: " + aNumberOfDollars);
		System.out.println("The ammount of Quarters: " + aNumberOfQuarters);
		System.out.println("The ammount of Dimes: " + aNumberOfDimes);
		System.out.println("The ammount of Nickels: " + aNumberOfNickels);
		System.out.println("The ammount of Pennies" + pennies);
		
	}

}
