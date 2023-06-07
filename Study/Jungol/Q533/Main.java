package Q533;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		String s = sc.next();
		int a = sc.nextInt();

		sc.close();
		
		if((s.equals("M"))&&(a>=18)) {
			System.out.println("MAN");
		}
		else if((s.equals("M"))&&(a<18)) {
			System.out.println("BOY");
		}
		else if((s.equals("F"))&&(a>=18)) {
			System.out.println("WOMAN");
		}
		else if((s.equals("F"))&&(a<18)) {
			System.out.println("GIRL");
		}
		else {
			System.out.println("사람이 아닙니다.");
		}
	}

}
