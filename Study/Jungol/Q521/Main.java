package Q521;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int sum;
		sum=(a++)*(--b);
		
				
		System.out.println(a + " " + b + " " +sum);


	}

}
