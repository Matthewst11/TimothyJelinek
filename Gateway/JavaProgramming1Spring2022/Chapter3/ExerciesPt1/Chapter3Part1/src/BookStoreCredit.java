import java.util.Scanner;

public class BookStoreCredit {

	public static void main(String[] args) {
		double GPA;
		String name;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a name >> ");
		name = input.nextLine();
		System.out.print("Please enter GPA >> ");
		GPA = input.nextDouble();
		
		
		System.out.println("Student named " + name + " had a GPA of " + GPA + " and earned $" + GPA * 10 + " bookstore credit." );

	}

}
