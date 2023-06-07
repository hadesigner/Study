package Q574;

import java.util.Scanner;

public class Main_t {
	public int maxRet(int[] p) {	// p = ar;
		int max = 0;
		if(p[0] > p[1]) {
			if(p[0] > p[2]) {
				max = p[0];
			}else {
				max = p[2];
			}
		}else {
			if(p[1] > p[2]) {
				max = p[1];
			}else {
				max = p[2];
			}
		}
		return max;
	}

	public int maxRet(int n1, int n2, int n3) {
		int max = 0;
		if(n1 > n2) {
			if(n1 > n3) {
				max = n1;
			}else {
				max = n3;
			}
		}else {
			if(n2 > n3) {
				max = n2;
			}else {
				max = n3;
			}
		}

		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[3];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}

		Main m = new Main();

		int ret = m.maxRet(ar[0], ar[1], ar[2]);
		int ret2 = m.maxRet(ar);
		System.out.println(ret);
		System.out.println(ret2);
		let sumsum = 0;
		num10.forEach( (item) => {
		  sumsum += item;
		});
	}
}