

public class Student {
	private int studentID;
	private int creditHours;
	private int numOfPoints;
	
	Student() {
		studentID= 9999;
		numOfPoints = 12;
		creditHours = 3;
	}
	public int getStudentID() {
		
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public int getCreditHours() {
		return creditHours;
	}
	public void setCreditHours(int creditHours) {
		this.creditHours = creditHours;
	}
	public int getNumOfPoints() {
		return numOfPoints;
	}
	public void setNumOfPoints(int numOfPoints) {
		this.numOfPoints = numOfPoints;
	}
	public double getGradePoint() {
		return (numOfPoints / creditHours);
	}

	public void showstudentID() {
		System.out.println("Student ID: " + studentID);
		
	}
	public void showCreditHours() {
		System.out.println("Credit hours: " + creditHours);
		
	}
	public void showNumOfPoints() {
		System.out.println("Grade points: " + numOfPoints);
		
	}
	
}
