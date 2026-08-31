public class Course{
	private String courseCode;
	private String courseName;
	private int creditHours;

	//constructors
	public Course(){
		courseCode=null;
		courseName=null;
		creditHours=0;
	}//0 Argument-constructor

	public Course(String courseCode, String courseName, int creditHours){
		this.courseCode=courseCode;
		this.courseName=courseName;
		this.creditHours=creditHours;
	}//overloaded-constructor

	public Course(Course obj){
		this.courseCode=obj.courseCode;
		this.courseName=obj.courseName;
		this.creditHours=obj.creditHours;
	}//copy-constructor



	//setters
	public void setCourseCode(String courseCode){
		this.courseCode=courseCode;
	}
	public void setCourseName(String courseName){
		this.courseName=courseName;
	}
	public void setCreditHours(int creditHours){
		this.creditHours=creditHours;
	}

	//getters
	public String getCourseCode(){
		return courseCode;
	}
	public String getCourseName(){
		return courseName;
	}
	public int getCreditHours(){
		return creditHours;
	}



	//other methods
	public void print(){
		System.out.println("Course code: "+courseCode);
		System.out.println("Course name: "+courseName);
		System.out.println("Credit hours: "+creditHours);
	}//print

	public static void print(Course[] c){
		for(int i=0; i<c.length; i++){
			c[i].print();
		}
	}//print

	public boolean isEqual(Course c){
		return this.courseCode.equals(c.courseCode)&&this.courseName.equals(c.courseName)&&this.creditHours==c.creditHours;
	}//isEqual

	public static void sort(Course[] s){
		for(int i=0; i<s.length; i++){
			int index=i;
			for(int j=i+1; j<s.length; j++){
				if(s[j].getCourseName().compareTo(s[index].getCourseName())>0){
					index=j;
				}
			}
			Course temp=s[i];
			s[i]=s[index];
			s[index]=temp;
		}
	}//sort

	public static int linearSearch(Course [] c, String key){
		for(int i=0; i<c.length; i++){
			if(c[i].getCourseCode().compareTo(key)==0)
				return i;
		}
		return -1;
	}//linearSearch

	public static int search(Course[] s, String key){
		int start =0;
		int end =s.length-1;

		while(start<end){
			int mid=(start+end)/2;
			if(s[mid].getCourseName().compareTo(key)==0)
				return mid;
			else if(s[mid].getCourseName().compareTo(key)<0)
				start=mid+1;
			else 
				end=mid-1;

		}
		return -1;
	}//search



}//Course-class