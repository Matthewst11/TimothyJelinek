package Ch10Ex10;

import java.util.Scanner;

public class CollegeEmployee extends Person {

   private String ssn;
   private double salary;
   private String department;

   public CollegeEmployee() {
   }

   @Override
   public void setData() {
       super.setData();
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter SSN: ");
       this.ssn = scan.nextLine();
       System.out.print("Enter Salary: ");
       this.salary = scan.nextDouble();
       scan.nextLine();
       System.out.print("Department: ");
       this.department = scan.nextLine();
   }

   @Override
   public String display() {
       return super.display() + "\n" + "SSN: " + ssn + " Salary $" + salary + " Department: " + department;
   }

}
