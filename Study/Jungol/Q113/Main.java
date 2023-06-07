package Q113;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int rech = sc.nextInt();
		int recv = sc.nextInt();
		
		int w = rech+5; // rech+=5; // rech = rech + 5;
		int h = recv*2; // recv*=2; // recv = recv * 2;
		
		System.out.printf("width = %d\nlength = %d\narea = %d", w,h,w*h);
	}

}
