import java.util.Scanner; 
public class DateValidation
{//class

	public static void main(String [] args)
	{//main

		Scanner dateValidation= new Scanner(System.in);

		System.out.print("Enter day: ");	
		int day =dateValidation.nextInt(); //reads day

		System.out.print("Enter month: ");	
		int month =dateValidation.nextInt(); //reads month

		System.out.print("Enter year: ");	
		int year =dateValidation.nextInt(); //reads year

		int maxDays=0;

		if(day<=0 || month<=0 || month>12 || year <=0 || year<1970 || year>2025)  //incase of error
		{
			System.out.print("Error: The entered "+ day + "-"+month+ "-"+ year + " is invalid!");
			return; // display an error message and stop the program (As instruction is given I used return so that program stops here)
		}
		




		if (month == 2) 
		{
          			  if (year % 4 == 0) 
			{
                			  	maxDays = 29;
           			} 
			else 
			{
                				maxDays = 28;
           			}
        		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) 
		{
           			maxDays = 30;
        		} 
		else 
		{
            			maxDays = 31;
      		}



		if (day > maxDays) 
		{
            			System.out.println("Error: The entered date " + day + "-" + month + "-" + year + " is invalid!");
            			return; //display an error message and stop the program (As instruction is given I used return so that program stops here)
        		}

		System.out.println("The entered date " + day + "-" + month + "-" + year + " is valid.");
	}//main
}//class