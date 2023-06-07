package Q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		int[]cont = new int[10];
		
		
		int min=10000; 
		int max=0;
//		int input = 0;
		for(int i=0;i<10;i++) {
			cont[i] = sc.nextInt();
			if(cont[i]<100) {
				min = cont[i];
				
			}
			else if (cont[i]>=100)  {
				max = cont[i];
				
			}
		}
		sc.close();
		if (min == 10000) min = 100;
		if (max == 0) max = 100;
	
		System.out.print(min + " " + max);
	}

}
