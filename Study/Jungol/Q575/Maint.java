package Q575;

import java.util.Scanner;

public class Maint {
	public static int nump(int p1, int p2) {
		int ret = 1;
		
		for(int i=0;i<p2;i++ ) {
			ret *= p1;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		int r = nump(num1,num2);
		System.out.println(r);
	}

}
