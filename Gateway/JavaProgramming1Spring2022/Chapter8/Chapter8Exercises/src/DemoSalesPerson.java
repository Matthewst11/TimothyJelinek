
public class DemoSalesPerson {

	public static void main(String[] args) {
		SalesPerson[] salesPeople = new SalesPerson[10];
		
		int i = 0;
		
		for (i = 0; i < salesPeople.length; i++) {
			salesPeople[i] = new SalesPerson(99999, 0);
		}
		for (i = 0; i < salesPeople.length; i++) {
			System.out.println("SalesPerson " + i + " has id# " + salesPeople[i].getId());
		}
	}

}
