public class Converter //class header

{ //class body starts

	public static void main(String [] args) //main header

	{ //main body starts

		//Variables 
		double amountUSD=100.0;
		double amountEUR=400.0;

		double usdToEur=amountUSD*0.95;
		double eurToUsd=amountEUR/0.95;

		//Print statements
		System.out.println(amountUSD + " USD= " + usdToEur + " EUR");
		System.out.print(amountEUR + " EUR= " + eurToUsd + " USD");
	
	} //main body ends

} //class body ends