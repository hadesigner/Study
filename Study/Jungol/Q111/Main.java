package Q111;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		int n3 = sc.nextInt();
//		int n4 = sc.nextInt();
		
//		System.out.println("sum " + (n1+n2+n3+n4));
//		System.out.print("avg " + (n1+n2+n3+n4)/4);
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			int inp = sc.nextInt();
			sum+=inp;
			
		}
		System.out.println("sum "+sum);
		System.out.println("avg "+sum/4);
	}

}
