import java.util.ArrayList;
public class WorkingWithArrayList{
	public static void main(String[] args) {
		ArrayList<String> arr=new ArrayList<String>();

		//Adding Values
		arr.add("Expository Writing");
		arr.add("Entrepreneurial Mindset");
		arr.add("Object Oriented Programming");
		arr.add("Digital Logic Design");

		System.out.println("Array List: "+arr);

		//Total Number of Cities
		System.out.println("\nSize: "+arr.size());

		//Displaying Specific cite using index
		System.out.println("Value at index # 3: "+arr.get(3));

		//Displaying list using loop
		System.out.println("\nUsing for loop:");
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}

		System.out.println("\nUsing enhanced for loop:");
		for(String temp:arr){
			System.out.println(temp);
		}

		//Adding cites at specific position
		arr.add(2, "OOP");
		System.out.println("\nAfter adding OOP at index # 2: "+arr);

		//Removing cite and displaying
		arr.remove(0);
		System.out.println("After removing index # 0: "+arr);

		arr.remove("OOP");
		System.out.println("After removing OOP:"+arr);

		//Modifying cite
		arr.set(0, "EM");
		System.out.println("Setting EM at index # 0: "+arr);

	}//main
}//task1