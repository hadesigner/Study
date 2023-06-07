package Q562;
import java.util.Scanner;
public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10]; // 10개의 정수를 받을 배열
		
		for(int i=0;i<num.length;i++) { // num[i] 로 10개의 정수배열을 받아서   
			num[i] = sc.nextInt();
			System.out.print(num[i]); // num[i]에 입력된 배열들을 다 뿌려준다.
			//num[i]에 입력된 값들이 다 저장된상태, 이제 홀수번째 짝수번째 나눠주면됨.
			int even = 0, odd = 0; // even , odd // 짝수 홀수 각각 따로 값을 주기위해 초기화 시켜 대기중
			sc.close();
			while(true){
				if((num[i])%2==1){
					even=num[i];						
				}else if((num[i]%2==0)) {
					odd=num[i];
				}	
			}
			
		}System.out.print(even);
		
		
		
			
	}

}
