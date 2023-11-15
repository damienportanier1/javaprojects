/*
Lab Week 8 Software Development
Lab 2 Write a program that allows a user to enter 5 results for each year of a 4 year course. The app should: Give an average for each year and give a total average
Damien Portanier
11 11 2022
*/

import java.util.Scanner; //java utility package - allowing for user input
public class LabTwoAverageApp{ //method
	public static void main(String[] args){

	//variables + initialise number of boxes
	int result=5; //5 rows
	int year=4; //4 columns
	double[][]array=new double [result][year]; //2D Arrays - row then column
	double averagePerYear1;
	double averagePerYear2;
	double averagePerYear3;
	double averagePerYear4;
	double sum1=0.0;
	double sum2=0.0;
	double sum3=0.0;
	double sum4=0.0;
	double totalAverage;

	//scanner + object
	Scanner scanner = new Scanner(System.in);  //scanner=nameCopyObjectScanner, we can put anything else
	LabTwoAverage object = new LabTwoAverage(); //object is the name of the object we create, base on the instantiable class file LabTwoAverage.java

	//input//ask to the user to input something
	for(int i=0;i<result;i++){ //outer loop will run 5 times because 5 rows
		for(int j=0;j<year;j++){
			System.out.println("Enter the result #"+(i+1)+" for year #"+(j+1)+".");
				array[i][j]=scanner.nextDouble(); //store the user answer into the 2D Arrays
		}//close inner
	}//close outer

	//set//send info to the instantiable class file
	object.setArray(array); //same setName than in Instantiable Class

	//compute
	object.compute(); //same computeName than in Instantiable Class

	//get//grab info from the instantiable class file
	averagePerYear1=object.getAveragePerYear1(); //same getName than in Instantiable Class
	averagePerYear2=object.getAveragePerYear2();
	averagePerYear3=object.getAveragePerYear3();
	averagePerYear4=object.getAveragePerYear4();
	totalAverage=object.getTotalAverage();

	//output
	System.out.println("Your average result for year 1 is "+averagePerYear1+".");
	System.out.println("Your average result per year 2 is "+averagePerYear2+".");
	System.out.println("Your average result per year 3 is "+averagePerYear3+".");
	System.out.println("Your average result per year 4 is "+averagePerYear4+".");
	System.out.println("Your total average is "+totalAverage+".");


	}
}//close method


