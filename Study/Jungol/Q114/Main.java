package Q114;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		int inputNum1 = sc.nextInt();
		int inputNum2 = sc.nextInt();
	
		sc.close();

		System.out.printf("%d %d\n" ,(++inputNum1),(inputNum2--));
		System.out.printf("%d %d" ,(inputNum1),(inputNum2));
	
	}

}
