
public class TwoCharacters {

	public static void main(String[] args) {
		MyCharacter char1 = new MyCharacter();
		char1.setName("Bob");
		char1.setEyes(2);
		char1.setLives(3);
		
		MyCharacter char2 = new MyCharacter();
		char2.setName("Mark");
		char2.setEyes(5);
		char2.setLives(10);
		
		display(char1);
		display(char2);
		
	}
	public static void display(MyCharacter ch) {
	System.out.println(ch.getName() + " has " + ch.getEyes() + " eyes and " + ch.getLives() + " lives.");	
	
	}
	
}
