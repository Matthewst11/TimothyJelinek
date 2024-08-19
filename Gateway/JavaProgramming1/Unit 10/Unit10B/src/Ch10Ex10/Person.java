package Ch10Ex10;

import java.util.Scanner;

public class Person {

   private String firstName;
   private String lastName;
   private String address;
   private String zip;
   private String phone;

   public Person() {

       setData();
   }

   public void setData() {

       Scanner scan = new Scanner(System.in);

       System.out.print("Enter the person's first name: ");
       this.firstName = scan.nextLine();
       System.out.print("Enter the person's last name: ");
       this.lastName = scan.nextLine();
       System.out.print("Enter the person's address: ");
       this.address = scan.nextLine();
       System.out.print("Enter the person's zipcode: ");
       this.zip = scan.nextLine();
       System.out.print("Enter the person's phone: ");
       this.phone = scan.nextLine();

   }

   public String display() {
       return firstName + " " + lastName + " " + address + " " + zip + " " + phone;
   }

}