package Q2441;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
				
		for(int i=1; i<=N; i++) {
			for(int j=0; j<=N-i; j++ ) {
				System.out.print("*");
			}
			for(int k=1; k<i; k++) {
				System.out.print("1");
			}
			System.out.println();
		}

	}
}
