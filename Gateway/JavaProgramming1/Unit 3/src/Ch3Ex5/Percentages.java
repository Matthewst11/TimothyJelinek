package Ch3Ex5;

public class Percentages {

	public static void main(String[] args) {
		double num1 = 3.0;
		double num2 = 4.0;
		
		computePercent(num1, num2);
		computePercent(num2, num1);
	}
	private static void computePercent(double n1, double n2) {
		double percent1 = (n1/n2) * 100;
		System.out.println(n1 + " is " + percent1 + "% of " + n2);
		
	}
	

	


		
		
	
}
