import java.util.Scanner;

public class Percentages2 {

	public static void main(String[] args) {
		double num1 = 0;
		double num2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a double >> ");
		num1 = input.nextDouble();
		System.out.print("Please enter a double >>");
		num2 = input.nextDouble();
		
		computePercent(num1, num2);
		computePercent(num2, num1);
		

	}
	public static void computePercent(double n1, double n2) {
		System.out.println(n1 + " is " + (n1 / n2 * 100) + " percent of " + n2);
	}

}
