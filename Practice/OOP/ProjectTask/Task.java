public class Task extends ProjectMudule{
	
	//Data Members
	private String taskName;
	private String taskDescription;

	//Constructors
	public Task(){
		taskName=null;
		taskDescription=null;
	}//Default 0-argument

	public Task(String taskName, String taskDescription){
		this.taskName=taskName;
		this.taskDescription=taskDescription;
	}//Overloaded 2-arguments

	public Task(int projectId, String projectName, String projectLocation, String moduleName, String taskName, String taskDescription){
		super(projectId, projectName, projectLocation, moduleName);
		this.taskName=taskName;
		this.taskDescription=taskDescription;
	}//Overloaded 6-arguments


	//Setters-Modifiers
	public void setTaskName(String taskName){
		this.taskName=taskName;
	}//setTaskName

	public void setTaskDescription(String taskDescription){
		this.taskDescription=taskDescription;
	}//setTaskDescription



	//Getters-Accessors
	public String getTaskName(){
		return taskName;
	}//getTaskName

	public String getTaskDescription(){
		return taskDescription;
	}//getTaskDescription


	//Other methods
	public void display(){
		super.display();
		System.out.println("Task Name: "+taskName +", Task Description: "+taskDescription);
	}//display

	
}//Task/GrandChild-class