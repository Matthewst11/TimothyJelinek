package Ch10Ex10;

import java.util.Scanner;

public class CollegeList {

   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       Person[] persons = new Person[14];
       String choice;
       int i = 0;
       do {
           menu();
           System.out.print("Enter the letter of your choice: ");
           choice = scan.nextLine();
           switch (choice.toUpperCase().charAt(0)) {
           case 'C':
               persons[i] = new CollegeEmployee();
               i++;
               break;
           case 'F':
               persons[i] = new Faculty();
               i++;
               break;
           case 'S':
               persons[i] = new Student();
               i++;
               break;
           case 'Q':
               try {
                   for (Person person : persons) {

                       System.out.println(person.display());
                       System.out.println();
                   }
               } catch (Exception e) {

               }

               break;

           default:
               System.out.println("Invalid choice!try again");
               break;
           }

       } while (choice.toUpperCase().charAt(0) != 'Q');

   }

   public static void menu() {

       System.out.println("C)ollege Employee.\n" + "F)eculty.\n" + "S)tudent.\n" + "Q)uit.");
   }
}