import java.util.Scanner;

public class DistanceFromAverageWithExceptionHandling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers;
		double total = 0;
		double average = 0;
		double entry = 0;
		int x = 0;
		boolean canCreateArray = true;
		int enteredSize = 0;
		boolean isValOk = false;
		final int QUIT = 9999;
		
		try {
			System.out.print("Please enter a value for the array size >>");
			enteredSize = input.nextInt();
		}
		catch(Exception e) {
			System.out.println("Invalid value for array size.");
			input.nextLine();
			canCreateArray = false;
		}
		
		if(canCreateArray = true) {
			try {
				numbers = new double[enteredSize];
			}
			catch(NegativeArraySizeException e) {
				System.out.println("Negative array size.");
				input.nextLine();
				enteredSize = 5;
				numbers = new double[enteredSize];
			}
			while(!isValOk) {
				try {
					System.out.print("Enter a numeric value or 9999 to quit >> ");
					entry = input.nextDouble();
					isValOk = true;
				}
				catch(Exception e){
					isValOk = false;
					input.nextLine();
				}
			}
			while(entry != QUIT && x < numbers.length) {
				numbers[x] = entry;
				x++;
				if(x < numbers.length) {
					try {
						System.out.println("Enter a numeric value or 9999 to quit >> ");
						entry = input.nextDouble();
					}
					catch(Exception e) {
						input.nextLine();
						--x;
					}
					
				}
			}
			if(x == 0) {
				System.out.println("Average cannot be computed because no numbers were entered");
			} else {
				for(int a = 0; a < numbers.length; ++a) {
					total += numbers[a];
				}
				average = total / x;
				System.out.println("You entered " + x + " is " + "numbers and their average is " + average);
				for(int i = 0; i < x; i++) {
					System.out.println(numbers[i] + " is " + (numbers[i] - average) + " away from the average.");
			}
		}
		}
		}
}
