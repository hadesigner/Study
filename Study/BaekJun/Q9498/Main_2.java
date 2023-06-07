package Q9498;

import java.util.Scanner;

public class Main_2 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
//3. switch - case
			int i = sc.nextInt();

			
			switch(i/10) {
			case 10 : 
			case 9 : 
				System.out.println("A");
				break;
			case 8 : 
				System.out.println("B");
				break;
			case 7 : 
				System.out.println("C");
				break;
			case 6 :
				System.out.println("D");
				break;
			default:
				System.out.println("F");
				break;
			}




			}

		}
