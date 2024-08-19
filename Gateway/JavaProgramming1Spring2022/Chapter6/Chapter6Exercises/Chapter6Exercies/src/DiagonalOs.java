
public class DiagonalOs {

	public static void main(String[] args) {
		int spaces = 0;
		for(int a = 0; a < 10; a++) {
			for(int b = 0; b < spaces; b++) {
				System.out.print(" ");
			}
			System.out.println("O");
			spaces++;
		}

	}

}
