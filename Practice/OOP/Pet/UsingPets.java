public class UsingPets{
	public static void main(String[] args) {
	Bird petBird=new Bird("Blue", 2, 1.5, "Bird Cage", "Blue", 2.0, "Short", true);
	Cat petCat=new Cat("Brown", "Black", 3.4, 2);
	Fish petFish=new Fish("black", 3.5, 1.6, "Pond", true, false, 7);


	System.out.println("\nBird's Information:");
	petBird.display();

	System.out.println("\n\nCat's Information:");
	petCat.display();

	System.out.println("\n\nFish's Information:");
	petFish.display();


	System.out.println("\n\nUpdating Cat's Information...");
	petCat.setEyeColor("Green");
	petCat.setAge(2.3);
	petCat.setWeight(3.9);
	petCat.setLocation("Cat house");

	System.out.println("\n\nUpdated Cat's Information:");
	petCat.display();


	System.out.println("\n\nUnique methods of Bird:");
	petBird.squawk();
	petBird.fly();


	System.out.println("\n\nUnique methods of Cat:");
	petCat.purr(5);
	petCat.meow();


	System.out.println("\n\nUnique method of Fish:");
	petFish.swim("Left");

	}//main

}//UsingPets