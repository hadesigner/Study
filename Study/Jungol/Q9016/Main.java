package Q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요. ");
		int height = sc.nextInt();
		System.out.print("몸무게를 입력하세요. ");
		double weight = sc.nextDouble();
		System.out.print("이름을 입력하세요. ");
		String name = sc.next();

		sc.close();

//		System.out.print("키 = " + height + "\n" + "몸무게 =" + weight+ "\n" + "이름 = " + name + "\n" );
		System.out.printf("키 = %d\n", height);
		System.out.printf("몸무게 = %.1f\n", weight);
		System.out.printf("이름 = %s\n", name);
	}
}
