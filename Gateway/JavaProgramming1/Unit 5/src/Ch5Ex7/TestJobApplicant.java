package Ch5Ex7;

public class TestJobApplicant {

	public static void main(String[] args) {
		JobApplicant app1 = new JobApplicant("Peter", "262-914-1322", true, false, true, false);
		JobApplicant app2 = new JobApplicant("Mitchel", "414-847-9820", false, false, true, true);
		JobApplicant app3 = new JobApplicant("Walter", "262-897-4283", true, true, true, true);
		JobApplicant app4 = new JobApplicant("Paul", "414-818-2980", true, true, false, true);
		
		String qualifiedMsg = "is qualified for an interview ";
		String notQualifiedMsg = "is not qualified for an interview at this time ";
		
		if(isQualified(app1))
			display(app1, qualifiedMsg);
		else
			display(app1, notQualifiedMsg);
		
		if(isQualified(app2))
			display(app2, qualifiedMsg);
		else
			display(app2, notQualifiedMsg);
		
		if(isQualified(app3))
			display(app3, qualifiedMsg);
		else
			display(app3, notQualifiedMsg);
		
		if(isQualified(app4))
			display(app4, qualifiedMsg);
		else
			display(app4, notQualifiedMsg);
	}

	
	public static boolean isQualified(JobApplicant app){
		int count = 0;
		boolean isQual;
		final int MIN_SKILL = 3;
		if(app.getHasWordSkill()){
			count += 1;
		}
		if(app.getHasSpreadsheetSkill()){
			count += 1;
		}
		if(app.getHasDatabaseSkill()){
			count += 1;
		}
		if(app.getHasGraphicsSkill()){
			count += 1;
		}
		if(count >= MIN_SKILL){
			isQual = true;
		}
		else {
			isQual = false;
		}
		return isQual;
		
	}
	public static void display(JobApplicant app, String msg){
		System.out.println(app.getName() + " "  + msg + " Phone: " + app.getPhone());
		
	}
	
}
