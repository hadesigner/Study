package Q9010;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		// 1.swap
//		int c = a;
//		a = b;
//		b = c;
//		System.out.print(a + " " + b);

		// 2.
		List<?> ar = Arrays.asList(10, 20);
		System.out.println(ar);
		Collections.swap(ar, 0, 1);
		System.out.println(ar);

		System.out.println(a + " " + b);

	}

}
