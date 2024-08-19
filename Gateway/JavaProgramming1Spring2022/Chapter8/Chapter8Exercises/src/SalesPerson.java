
public class SalesPerson {

	private int id;
	private double sales;
	
	SalesPerson(int idNum, double amt) {
		id = idNum;
		sales = amt;
	}

	public int getId() {
		return id;
	}

	public void setId(int idNum) {
		this.id = idNum;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double amt) {
		this.sales = amt;
	}
	
}
