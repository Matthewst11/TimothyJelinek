
public class Factorials {

	public static void main(String[] args) {
		int factorial;
		for(int i = 1; i <= 10; i++) {
			factorial = i;
			for(int j = i - 1; j > 0; --j) {
				// factorial *= j;
				factorial = factorial * j;
			}
			System.out.println("The factorial f " + i + " is " + factorial);
		}

	}

}
