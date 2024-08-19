
public class Population {

	public static void main(String[] args) {
		double mexicoPop = 128;
		double usPop = 323;
		final double MEXICO_RATE = 0.0101;
		final double US_RATE = 0.0015;
		int year = 0;
		
		System.out.println("Years    Mexico Pop    US Pop (millions)");
		System.out.println("----------------------------------------");
		
		while(usPop > mexicoPop) {
			mexicoPop = mexicoPop + (mexicoPop * MEXICO_RATE);
			usPop = usPop - (usPop * US_RATE);
			year++;
			System.out.println(year + " " + mexicoPop + " " + usPop);
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("\nThe population of Mexico will exceed the U.S. population in " + year + " years");
		System.out.println("The population of Mexico will be " + mexicoPop + " million");
		System.out.println("and the population of the U.S. will be " + usPop + " million");

	}

}
