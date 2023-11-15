/*Week 8 teacher Emer Thornbury lesson

Monday 14 11 2022

Rainfall.java

Develop an application that accepts from the user,
The average rainfall each day for four weeks and stores them in an array.
The application should then calculate the average rainfall for each week and store the answers in a separate array.

Then calculate min and max.

TIPS: make IPO and then put first Vars, Set and Get method in main file (instantiable) + compile at every code written
*/

import java.util.Scanner; //java utility package - allowing for user input
public class RainfallApp{ //method
	public static void main(String[] args){

		//vars
		double rainfall[][] = new double[4][7]; //4 rows and 7 columns
		double avg[] = new double[4];
		double min,max;

		//objam
		Scanner in = new Scanner(System.in);
		Rainfall rain = new Rainfall();
		//input
		for (int week = 0; week < rainfall.length; week++){
			for (int day=0; day < rainfall[week].length; day++){

				//ask for data
				System.out.println("Enter rainfall data for week "+(week+1));
				rainfall[week][day] = in.nextDouble();
			}//inner close
		}//outer close
		//call set method
		rain.setRainfall(rainfall);
		//call my compute
		rain.compute();
		//call my getters
		avg = rain.getAvg();
		min = rain.getMin();
		max = rain.getMax();

		//output = display - 1 for loop for avg,
		System.out.println("");
		for (int week = 0; week < avg.length; week++){ //avg array store with only the week (row)
			//display rainfall
			System.out.println("Avg rainfall for week "+(week+1)+": "+avg[week]);
		}//outer close
		System.out.println("Min is "+min);
		System.out.println("Max is "+rain.getMax()); //or +max is the same

		//for test - display the contents of a 2D Array
		for (int week = 0; week < rainfall.length; week++){
			for (int day=0; day < rainfall[week].length; day++){

				System.out.println("rainfall data "+rainfall[week][day]);
			}//inner close
		}//outer close


	}
}
