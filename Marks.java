/*
Software Development
Lab Week 7 - Question 1
Marks.java
MarksApp.java
Damien Portanier
05 11 2022

Question 1. Create an application that asks a user to enter how many subjects they have. The application should then ask the user to enter the results for each subject. Store these results in an array and print them back to the user along with their overall average and grade for each module.
*/

//method
public class Marks{
	//Variables
	private int subject;
	private int sum;
	private double average;
	private String grade;
	private String msg;
	private int[] array;

	//Constructor (by default ou modif)
	public Marks(){ //permit to input by default if no input
		int subject=0;
		int sum;
		double average=0.0;
		String grade="";
		String msg="";
	}
	//Setmethod //receive info from App file (what input the user in App file)//link what user input in Appfile (MarksApp.java) to (=) the Variable (sum, array) in Instantiablefile Marks.java (this.)

	public void setSum(int sum){
	this.sum=sum;
	}
	public void setArray(int[]array){
		this.array=array;
	}

	//Compute - For Loop - If/else statement
	public void compute(){

		average=sum/array.length;

		for(int i=0;i<=100;i++){
			if(average<20){
				grade="F";
			}
			else if(average<40){
				grade="D";
			}
			else if(average<60){
				grade="C";
			}
			else if(average<80){
				grade="B";
			}
			else{
				grade="A";
			}
		}
		msg="Your average result is "+average+" / 100 and your grade is "+grade+".";

	}
	//Getmethod
	public String getMsg(){
	return msg; //return = send the information to the App file (MarksApp.java)//msg is the variable we want to output in app file
	}
}
