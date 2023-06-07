package Q196;

import java.util.Scanner;

class Person {
   private String name;
   private String tel;
   private String adrs;

   public Person(String name, String tel, String adrs) {
      this.name = name;
      this.tel = tel;
      this.adrs = adrs;
   }

   public void print() {
      System.out.println(name + " " + tel + " " + adrs);
   }
   
   public char getFirstName() {
      return name.charAt(0);
   }
}

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      String tel = sc.next();
      String adrs = sc.next();
      Person p1 = new Person(name, tel, adrs);

      name = sc.next();
      tel = sc.next();
      adrs = sc.next();
      Person p2 = new Person(name, tel, adrs);

      name = sc.next();
      tel = sc.next();
      adrs = sc.next();
      Person p3 = new Person(name, tel, adrs);
      sc.close();

//      p1.print();
//      p2.print();
//      p3.print();
      
      if(p1.getFirstName() < p2.getFirstName()) {
         if(p2.getFirstName() < p3.getFirstName()) {
            p1.print();
         }else {
            p3.print();
         }
      }else {
         if(p2.getFirstName() < p3.getFirstName()) {
            p2.print();
         }else {
            p3.print();
         }
      }
   }
}