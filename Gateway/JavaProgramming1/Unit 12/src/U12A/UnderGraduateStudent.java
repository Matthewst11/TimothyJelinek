package U12A;

public class UnderGraduateStudent extends Student
{
public static final double UNDERGRAD_TUITION = 8500;
public UnderGraduateStudent(String id, String name)
{
super(id, name);
setTuition();
}
public void setTuition()
{
tuition = UNDERGRAD_TUITION;
}
}