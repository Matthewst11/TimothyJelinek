
public class TestSandwich {

	public static void main(String[] args) {
		Sandwich firstSandwich = new Sandwich();
		firstSandwich.setBreadType("Rye");
		firstSandwich.setMainIngredient("Corned Beef");
		firstSandwich.setPrice(6.99);
		System.out.println("You ordered " + firstSandwich.getMainIngredient()
		+ " on " + firstSandwich.getBreadType() + " which costs $" + firstSandwich.getPrice());
		
		Sandwich secondSandwich = new Sandwich();
		secondSandwich.setBreadType("Sourdough");
		secondSandwich.setMainIngredient("Ham");
		secondSandwich.setPrice(11.99);
		System.out.println("You ordered " + secondSandwich.getMainIngredient()
		+ " on " + secondSandwich.getBreadType() + " which costs $" + secondSandwich.getPrice());
	}
	
}
