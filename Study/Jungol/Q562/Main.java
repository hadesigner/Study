package Q562;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
			int[] num = new int[10];
			
			for(int i=0; i<num.length;i++) {
				num[i] = sc.nextInt();
			}
			sc.close();
			
			int even = 0, odd = 0;
			
			for(int i=1; i<num.length;i+=2) { //i = i+2;
				even +=num[i];
			}
			for(int i=0; i<num.length;i+=2) { //i = i+2;
				odd +=num[i];
			}
			System.out.printf("sum : %d\n",(even));
			System.out.printf("avg : %.1f",(odd)/(num.length/(double)2));
			
		
	}

}
