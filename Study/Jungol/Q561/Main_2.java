package Q561;
import java.util.Scanner;
public class Main_2 {

	public static void main(String[] args) {
		
		int min = 0;
		int max = 9999;
		int[] num = new int[10];

		Scanner sc = new Scanner(System.in);
		
	
		for(int i = 0; i<10; i++) { 
			num[i] = sc.nextInt();
			
			if(num[i]<100 && num[i]>min) {
				min = num[i];
			}
			else if(num[i]>=100 && num[i]<max){
				max = num[i];
			}
		}		sc.close();
		
		if(min==0) 
		{
			min=100;
		}
		if(max==9999) 
		{
			max=100;
		}

		System.out.print(min + " " + max);
	}

}
