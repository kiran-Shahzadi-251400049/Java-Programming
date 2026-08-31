import java.util.ArrayList;
public class UsingStudents{
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(1514, "Kamran", 3.52));
		list.add(new Student(1515, "Kashif", 2.9));
		list.add(new Student(1516, "Khushboo", 3.2));
		list.add(new Student(1517, "Kainat", 3.84));
		list.add(new Student(1518, "Kashmala", 3.87));

		System.out.println("List of Students: ");
		for(int i=0; i<list.size(); i++){
			System.out.println("\nStudent # "+(i+1));
			list.get(i).displayStudent();
		}

		System.out.println("\nHighest Gpa: "+list.get(0).getHighestGpa(list));
		System.out.println("\nAverage Gpa: "+list.get(0).getAverageGpa(list));
		System.out.println("\nThere exist a student with id 1520: "+list.get(0).searchById(list, 1520));
		System.out.println("\nKainat found at index: "+list.get(0).searchByName(list, "Kainat"));

	}
}//UsingStudents