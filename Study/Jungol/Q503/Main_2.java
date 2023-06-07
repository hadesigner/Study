package Q503;

public class Main_2 {

	public static void main(String[] args) {
		int height = 170;
		double weight = 68.6; 
		System.out.println("My height");
		System.out.println(height);
		System.out.println("My weight");
		System.out.printf("%.6f\n", weight);
		
		
		int v1 = 10;
		int v2 = v1;
		int v3 = v2 + v1;
		System.out.printf("안녕하세요. %d %d %f\n", v3, v1, weight);//integer 정수 // 
		System.out.printf("안녕하세요. %d %d %d", v3, v1, v2);
		System.out.println("안녕하세요 " + height);
	
		System.out.println("5 Dan\n");
		System.out.println("5 * 2 = 10");
	
		int num = 5;
		int num2 = 2;
		System.out.printf("%d Dan\n", num);
		System.out.printf("%d * %d = %d", num, num2, (num*num2));

	}

}
