package Q596;
import java.util.Scanner;
public class Main {
	   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	  String str = sc.next();//문자열 입력
	  int num = sc.nextInt();//정수 입력받기
	  sc.close();//입력 종료
	  
	  		for(int i = str.length()-1; i>=0;i--) {//char str 적은 문자를 -1씩 돌려빼준다
	  			System.out.print(str.charAt(i));//charAt(i)의 i의 문자열을 보여주는것에 length 값을 하나씩 뺀다 // 
	  			if(--num==0) {
	  				break;//만약 --num //1씩감소하는값이 == 0이 되면 break받아서 빠져나간다) 
	  			}
	  		}
	   
	   
		   
	   }
}
