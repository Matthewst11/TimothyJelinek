
public class TestJobApplicant {

	public static void main(String[] args) {
		JobApplicant app1 = new JobApplicant("Johnson", "123-123-1234", true, false, true, false);
		JobApplicant app2 = new JobApplicant("Kermit", "312-543-1275", true, false, false, false);
		JobApplicant app3 = new JobApplicant("Lawrence", "608-288-0915", true, false, true, true);
		JobApplicant app4 = new JobApplicant("Mitchell", "815-288-3881", true, true, true, true);

		String qualifiedMsg = "is qualified for an interview   ";
		String notQualifiedMsg = "is not qualified for an interview at this time   ";
		
		if (isQualified(app1)) {
			display(app1, qualifiedMsg);
		}
		else {
			display(app1, notQualifiedMsg);
		}
		if (isQualified(app2)) {
			display(app2, qualifiedMsg);
		}
		else {
			display(app2, notQualifiedMsg);
		}
		if (isQualified(app3)) {
			display(app3, qualifiedMsg);
		}
		else {
			display(app3, notQualifiedMsg);
		}
		if (isQualified(app4)) {
			display(app4, qualifiedMsg);
		}
		else {
			display(app4, notQualifiedMsg);
		}
	}

	public static boolean isQualified(JobApplicant app){
		boolean isQual = false;
		final int MIN_SKILLS = 3;
		int count = 0;
		
		if (app.isHasWordSkill()){
			count += 1;
		}
		if (app.isHasSpreadsheetSkill()){
			count += 1;
		}
		if (app.isHasDatabaseSkill()){
			count += 1;
		}
		if (app.isHasGraphicsSkill()){
			count += 1;
		}
		
		if (count >= MIN_SKILLS) {
			isQual = true;
		}
		else {
			isQual = false;
		}
		return isQual;
	}
	
	public static void display(JobApplicant app, String msg){
		System.out.println(app.getName() + " " + msg + "  Phone: " + app.getPhone());
	}
}
