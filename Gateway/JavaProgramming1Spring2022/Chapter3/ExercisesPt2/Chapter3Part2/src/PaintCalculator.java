import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {
		// double height, width, length;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height of the room >>");
		double height = input.nextDouble();
		System.out.print("Enter the width of the room >>");
		double width = input.nextDouble();
		System.out.print("Enter the length of the room >>");
		double length = input.nextDouble();
		
		double cost = calcCost(height, width, length);
		System.out.println("Your total cost at $32 per gallons is $" + cost);
		
	}

	public static double calcCost(double height, double width, double length) {
		double wallArea = (height * width * 2) + (height * length * 2);
		System.out.println("Your room has a wall area of " + wallArea + " sq ft.");
		double gallonsNeeded = calcGallona(wallArea);
		System.out.println(gallonsNeeded + " gallons are needed to paint the room.");
		double total = gallonsNeeded * 32;
		return total;
	}

	public static double calcGallona(double wallArea) {
		return wallArea / 350;
	}

	
	

}
