/*Creating first assignment
  Task number 3
  Extracting and transforming digits from number*/

public class ExtractionOfDigits //Class Header

{ //Class Body Starts

	public static void main(String [] assignment1) //Main Header

	{ //Main Body starts

		//Variables 
		int number = 5836271;

		//Extracting digits from number    
		int digit1 =  (number/1000000);
		int digit2 =  (number/100000)%10;      // / Moves target digit to the right end, But extra digits remain
		int digit3 =  (number/10000)%10;
		int digit4 =  (number/1000)%10;
		int digit5 =  (number/100)%10;        //  % Removes extra digits and keeps only last digit
		int digit6 =  (number/10)%10;
		int digit7 =  (number/1)%10;

		//Applying transformation rules
		digit1 += 2;
		digit2 -= 1;
		digit3 *= 2;
		digit4 /= 2;
		digit5 += 3; 
		digit6 -= 2;
		digit7 *= 3;  

		//Writting code
		int encrptdcode = digit1*1000000+digit2*100000+digit3*10000+digit4*1000+digit5*100+digit6*10+digit7*1;

		//Print Statements

		System.out.println("Original Code :" + number);
		System.out.println("Encrypted Code :" + encrptdcode);

	} //Main Body ends

} //Class Body Ends