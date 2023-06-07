package Q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int roll = str.length();
		int cnt;
		
		char[] c = new char[roll];

		for (int i = 0; i < roll; i++) {
			c[i] = str.charAt(i);
		}
		sc.close();
		
		for (int i = 0; i < roll; i++) {
			cnt = roll - 1 - i;
			for (int j = 0; j < roll; j++) {
				if (cnt == roll) {
					cnt = 0;
				}
				System.out.print(c[cnt]);
				cnt++;
			}
			System.out.println();
		}
	}

}
