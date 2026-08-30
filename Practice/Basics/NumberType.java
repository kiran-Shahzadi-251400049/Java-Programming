import java.util.Scanner;

public class NumberType
{
	public static void main(String[] args) 
	{

       	 Scanner input = new Scanner(System.in);

     	   System.out.print("Enter a number: ");
       	   double number = input.nextDouble();  

       	 if (number == (int) number) 
	{
             		  System.out.println("The number " + (int) number + " is an integer.");
        	} 

	else 
	{
           		 System.out.println("The number " + number + " is a real number.");
      	 }

    }
}
