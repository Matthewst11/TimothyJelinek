import java.util.Scanner;

public class Alphabetize {

	public static void main(String[] args) {
		//String str1, str2, str3;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string >>> ");
		String str1 = input.nextLine();
		System.out.print("Enter a string >>> ");
		String str2 = input.nextLine();
		System.out.print("Enter a string >>> ");
		String str3 = input.nextLine();

		if(str1.toLowerCase().compareTo(str2.toLowerCase()) <= 0  && str2.toLowerCase().compareTo(str3.toLowerCase()) <= 0) {
			System.out.println("The strings are in alphabetical order.");
		}
		else {
			System.out.println("The strings are NOT in alphabetical order.");
		}
		input.close();
	}

}
