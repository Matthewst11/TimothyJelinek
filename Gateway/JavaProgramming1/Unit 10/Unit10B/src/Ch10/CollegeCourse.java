package Ch10;

public class CollegeCourse {

private String courseId;
private int creditHours;
private char grade;
public CollegeCourse(String id, int hours, char grade)
{
    courseId=id;
    creditHours = hours;
    this.grade = grade;
}

public void setCourseId(String id)
{
    courseId = id;
}

public String getCourseId()
{
    return courseId;
}

public void setHours(int hours)
{
    creditHours = hours;
}

public int getHours()
{
    return creditHours;
}

public void setGrade(char grade)
{
    this.grade = grade;
}

public char getGrade()
{
    return grade;
}
}