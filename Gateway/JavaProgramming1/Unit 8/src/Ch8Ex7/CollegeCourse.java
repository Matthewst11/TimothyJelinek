package Ch8Ex7;

public class CollegeCourse {

	private String courseID;
	private int creditHours;
	private char letterGrade;
	
	public CollegeCourse(String id, int  hours, char grade) {
		courseID = id;
		creditHours = hours;
		letterGrade = grade;
		
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public int getCreditHours() {
		return creditHours;
	}

	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}

	public char getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(char letterGrade) {
		this.letterGrade = letterGrade;
	}
	
}
