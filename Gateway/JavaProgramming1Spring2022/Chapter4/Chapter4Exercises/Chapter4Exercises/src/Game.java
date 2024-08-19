
public class Game {
	private String Team1;
	private String Team2;
	private String time;
	public final static String MOTTO = "Sportsmanship!";
	
	public Game(String tm1, String tm2, String tme) {
		Team1 = tm1;
		Team2 = tm2;
		time = tme;
		
		
		
	}

	public String getTeam1() {
		return Team1;
	}

	public String getTeam2() {
		return Team2;
	}

	public String getTime() {
		return time;
	}
	
	
}