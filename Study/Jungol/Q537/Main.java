package Q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

		System.out.println(inp);
		
		//1.for
//		int sum = 0;
//		for(int i=1;i<=inp;i++) {
//			sum = sum + i ; // sum += i;
//		}
//		
//		System.out.println(sum);
		
		//2.while
		
		int sum2 = 0;
		int i2 = 0;
		while(i2 <= inp) {
			sum2 += i2++;
		}
		System.out.println(sum2);
		
		
		//3. do - while
//		int sum3 = 0;
//		int i3 = 0;
//		do {
//			sum3 += i3++;
//		}while(i3 <= inp);
//		
//		System.out.println(sum3);
		
		
//		int i = 1;
//		int sum = 0;
//		int j = sc.nextInt();
//		sc.close();
//		while (i<=j)
//		{
//			sum=sum+i;
//			i++;
//			
//		}
//		System.out.print(sum);
		
	}

}
