import java.util.Scanner;

public class GradeCalculation
{
	public static void main(String[] args) 
	{

       	 Scanner input = new Scanner(System.in);

       	 System.out.print("Enter your quiz score: ");
      	  int score = input.nextInt();

        	String grade;

       	 if (score >= 90 && score <= 100) 
	{
           		 grade = "A";
        	} 
	else if (score >= 80 && score <= 89) 
	{
            		grade = "B";
        	}
	else if (score >= 70 && score <= 79) 
	{
            		grade = "C";
        	} 
	else if (score >= 60 && score <= 69) 
	{
            		grade = "D";
        	} 
	else if (score < 60) 
	{
	                 grade = "F";
        	}
	 else 
	{
            		grade = "Invalid score";  
       	}

        System.out.println("Quiz Score: " + score);
       	System.out.println("Grade: " + grade);

	}//main
}//class
