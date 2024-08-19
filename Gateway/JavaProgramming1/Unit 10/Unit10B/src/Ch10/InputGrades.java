package Ch10;
import java.util.Scanner;
public class InputGrades {

public static void main(String[] args) {

    final int NUM_STUDENTS = 3;
    final int NUM_COURSES = 3;  

    Student[] students = new Student[NUM_STUDENTS]; 
    int s;
    int c;
    int stId;
    int csIndex;
    String courseId = "";
    int hours = 0;
    
    char grade = 'z';
    CollegeCourse course = new CollegeCourse(courseId,hours, grade);//not sure if I am handling this correctly

    Scanner input = new Scanner(System.in);

    for(s = 0; s<NUM_STUDENTS; ++s)
    {
        students[s] = new Student(s);   
        System.out.print("Enter ID for student #" + (s+1) + ":");
        stId = input.nextInt();
        input.nextLine();
        students[s].setStudentId(stId);
        for(c=0; c < NUM_COURSES; ++c)
        {               
            csIndex=c;
            System.out.print("Enter course ID #" + (c+1) + ":");
            courseId = input.nextLine();
            course.setCourseId(courseId);
            System.out.print("Enter hours:");
            hours = input.nextInt();
            input.nextLine();
            course.setHours(hours);
            String enteredGrade = "";
                while(enteredGrade.length()!=1) {
                    System.out.print("Enter grade:");
                    enteredGrade = input.nextLine();
                    if(enteredGrade.length()==1) {
                        grade = enteredGrade.charAt(0);
                    } else {
                        System.out.println("Type only one character!");
                    }
                }
            course.setGrade(grade);
            students[s].setCourse(csIndex, course);         
        }
    }

    for(s = 0; s<NUM_STUDENTS; ++s)
    {
        System.out.print("\nStudent# " +
                students[s].getStudentId());
        System.out.println();
        for(c=0;c<NUM_COURSES;++c)
            System.out.print(students[s].getCourse(c) + " ");   
        System.out.println();
    }   
}

}