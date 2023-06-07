package Q3052;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] Num = new int[10];
		for(int i=0; i<Num.length; i++) {
			Num[i] = sc.nextInt(); 
		}
		sc.close();
		
		//1단계
//		for(int i=0; i<Num.length;i++) {
//			System.out.print(Num[i] + " ");
//		}
//		System.out.println();
		
		//2단계
		int[] rem = new int[10];
		for(int i = 0; i<Num.length; i++) {
			rem[i] = Num[i]%42;
		}
		for(int i = 0; i<rem.length; i++) {
//			System.out.print(rem[i]+" ");
		}
		//3단계
		int[] answer = new int[rem.length];
		answer[0] = rem[0];

		int answerCount = 1;
		for (int i = 1; i < rem.length; ++i)
		{
			boolean isSame = false;
			for (int j = 0; j < answerCount; ++j)
			{
				if (answer[j] == rem[i])
				{
					isSame = true;
					break;
				}
			}
			if (isSame == false)
			{
				answer[answerCount] = rem[i];
				++answerCount;
			}
		}

		System.out.println(answerCount);
		
	}

}
