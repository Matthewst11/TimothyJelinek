
public class BloodData {
	private String bloodType;
	private String rhFactor;
	public String getBloodType() {
		return bloodType;
	}
	
	public BloodData() {
		//bloodType = "O";
		//rhFactor = "+";
		this("O", "+");
	}
	
	public BloodData(String bType, String rh) {
		bloodType = bType;
		rhFactor = rh;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(String rhFactor) {
		this.rhFactor = rhFactor;
	}

	}
