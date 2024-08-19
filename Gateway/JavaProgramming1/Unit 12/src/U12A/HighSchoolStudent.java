package U12A;

public class HighSchoolStudent extends Student
{
public static final double HS_TUITION = 5500;
public HighSchoolStudent (String id, String name)
{
super(id, name);
setTuition();
}
public void setTuition()
{
tuition = HS_TUITION;
}
}