
public class DemoHorses {

	public static void main(String[] args) {
		Horse horse1 = new Horse();
		RaceHorse horse2 = new RaceHorse();
		
		horse1.setName("Old Paint");
		horse1.setColor("Brown");
		horse1.setBirthYear(2017);
		
		horse2.setName("Champion");
		horse2.setColor("Black");
		horse2.setBirthYear(2019);
		horse2.setRaces(5);
		
		System.out.println(horse1.getName() + " is " + horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
		System.out.println(horse2.getName() + " is " + horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
		
		System.out.println(horse2.getName() + " has been in " + horse2.getRaces() + " races.");

	}

}
