public class PatientRecord{
	//State,Attributes, Data members, Fields, Instance fiels
	private String patientID;
	private String patientName;
	private String bloodGroup;
	private String lastVisitDate;
	private static int idCounter = 0;

	//Constructors
	public PatientRecord(){
		patientID = "P000" + idCounter;
		patientName = "Unknown";
		bloodGroup = "O+";
		lastVisitDate = "2000-01-01";
	}//Default-Constructor

	public PatientRecord(String name, String bloodType, String lastTimeVisit){
		patientID = "P000"+ idCounter++;
		patientName = name;
		bloodGroup = bloodType;
		lastVisitDate = lastTimeVisit;
	}//Overloaded-Constructor

	public PatientRecord(PatientRecord p){
		this.patientID = p.patientID+"_Copy";
		this.patientName = p.patientName;
		this.bloodGroup = p.bloodGroup;
		this.lastVisitDate = p.lastVisitDate;
	}//Copy-Constructor

	//Getters, Accessors
	public String getId(){
		return patientID;
	}//getId

	public String getName(){
		return patientName;
	}//getName

	public String getBloodGroup(){
		return bloodGroup;
	}//getBloodGroup

	public String getLastVisitDate(){
		return lastVisitDate;
	}//getLastVisitDate

	//Setters, Mutators
	public void setBloodGroup(String bloodType){
		if(bloodType.equals("A+") || bloodType.equals("A-") || bloodType.equals("B+") || bloodType.equals("B-") || bloodType.equals("AB+") || bloodType.equals("AB-") || bloodType.equals("O+") || bloodType.equals("O-")){
			bloodGroup = bloodType;
		}
		else{
			System.out.println("Error:Invalid Blood Group!");
		}
	}//setBloodGroup

	public void setLastVisitDate(String lastTimeVisit){
		if(lastTimeVisit == null || lastTimeVisit.isEmpty()){
			System.out.println("Error:Date cann't be Empty!");
		}
		else{
			lastVisitDate = lastTimeVisit;
		}
	}//setLastVisitDate


	//Member Methods
	public String toString(){
		return "Patient: "+patientName +", ID: "+patientID +", Blood Group: "+bloodGroup +", Last Visit: "+lastVisitDate; 
	}//toString

	public static PatientRecord create(String name, String bloodType, String lastTimeVisit){
		if(name == null || name.isEmpty()){
			System.out.println("Error:Name Cann't be empty!");
			return null;
		}
		if(!(bloodType.equals("A+") || bloodType.equals("A-") || bloodType.equals("B+") || bloodType.equals("B-") || bloodType.equals("AB+") || bloodType.equals("AB-") || bloodType.equals("O+") || bloodType.equals("O-"))){
			System.out.println("Error:Invalid Blood Group!");
			return null;
		}
		if(lastTimeVisit == null || lastTimeVisit.isEmpty()){
			System.out.println("Error:Date cann't be Empty!");
			return null;
		}
		PatientRecord patient = new PatientRecord();
		patient.patientName = name;
		patient.patientID = "P000"+idCounter++;
		patient.bloodGroup = bloodType;
		patient.lastVisitDate = lastTimeVisit;
		return patient;
	}//create

	public void copy(PatientRecord p){
		this.patientID = "P000"+idCounter++;
		this.patientName = p.patientName;
		this.bloodGroup = p.bloodGroup;
		this.lastVisitDate = p.lastVisitDate;
	}//Copy-Method

	public boolean isEqual(PatientRecord p){
			return this.patientID.equals(p.patientID) && this.patientName.equals(p.patientName);
	}//isEqual

	public boolean isNotEqual(PatientRecord p){
			return !(this.patientID.equals(p.patientID)) || !(this.patientName.equals(p.patientName));
	}//isNotEqual

	public boolean mergeHistory(PatientRecord p){
		if(!(this.patientName.equals(p.patientName))){
			System.out.println("Merging failed:Name Mismatched!");
			return false;
		}
		else if(!(this.bloodGroup.equals(p.bloodGroup))){
			System.out.println("Merging failed:Blood Group Mismatched!");
			return false;
		}
		else{
			this.lastVisitDate = p.lastVisitDate;
			this.patientID = this.patientID + "+" + p.patientID;
			return true;
		}
	}//mergeHistory

}//PatientRecord-Class