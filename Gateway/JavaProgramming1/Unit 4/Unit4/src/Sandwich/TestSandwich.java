package Sandwich;

public class TestSandwich {

	public static void main(String[] args) {
		Sandwich sandwich1 = new Sandwich("White", 25, "Ham", 50) ;
		printResult(sandwich1, 1);
		
		Sandwich sandwich2 = new Sandwich("Wheat", 60, "Chicken", 70) ;
		printResult(sandwich2, 2);
	
		Sandwich sandwich3 = new Sandwich("Multigrain", 76, "Cheese", 35) ;
		printResult(sandwich3, 3);
	
	
	}




	public static double calculateTotalCalories(Sandwich sandwich, int counter) {
		double total = (sandwich.getBread().getCaloriePerSlice()* 2) + sandwich.getSandwichFilling().getCaloriePerFilling() ;
		return total;
		
	}
	public static double calculateTotalCalories(Bread bread, SandwichFilling sandwichFilling) {
		double total = (bread.getCaloriePerSlice()* 2) + sandwichFilling.getCaloriePerFilling();
		return total;
	
	}
	public static void printResult(Sandwich sandwich, int counter) {
		System.out.println("Motto: " + Bread.MOTTO);
		System.out.println("---------Sandwich: " + counter + " --------");
		System.out.println("Bread Type " + sandwich.getBread().getBreadType());
		System.out.println("Calories (per slice): " + sandwich.getBread().getCaloriePerSlice());
		System.out.println("SandwichFilling Type: " + sandwich.getSandwichFilling().getSandwichFilling());
		System.out.println("Calories (per filling): " + sandwich.getSandwichFilling().getCaloriePerFilling());
		System.out.println("Total Calories: " + calculateTotalCalories(sandwich.getBread(), sandwich.getSandwichFilling()));
	}

	
		
	

	
	
}