package Q571;

import java.util.Scanner;

public class MainExample {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	sc.close();
	
		System.out.println(n);
		
		Main to = new Main();
		
		for(int i=0;i<n;i++) {
			to.printStr();
		}
	}

}
