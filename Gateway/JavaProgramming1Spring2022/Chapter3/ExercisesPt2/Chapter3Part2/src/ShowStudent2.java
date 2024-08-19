

public class ShowStudent2 {

	public static void main(String[] args) {
		Student pupil = new Student();
		pupil.showstudentID();
		pupil.showNumOfPoints();
		pupil.showCreditHours();
		System.out.println("The GPA is " +pupil.getGradePoint());
		
		
	}

}
