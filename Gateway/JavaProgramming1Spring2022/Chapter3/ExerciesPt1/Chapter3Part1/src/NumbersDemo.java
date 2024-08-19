
public class NumbersDemo {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 5;
		
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
