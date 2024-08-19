package Sandwich;

public class Sandwich {
	Bread bread;
	SandwichFilling sandwichFilling;
	
	
	
	public Sandwich() {}
	public Sandwich(Bread bread, SandwichFilling sandwichFilling) {
		this.setBread(bread);
		this.setSandwichFilling(sandwichFilling);
	}
	public Sandwich(String breadType, double caloriePerSlice, String sandwichFilling, double caloriePerFilling) {
		this.bread = new Bread(breadType, caloriePerSlice);
		this.sandwichFilling = new SandwichFilling(sandwichFilling, caloriePerFilling);
		
	}
	
	public Bread getBread() {
		return bread;
	}
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	public SandwichFilling getSandwichFilling() {
		return sandwichFilling;
	}
	public void setSandwichFilling(SandwichFilling sandwichFilling) {
		this.sandwichFilling = sandwichFilling;
	}
	
	

}
