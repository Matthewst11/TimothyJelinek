package Sandwich;

public class SandwichFilling {
	private String sandwichFilling;
	private double caloriePerFilling;
	
	
	public SandwichFilling() {}
	public SandwichFilling(String sandwichFilling, double caloricePerFilling) {
		this.setSandwichFilling(sandwichFilling);
		this.setCaloriePerFilling(caloricePerFilling);
		
	}
	public String getSandwichFilling() {
		return sandwichFilling;
	}
	public void setSandwichFilling(String sandwichFilling) {
		this.sandwichFilling = sandwichFilling;
	}
	public double getCaloriePerFilling() {
		return caloriePerFilling;
	}
	public void setCaloriePerFilling(double caloricePerFilling) {
		this.caloriePerFilling = caloricePerFilling;
	}
	public Bread getBread() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
