import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter an even number or 999 to quit:  ");
		int num = input.nextInt();
		
		while(num != 999) {
			if(num % 2 == 0) {
				System.out.println("Good job! That was even!");
			}
			else {
				System.out.println("That is NOT an even number");
			}
			System.out.print("Please enter an even number or 999 to quit:  ");
			num = input.nextInt();
		}
		System.out.println("Goodbye");
	
	input.close();
	}
}
