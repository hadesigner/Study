package Q597;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		String str1 = sc.next();
		String str2 = sc.next();
		
		sc.close();
		System.out.printf("%d",(str1.length()+str2.length()));
	}

}
