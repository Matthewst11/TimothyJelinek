
public class PremiumSugarSmashPlayer extends SugarSmashPlayer {
	
	private final int LEVELS = 50;
	
	public PremiumSugarSmashPlayer() {
		scores = new int[LEVELS];
	}
	
	public int getLevels() {
		return LEVELS;
	}
}
