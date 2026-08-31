public class TimeInterval{
	//Data members, Instance field, Attributes, States, Fields
	private int hours;
	private int minutes;
	private int seconds;
	private String type;


	//Constructors
	public TimeInterval(){
		hours = 0;
		minutes = 15;
		seconds = 0;
		type = "BREAK";
	}//Default-Constructor

	public TimeInterval(int h, int min, int sec, String category){
		if(h >= 0 && min >=0 && min<=59 && sec >=0 && sec<=59 && category !=null && !category.isEmpty() ){
			hours = h;
			minutes = min;
			seconds = sec;
			type = category;
		}
		else{
			if(h < 0){
				System.out.println("Error:Invalid hours!");
			}
			if(min < 0 || min > 59){
				System.out.println("Error:Invalid minutes!");
			}
			if(sec < 0 || sec > 59){
				System.out.println("Error:Invalid seconds!");
			}
			if(category == null || category.isEmpty()){
				System.out.println("Error:Invalid type!");
			}

		}
	}//Overloaded-Constructor

	public TimeInterval(TimeInterval obj){
		this.hours = obj.hours;
		this.minutes = obj.minutes;
		this.seconds = obj.seconds;
		this.type = new String(obj.type);
	}//Copy-Constructor


	//Setters, Mutators
	public void setHours(int h){
		if(h >= 0){
			hours = h;
		}
		else{
			System.out.println("Error:Invalid hours!");
		}
	}//setHours

	public void setMinutes(int min){
		if(min >=0 && min <=59){
			minutes = min;
		}
		else{
			System.out.println("Error:Invalid minutes!");
		}
	}//setMinutes

	public void setSeconds(int sec){
		if(sec >=0 && sec <=59){
			seconds = sec;
		}
		else{
			System.out.println("Error:Invalid seconds!");
		}
	}//setSeconds

	public void setType(String category){
		if(category != null && !category.isEmpty() ){
			type = category;
		}
		else{
			System.out.println("Error:Invalid type!");
		}
	}//setType


	//Getters, Accessors
	public int getHours(){
		return hours;
	}//getHours

	public int getMinutes(){
		return minutes;
	}//getMinutes

	public int getSeconds(){
		return seconds;
	}//getSeconds

	public String getType(){
		return type;
	}//getType


	//Member Methods
	public static TimeInterval create(int h, int min, int sec, String category){
		if(h >= 0 && min >=0 && min<=59 && sec >=0 && sec<=59 && category !=null && !category.isEmpty() ){
			TimeInterval obj = new TimeInterval();
			obj.hours = h;
			obj.minutes = min;
			obj.seconds = sec;
			obj.type = category;
			return obj;
		}
		else{
			if(h < 0){
				System.out.println("Error:Invalid hours!");
			}
			if(min < 0 || min > 59){
				System.out.println("Error:Invalid minutes!");
			}
			if(sec < 0 || sec > 59){
				System.out.println("Error:Invalid seconds!");
			}
			if(category == null || category.isEmpty()){
				System.out.println("Error:Invalid type!");
			}
			return null;
		}
	}//create

	public TimeInterval copy(){
		TimeInterval obj = new TimeInterval();
		obj.hours = this.hours;
		obj.minutes = this.minutes;
		obj.seconds = this.seconds; 
		obj.type = this.type;
		return obj;
	}//copy

	public String toString(){
		return "Interval: ["+hours +"]h ["+minutes +"]min ["+seconds + "], Type: "+type;
	}//toString

	public boolean isEqual(TimeInterval obj){
		int thisTotalSeconds = this.hours*3600 + this.minutes*60 + this.seconds;
		int objTotalSeconds = obj.hours*3600 + obj.minutes*60 + obj.seconds;
		if(thisTotalSeconds == objTotalSeconds){
			return true;
		}
		else{
			return false;
		}
	}//isEqual

	public boolean isNotEqual(TimeInterval obj){
		int thisTotalSeconds = this.hours*3600 + this.minutes*60 + this.seconds;
		int objTotalSeconds = obj.hours*3600 + obj.minutes*60 + obj.seconds;
		if(thisTotalSeconds != objTotalSeconds){
			return true;
		}
		else{
			return false;
		}
	}//isNotEqual

	public int shiftDuration(int secondsToAdd){
		int totalSeconds = hours*3600 + minutes*60 + seconds;
		int totalDuration = totalSeconds + secondsToAdd;
		hours = totalDuration / 3600;
		int remaining = totalDuration % 3600;
		minutes = remaining / 60;
		seconds = remaining % 60;

		if(totalDuration > 7200){
			type = "LONG";
		}
		else if(totalDuration > 1800 && totalDuration <= 7200){
			type = "MEDIUM";
		}

		return totalDuration;
	}//shiftDuration

}//TimeInterval-Class