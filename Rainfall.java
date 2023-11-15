/*Week 8 teacher Emer Thornbury lesson

Monday 14 11 2022

Rainfall.java

Develop an application that accepts from the user,
The average rainfall each day for four weeks and stores them in an array.
The application should then calculate the average rainfall for each week and store the answers in a separate array.

Then calculate min and max.

TIPS: make IPO and then put first Vars, Set and Get method in main file (instantiable) + compile at every code written
*/

public class Rainfall{

	//data members
		//create, declare and initialise the 2D Arrays
	private double rainfall[][] = new double[4][7]; //4 rows and 7 columns
	private double avg[] = new double[4];
	private double min,max;

	//constructor - default
	public Rainfall (){
		//rainfall[][]=new double[4][7];
	}
	//set methods - one for every input
	public void setRainfall(double[][]rainfall){
		this.rainfall=rainfall;
	}

	//my other methods - compute + for loop
	public void compute(){
		min = rainfall[0][0];
		max = rainfall[0][0];
		for (int week=0; week < rainfall.length; week++){ //i = week = row
			double sum = 0;//set to 0 at the start of the week
			for (int day = 0; day < rainfall[week].length; day++){ //y = day = column
				sum = sum + rainfall[week][day];
				//min check and possible reset
				if(min > rainfall[week][day]){
					min = rainfall[week][day];
				}
				//max check and possible reassign
				if(max < rainfall[week][day]){
					max = rainfall[week][day];
				}
			}//inner close
			avg[week] = sum/7;//sum/rainfall[week].length;
		}//outer close
	}//compute close

	//get methods - one for every output
	public double getMin(){
		return min; //return = send the information to the App file
	}
	public double getMax(){
		return max; //return = send the information to the App file
	}
	public double [] getAvg(){//datatype [] for return an array to the App File
		return avg; //return = send the information to the App file
	}

}

