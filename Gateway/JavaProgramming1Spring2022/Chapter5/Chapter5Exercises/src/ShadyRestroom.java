import java.util.Scanner;

public class ShadyRestroom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int selection;
		int price;
		String result;
		final int QUEEN = 1, KING = 2, SUITE = 3;
		final int QPRICE = 125, KPRICE = 139, SPRICE = 165;
		final String QSTRING = "Queen bed", KSTRING = "King Bed", SSTRING = "Suite with a kind bed and pull-out couch",
				INVALIDSTRING = "an invalid option";
		
		System.out.println("\n\n\tMenu\n");
		System.out.println("---------------------------------------------");
		System.out.println("(" + QUEEN + ") " + QSTRING);
		System.out.println("(" + KING + ") " + KSTRING);
		System.out.println("(" + SUITE + ") " + SSTRING);
		System.out.println("---------------------------------------------");
		System.out.println("Enter Selection (1, 2, or 3) >> ");
		
		selection = input.nextInt();
		
		if (selection == QUEEN) {
			price = QPRICE;
			result = QSTRING;
		}
		else if (selection ==KING) {
			price = KPRICE;
			result = KSTRING;
		}
		else if (selection == SUITE) {
			price = SPRICE;
			result = SSTRING;
		}
		else {
			result = INVALIDSTRING;
			price = 0;
		}
		
		System.out.println("\n\nYou selected " + result + " $" + price);
	}

}
