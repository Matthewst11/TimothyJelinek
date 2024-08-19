
public class DemoSugarSmash {

	public static void main(String[] args) {
		SugarSmashPlayer ssPlayer = new SugarSmashPlayer();
	      ssPlayer.setIdNumber(1111);
	      ssPlayer.setName("Alex");
	      System.out.println("\nAt start");
	      display(ssPlayer);       
	      ssPlayer.setScore(200, 0);
	      System.out.println("\nAfter setting first score");
	      display(ssPlayer);
	      System.out.println("Trying to set fifth score too soon");
	      ssPlayer.setScore(30, 4);
	      System.out.println("\nAfter setting second score");
	      ssPlayer.setScore(30, 1);
	      display(ssPlayer);
	      System.out.println("\nTrying to set third score when second is too low");
	      ssPlayer.setScore(100, 2);
	      display(ssPlayer);
	      System.out.println("\nAfter setting second, third, fourth, and fifth scores");
	      ssPlayer.setScore(100, 1);
	      ssPlayer.setScore(300, 2);
	      ssPlayer.setScore(400, 3);
	      ssPlayer.setScore(10, 4);
	      display(ssPlayer);
	      System.out.println("\nTrying to set eleventh score");
	      ssPlayer.setScore(100, 10);

	}
	public static void display(SugarSmashPlayer p) {
	      System.out.println("   ID #" + p.getIdNumber() + "  Name: " +
	         p.getName());
	      for(int x = 0; x < p.getLevels(); ++x)
	         System.out.print("   " + p.getScore(x));
	      System.out.println();
		}
	

}

