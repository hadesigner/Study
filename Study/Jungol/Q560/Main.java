package Q560;

//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int min = Integer.MAX_VALUE;
//		for (int i = 0; i < 10; ++i) {
//			int num = sc.nextInt();
//			if (num < min) {
//				min = num;
//			}
//		}System.out.print(min);
//		sc.close();
//	}
//}


//		int[]num = new int[10];//10번의 입력값저장
//		
//		for(int i=0; i<=num.length; i++) {//10번반복
//			num[i] = sc.nextInt();//10번 입력
//				}
//				sc.close();

//				}
//				System.out.print(min);	
//
//		}
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] ar = new int[10];
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
      }
      sc.close();

      int i = 0;
      int min = ar[0];
      while (i < ar.length -1) {
         min = (min <= ar[i]) ? min : ar[i];
      }
      System.out.println(min);
   }
}