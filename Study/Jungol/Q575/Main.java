package Q575;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 =  sc.nextInt();
		double num2 =  sc.nextInt();
		
		sc.close();
		
		double powValue = Math.pow(num1,num2);
		if(num1<=10) {
			System.out.println((int)powValue);
		}		
	}
}
