/*
Lab Week 8 Software Development
Lab 2 Write a program to print a grid.
Damien Portanier
11 11 2022
*/

//method
public class LabOneGrid{
	public static void main (String []args){

		//Variables
		//declare (named result), create array, initialise row then column (left to right)
		int row=10;//10 rows
		int column=1;//1 column
		String[][]result; //2D Arrays
		result=new String[row][column];//2D Arrays with 10 rows and 1 column

		//Nested Loops + Process + Output
		for(int i=0;i<row;i++){ //outer loop will run 10 times because 10 rows
			for(int j=0;j<column;j++){ //inner loop will run 1 time because 1 column
				result[i][j]="- - - - - - - - - -";
					System.out.println(result[i][j]);
					System.out.println();
			}//close inner
		}//close outer
	}
}//close method
