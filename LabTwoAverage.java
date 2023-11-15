/*
Lab Week 8 Software Development
Lab 2 Write a program that allows a user to enter 5 results for each year of a 4 year course. The app should: Give an average for each year and give a total average
Damien Portanier
11 11 2022
*/

//method
public class LabTwoAverage{

		//Variables
		//declare (named result), create array, initialise 2D Arrays //number of boxes in the 2D Arrays will be initialise in the AppFile because the Instantiable Class is the base for multiple Apps
		private int result; //row
		private int year; //column
		private double[][]array;//2D Arrays - row then column
		private double averagePerYear1;
		private double averagePerYear2;
		private double averagePerYear3;
		private double averagePerYear4;
		private double totalAverage;
		private double sum1;
		private double sum2;
		private double sum3;
		private double sum4;

		//Constructor (by default or modif)
		public LabTwoAverage(){
			int result=0;
			int year=0;
			double averagePerYear1=0.0;
			double averagePerYear2=0.0;
			double averagePerYear3=0.0;
			double averagePerYear4=0.0;
			double totalAverage=0.0;
			double sum1=0.0;
			double sum2=0.0;
			double sum3=0.0;
			double sum4=0.0;


		}
		//Setmethod //receive what input the user in App file and store it to (=) in the 2D Arrays (variable) in Instantiable Class file LabTwoAverage.java (this.)
		public void setArray(double[][]array){
			this.array=array;
		}

		//Compute + Nested Loops with 2D Arrays
		public void compute(){

			for(int i=0;i<array.length;i++){ //outer loop will run 5 times
				for(int j=0;j<1;j++){ //inner loop run as many time as outer loop run
					sum1=(sum1+array[i][j]); //we make the sum of the 5 results in year 1
				}//close inner
			}//close outer

			for(int i=0;i<array.length;i++){
				for(int j=1;j<2;j++){
					sum2=(sum2+array[i][j]);//we make the sum of the 5 results in year 2
				}//close inner
			}//close outer

			for(int i=0;i<array.length;i++){
				for(int j=2;j<3;j++){
					sum3=(sum3+array[i][j]);//we make the sum of the 5 results in year 3
				}//close inner
			}//close outer

			for(int i=0;i<array.length;i++){
				for(int j=3;j<4;j++){
					sum4=(sum4+array[i][j]);//we make the sum of the 5 results in year 4
				}//close inner
			}//close outer

			averagePerYear1=sum1/5; //calculation of average result in year 1
			averagePerYear2=sum2/5; //calculation of average result in year 2
			averagePerYear3=sum3/5; //calculation of average result in year 3
			averagePerYear4=sum4/5; //calculation of average result in year 4


			totalAverage=(averagePerYear1+averagePerYear2+averagePerYear3+averagePerYear4);//calculation of the total average result
		}
		//Getmethod
		public double getAveragePerYear1(){
			return averagePerYear1; //return = send the information to the App file
		}
		public double getAveragePerYear2(){
			return averagePerYear2;
		}
		public double getAveragePerYear3(){
			return averagePerYear3;
		}
		public double getAveragePerYear4(){
			return averagePerYear4;
		}
		public double getTotalAverage(){
			return totalAverage;
		}
}//close method