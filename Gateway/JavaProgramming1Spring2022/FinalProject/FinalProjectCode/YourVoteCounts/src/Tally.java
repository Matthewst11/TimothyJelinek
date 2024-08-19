
public class Tally {
	private int ans1 = 0, ans2 = 0, ans3 = 0, ans4 = 0;
	
	public void addToTotal(int x) {
		switch(x) {
			case 1:
				ans1++;
				break;
			case 2:
				ans2++;
				break;
			case 3:
				ans3++;
				break;
			case 4:
				ans4++;
				break;
		}
	}
	
	public void displayTallies() {
		System.out.println("");
		System.out.println("Total for answer 1 = " + ans1);
		System.out.println("Total for answer 2 = " + ans2);
		System.out.println("Total for answer 3 = " + ans3);
		System.out.println("Total for answer 4 = " + ans4);
		System.out.println("");
	}
	
	public void clearTallies() {
		ans1 = 0;
		ans2 = 0;
		ans3 = 0;
		ans4 = 0;
	}
}
