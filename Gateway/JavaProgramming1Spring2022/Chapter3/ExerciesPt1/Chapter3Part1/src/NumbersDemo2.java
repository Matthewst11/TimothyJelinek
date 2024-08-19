import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please ener an integer >> ");
		num1 = input.nextInt();
		System.out.print("Please enter an integer >> ");
		num2 = input.nextInt();
		
		
		dislayTwiceTheNumber(num1);
		displayNumberPlusFive(num1);
		displayNumberSquared(num1);
		
		dislayTwiceTheNumber(num2);
		displayNumberPlusFive(num2);
		displayNumberSquared(num2);
		
	}




	private static void displayNumberSquared(int number) {
		System.out.println(number + " squared = " + (number * number));
		
	}

	

	private static void displayNumberPlusFive(int number) {
		System.out.println(number + " + 5 = " + (number + 5));
		
	}


	public static void dislayTwiceTheNumber(int number) {
		System.out.println(number + " * 2 = " + (number * 2));
		
	}

}
