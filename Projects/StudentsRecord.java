import java.util.Scanner;
public class StudentsRecord{
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		System.out.print("\n-------------------------------------------\n");
		System.out.print("\t\tStudents Record\n");
		System.out.print("-------------------------------------------\n");	

		int size;
		do{
			System.out.print("\nEnter number of Students(Range:5-15): ");
			size = input.nextInt();
	    }while(size<5 || size>15);

		String [][] students = new String[size][2];
		
		int choice=1; int currentSize=0;

		while(choice!=0){
			System.out.print("\n-------------Here is the Menu---------\n\n");

			System.out.print("=>Press 0 to Exit\n=>Press 1 to Add a New Student\n=>Press 2 to Search by Name"+
			"\n=>Press 3 to Search by Id\n=>Press 4 to Sort by Name\n=>Press 5 to Sort by Id\n=>Press 6 to Display All Students\n");
			do{
				System.out.print("\nEnter your choice: ");
				choice = input.nextInt();
			}while(choice<0 || choice>6);
			input.nextLine();

			if(choice==1){
				if(add(students, currentSize)){
					System.out.print("\nEnter the name of student: ");
					String name = input.nextLine();

					System.out.print("Enter the id of student: ");
					String id = input.nextLine();

					students[currentSize][0]=name;
					students[currentSize][1]=id;

					currentSize ++;
				}//if
				else
					System.out.print("The list is full. No more students can be added.\n");
			}//if

			if(choice==2){
				System.out.print("Enter the name to search: ");
				String key1=input.nextLine();

				int result1=searchByName(students, currentSize, key1);
				if(result1==-1)
					System.out.print("Name not found!");
				else
					System.out.print("Name found at "+result1 +"\n");
			}//if

			if(choice==3){
				System.out.print("Enter the ID to search: ");
				String key2=input.nextLine();

				int result2=searchById(students, currentSize, key2);
				if(result2==-1)
					System.out.print("\nId not found!");
				else
					System.out.print("\nId found at "+result2 +"\n");
			}//if	

			if(choice==4){
				sortByName(students, currentSize);
			}//if

			if(choice==5){
				sortById(students, currentSize);
			}//if	

			if(choice==6){
				display(students, currentSize);
			}//if

		}//while

		System.out.print("Progrm ended successfully...");

	}//main

	public static boolean add(String[][] students, int currentSize){
				if(currentSize<students.length)
					return true;
				else
					return false;
	}//add

	public static int searchByName(String[][] students, int currentSize, String key1){
		for(int i=0; i<currentSize; i++){
				if(students[i][0].equalsIgnoreCase(key1)) {
					return i;
				}//if
		}//for
		return -1;
	}//searchByName

	public static int searchById(String[][] students, int currentSize, String key2){
		for(int i=0; i<currentSize; i++){
				if(students[i][1].equalsIgnoreCase(key2)) {
					return i;
				}//if
		}//for

		return -1;
	}//searchById

	public static void sortByName(String[][] students, int currentSize){
			for(int i=0; i<currentSize-1; i++){
				for (int j=0; j<currentSize-i-1; j++){
					if(students[j][0].compareTo(students[j+1][0])>0){
						String[] temp = students[j];
            			students[j] = students[j + 1];
            			students[j + 1] = temp;
					}//if
				}//column-for
			}//row-for
	}//sortByName

	public static void sortById(String[][] students, int currentSize){
			for(int i=0; i<currentSize-1; i++){
				for (int j=0; j<currentSize-i-1; j++){
					if(students[j][1].compareTo(students[j+1][1])>0){
						String[] temp = students[j];
            			students[j] = students[j + 1];
            			students[j + 1] = temp;
					}//if
				}//column-for
			}//row-for
	}//sortById

	public static void display(String[][] students, int currentSize){
			for(int i=0; i<currentSize; i++){
				System.out.println(students[i][0] + " " + students[i][1]);
			}//for
			System.out.print("\n");
	}//display

}//class