package Q555;

//		for문 ~ while랑 똑같이 반복하는데 그뒤에 i들어감, 
//		조건식이 들어있으므로 구하고자 하는값의 조건이 
//		무엇인지 정확할 경우사용한다.
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] ar = new String[10];
		for (int i = 0; i < 10; i++) {
			String in = sc.next();
			ar[i] = in;
		}
		for (int i = 0; i < 10; i++) {

			System.out.print(ar[i]);
		}

		sc.close();
	}
}