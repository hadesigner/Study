package Q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		sc.close();

		char change;

		for (int i = 0; i < str.length(); i++) {

			change = str.charAt(i);

			if (change >= 'A' && change <= 'Z') {

				System.out.print(change);

			} else if (change >= 'a' && change <= 'z') {

				System.out.print((char) (change - 32));
			}
		}
	}

}