import java.util.Scanner;

public class QuartsToGallonsWithExceptionHandling {

	public static void main(String[] args) {
		final int QUARTS_IN_GALLON = 4;
		int quartsTotal = 0;
		int gallonsNeeded;
		int quartsNeeded;
		boolean isGoodUserEntry = false;
		
		Scanner input = new Scanner(System.in);
		
		while (!isGoodUserEntry) {
			try {
				System.out.print("Please enter the number of quarts of paint needed  >> ");
				quartsTotal = input.nextInt();
				isGoodUserEntry = true;
			}
			catch(Exception e) {
				input.nextLine();
				System.out.println("Invalid data entry. Please enter a number. ");
			}
		}
		
		gallonsNeeded = quartsTotal / QUARTS_IN_GALLON;
		quartsNeeded = quartsTotal % QUARTS_IN_GALLON;
		
		System.out.println("A job that needs " + quartsTotal + " quarts, requires " 
				+ gallonsNeeded + " gallons plus " + quartsNeeded + " quarts.");

		input.close();
	}

	
}
