package Q524;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();//n1정수 입력
		int n2 = sc.nextInt();//n2정수 입력
		
		sc.close();//입력값 종료
		
		boolean b1 = n1 != 0;// b1는 n1(입력받은값)이 0이 아닐때 
		boolean b2 = n2 != 0;// b2는 n2(입력받은값)이 0이 아닐때 
		System.out.print((b1 && b2) +" "+(b1||b2));
		
	
	}

}
