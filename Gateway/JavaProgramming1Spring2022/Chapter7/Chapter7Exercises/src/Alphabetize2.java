import java.util.Scanner;

public class Alphabetize2 {

	public static void main(String[] args) {
		//String str1, str2, str3;
				Scanner input = new Scanner(System.in);
				System.out.print("Enter a string >>> ");
				String str1 = input.nextLine();
				System.out.print("Enter a string >>> ");
				String str2 = input.nextLine();
				System.out.print("Enter a string >>> ");
				String str3 = input.nextLine();

				if(str1.toLowerCase().compareTo(str2.toLowerCase()) < 0) 
					if(str2.toLowerCase().compareTo(str3.toLowerCase()) < 0)
						System.out.println(str1 + " " + str2 + " " + str3);
					else if(str3.toLowerCase().compareTo(str1.toLowerCase()) < 0)
						System.out.println(str2 + " " + str1 + " " + str2);
						else System.out.println(str1 + " " + str3 + " " + str2);
				else if(str1.toLowerCase().compareTo(str3.toLowerCase()) < 0)
					System.out.println(str2 + " " + str1 + " " + " " + str3);
					else if(str3.toLowerCase().compareTo(str2.toLowerCase()) < 0)
						System.out.println(str3 + " " + str2 + " " + str1);
					else
						System.out.println(str2 + " " + str3 + " " + str1);
				
				input.close();
	}
}
				
