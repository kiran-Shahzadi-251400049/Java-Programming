
public class WarehousePackingSummary  //Class header

{  //Class body starts

		public static void main(String [] args)  //Main header
	
		{  //Main body starts

			//Variable
			
			int totalitems =347;
			final int box60 =60;
			final int box25 =25;
			final int box10 =10;
			final int box5 =5;

			int box_60 =totalitems/box60;
			int leftAfter60 =totalitems%box60;

			int box_25 =leftAfter60/box25;
			int leftAfter25 =leftAfter60%box25;

			int box_10 =leftAfter25/box10;
			int leftAfter10 =leftAfter25%box10;

			int box_5 =leftAfter10/box5;
			int leftAfter5 =leftAfter10s%box5;

			//Print Statements

			System.out.println("Warehouse Packing Summary");
			System.out.println("=========================");
			System.out.println("Total items to pack: " + totalitems);
			System.out.println("Boxes of 60 items: " + box_60);
			System.out.println("Boxes of 25 items: " + box_25);
			System.out.println("Boxes of 10 items: " + box_10);
			System.out.println("Boxes of 5 items : " + box_5);
			System.out.println("Unpacked items   : " + leftAfter5);
			System.out.print("=========================");

		}  //Main body ends

}  //Clss body ends