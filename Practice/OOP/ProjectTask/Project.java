public class Project{
	
	//Data Members
	private int projectId;
	private String projectName;
	private String projectLocation;


	//Constructors
	public Project(){
		projectId=0;
		projectName=null;
		projectLocation=null;
	}//Default 0-argument

	public Project(int projectId, String projectName, String projectLocation){
		this.projectId=projectId;
		this.projectName=projectName;
		this.projectLocation=projectLocation;
	}//Overloaded 3-arguments


	//Setters-Modifiers
	public void setProjectId(int projectId){
		this.projectId=projectId;
	}//setProjectId

	public void setProjectName(String projectName){
		this.projectName=projectName;
	}//setProjectName

	public void setProjectLocation(String projectLocation){
		this.projectLocation=projectLocation;
	}//setProjectLocation


	//Getters-Accessors
	public int getProjectId(){
		return projectId;
	}//getProjectId

	public String getProjectName(){
		return projectName;
	}//getProjectName

	public String getProjectLocation(){
		return projectLocation;
	}//getProjectLocation


	//Other method
	public void display(){
		System.out.println("Project Name: "+projectName +", Project Id: "+projectId +", Project Location: "+projectLocation);
	}//display


}//Project/Parent-Class