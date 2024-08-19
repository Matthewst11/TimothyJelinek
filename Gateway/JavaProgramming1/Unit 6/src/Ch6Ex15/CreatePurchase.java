package Ch6Ex15;

import java.util.Scanner;

public class CreatePurchase {

	public static void main(String[] args) {
		Purchase purchase = new Purchase();
		Scanner s =new Scanner(System.in);
		System.out.println("Please enter the details:");
		while(true) {
			System.out.println("Enter an invoice number between 1,000 and 8,000: ");
			int i = s.nextInt();
			if(i>=1000 && i<=8000) {purchase.setInvoiceNum(i);break;}
			else System.out.println("Invalid entry.  Please try again.");
			
		}
		while(true) {
			System.out.println("Enter the amount of the sale(positive number):");
			int i=s.nextInt();
			if(i>=0) {
				purchase.setAmountOfSale(i);break;}
			else System.out.println("You entered a negative number.  Please try again.");
			
			
		}
		purchase.display();
		

	}

}
