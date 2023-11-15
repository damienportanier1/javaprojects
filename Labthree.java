/*
Lab 3 Week 4
Damien Portanier
17 10 2022
*/
//InstantiableClassFile
public class Labthree{
	//Variables
	private double number;
	private String msg;

	//Constructor (by default)
	public Labthree(){
		number=0;
		msg=" ";
	}
	//Setmethod
	public void setNumber(double number){ // setNameVariableInstantiable is a name we give at set //receive what input the user in App file
		this.number=number;} ////RightToLeft - link what userInput () in Appfile to (=) the Variable () in Instantiablefile (this.)

	//Compute/process/calcul

	public void computeMsg(){
		if (number%2==0){
			msg="The number is odd";
		}
		else {
			msg="The number is even";
		}
	}
	//Getmethod
	public String getMsg (){//getNameVariableInstantiable is a name we give at get
		return msg; //return = send the information to the App file
	}
}
