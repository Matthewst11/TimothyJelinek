
public class Billing {
	final static double TAX = 0.08;
	
	public static void main(String[] args) {
		double totalBill = computeBill(10.00);
		System.out.println("1 param --->. Your total is " + totalBill);
		totalBill = computeBill(10.00, 5);
		System.out.println("2 param --->. Your total is " + totalBill);
		totalBill = computeBill(10.00, 5, 9.00);
		System.out.println("3 param --->. Your total is " + totalBill);
	}

	public static double computeBill(double amt) {
		double bill = (amt * TAX) + amt;
		return bill;
	}
	
	public static double computeBill(double amt, int qty) {
		double subtotal = amt * qty;
		subtotal = subtotal * TAX + subtotal;
		return subtotal;
	}

	public static double computeBill(double amt, int qty, double coupon) {
		double subtotal = amt * qty;
		subtotal = subtotal - coupon;
		subtotal = subtotal * TAX + subtotal;
		return subtotal;
	}
}
