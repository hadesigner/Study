package Q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		
		StringTokenizer st = new StringTokenizer(str);
		int n = st.countTokens();
		System.out.println(n);
		
		while(st.hasMoreTokens()) {
			String token =st.nextToken();
			System.out.println(token);
		}

//		int cont = 1;
//		
//		for(int i=0;i<str.length();i++) {
//			if(str.charAt(i)==' ') {
//				cont++;
//			}
//		}
//						
//		sc.close();
//		
//		System.out.println(cont);
	}

}
