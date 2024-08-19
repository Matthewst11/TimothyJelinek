public class Team {
	private String hsname;
	private String sport;
	private String teamName;
	public final static String MOTTO = "Sportsmanship!";
	public Team() {
		//hs = "Lincoln"
		//sport = "Soccer"
		//team name = "Kickers"
		this("Lincoln", "Soccer", "Kickers");
	}
	
	public Team(String hsn, String sprt, String tmn) {
		hsname = hsn;
		sport = sprt;
		teamName = tmn;
	}

	public String getHsname() {
		return hsname;
	}

	public void setHsname(String hsname) {
		this.hsname = hsname;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
}