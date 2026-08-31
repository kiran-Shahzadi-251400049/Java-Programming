public class RunRetailItem{
	public static void main(String[] args) {
		RetailItem item1 = new RetailItem();
		RetailItem item2 = new RetailItem();
		RetailItem item3 = new RetailItem();

		System.out.println("Enter data for item 1");
		item1.input();
		System.out.println("Enter data for item 2");
		item2.input();
		System.out.println("Enter data for item 3");
		item3.input();

		System.out.println("\nData stored: ");
		System.out.println("\nItem 1");
		item1.output();
		System.out.println("\nItem 2");
		item2.output();
		System.out.println("\nItem 3");
		item3.output();
	}
}