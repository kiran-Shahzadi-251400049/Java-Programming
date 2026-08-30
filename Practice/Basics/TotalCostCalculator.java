public class TotalCostCalculator //class header

{  //class body starts

    public static void main(String[] postlab2task1) //main header

	{  //main body starts

        //Variables
        double basePrice = 250.0;   
        int quantity = 15;          
        double taxRate = 0.07;      

        double totalBasePrice = basePrice*quantity;
        double totalTax = totalBasePrice*taxRate;
        double totalCost = totalBasePrice+totalTax;

        //print statements
        System.out.println("Base price per item: " + basePrice);
        System.out.println("Quantity of items: " + quantity);
        System.out.println("Total tax amount: " + totalTax);
        System.out.println("Total cost (including tax): " + totalCost);

    }  //main body ends

}  //class body ends
