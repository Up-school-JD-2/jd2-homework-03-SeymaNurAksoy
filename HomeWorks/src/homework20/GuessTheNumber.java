package homework20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {

		int sayac = 0;
		int sayac2 = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		int inputNumberFirstUser = 0;
		int inputNumberSecondUser = 0;

		boolean isItTrueFirstUser = false;
		boolean isItTrueSecondUser = false;

		Random random = new Random();
		int randomNumber = random.nextInt(100);
		
		//System.out.println(randomNumber);
		
		Scanner scan = new Scanner(System.in);
		while (isItTrueFirstUser == false || isItTrueSecondUser == false) {

			if (isItTrueFirstUser == false) {
				System.out.print("First User , Input Guess Number: ");
				inputNumberFirstUser = scan.nextInt();
			}
			if (isItTrueSecondUser == false) {
				System.out.print("Second User , Input Guess Number: ");
				inputNumberSecondUser = scan.nextInt();
			}
			if (randomNumber == inputNumberFirstUser && isItTrueFirstUser == false) {
				System.out.println("Congrats correct guess. Number");
				sayac++;
				isItTrueFirstUser = true;
			}
			if (randomNumber == inputNumberSecondUser && isItTrueSecondUser == false) {
				System.out.println("Congrats correct guess");
				sayac2++;
				isItTrueSecondUser = true;
			}

			if (randomNumber > inputNumberFirstUser && isItTrueFirstUser == false) {
				System.out.println("(First User) Too low, try again  ");
				sayac++;
			}
			if (randomNumber < inputNumberFirstUser && isItTrueFirstUser == false) {
				System.out.println("(First User) Too high, try again ");
				sayac++;
			}
			if (randomNumber > inputNumberSecondUser && isItTrueSecondUser == false) {
				System.out.println("(Second User) Too low, try again  ");
				sayac2++;
			}
			if (randomNumber < inputNumberSecondUser && isItTrueSecondUser == false) {
				System.out.println("(Second User) Too high, try again ");
				sayac2++;
			}
		}
		arrayList.add(sayac);
		arrayList.add(sayac2);
		System.out.println("Answer: " + randomNumber);

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Number of Guesses for the " + (i + 1) + ". User : " + arrayList.get(i));
		}

	}

}
