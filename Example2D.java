public class Example2D{
	//declare vars
	private int[][] initialNumbers;
	private double[][] finalNumbers=new double[2][3];
	private double[] sum=new double[2];
	private double[] avg=new double[2];

	//constructor
	public Example2D(){

	}
	//set
	public void setInitialNumbers(int[][] initialNumbers){
		this.initialNumbers=initialNumbers;
	}
	//compute
	public void computeFinalNumbers(){
		//multiply the numbers to create new array
		for(int i=0;i<initialNumbers.length;i++){//rows
			for(int j=0;j<initialNumbers[i].length;j++){//columns
				finalNumbers[i][j]=initialNumbers[i][j]*1.1;
				sum[i]=sum[i]+finalNumbers[i][j];
			}
			avg[i]=sum[i]/initialNumbers[i].length;
		}
	}
	//get
	public double[][] getFinalNumbers(){
		return finalNumbers;
	}
	public double[] getSum(){
		return sum;
	}
	public double[] getAvg(){
		return avg;
	}

}