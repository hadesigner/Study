package Q2742;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 사용자의 입력이 있음
		
		int N = sc.nextInt(); // 정수값 N을 입력받는다
		
		sc.close(); //입력받았으면 스캐너를 닫음
		
		for(int i=1; i<=N;i++) { // for문안에서 입력한N의 정수값만큼 돈다 
			
			System.out.println(N-i+1);	//돌은 i값 출력
		}
//		for(int i=N; i>0; i--) {
//			System.out.println(i);
//		}
		
		
	}

}
