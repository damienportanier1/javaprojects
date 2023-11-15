/*CarApp.java
Damien Portanier
24 10 2022*/ //always put it, it cost points

import java.util.Scanner; //utility package - allowing for user input
public class CarApp{
	public static void main(String[] args){

	//variables - je copie colle ce que j'ai dans les variables de instantiableclass.java en enlevant les private

	String service;//input
	String location;//input
	String day;//output

	//object
	Scanner keyboard; //keyboard=nameCopyObjectScanner, we can put anything else //Scanner is a class from java utility package and this allows for user input //
 	keyboard=new Scanner(System.in); //nameCopyObjectScanner link (=), we created (new) a copy base on Scanner(System.in) which allows user input
	Car c; //ex myRestaurant is name of the copyobject
	c=new Car (); //permit to create (new) copyObject (myRestaurant) and link it with the mould (Restaurant = Instantiable class)

	//input
	System.out.println("Services you need? Options are Full, Interim or Pre-Nct.");//ask the question
		service=keyboard.nextLine();//store the user answer to the variable (nameVariableInstantiable) //datatype of what user input//= means link/store what user input to nameVariableInstantiable //ATTENTION IN SCANNER UTILITY PACKAGE a String = Line so for a word “nextLine”

	System.out.println("In which location ? Options are Blanchardstown or Stillorgan.");//ask the question
		location=keyboard.nextLine();

//prof plan for win points //ask the question //store the answer //send the answer to the instantiable class

	//set
	c.setLocation(location);
	c.setService(service);//send the answer to the instantiable class//paymentAmount is variable of what input the user //same setName than in Instantiable file //myRestaurant is the nameCopyObject

	//Compute-process
	c.compute();//if only one compute we can leave just compute as name //same computeName than in Instantiable file //myRestaurant is the nameCopyObject

	//Get
	day=c.getDay(); //same getName than in instantiablefile //myRestaurant is the nameCopyObject //totalCost ce qu’on veut savoir

	//output// grab info (totalCost) from my instantiable class and send to myRestaurant (copyObject)
    System.out.println("Please bring your car on the "+day);//we need to grab (the totalCost back in) the answer first

	}
}
