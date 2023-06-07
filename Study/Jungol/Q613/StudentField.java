package Q613;

import java.util.Scanner;

public class StudentField {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String school = sc.next();
		int grade = sc.nextInt();
//	생성자 이용
		Student s1 = new Student(name,school,grade);
//	생성자 없이 생성
//		Student s1 = new Student();
//		name = sc.next();
//		school = sc.next();
//		grade = sc.nextInt();
//		sc.close();
		
//		s2.name = name;
//		s2.school = school;
//		s2.grade = grade;
		
//		생성자 바꾸기
		
		Student s2 = new Student(name,school,grade);
		sc.close();
		s2.name = name;
		s2.school = school;
		s2.grade = grade;
		
		System.out.println("Name : " + s1.name);
		System.out.println("School : " + s1.school);
		System.out.println("Grade : " + s1.grade);
		System.out.println("Name : " + s2.name);
		System.out.println("School : " + s2.school);
		System.out.println("Grade : " + s2.grade);
		
	}

}