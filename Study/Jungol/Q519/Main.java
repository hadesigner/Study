package Q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		a+=100;
		b%=10;
//		int aa = a + 100; 
//		int c = b % 10;
		System.out.printf("%d ", (a));
		System.out.printf("%d", (b));

	}

}
