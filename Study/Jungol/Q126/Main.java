package Q126;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		

		int odd = 0, even = 0;
		while(true) {
			int num = sc.nextInt();
			
			if(num==0) {
				break;
			}else if(num%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		sc.close();
			System.out.println("odd : " + odd);
			System.out.println("odd : " + even);
		}
	}

