package Q115;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int height1 = sc.nextInt();
		int weight1 = sc.nextInt();
		int height2 = sc.nextInt();
		int weight2 = sc.nextInt();
	
		sc.close();

		int s = (height1>height2)&&(weight1>weight2) ? 1 : 0 ;
		System.out.print(s);

	}

}
