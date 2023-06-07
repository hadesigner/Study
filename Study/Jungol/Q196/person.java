package Q196;
import java.util.Scanner;


class Personset{
	private String name,number,add;
	public Personset(String name, String number, String add) {
	this.name = name;
	this.number = number;
	this.add = add;
	
	}
}

public class person {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Personset[] info = new Personset[3];
	
	for(int i=0;i<info.length;i++) {
		System.out.print("");
		String name = sc.nextLine();
		System.out.print("");
		String number = sc.nextLine();
		System.out.print("");
		String add = sc.nextLine();
		info[i] = new Personset(name,number,add);
	}
	
	for(int i=0; i<Personset.length; i++) {
		System.out.print("");
		
	}
	
	
	

	}
}
