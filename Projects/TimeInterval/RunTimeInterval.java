public class RunTimeInterval{
	 public static void main(String[] args) {
		TimeInterval interval1 = new TimeInterval();
		TimeInterval interval2 = new TimeInterval(3, 25, 55, "TRAVEL");
		TimeInterval interval3 = new TimeInterval(interval2);
		TimeInterval interval4 = TimeInterval.create(5, 45, 20, "BREAK");

	 	System.out.println("------------------------------------------------------------------");
	 	System.out.println("                        Time Interval Program                     ");
	 	System.out.println("------------------------------------------------------------------");

	 	System.out.println("\nTrying to set hours of interval 1 to -4:");
	 	interval1.setHours(-4);
	 	System.out.println("\nTrying to set hours of interval 1 to 1:");
	 	interval1.setHours(1);
	 	System.out.println("Hours of interval 1: "+ interval1.getHours());


	 	System.out.println("\nTrying to set minutes of interval 2 to 61:");
	 	interval2.setMinutes(61);
	 	System.out.println("\nTrying to set minutes of interval 2 to 48:");
	 	interval2.setMinutes(48);
	 	System.out.println("Minutes of interval 2: "+ interval2.getMinutes());


	 	System.out.println("\nTrying to set seconds of interval 3 to -30:");
	 	interval3.setSeconds(-30);
	 	System.out.println("\nTrying to set seconds of interval 3 to 20:");
	 	interval3.setSeconds(20);
	 	System.out.println("Seconds of interval 3: "+ interval3.getSeconds());


	 	System.out.println("\nTrying to set type of interval 4 to empty String:");
	 	interval4.setType("");
	 	System.out.println("\nTrying to set type of interval 4 to WORK:");
	 	interval4.setType("WORK");
	 	System.out.println("Type of interval 4: "+ interval4.getType());

	 	System.out.println("------------------------------------------------------------------");

	 	System.out.println("\nDetails of interval 1:");
	 	System.out.println(interval1.toString());

	 	System.out.println("\nDetails of interval 2:");
	 	System.out.println(interval2.toString());

	 	System.out.println("\nDetails of interval 3:");
	 	System.out.println(interval3.toString());

	 	System.out.println("\nDetails of interval 4:");
	 	System.out.println(interval4.toString());

	 	System.out.println("------------------------------------------------------------------");

	 	System.out.println("\nInterval 1 is equal to interval 2: " + interval1.isEqual(interval2));
	 	System.out.println("\nInterval 3 is not equal to interval 4: " + interval3.isNotEqual(interval4));

	 	System.out.println("------------------------------------------------------------------");

	 	System.out.println("\nCopying interval 3 in a new interval: ");
	 	System.out.println("Interval 3(before copying):");
	 	System.out.println(interval3.toString());

	 	TimeInterval interval5 = interval3.copy();
	 	System.out.println("\nNew interval: ");
	 	System.out.println(interval5.toString());

	 	interval5.setType("HOLIDAY");
	 	System.out.println("\nNew interval after setting type HOLIDAY: ");
	 	System.out.println(interval5.toString());

	 	System.out.println("\nInterval 3(after copying):");
	 	System.out.println(interval3.toString());

	 	System.out.println("------------------------------------------------------------------");

	 	System.out.println("\nShifting Duration:");

	 	System.out.println("\nOriginal record of interval 1:\n" + interval1.toString());

	 	System.out.println("\nTotal duration after adding 200 sec: " + interval1.shiftDuration(-4000));
	 	System.out.println("Interval 3 after updation:\n"+interval1.toString());

	 	System.out.println("\nTotal duration after adding 2000 sec: " + interval1.shiftDuration(2500));
	 	System.out.println("Interval 3 after updation:\n"+interval1.toString());

	 	System.out.println("\nTotal duration after adding 5000 sec: " + interval1.shiftDuration(7000));
	 	System.out.println("Interval 3 after updation:\n"+interval1.toString());

	 	System.out.println("------------------------------------------------------------------");
	 	System.out.println("                     Program Ended Successfully                   ");
	 	System.out.println("------------------------------------------------------------------");

	 }//Main-Method
}//RunTimeInterval-Class