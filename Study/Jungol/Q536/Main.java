package Q536;

public class Main {
	public static void main(String[] args) {

		int w = 1;
		while (w < 16) {
			System.out.printf("%d", w++);
			if (w <= 15) {
				System.out.printf(" ");
			}
			;
		}

		System.out.println();

		for (int i = 1; i < 16; i++) {
			System.out.printf("%d", i);
			if (i < 15) {
				System.out.printf(" ");
			}
			;
		}

	}
}