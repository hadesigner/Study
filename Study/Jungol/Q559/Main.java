package Q559;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
		double[]scores = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
			
		System.out.printf("%.1f \n",(scores[num1-1] + scores[num2 - 1]));
	}

}
