package Ch6Ex15;

public class Purchase {

	int invoiceNum;
	int amountOfSale;
	double amountSalesTax;
	final double taxRate = 0.05;
	
	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public void setAmountOfSale(int a) {
		this.amountOfSale = a;
		amountSalesTax =(taxRate * a);
		
	}
	public void display() {
		System.out.println("The details are:");
		System.out.println("InvoiceNumber: "+ invoiceNum);
		System.out.println("Amount of sales: $"+ amountOfSale);
		System.out.println("Amount of sales tax: $" +amountSalesTax);
		
		
	}
	
	

}

