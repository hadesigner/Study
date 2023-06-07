package Q535;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num = sc.nextDouble();

		sc.close();
//		1. switch문
		if (num >= 0 && num <= 4.5) {
			switch ((int) num) {
			case (4):
				System.out.print("scholarship");
				break;
			case (3):
				System.out.print("next semester");
				break;
			case (2):
				System.out.print("seasonal semester");
				break;
			default:
				System.out.print("retake");
				break;

			}
		}
//		2. if문

//		if(num>=4) {
//			System.out.print("scholarship");
//		}
//		else if(num>=3) {
//			System.out.print("next semester");
//		}
//		else if(num>=2) {
//			System.out.print("seasonal semester");
//		}
//		else{
//			System.out.print("retake");
//		}
	}

}
