public class UsingTasks{
	public static void main(String[] args) {
		
		ProjectMudule module=new ProjectMudule("Student data");
		Task task=new Task(251400049, "Attendance System", "University", "Student Attendance", "Mark present/absent", "Record students attendance daily");

		System.out.println("\nModule Information:");
		module.display();

		System.out.println("\n\nTask Information:");
		task.display();

		System.out.println("\n\nUpdating Module Information...");

		module.setProjectId(251400048);
		module.setProjectName("Student Record System");
		module.setProjectLocation("Classroom");

		System.out.println("\n\nUpdated Module Information:");
		module.display();


	}//main

}//UsingTasks