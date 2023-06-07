package Q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2= 0;
		
		while(true) {
			int num = sc.nextInt();
			if (num==0){
				break;
			}
			else if((num%3==0)&&(num%5==0)){
				n1 = num;
			}
			else if((num%3!=0)&&(num%5!=0)) {
				n2++;
			}

		}	
		System.out.print(n2);
		sc.close();		
	}

}
