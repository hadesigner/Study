package Q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		sc.close();
//
//		int d = a + b + c;
//		double e = d / 3;
//		System.out.printf("sum : %d\n", d);
//		System.out.printf("avg : %.0f",e);

		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i]; // 합계
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / num.length));
	}

}
