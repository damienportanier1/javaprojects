public class Example{
	//declare vars
	private int[] initialNumbers;
	private int[] finalNumbers=new int[3];
	private int sum;
	private double avg;

	//constructor
	public Example(){
		sum=0;
		avg=0.0;
	}
	//set
	public void setInitialNumbers(int[] initialNumbers){
		this.initialNumbers=initialNumbers;
	}
	//compute
	public void computeFinalNumbers(){
		finalNumbers=new int[initialNumbers.length];
		//multiply the numbers to create new array
		for(int i=0;i<initialNumbers.length;i++){
			finalNumbers[i]=initialNumbers[i]*5;
			sum=sum+finalNumbers[i];
		}
		avg=sum/initialNumbers.length;
	}
	//get
	public int[] getFinalNumbers(){
		return finalNumbers;
	}
	public int getSum(){
		return sum;
	}
	public double getAvg(){
		return avg;
	}

}