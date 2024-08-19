
public class TestTeam {

	public static void main(String[] args) {
		Team t1 = new Team("Algoma", "Football", "Blazers");
		display(t1);
		Team t2 = new Team("Michango", "Baseball", "Batters");
		display(t2);
		Team t3 = new Team("Flordia HS", "Tennis", "Racketeers");
		display(t3);
	}
	
	public static void display(Team t){
		System.out.println("The high school name is: " + t.getHsname());
		System.out.println("The sport is: " + t.getSport()); 
		System.out.println("The team name is: " + t.getTeamName());
		System.out.println(Team.MOTTO);
		System.out.println("-------------------------");
	}

}
