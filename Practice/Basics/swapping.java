public class swapping {
	public static void main(String [] args){
		int a = 8;
                int b = 5;

	        System.out.println("Value of variable a before swapping = " + a);
                System.out.println("Value of variable b before swapping = " + b);

                // Swapping
                int temp = a;
                a = b;
                b = temp;

                System.out.println("Value of variable a after swapping = " + a);
                System.out.println("Value of variable b after swapping = " + b);
	}
}