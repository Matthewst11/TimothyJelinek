
public class MyCharacter {
	private String name;
	private int numberOfEyes;
	private int numberOfLives;
	
	public void setName(String characterName) {
		this.name = characterName;
		
	}
	
	public String getName() {
		return name;
	}

	public int getEyes() {
		return numberOfEyes;
	}
	
	public void setEyes(int eyes) {
		this.numberOfEyes = eyes;
	}

	public int getLives() {
		return numberOfLives;
	}

	public void setLives(int life) {
		this.numberOfLives = life;
	}

	
}
