package Q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		sc.close();

		System.out.print(st1 + st1);

//		for문자열 10번 반복할시
		for (int i = 0; i < 2; i++) {
			System.out.print(st1);
		}

	}

}
