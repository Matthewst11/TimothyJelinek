
public class PartyWithConstructor2 {
	private int guests;

	public PartyWithConstructor2(int numGuests) {
		guests = numGuests;
	}
	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}
	
	public void displayInvitation() {
	System.out.println("Please come to my party!");
}
}
