package Q617;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Person[] p = new Person[5];
		
		for(int i=0;i<p.length;i++) {
			String name = sc.next();
			int height = sc.nextInt();
			
			p[i] = new Person(name,height);
		}
		sc.close();
		
//		for(int i=0;i<p.length;i++) {
//			p[i].print();
//		}
		
		Person min = p[0];
		for(int i=0;i<p.length;i++) {
			if(min.getHeight()>p[i].getHeight()) {
				min = p[i];
			}
		}
		min.print();
		
		
		
		
		
//		String [] num = new String[5];
//		String Str = "";
//		for(int i=0;i<num.length;i++) {
//			char ch = num.charAt;
//			if(48<=ch && ch<=57) {
//				Str += ch;
//			}
//		}
//		sc.close();
//		System.out.println(Str);
		
		
//		int i = 0;
//		int min = num[i];
//		while(i<num.length-1) {
//			min = (min<=num[i])?min:num[i];
//		}
//		System.out.println(min);
//		if(num[i]>num[i])
//		int sum = 0;
//		for(int i = 0;i<num.length;i++) {
//			if(num)
//		}
//		System.out.print(num);
		
	}
}
