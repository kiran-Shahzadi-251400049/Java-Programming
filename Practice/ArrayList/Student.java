import java.util.ArrayList;
public class Student implements Measurable{
	//Data Members
	private int id;
	private String name;
	private double gpa;

	//Constructor
	public Student(int id, String name, double gpa){
		this.id=id;
		this.name=name;
		this.gpa=gpa;
	}


	//Setters
	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setGpa(double gpa){
		this.gpa=gpa;
	}


	//Getters
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getGpa(){
		return gpa;
	}


	//Display Method
	public void displayStudent(){
		System.out.println("Student Id: "+id +"\nName: "+name +"\nGpa: "+gpa);
	}


	//Overridden Methods
	public double getHighestGpa(ArrayList<Student> list){
		double highestGpa=list.get(0).getGpa();
		for(int i=1; i<list.size(); i++){
			if(list.get(i).getGpa()>highestGpa){
				highestGpa=list.get(i).getGpa();
			}
		}
		return highestGpa;
	}

	public double getAverageGpa(ArrayList<Student> list){
		double sum=0;
		double averageGpa=0;
		for(int i=0; i<list.size(); i++){
			sum+=list.get(i).getGpa();
		}
		averageGpa=sum/list.size();
		return averageGpa;
	}

	public boolean searchById(ArrayList<Student> list, int id){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getId()==id){
				return true;
			}
		}
		return false;
	}

	public int searchByName(ArrayList<Student> list, String name){
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getName().equals(name)){
				return i;
			}
		}
		return -1;
	}

}//Student