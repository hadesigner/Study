package Q572;
import java.util.Scanner;
public class MainExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt(); 
		sc.close();
		
		System.out.println(r);
		
		Main circle = new Main(r);
		
		double area = circle.getArea();
		System.out.printf("%.2f",area);
	}
}
