package Ch5Ex3;

import java.util.Scanner;

public class ShadyRestRoom {

	public static void main(String[] args) {
		int selection;
		int price;
		String result;
		final int QUEEN = 1, KING = 2, SUITE = 3;
		final int QPRICE = 125, KPRICE = 139, SPRICE = 165;
		final String QSTRING = "Queen bed", KSTRING = "King bed", SSTRING = "Suite with a king bed and pull-out couch",
				INVALIDSTRING = "an invalid option";
		
		Scanner input = new Scanner(System.in);
		System.out.println("\n\n\nMenu\n");
		System.out.println("--------------------------------------------");
		System.out.println("(" + QUEEN + ")" + QSTRING);
		System.out.println("(" + KING + ") " + KSTRING);
		System.out.println("(" + SUITE + ")" + SSTRING);
		System.out.println("--------------------------------------------");
		System.out.println("Enter Selection (1, 2, or 3) >> ");
		selection = input.nextInt();
		
		if (selection == QUEEN){
			price = QPRICE;
			result = QSTRING;
			
		}
		else if (selection == KING){
				price = KPRICE;
				result = KSTRING;
		}
		else if (selection == SUITE){
				price = SPRICE;
				result = SSTRING;
		}
		else {
			result = INVALIDSTRING;
			price = 0;
		}
		System.out.println("You selected " + result + " $" + price);
		
		}
	}


