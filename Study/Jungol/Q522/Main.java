package Q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
	
		sc.close();
		
		if(num1==num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(num1!=num2) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
//		
//		case1.
		int[]inp=new int[2];
		if(inp[0]==inp[1]) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
		if(inp[0]!=inp[1]) {
			System.out.print("1");
		}else {
			System.out.print("0");
		}
//		case2.삼항연산자
		int res1 = (inp[0]==inp[1]) ? 1 : 0;
		int res2 = (inp[0]==inp[1]) ? 1 : 0;
		System.out.println(res1);
		System.out.println(res2);
	}


}
