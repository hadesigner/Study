package Q614;

import java.util.Scanner;

//public class StudentField {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		
//		s2.school = sc.next();
//		s2.grade = sc.nextInt();
//		sc.close();
//		s1.school = "Jejuelementary School";
//		s1.grade = 6;
//
//		System.out.println(s1.grade + " grade in " + s1.school);
//		System.out.println(s2.grade + " grade in " + s2.school + " School");
//		
//
//	}
//	
//}

public class StudentField {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		Student s1 = new Student("Jejuelementary School",6);
		Student s2 = new Student(school,grade);

		System.out.println(s1.grade + " grade in " + s1.school);
		System.out.println(s2.grade + " grade in " + s2.school + " School");
		

	}
	
}