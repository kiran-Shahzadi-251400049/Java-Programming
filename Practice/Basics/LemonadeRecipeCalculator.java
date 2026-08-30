/*Creating first assignment
  Task number 2
  Calculating Lemonade Recipe*/
  
public class LemonadeRecipeCalculator //Class Header

{ //Class body Starts

	public static void main(String [] assignment1) //Main header

	{ //Main Body Starts

			//Variables

			//For 10 glasses
			double originalGlasses = 10;
			double lemonJiuceFor10Gls = 2.0;
			double sugarFor10Gls = 1.5;
			double waterFor10Gls = 8.0;

			//For 1 glass
			double oneGls = 1;
			double lemonJiuceFor1Gls = lemonJiuceFor10Gls/10.0;
			double sugarFor1Gls = sugarFor10Gls/10.0;
			double waterFor1Gls = waterFor10Gls/10.0;
		
			//For 25 glasses
			int desiredGls = 25;
			double lemonJiuceFor25Gls = lemonJiuceFor1Gls*desiredGls;
			double sugarFor25Gls = sugarFor1Gls*desiredGls;
			double waterFor25Gls = waterFor1Gls*desiredGls;


			//Print Statements

			//Intro
			System.out.println("\t    FreshSip Lemonade Company");
			System.out.println("\t    Lemonade Recipe Calculator");

			System.out.println("--------------------------------------------------");

			//For 10 glasses
			System.out.println("Original recipe makes: " + originalGlasses + "glasses \n");
			System.out.println("Ingredients for original recipe:");
			System.out.println("Lemon juice: \t " + lemonJiuceFor10Gls + "cups");
			System.out.println("Sugar: \t \t " + sugarFor10Gls+ "cups");
			System.out.println("Water: \t \t " + waterFor10Gls+ "cups");

			System.out.println("-------------------------------------------------");

			//For 25 glasses
			System.out.println("number of glasses you want to make: " + desiredGls);
			System.out.println("To make 25 glasses of lemonade, you will need:");
			System.out.println("Lemon juice: \t " + lemonJiuceFor25Gls+ "cups");
			System.out.println("Sugar: \t \t " + sugarFor25Gls+ "cups");
			System.out.println("Water: \t \t " + waterFor25Gls+ "cups");

			System.out.println("--------------------------------------------------");

			System.out.print("\t   Enjoy your refreshing lemonade!");

	} //Main Body ends

} //Class Body ends