package Q515;

import java.util.Scanner;

public class Main{

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	

			int i = sc.nextInt();
			int j = sc.nextInt();
			sc.close();
			
			System.out.println(i);
			System.out.println(j);
			if(i>=j) {
				//1. num1 >= num2
//				System.out.printf("%d * %d = %d\n",i,j,(i*j));
//				System.out.printf("%d / %d = %d\n",i,j,(i/j));
			}
			else {
				//2. num1 < num2
				//case.1 i,j위치를 바꾼다
//				System.out.printf("%d * %d = %d\n",j,i,(j*i));
//				System.out.printf("%d / %d = %d\n",j,i,(j/i));
				
				//case.2 어떻게 마이너스시켜서 답이나옴 . 신기
//				int m = i-j;
//				j = i-m;
//				i = i+m;
				
//				System.out.println(i + "*" + j + " = " + (i * j));
//				System.out.println(i + "/" + j + " = " + (i / j));
				//case.3 swap
				
				int tmp = i;
				i = j;
				j = tmp;
				
				System.out.println(i + "*" + j + " = " + (i * j));
				System.out.println(i + "/" + j + " = " + (i / j));
			}
			
			


			}

		}
