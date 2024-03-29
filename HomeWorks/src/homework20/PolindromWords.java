package homework20;

import java.util.Arrays;
import java.util.Scanner;

public class PolindromWords {
	public static void main(String[] args) {
		boolean quit = false;
		while (quit == false) {
			System.out.print("Kelime Giriniz : ");

			Scanner scan = new Scanner(System.in);
			String userWord = scan.next();

			char[] ch = new char[userWord.length()];
			char[] chTCopy = new char[userWord.length()];

			for (int i = 0; i < userWord.length(); i++) {
				ch[i] = userWord.charAt(i);
			}

			for (char c : ch) {
				System.out.print("[" + c + "]");
			}
			System.out.println();

			for (int i = ch.length - 1; i >= 0; i--) {
				chTCopy[i] = ch[ch.length - i - 1];
			}

			for (char c : chTCopy) {
				System.out.print("[" + c + "]");
			}
			for (int i = 0; i < ch.length - 1; i++) {
				if (Arrays.equals(ch, chTCopy)) {
					System.out.println("Polindrom Kelimedir .");
					break;
				} else {
					System.out.println("Polindrom Kelime Değil.");
					break;
				}
			}
			System.out.println(
					"Devam Etmek istemez iseniz 'h' olarak belirtiniz, devam etmek için 'e' olarak belirtiniz");
			String quitE = scan.next();
			if (quitE.equals("h")) {
				quit = true;
				System.out.println("Görüşmek üzere çıkış yaptınız.");

			}
		}

	}

}
