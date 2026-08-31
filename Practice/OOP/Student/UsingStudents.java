public class UsingStudents{
	public static void main(String[] args) {
		Student s1=new Student(3, "Shagufta");
		Student s2=new Student(8, "Kashif");

		s1.displayState();
		s2.displayState();

		System.out.println("Comparing both students name results in: "+s1.compareTo(s2));

	}//main

}//UsingStudents-class