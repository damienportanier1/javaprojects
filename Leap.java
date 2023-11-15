public class Leap{
	//var
	private int year;
	private boolean isLeap;
	private String msg;
	//constructor
	public Leap(){
		msg="is not a leap year";
	}
	//set
	public void setYear(int year){
		this.year=year;
	}
	//compute
	public void computeLeap(){
		if(year%4==0){
			isLeap=true;
			if(year%100==0){
				isLeap=false;
				if(year%400==0){
					isLeap=true;
				}
			}
		}
		if(isLeap==true){
			msg="is a leap year";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}

}