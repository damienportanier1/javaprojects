public class NightOut{
	//vars
	private String programmeCode;
	private int yearOfStudy;
	private String venueMsg;
	//constructor
	public NightOut(){
		venueMsg="Not yet set";
	}
	//set
	public void setProgrammeCode(String programmeCode){
		this.programmeCode=programmeCode;
	}
	public void setYearOfStudy(int yearOfStudy){
		this.yearOfStudy=yearOfStudy;
	}
	//compute
	public void computeVenue(){
		if(yearOfStudy==1){
			if(programmeCode.equalsIgnoreCase("HDAIML")){
				venueMsg="Lagoona";
			}
			else if(programmeCode.equalsIgnoreCase("HDBC")){
				venueMsg="Harbormaster";
			}
			else{
				venueMsg=programmeCode+": is not a valid code";
			}
		}
		else if(yearOfStudy==2){
			if(programmeCode.equalsIgnoreCase("HDAIML")){
				venueMsg="Harbormaster";
			}
			else if(programmeCode.equalsIgnoreCase("HDBC")){
				venueMsg="Lagoona";
			}
			else{
				venueMsg=programmeCode+": is not a valid code";
			}
		}
		else{
			venueMsg=yearOfStudy+": is not a valid input";
		}


	}
	//get
	public String getVenue(){
		return venueMsg;
	}

}