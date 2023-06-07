package Q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double yd = sc.nextDouble();
		sc.close();

		System.out.printf("%.1fyard = %.1fcm\n", yd, (yd * 91.44));

	}

}
