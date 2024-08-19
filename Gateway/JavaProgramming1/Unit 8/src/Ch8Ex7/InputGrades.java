package Ch8Ex7;
import javax.swing.JOptionPane;
public class InputGrades {

	public static void main(String[] args) {
		Student students[] = new Student[10];
		for( int i = 0; i < 10; i++) {
			String str = JOptionPane.showInputDialog(null, "Enter ID for student #" + ( i + 1));
			int sID = Integer.parseInt(str);
			CollegeCourse courses[] = new CollegeCourse[3];
			for( int j = 0; j < 3; j++) {
				str = JOptionPane.showInputDialog(null, "Enter course ID #" + (j + 1));
				String cID = str;
				str = JOptionPane.showInputDialog(null, "Enter credit hours #" + (j + 1));
				int hours = Integer.parseInt(str);
				str = JOptionPane.showInputDialog(null, "Enter course grade #" + (j + 1));
				char grade = str.charAt(0);
				while(str.length() != 1 || (grade !='A' && grade != 'B' && grade != 'C' && grade != 'D' && grade != 'E' && grade != 'F')) {
					
				}
				grade = str.charAt(0);
				
					str = JOptionPane.showInputDialog( null, "Enter A, B, C, D, E, or F only.");
					grade = str.charAt(0);
					courses[j] = new CollegeCourse(cID, hours, grade);
				}
			students[i] = new Student(sID, courses);
			
			
				
				
			}
		System.out.println("Details of 10 students:\n");
		for(int i = 0; i < 10; i++) {
			String output = "";
			output += "Student ID: " + students[i].getStudentID() + "\n";
			
			for(int j = 0; j < 3; j++) {
				output += "Course ID:" + students[i].getCourse(j).getCourseID() + ",";
				output += "Credit Hours:" + students[i].getCourse(j).getCreditHours() + ",";
				output += "Letter Grade:" + students[i].getCourse(j).getLetterGrade() + "\n";
				
			}
			System.out.println(output);
		}
		}
		

	}


