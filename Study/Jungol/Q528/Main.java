package Q528;
//정수를입력받는다 . 
//첫줄에 입력받은 숫자를 출력한다.
//입력받은 숫자가 음수이면 둘째줄에 minus 출력작성한다.
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);			
			int age = sc.nextInt();
			sc.close();
			
			System.out.println(age);
			
			if(0>age) 
			{
				System.out.print("minus");
			}			

		}

	}
	
	
