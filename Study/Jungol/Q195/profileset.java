package Q195;
import java.util.Scanner;
public class profileset {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		String number = sc.next();
		String add = sc.next();
		sc.close();
		
//		System.out.println(name);
//		System.out.println(number);
//		System.out.println(add);

		profile p1 = new profile (name,number,add);
		p1.objprint();
	}
}
