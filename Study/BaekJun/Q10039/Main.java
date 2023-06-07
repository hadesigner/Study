package Q10039;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 40) {
				num[i] = 40;

			}
			sum += num[i];
		}
		System.out.println(sum / 5);

	}

}
