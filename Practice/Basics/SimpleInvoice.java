// TechMart Online Store

public class SimpleInvoice  //Class Header

{  //Class Body Starts

	public static void main(String [] args)  //Main Header

	{  //Main Body Starts
		
		//Varialbles
		String name ="Kiran Shahzadi";  //Customer details
		String date ="17-11-2025";     //Order details
		String time ="03:30 PM";

		//Products
		String product1 ="Laptop Bag";
		String product2 ="Wireless Mouse";
		String product3 ="USB Flash Drive";
		String product4 ="Laptop Stand";

		//Quantities
		int qtyOfProduct1 =1;
		int qtyOfProduct2 =2;
		int qtyOfProduct3 =1;
		int qtyOfProduct4 =1;

		//Unit Prices
		double priceOfProduct1 =2500.0;
		double priceOfProduct2 =1200.0;
		double priceOfProduct3 =800.0;
		double priceOfProduct4 =3500.0;

		//Totals
		double totalforProduct1 =qtyOfProduct1*priceOfProduct1;
		double totalforProduct2 =qtyOfProduct2*priceOfProduct2;
		double totalforProduct3 =qtyOfProduct3*priceOfProduct3;
		double totalforProduct4 =qtyOfProduct4*priceOfProduct4;

		//Final calculations and bill
		double subtotal =totalforProduct1+totalforProduct2+totalforProduct3+totalforProduct4;
		double deliveryCharges =250.0;
		double serviceFee =subtotal*0.03;
		double netTotal =subtotal+deliveryCharges+serviceFee;

		//Print Statements
		System.out.println("===========================================");

		System.out.println(" \t TechMart Online Store");  //Store Name

		System.out.println("===========================================");

		System.out.println("Customer Name:   " + name);  //Customer details
		System.out.println("Order Date:      " + date + "  " + time);  //Order details

		System.out.println("===========================================");

		System.out.println("Product \t \t Qty \t Unit Price \t Total");

		System.out.println("-------------------------------------------");

		System.out.println(product1 + "\t \t " + qtyOfProduct1 + "\t " + priceOfProduct1 + "\t \t " + totalforProduct1);  //1st product
		System.out.println(product2 + "\t \t " + qtyOfProduct2 + "\t " + priceOfProduct2 + "\t \t " + totalforProduct2);  //2nd product
		System.out.println(product3 + "\t \t " + qtyOfProduct3 + "\t " + priceOfProduct3 + "\t \t " + totalforProduct3);  //3rd product
		System.out.println(product4 + "\t \t " + qtyOfProduct4 + "\t " + priceOfProduct4 + "\t \t " + totalforProduct4);  //4th product

		System.out.println("-------------------------------------------");

		System.out.println("Subtotal: \t \t \t Rs. " + subtotal);
		System.out.println("Delivery Charges: \t \t Rs. " + deliveryCharges);
		System.out.println("Service Fee (3%):   \t \t Rs. " + serviceFee);

		System.out.println("-------------------------------------------");

		System.out.println("Final Amount: \t \t \t Rs. " + netTotal);


		System.out.println("===========================================");

		System.out.println("Thank you for shopping with TechMart!");

		System.out.print("===========================================");

	}  //Main Body Ends

}  //Class Body Ends
