
public class FormLetterWritter {

	public static void main(String[] args) {
		displaySalutation("Smith");
		displaySalutation("John", "Doe");

	}

	public static void displaySalutation(String lname) {
		System.out.println("Dear Mr. & Ms. " + lname);
		orderThanks();
	}

	public static void displaySalutation(String fname, String lname) {
		System.out.println("Dear "+ fname + " " + lname);
		orderThanks();
	}
	
	public static void orderThanks() {
		System.out.println("");
		System.out.println("Thank you for your recent order.");
		System.out.println("---------------------------------");
		
	}
}
