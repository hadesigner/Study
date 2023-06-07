package Q529;



//1.키의 값을 자연수로 입력받는다.
//2. 몸무게의 값을 자연수로 입력받는다.
//3. 첫번째줄에 몸무게+100-키 값을출력한다.
//4. 비만수치가 0보다 클경우.
//5. 다음줄에 obesity 메세지 출력한다.


import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);			
			int height = sc.nextInt();
			int weight = sc.nextInt();
			int obesity = weight+100-height;
			sc.close();
			
			System.out.println(obesity);
			
			if(0<obesity) 
			{
				System.out.println("Obesity");
			}			

		}

	}