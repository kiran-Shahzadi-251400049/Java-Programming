import java.util.ArrayList;
public interface Measurable{
	public abstract double getHighestGpa(ArrayList<Student> list);
	public abstract double getAverageGpa(ArrayList<Student> list);
	public abstract boolean searchById(ArrayList<Student> list, int id);
	public abstract int searchByName(ArrayList<Student> list, String name);
}//Measurable