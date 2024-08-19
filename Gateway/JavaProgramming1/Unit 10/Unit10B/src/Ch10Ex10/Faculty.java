package Ch10Ex10;

import java.util.Scanner;

public class Faculty extends CollegeEmployee {

   private boolean isTenured;

   public Faculty() {

   }

   @Override
   public void setData() {
       super.setData();
       Scanner scan = new Scanner(System.in);
       System.out.print("Feculty memeber is: ");
       this.isTenured = scan.nextBoolean();

   }

   @Override
   public String display() {
       if (isTenured) {
           return super.display() + " Faculty member is tenured";
       } else {
           return super.display() + " Faculty member is not tenured";
       }
   }

}