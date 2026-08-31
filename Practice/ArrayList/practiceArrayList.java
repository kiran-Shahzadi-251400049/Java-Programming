import java.util.ArrayList;
public class practiceArrayList{
	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(); 
		fruits.add("Apple"); 
		fruits.add("Banana"); 
		fruits.add("Mango"); 
		fruits.add("Orange"); 
		fruits.add(2,"Grapes"); 
		System.out.println(fruits);

		fruits.set(1,"Peach"); 
		fruits.remove("Orange"); 

		for(String temp:fruits){
			System.out.println(temp);
		} 
		System.out.println("Size: "+fruits.size());
		System.out.println(fruits.contains("Mango")); 
		System.out.println(fruits.indexOf("Apple"));


		//ArrayList of Objects

		Student s1=new Student("Kashif",4567);
		Student s2=new Student("Kamran",2345);
		Student s3=new Student("Kashaf",8970);

		ArrayList<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		System.out.println("Students before removing:");
		for(Student temp:list){
			System.out.println(temp);
		}

		list.remove(1);

		System.out.println("\nStudents after removing:");
		for(Student temp:list){
			System.out.println(temp);
		}


		System.out.println("\nFinding 8970: ");
		boolean found=false;
		for(int i=0; i<list.size(); i++){
			if(list.get(i).getRollNum()==8970){
				System.out.println(list.get(i));
				found=true;
				break;
			}
		}
		if(!found)
			System.out.println("Not found");

	}
}

 class Student{
	private String name;
	private int rollNum;

	public Student(){

	}
	public Student(String name, int rollNum){
		this.name=name; 
		this.rollNum=rollNum;
	}

	public void setName(String name){
		this.name=name;
	}
	public void setRollNum(int rollNum){
		this.rollNum=rollNum;
	}

	public String getName(){
		return name;
	}

	public int getRollNum(){
		return rollNum;
	}

	public String toString(){
		return "Name: "+name +", Roll number: "+rollNum;
	}
}