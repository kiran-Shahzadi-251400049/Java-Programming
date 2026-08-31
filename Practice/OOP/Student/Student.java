public class Student implements Comparable{
	//Data Members
	private int id;
	private String name;

	//Constructor
	public Student(int id, String name){
		this.id=id;
		this.name=name;
	}

	//Setters
	public void setId(int id){
		this.id=id;
	}

	public void setName(String name){
		this.name=name;
	}

	//Getters
	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	//Other Methods
	public void displayState(){
		System.out.println("Id: "+id +", Name: "+name);
	}

	public int compareTo(Student obj){
		if(this.name.compareTo(obj.name)==0)
			return 0;
		else if(this.name.compareTo(obj.name)>0)
			return 1;
		else 
			return -1;
	}

}//Student-class