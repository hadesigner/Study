package Q540;

import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			int num = sc.nextInt();
			if(num%3==0) {
				System.out.println(num/3);
			}
			else if(num%3==1){
				
			}
			else if(num==-1) {
				break;
			}
					
		}
		
		sc.close();


	}

}
