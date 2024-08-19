package Ex7_1;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String phrase,str;
		int len,i;
		str = "";
		System.out.print("\n\nEnter a string or phrase: ");
		phrase = input.nextLine();
		phrase = phrase.replaceAll("\\W", "");
		len = phrase.length();
		
		for(i = len-1;i>=0; i--) {
			str = str + phrase.charAt(i);
			
		}
		if(phrase.equalsIgnoreCase(str)) {
			System.out.println("You entered a palindrome.");
		}
		else {
			System.out.println("You did not enter a palindrome.");
			
		}
		System.out.println("\n");
				
	}

}
