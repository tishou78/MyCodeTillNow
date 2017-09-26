package QA9;

public enum Months {
	January("january"),
	February("february"),
	March("march"),
	April("april"),
	May("may"),
	Jun("jun"),
	July("july");
	
	private String value;
	private Months(String value){
		this.value = value;
	}
	public String getVelue(){
		return value;
	}
	public static Months fromString(String monthValue){
		for(Months month: values()){
			if(month.getVelue().equalsIgnoreCase(monthValue))
			  return month;
		}
		
		return null;
    }
}
