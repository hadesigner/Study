package Q632;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		sc.close();
		
		int min = 0;
		min = n1<n2 ? n1 : n2;
		min = min<n3 ? min : n3;
		System.out.println(min);
		

	}
}
