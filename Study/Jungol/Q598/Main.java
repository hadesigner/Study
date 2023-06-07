package Q598;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char chr = sc.next().charAt(0);
			if(chr >= 'A' && chr<='Z'||chr >= 'a' && chr<='z') {
				System.out.println(chr);
			}
			else if(chr >='0' && chr<='9') {
				System.out.println((int)chr);
			}
			else {
				break;
			}
		}sc.close();
	}

}
