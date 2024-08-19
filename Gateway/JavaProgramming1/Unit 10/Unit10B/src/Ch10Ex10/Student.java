package Ch10Ex10;

import java.util.Scanner;

public class Student extends Person {

   private String major;
   private double gpa;

   public Student() {

   }

   @Override
   public void setData() {
       super.setData();
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter the student's major: ");
       this.major = scan.nextLine();
       System.out.print("Enter the student's GPA: ");
       this.gpa = scan.nextDouble();
       scan.nextLine();
   }

   @Override
   public String display() {

       return super.display() + "\n" + " Major: " + major + " GPA: " + gpa;
   }

}