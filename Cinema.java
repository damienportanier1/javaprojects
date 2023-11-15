/*
Lab 1 Week 4
Damien Portanier
17 10 2022
*/
//InstantiableClassFile
public class Cinema{
	//Variables
	private int userAge;
	private int numberOfCinemaTickets;
	private double price;
	//Constructor (by default)
	public Cinema(){
		userAge=0;
		numberOfCinemaTickets=0;
		price=0.0;}

	//Setmethod
	public void setUserAge(int userAge){ // setNameVariableInstantiable is a name we give at set //receive what input the user in App file
		this.userAge=userAge;} ////RightToLeft - link what userInput () in Appfile to (=) the Variable () in Instantiablefile (this.)
	public void setNumberOfCinemaTickets(int numberOfCinemaTickets){ // setNameVariableInstantiable is a name we give at set //receive what input the user in App file
		this.numberOfCinemaTickets=numberOfCinemaTickets;}

	//Compute/process/calcul

	public void computePrice(){
		if (userAge>=18){
			price=numberOfCinemaTickets*15;
		}
		else if (userAge<18){
			price=numberOfCinemaTickets*10;
		}
	}
	//Getmethod
	public double getPrice (){//getNameVariableInstantiable is a name we give at get
		return price;//return = send the information to the App file
	}
}
