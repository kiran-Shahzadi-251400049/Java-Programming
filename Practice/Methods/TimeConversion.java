import java.util.Scanner;
public class TimeConversion
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter seconds: ");
		double seconds = input.nextDouble();

		while(seconds<1)
		{
			System.out.print("Enter valid seconds: ");
			seconds = input.nextInt();
		}//while

		secondsToTimeUnits(seconds);

	}//main

	public static void secondsToTimeUnits(double seconds)
	{
       		 long totalMilliseconds = (long)(seconds * 1000);	//As (1 second = 1000 milliseconds), (suitable datatype=long)(int se sai output nai nikli)

       		 long hours = totalMilliseconds/3600000;
       		 long remainingMs = totalMilliseconds%3600000;

       		 long minutes = remainingMs/60000;
        		remainingMs = remainingMs%60000;

        		long secs = remainingMs/1000;
        		long milliseconds = remainingMs%1000;

		if(hours>0)
		{
			System.out.print(hours+" x Hour ");
		}//hours

		if(minutes>0)
		{
			System.out.print(minutes+" x Minutes ");
		}//minutes

		if(secs>0)
		{
			System.out.print(secs+" x Secs ");
		}//secs

		if(milliseconds>0)
		{
			System.out.print(milliseconds+" x Milliseconds");
		}//milliseconds

	}//secondsToTime
}//class