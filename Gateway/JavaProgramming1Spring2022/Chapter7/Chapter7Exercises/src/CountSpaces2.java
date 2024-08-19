import java.util.Scanner;

public class CountSpaces2 {

	public static void main(String[] args) {
		String aString;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an inspirational quote >>> ");
		aString = input.nextLine();
		int numSpaces = 0;
		int stringLength = aString.length();
		//String string2 = aString.trim();
		
		for(int i = 0; i < stringLength; i++) {
			char ch = aString.charAt(i);
			if(ch == ' ') {
				numSpaces++;
			}
		}
		System.out.println("The number of spaces is " + numSpaces);

		input.close();
	}

}
