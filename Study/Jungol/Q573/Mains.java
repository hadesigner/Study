package Q573;

import java.util.Scanner;

public class Mains {
	public static void cont(int num) {
		int cont = 1;
		for(int i=0; i<num;i++) {
			for(int j=0; j<num;j++) {
				System.out.print(cont++ + " ");
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		System.out.print(num);
		cont(num);

	}

}
