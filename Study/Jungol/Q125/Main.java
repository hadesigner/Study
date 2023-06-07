package Q125;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();//입력 
		sc.close();//입력종료
		
		int cont = 1;//배열을 0부터 1~로 채우기 위해 변수 선언.
		
		for(int i=0; i<n1; i++) {//i는 n1보다 작다 . i는 1씩 증가 반복
			int[]arr = new int[n1];//int[]< new int[n1]의 값을 저장
			arr[i] = cont++;//cont++가 하나씩 증가하여 arr[i]에 값이 들어간다.
			if(i < n1) {//-1은 n1-1을 하다가 0되면 else로 넘어가서 콤마를 제거한다. 
				System.out.print(arr[i]+" "); //만약 i가 n1-1보다 작다 (참)이면 arr[i]에 저장된 값을 출력하면서 콤마 추가.
			}
		}
		
		
	}

}
