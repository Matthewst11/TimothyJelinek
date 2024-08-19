
public class NineInts {

	public static void main(String[] args) {
		// Initialize array
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i = 0;
		
		// Display array first to last
		for (i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		// Display array last to first
		for (i = numbers.length - 1; i >= 0; i--) {
			// System.out.println(numbers[8]);
			System.out.print(numbers[i] +  " ");
		}
		
	}

}
