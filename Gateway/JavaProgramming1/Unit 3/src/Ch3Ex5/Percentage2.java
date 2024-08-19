package Ch3Ex5;

import java.util.Scanner;

public class Percentage2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a firstnumber.");
		double n1 = input.nextDouble();
		System.out.println("Please enter a second number.");
		double n2 = input.nextDouble();;
		computePercent(n1, n2);
		computePercent(n2, n1);
		
	}

	private static void computePercent(double n1, double n2) {
		double percent1 = (n1/n2) * 100;
		System.out.println(n1 + " is " + percent1 + "% of " + n2);
		
	}

}
