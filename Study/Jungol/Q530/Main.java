package Q530;

import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);			
			int age = sc.nextInt();
			sc.close();
			
			if(20<=age) 
			{
				System.out.println("adult");
			}		

			else {
				int year = (20-age);
				System.out.println(year+" years later");
			}
//유형2
//			Scanner sc = new Scanner(System.in);			
//			int age = sc.nextInt();
//			sc.close();
//			
//			System.out.println(age);
//			
//			if(age>=20) 
//			{
//				System.out.println("adult");
//			} else {
//				System.out.print(20-age);
//				System.out.println("years later");
//			}
			
			
		}

	}