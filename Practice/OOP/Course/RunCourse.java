public class RunCourse{
	public static void main(String[] args) {
		Course [] arr=new Course[5];

		arr[0]=new Course("CS-132", "OOP", 3);
		arr[1]=new Course("MATH-242", "DLD", 5);
		arr[2]=new Course("SE-567", "Software Engineering", 2);
		arr[3]=new Course("ENG-102", "Expository Writing", 4);
		arr[4]=new Course("BS-218", "Entrepreneurial Mindset", 1);

		System.out.println("\nDisplaying states of all objects: ");
		Course.print(arr);

		System.out.println("\n\nCourse 2 is equals to course 5: "+arr[4].isEqual(arr[2]));
		System.out.println("\n\nLinear Search:");
		if(Course.linearSearch(arr, "DLD")==-1)
			System.out.println("Target course code (DLD) not found");
		else 
			System.out.println("Target(DLD) found at "+Course.linearSearch(arr, "DLD"));

		System.out.println("\n\nSorting array...");
		Course.sort(arr);
		Course.print(arr);

		System.out.println("\n\nBinary Search:");
		Course.search(arr, "Expository Writing");
		if(Course.search(arr, "Expository Writing")==-1)
			System.out.println("Target(Expository Writing) not found");
		else 
			System.out.println("Target course (Expository Writing) found at "+Course.search(arr, "Expitosory Writing"));

	}//main
}//RunCourse-class