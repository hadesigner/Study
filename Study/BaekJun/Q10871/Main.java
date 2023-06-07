package Q10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inputArrNum;
		int inputCheckNum;

		inputArrNum = sc.nextInt();
		inputCheckNum = sc.nextInt();

//		sc.close();

		int[] inputArr = new int[inputArrNum];

		for (int i = 0; i < inputArr.length; ++i) {
			inputArr[i] = sc.nextInt();
		}

		for (int i = 0; i < inputArr.length; ++i) {
			if (inputArr[i] < inputCheckNum) {
				System.out.print(inputArr[i] + " ");
			}
		}
	}
}
