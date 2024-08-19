package Ch5Ex7;

public class JobApplicant {
	private String name;
	private String phone;
	private boolean hasWordSkill;
	private boolean hasSpreadsheetSkill;
	private boolean hasDatabaseSkill;
	private boolean hasGraphicsSkill;
	
	public JobApplicant(String n, String p, boolean w, boolean s, boolean d, boolean g){
		this.name = n;
		this.phone = p;
		hasWordSkill = w;
		hasSpreadsheetSkill = s;
		hasDatabaseSkill = d;
		hasGraphicsSkill = g;
		
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public boolean getHasWordSkill() {
		return hasWordSkill;
	}

	public boolean getHasSpreadsheetSkill() {
		return hasSpreadsheetSkill;
	}

	public boolean getHasDatabaseSkill() {
		return hasDatabaseSkill;
	}

	public boolean getHasGraphicsSkill() {
		return hasGraphicsSkill;
	}
	
	
}
