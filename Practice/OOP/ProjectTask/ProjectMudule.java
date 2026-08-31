public class ProjectMudule extends Project{
	
	//Data Members
	private String moduleName;

	//Constructors
	public ProjectMudule(){
		moduleName=null;
	}//Default 0-argument

	public ProjectMudule(String moduleName){
		this.moduleName=moduleName;
	}//Overloaded 1-argument

	public ProjectMudule(int projectId, String projectName, String projectLocation, String moduleName){
		super(projectId, projectName, projectLocation);
		this.moduleName=moduleName;
	}//Overloaded 4-arguments


	//Setter-Modifier
	public void setModuleName(String moduleName){
		this.moduleName=moduleName;
	}//setModuleName


	//Getter-Accessor
	public String getModuleName(){
		return moduleName;
	}//getModuleName


	//Other method
	public void display(){
		super.display();
		System.out.println("Module Name: "+moduleName);
	}//display

	
}//Module/Child-class