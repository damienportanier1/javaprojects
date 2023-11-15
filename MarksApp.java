/*
Software Development
Lab Week 7 - Question 1
Marks.java
MarksApp.java
Damien Portanier
05 11 2022

Question 1. Create an application that asks a user to enter how many subjects they have. The application should then ask the user to enter the results for each subject. Store these results in an array and print them back to the user along with their overall average and grade for each module.
*/

import java.util.Scanner; //java utility package - allowing for user input
public class MarksApp{ //method
	public static void main(String[] args){

	//variables
	int subject=0;//initialize 0 by default to the variable sum
	int sum=0;
	double average;
	String grade;
	String msg;
	String text;

	//object
 	Scanner keyboard=new Scanner(System.in);//keyboard is the name we give
	Marks object=new Marks (); //permit to create (new) copyObject (named objet) of instantiable class file (Marks) and link it (=) with the instantiable class file (Marks)

	//input
		//ask a question - store the user answer into the variable (subject)
	System.out.println("How many subjects did you take?");
	subject=keyboard.nextInt();

	//set up number of boxes in the array which depend of the number of subject the user input
	int[] array=new int[subject];

	//ask to enter as many times as the number of subjects (user previous response)
	for(int i=0; i<array.length; i++) {
		System.out.print("Please enter the marks (0-100) of the subject "+(i+1)+": ");

			//link the input (marks) of the user into the array
			array[i]=keyboard.nextInt();
			//process for calculate the sum of all marks
			sum=sum+array[i];

			//here short way could be (no use of the array): sum = (keyboard.nextInt()+sum);
	}
	//set
		//send the answers to the instantiable class file Marks.java
		//subject and sum are variables that depend of the user's answers
		//same setName than in Instantiable file
		//object is the name of the copyObject
	object.setArray(array);
	object.setSum(sum);

	//compute
		//name compute must be the same than in instantiable class file Marks.java
	object.compute();

	//get
		//grab info (msg) from the instantiable class file Marks/java
		//name getMsg must be the same than in instantiable class file Marks.java
		//msg represent what we want to know/output
	msg=object.getMsg();

	//output
    System.out.println(msg);
	}

}

