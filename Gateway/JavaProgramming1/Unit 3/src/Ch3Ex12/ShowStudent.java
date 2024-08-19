package Ch3Ex12;

public class ShowStudent {

	public static void main(String[] args) {
		Student pupil = new Student();
		
		pupil.setStudentID(5325);
		pupil.setNumOfPoints(39);
		pupil.setCreditHours(25);
		
		pupil.showstudentID();
		pupil.showNumOfPoints();
		pupil.showCreditHours();
		
		System.out.println("The GPA is " + pupil.getGradePoint());
	}

}
