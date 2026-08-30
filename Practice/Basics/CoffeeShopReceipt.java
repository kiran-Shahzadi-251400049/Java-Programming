/*Creating First Assignment
  Task Number One
  Coffe Shop Receipt*/


public class CoffeeShopReceipt //Class Header
{ //Class Body Start

	public static void main(String [] assignment1) //Main Header
	{ //Main Body Start

			//Variable
			//Info
			String ph_no = "042-987654321"; 
			String date = "05-05-2025";
			String receipt = "000245";
			String cashierName = "Sara";
			String pymntMode = "Card";

			//items
			String item1 = "Cappuccino";
			String item2 = "Muffin";
			String item3 = "Latte";

			//Quantity of items
			int qtyOfItem1 = 2;
			int qtyOfItem2 = 1;
			int qtyOfItem3 = 3;	

			//Individual price
			double priceOfItem1 = 450.0;
			double priceOfItem2 = 250.0;
			double priceOfItem3 = 300.0;

			//Total individual item price 
			double totalOfItem1 = qtyOfItem1*priceOfItem1;
			double totalOfItem2 = qtyOfItem2*priceOfItem2;
			double totalOfItem3 = qtyOfItem3*priceOfItem3;


			//Grandtotal, apllying tax and discount
			double grandTotal = totalOfItem1+totalOfItem2+totalOfItem3;
			double discount = grandTotal/10.0;
			double tax =(5.0/100.0)*grandTotal;       //or 0.05*grandTotal;
			double netTotal = grandTotal - discount + tax;

			//Print Staements
			System.out.println("\t \t \t Brew Haven Coffe Shop"); 
			System.out.println("\t \t \t 45 Liberty Street, Lahore");  //Contact details
			System.out.println("\t \t \t Ph: " + ph_no);
		
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("Date:  " + date + " \t \t \t \t \t \t  Receipt #:   " + receipt);
			System.out.println("Cashier:   " + cashierName + " \t \t \t \t \t \t  Payment Mode:   " + pymntMode);

			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("Item \t \t \t Qty \t \t Unit Price \t \t  Total");

			System.out.println("-----------------------------------------------------------------------------");

			System.out.println(item1 + "\t \t " + qtyOfItem1 + "\t \t " + priceOfItem1 + "\t \t \t  " + totalOfItem1);
			System.out.println(item2 + "\t \t \t " + qtyOfItem2 + "\t \t " + priceOfItem2 + "\t \t \t  " + totalOfItem2);
			System.out.println(item3 + "\t \t \t " + qtyOfItem3 + "\t \t " + priceOfItem3 + "\t \t \t  " + totalOfItem3);

			System.out.println("-----------------------------------------------------------------------------");
	
			System.out.println("Subtotal: \t \t \t \t \t \t \t " + grandTotal);
			System.out.println("Discount (10%): \t \t \t \t \t        -" + discount);
			System.out.println("Tax (5%): \t \t \t \t \t \t \t " + tax);

			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("Net Total: \t \t \t \t \t \t \t " + netTotal);
	
			System.out.println("-----------------------------------------------------------------------------");
		
			System.out.println("\t Thank you for visiting Brew Haven!");
			System.out.println("\t No refunds without receipt.");
			System.out.println("\t See you again :)");

	} //Main Body End

} //Class Body End