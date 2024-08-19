package Ch8Ex7;

public class Student {

	private int studentID;
	private CollegeCourse courses[] = new CollegeCourse[3];
	
	public Student(int id, CollegeCourse[] course) {
		studentID = id;
		courses = course;
		
	}
	public int getStudentID() {
		return studentID;
		
	}
	public void setStudentID(int newStudentID) {
		studentID = newStudentID;
		
	}
	public CollegeCourse getCourse(int position) {
		if(position >= 0 && position <= 2)
			return courses[position];
		else
			return null;
		
	}
	public void setCourse(CollegeCourse course, int position) {
		if(position >= 0 && position <= 2)
			courses[position] = course;
		
	}
}
