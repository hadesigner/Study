package Q1291;
import java.util.Scanner;
public class Mainn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int fi = sc.nextInt();
		int se = sc.nextInt();
		

		
		sc.close();
		
		int cnt = fi < se ? 1 : -1;

		for (int i = 1; i < 10; ++i)
		{
			for (int j = fi; ; j += cnt) 
			{
				System.out.printf("%d * %d =%3d   ", j, i, (j*i));

				if (j == se)
				{
					break;
				}

			}
			System.out.print("\n");

		}
	}

}