package Q563;
import java.util.Scanner;

//public class Main {
//
//   public static void main(String[] args) {
//      Scanner sc= new Scanner(System.in);
//      int num[]=new int[10];
//      int temp=0;
//      
//      
//      for(int i =0; i<num.length;i++) {
//         num[i]=sc.nextInt();
//      }
//      sc.close();
//      for(int i=0;i<num.length;i++) {
//         for(int j=0;j<num.length;j++) {
//            if(num[i]>=num[j]) {
//               temp=num[i];
//               num[i]=num[j];
//               num[j]=temp;
//            }
//         }
//      }
//      for(int i=0;i<num.length;i++) {
//         System.out.print(num[i]+" ");
//      }
//
//   }
//
//}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		for(int i=0; i<10; i++) {
			int inputNum = sc.nextInt();
			num[i] = inputNum;
		}
		sc.close();
		
		for(int j=0; j<num.length;j++) {
			int max = Integer.MIN_VALUE;
			int idx = 0;
			for(int i=0; i<num.length;i++) {
				if(max <num[i]) {
					max=num[i];
					idx = i;
				}
			}
			System.out.print(max+" ");
			num[idx] = -1;
		}
	}

}