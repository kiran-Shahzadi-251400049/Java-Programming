public class RunPatientRecord{
	public static void main(String[] args) {
		PatientRecord patient1 = new PatientRecord();
		PatientRecord patient2 = new PatientRecord("Musa", "A-", "2026-5-15");
		PatientRecord patient3 = new PatientRecord();
		PatientRecord patient4 = new PatientRecord(patient2);

		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("                                  Patient Record System                                  ");
		System.out.println("-----------------------------------------------------------------------------------------");


		System.out.println("\nRecord of patient # 1:");
		System.out.println(patient1.toString());

		System.out.println("\nRecord of patient # 2:");
		System.out.println(	patient2.toString());

		System.out.println("\nRecord of patient # 3:");
		System.out.println(patient3.toString());

		System.out.println("\nRecord of patient # 4:");
		System.out.println(patient4.toString());

		System.out.println("\n-----------------------------------------------------------------------------------------");


		System.out.println("\nTrying to set the blood group of patient 1 to C+:");
		patient1.setBloodGroup("C+");

		System.out.println("\nTrying to set the blood group of patient 2 to AB+:");
		patient2.setBloodGroup("AB+");
		System.out.println(patient2.toString());

		System.out.println("\nTrying to set the last visit date of patient 3 to empty string :");
		patient3.setLastVisitDate("");

		System.out.println("\nTrying to set the last visit date of patient 4 to 2026-6-1:");
		patient4.setLastVisitDate("2026-6-1");
		System.out.println(patient4.toString());


		System.out.println("\n-----------------------------------------------------------------------------------------");


		System.out.println("\nTrying to create new object with data empty string, A-, 2025-12-23 :");
		System.out.println(PatientRecord.create("", "D-", ""));

		System.out.println("\nTrying to create new object with data Musa, AB+, 2026-4-23: ");
		PatientRecord patient5 = PatientRecord.create("Musa", "AB+", "2026-4-23");
		System.out.println("\nRecord of new object (patient # 5):");
		System.out.println(patient5.toString());


		System.out.println("\n-----------------------------------------------------------------------------------------");


		System.out.println("\nRecord of Patient 1 is equal to patient 3:" + patient1.isEqual(patient3));

		System.out.println("\nRecord of Patient 2 is not equal to patient 4:" + patient2.isNotEqual(patient4));


		System.out.println("\n-----------------------------------------------------------------------------------------");


		System.out.println("\nCopying Record of patient 4 in patient 1:");
		System.out.println("Record of patient # 1 (before copying):");
		System.out.println(patient1.toString());
		System.out.println("\nRecord of patient # 4 before copying:");
		System.out.println(patient4.toString());
		patient1.copy(patient4);
		System.out.println("Record of patient # 1 (after copying):");
		System.out.println(patient1.toString());


		System.out.println("\n-----------------------------------------------------------------------------------------");


		System.out.println("\nSuccesfully merged the Records of patient 1 and patient 5:"+patient1.mergeHistory(patient5));
		System.out.println("\nSuccesfully merged the Records of patient 2 and 5: "+patient2.mergeHistory(patient5));
		System.out.println("Record of patient 2 after merging: ");
		System.out.println(patient2.toString());

		System.out.println("\n-----------------------------------------------------------------------------------------");
		System.out.println("                                  Program End Successfully                               ");
		System.out.println("-----------------------------------------------------------------------------------------");

	}//Main-Method

}//RunPatientRecord-Class