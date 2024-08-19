package Ch10;
public class Student {

final int NUM_COURSES = 3;

private int studentId;
private CollegeCourse courseAdd;
private CollegeCourse[] courses = new CollegeCourse[NUM_COURSES];


public Student(int studentId)
{
    this.studentId=studentId;   
}

public void setStudentId(int id)
{
    studentId = id;
}

public int getStudentId()
{
    return studentId;
}

public void setCourse(int index, CollegeCourse course)
{
    courses[index] = course;
}

public CollegeCourse getCourse(int index)
{
    return courses[index];
    
}       
}