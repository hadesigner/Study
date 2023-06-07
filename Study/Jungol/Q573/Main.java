package Q573;

import java.util.Scanner;

public class Main {
	public static void cont(int num) {
		int cont = 1;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(cont++ + " "); // 1씩 증가
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		sc.close();

		System.out.println(num);

		cont(num); // 메소드 호출부

	}

}
