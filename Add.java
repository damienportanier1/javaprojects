//code du prof
public class Add{
	//vars
	private double sum;
	private double average;
	private int repeat;
	private String grade;
	//constructor
	public Add(){
		grade="Not set";
	}
	//set
	public void setSum(double sum){
		this.sum=sum;
	}
	public void setRepeat(int repeat){
		this.repeat=repeat;
	}
	//compute
	public void computeAverage(){
		average=sum/repeat;
	}
	public void computeGrade(){
		if(average>=40 && average<50){
			grade="Pass";
		}
		else if(average>=50 && average<60){
			grade="2.2";
		}
		else if(average>=60 && average<70){
			grade="2.1";
		}
		else if(average>=70 && average<=100){
			grade="1.1";
		}
		else if(average<40 && average>=0){
			grade="Fail";
		}
		else{
			grade="Out of range";
		}
	}
	//get
	public double getAverage(){
		return average;
	}
	public String getGrade(){
		return grade;
	}
}