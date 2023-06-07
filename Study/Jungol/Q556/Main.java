package Q556;

public class Main {


	public static void main(String[] args) {

//		int[] ar = new int[10];
//		case.1
//		ar[0] = 1; ~~ ar[9] = 10;		

//		case.2
//		for(int i=0; i<ar.length;i++) {
//			ar[i] = i + 1;
//		}
//		System.out.print(ar[0] + " ");
//		System.out.print(ar[1] + " ");
//		System.out.print(ar[2] + " ");
//		System.out.print(ar[3] + " ");
//		System.out.print(ar[4] + " ");
//		System.out.print(ar[5] + " ");
//		System.out.print(ar[6] + " ");
//		System.out.print(ar[7] + " ");
//		System.out.print(ar[8] + " ");
//		System.out.print(ar[9] + " ");

//		case.3
		int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]);
			if (i < ar.length - 1) {
				System.out.print(" ");
			}

//			if(i<9) 
//			{
//			System.out.print(" ");
//			};
		}

	}

}
