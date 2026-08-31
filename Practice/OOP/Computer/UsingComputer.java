public class UsingComputer{

	public static void main(String[] args) {

	HardDisk hd =new HardDisk(1550.3, 6, "SSD");
	Ram rm =new Ram(2400, 8.3);

	Computer c =new Computer(hd, rm, 50000, "ABC");

	System.out.println("\nInformation of computer: ");
	c.ComputerState();

	System.out.println("\nCapacity of ram: "+c.getRamCapacity());
	System.out.println("\nCapacity of hard-disk: "+c.getHardDiskCapacity());

	System.out.println("\nRam is costly than hardisk:"+ c.isRamCostly());
	System.out.println("\nHard-disk is SSD: "+c.isDiskSSD());

	}//main

}//UsingComputer