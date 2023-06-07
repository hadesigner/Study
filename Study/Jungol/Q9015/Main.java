package Q9015;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력하시오. ");
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		sc.close();

		System.out.println(int1 + " + " + int2 + " = " + (int1 + int2));
		System.out.println(int1 + " * " + int2 + " = " + (int1 * int2));

	}

}
