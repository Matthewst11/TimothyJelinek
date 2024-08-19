package Sandwich;

public class Bread {
	private String breadType;
	private double caloriePerSlice;
	public static final String MOTTO = "The staff of life.";
	
	
	
	public Bread() {}
	public Bread(String breadType, double caloriePerSlice) {
		this.setBreadType(breadType);
		this.setCaloriePerSlice(caloriePerSlice);
		
		
	}
	public String getBreadType() {
		return breadType;
		
		
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
		
	}
	public double getCaloriePerSlice() {
		return caloriePerSlice;
	}
	public void setCaloriePerSlice(double caloriePerSlice2) {
		this.caloriePerSlice = caloriePerSlice2;
	}
	
	
}
