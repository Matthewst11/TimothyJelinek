
public class JobApplicant {
	private String name, phone;
	private boolean hasWordSkill;
	private boolean hasSpreadsheetSkill;
	private boolean hasDatabaseSkill;
	private boolean hasGraphicsSkill;
	
	public JobApplicant(String n, String p, boolean w, boolean s, boolean d, boolean g) {
		this.name = n;
		this.phone = p;
		this.hasWordSkill = w;
		this.hasSpreadsheetSkill = s;
		this.hasDatabaseSkill = d;
		this.hasGraphicsSkill = g;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public boolean isHasWordSkill() {
		return hasWordSkill;
	}

	public boolean isHasSpreadsheetSkill() {
		return hasSpreadsheetSkill;
	}

	public boolean isHasDatabaseSkill() {
		return hasDatabaseSkill;
	}

	public boolean isHasGraphicsSkill() {
		return hasGraphicsSkill;
	}
	
	
}
