package codingBat;

public class AnswerCell {

	public static void main(String[] args) {
		/*
		 * Your cell phone rings. Return true if you should answer it. Normally you
		 * answer, except in the morning you only answer if it is your mom calling. In
		 * all cases, if you are asleep, you do not answer.
		 * 
		 */

		System.out.println(answerCell(false, false, false));
		System.out.println(answerCell(false, false, true));
		System.out.println(answerCell(true, false, false));

	}

	public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

		if (isMorning) {
			if (!isMom) {
				return false;
			}
		}
		if (!isAsleep) {
			return true;
		} else {
			return false;
		}
	}
}
