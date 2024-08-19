
public class TestGame {

	public static void main(String[] args) {
		
		Game game1 = new Game("Blazers", "Scorers", "12pm");
		display(game1);
	}

	private static void display(Game game) {
		System.out.println("The " + game.getTeam1() + " are facing the " + 
	game.getTeam2() + " at " + game.getTime() + ".");
	}

}
