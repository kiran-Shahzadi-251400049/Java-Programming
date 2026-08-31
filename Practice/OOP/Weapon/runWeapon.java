public class runWeapon{
	public static void main(String [] args){
		Weapon Shaheen_II = new Weapon();
		Weapon Babur = new Weapon();
		Weapon Al_Khalid = new Weapon();

		Shaheen_II.setName("Shaheen_II");
		Babur.setName("Babur");
		Al_Khalid.setName("Al_Khalid");

		Shaheen_II.setOriginCountry("Pakistan");
		Babur.setOriginCountry("Pakistan");
		Al_Khalid.setOriginCountry("Pakistan");

		Shaheen_II.setType("Ballistic Missile");
		Babur.setType("Cruise Missile");
		Al_Khalid.setType("Main Battle Tank");

		Shaheen_II.setRange(2500);
		Babur.setRange(700);
		Al_Khalid.setRange(450);


		if (Shaheen_II.isCapableOfHitting(2000) ) {
			System.out.println("Shaheen_II is Capable Of Hitting.");
		}
		else
			System.out.println("Shaheen_II is not Capable Of Hitting.");



		if (Babur.isCapableOfHitting(1000) ) {
			System.out.println("Babur is Capable Of Hitting.");
		}
		else
			System.out.println("Babur is not Capable Of Hitting.");



		if (Babur.isCapableOfHitting(500) ) {
			System.out.println("Al_Khalid is Capable Of Hitting.");
		}
		else{
			System.out.println("Al_Khalid is not Capable Of Hitting.");
		}
	}//main

}//class-runWeapon