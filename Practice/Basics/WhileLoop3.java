import java.util.Scanner;

public class WhileLoop3
{

    	public static void main(String[] args) 
	{
        	Scanner input = new Scanner(System.in);

       	 // a) Numbers from 1 to 100

        	System.out.println("Numbers from 1 to 100:");
        	int i = 1;
        	while (i <= 100) {
            	System.out.print(i + " ");
           	 i++;
        	}

        	System.out.println("\n");

        	// b) Powers of 3 less than n

        	System.out.print("Enter value of n for powers of 3: ");
        	int n = input.nextInt();

        	System.out.println("Powers of 3 less than " + n + ": ");
        	int power = 1;
        	while (power < n) 
			{
           		System.out.print(power + " ");
            		power = power * 3;
       		}

        	System.out.println("\n");

        	// c) Numbers divisible by 8 less than n


        	System.out.print("Enter th number: ");
        	int num = input.nextInt();

        	System.out.print("Numbers divisible by/multiples of 4 less than " + num+ ": ");
			n=0;

        	while (n<num) 
			{
				if(num %4==0)
				{
            		System.out.print( n+ " ");
            	}
				else 
				{
					System.out.print("------");
				}
				n += 4;
    		}

    }//main
}//class
