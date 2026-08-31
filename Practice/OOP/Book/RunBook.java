public class RunBook{
	public static void main(String[] args) {
		Book object1 = new Book();
		Book object2 = new Book(2514);
		Book object3 = new Book(2517, 30);
		Book object4 = new Book(1519, 80, 45.5);
		Book object5 = new Book(object2);

		System.out.println("State of object 1:");
		object1.display();

		System.out.println("\n\nState of object 2:");
		object2.display();

		System.out.println("\n\nState of object 3:");
		object3.display();

		System.out.println("\n\nState of object 4:");
		object4.display();

		System.out.println("\n\nState of object 5:");
		object5.display();

		object1.setBookId(2521);
		object2.setBookId(2522);
	

		object1.setPages(50);
		object2.setPages(80);

		object1.setPrice(34.6);
		object2.setPrice(53.5);

		System.out.println("\n\nObject 1 has more pages then object 2: " + object1.isLarger(object2));
		System.out.println("\nObject 1 expensive then object 2: " + object1.isExpensive(object2));
		object1.Copy(object2);
		System.out.println("\nObject 1 copied in object 2: ");
		object2.display();
		System.out.println("\n\nObject 2 is equal to object 1: " + object2.isEqual(object1));
		System.out.println("\nString representation of Object 2 is:\n" + object2.toString());

		System.out.println("\nObject 6 using create method:");
		Book object6 = object1.create(object2);
		object6.display();

	}//main
}//class