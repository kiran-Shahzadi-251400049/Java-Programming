import java.util.Scanner;
public class TempConvert
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of temperature: ");
		double value = input.nextDouble();

		char temperature =' ';

		do{
		System.out.print("In which type do you to convert the value?\nEnter F for Fahrenheit and C for Celsius: ");
		temperature = input.next().charAt(0);
		}while(temperature!='F' && temperature!='f' && temperature!='C' && temperature!='c');
		
		double result = tempConvert(value, temperature);

		if(temperature=='F' || temperature=='f')
		{
		System.out.print("The temperature in Fahrenheit is: "+result);
		}

		else
		{
		System.out.print("The temperature in Celsiusis: "+result);
		}

	}//main

	public static double tempConvert(double value, char temperature) 
	{

		if(temperature=='F' || temperature=='f')
		{
			return  (9.0/5.0)*value+32;		//F = (9 / 5) C + 32 
		}//if

		else
		{
			return  5.0/9.0*(value-32);		//C = 5 / 9 (F – 32)		
		}

	}//tempConvert
}//class