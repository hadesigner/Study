package Q1303;
import java.util.Scanner;
public class Main {
	public static void cont(int num1,int num2) {
		int cont = 1;
		for(int i=0;i<num1;i++) {
			for(int j=0; j<num2;j++) {
				System.out.print(cont++ + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
//		System.out.print(num1+num2);
		cont(num1,num2);
	}

}
