package Q525;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int inputNum1 = sc.nextInt();
		int inputNum2 = sc.nextInt();
		int inputNum3 = sc.nextInt();
		
		sc.close();
		int max;
		int eql;

		max = inputNum1>inputNum2 && inputNum1>inputNum3 ? 1 : 0 ;
		eql = inputNum1==inputNum2 && inputNum2==inputNum3 ? 1 : 0;
		
		System.out.print(max+" "+eql);
		
	    	
	}
		
}
