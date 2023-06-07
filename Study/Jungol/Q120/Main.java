package Q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		sc.close();
		
		int max = 0, min = 0;
		max = n1>n2 ? n1 : n2;
		min = n1<n2 ? n1 : n2;
		System.out.printf("%d",(max-min));

	}

}
