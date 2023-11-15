/*
Week 9 Software Development
Lisa Murphy example
MobileNumberApp.java
21 11 2021

Create an app to check for a valid mobile number from a user. The mobile number is valid if its 10 numbers length and its starts with either 083, 085 and 087. Based on this, tell the user whether its valid or invalid. */

//method
import java.util.Scanner; //utility package - allowing for user input
public class MobileNumberApp{
	public static void main(String[] args){

	//variables
	String number;//(input)store the number coming in from the user
	String validity; //(output)store the message to send back to the user

	//Scanner + object named myMobileNumber which is based on Instantiable Class MobileNumber file
	Scanner keyboard = new Scanner (System.in);
	MobileNumber myMobileNumber = new MobileNumber();

	//input //ask question //store the user answer into number (variable)
	System.out.println("Please enter your mobile number:");
		number=keyboard.nextLine();

	//set
	myMobileNumber.setNumber(number);//same setName than in Instantiable Class file

	//compute
	myMobileNumber.compute();

	//get //get info from instantiable class file and store into String validity (variable)
	validity=myMobileNumber.getValidity();

	//output
	System.out.println(validity);


	}
}

