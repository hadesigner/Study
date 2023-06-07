package Q613;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		MainField fiv = new MainField();
		Scanner sc = new Scanner(System.in);

		
		fiv.Name = sc.next();
		fiv.School = sc.next();
		fiv.Grade = sc.nextInt();
		
		sc.close();
		
		System.out.println("Name : " + fiv.Name);
		System.out.println("School : " + fiv.School);
		System.out.println("Grade : " + fiv.Grade);
	}

}
//public class Main{
//	public static void main(String[] args) {
//		MainField[] fivarr = new MainField[2];
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<fivarr.length; ++i) {
//			fivarr[i].Name = sc.next();
//			fivarr[i].School = sc.next();
//			fivarr[i].Grade = sc.nextInt();
//		}
//		
//		
//		sc.close();
//		
//		System.out.println("Name : " + fivarr[i].Name);
//		System.out.println("School : " + fivarr[i].School);
//		System.out.println("Grade : " + fivarr[i].Grade);
//	}
//}

