import java.util.Scanner;

public class InchConversion {

	public static void main(String[] args) {
		final int INCHES_IN_A_FOOT = 12;
		final int FEET_IN_A_YARD = 3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an integer of inches >> ");
		int inches = input.nextInt();
		
		convertInchesToFeet(inches);
		convertInchesToYards(inches);
		

	}

	public static void convertInchesToYards(int inches) {
		double yards;
		final double INCHES_IN_A_FOOT = 12;
		final double FEET_IN_A_YARD = 3;
		yards = (inches / INCHES_IN_A_FOOT) / FEET_IN_A_YARD;
		
		System.out.println(inches + " inches is " + yards + " yards.");
	}

	public static void convertInchesToFeet(int inches) {
		int feet;
		final int INCHES_IN_A_FOOT = 12;
		feet = inches / INCHES_IN_A_FOOT;
		
		System.out.println(inches + " inches is " + feet + " feet.");
	}

}
