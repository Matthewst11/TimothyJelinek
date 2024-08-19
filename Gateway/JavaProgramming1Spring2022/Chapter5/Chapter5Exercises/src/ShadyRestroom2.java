import java.util.Scanner;

public class ShadyRestroom2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int selection;
		int price;
		String result;
		String view = "no";
		final int QUEEN = 1, KING = 2, SUITE = 3;
		final int QPRICE = 125, KPRICE = 139, SPRICE = 165;
		final String QSTRING = "Queen bed", KSTRING = "King Bed", SSTRING = "Suite with a kind bed and pull-out couch",
				INVALIDSTRING = "an invalid option";
		final int LAKE = 1, PARK = 2;
		final String LSTRING = "a lake", PSTRING = "a park", VIEW_ERRORSTRING = "an invalid view, so using lake";
		final int LPREMIUM = 15;
		
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
		
		//System.out.println("\n\nYou selected " + result + " $" + price);
		
		if (price != 0) {
			System.out.println("\nPlease choose a view:");
			System.out.println("(" + LAKE + ") " + LSTRING);
			System.out.println("(" + PARK + ") " + PSTRING);
			System.out.println("Enter Selection (1 or 2) >> " );
			selection = input.nextInt();
			if (selection == LAKE) {
				price += LPREMIUM; // price = price + LPREMIUM
				view = LSTRING;
			}
			else if (selection == PARK) {
				view = PSTRING;
			}
			else {
				price += LPREMIUM;
				view = VIEW_ERRORSTRING;
			}
		}
		System.out.println("\nYou selected " + result + " with " + view + " view for $" + price);
		
	}

}
