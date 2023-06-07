package Q558;

import java.util.Scanner;

public class Main {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int[] num = new int[100];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = sc.nextInt();
//			for (int n = 0; n < i; i--) {
//				if (num[i] == 0) {
//					System.out.print(num[i]);
//				}
//			}break;
//			
//
//
//		}
//		sc.close();
//
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] ar = new int[100];
//		int inp = 0, idx = 0;
//		do {
//			inp = sc.nextInt();
//			ar[idx++] = inp;
//		} while (inp != 0);
//		sc.close();
//
//		for (int i = 0; i < idx; i++) {
//		}
//		System.out.println();
//		for (int i = idx - 1; i >= 0; i--) {
//			System.out.print(ar[i] + " ");
//
//		}

		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] == 0)
				break;
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] != 0)
				System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
