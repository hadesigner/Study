package Q616;

import java.util.Scanner;
public class Main {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		
		int x1 = sc.nextInt(); //1
		int y1 = sc.nextInt();	//2
		int x2 = sc.nextInt();	//3
		int y2 = sc.nextInt();	//4
		int x3 = sc.nextInt();	// 10
		int y3 = sc.nextInt();	//20
		sc.close();
		
//		System.out.print(x1 +" " + y1+" ");
//		System.out.print(x2 +" " + y2+" ");
//		System.out.print(x3 +" " + y3+" ");
		
		//.은 메소드에 접근할수있다.
	
		Tri tri = new Tri(x1,y1,x2,y2,x3,y3);
		
		
		double dx = tri.getCoGX();
		double dy = tri.getCoGY();

		System.out.printf("(%.1f %.1f)\n",dx,dy);
		
	}

}
