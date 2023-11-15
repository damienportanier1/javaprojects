/*
Lab 1 Week 5
Damien Portanier
23 10 2022
*/

import java.util.Scanner; //utility package - allowing for user input
public class BloodApp{
	public static void main(String[] args){

	//variables
	int age;
	String blood;
	String msg;


	//object
	Scanner keyboard; //keyboard=nameCopyObjectScanner, we can put anything else //Scanner is a class from java utility package and this allows for user input //
 	keyboard=new Scanner(System.in); //nameCopyObjectScanner link (=), we created (new) a copy base on Scanner(System.in) which allows user input
	Blood bloodApp; //bloodApp is the name of the copyObject
	bloodApp=new Blood(); //permit to create (new) copyObject (bloodApp) and link it with the instantiable class (Blood)

	//input
	System.out.println("Please put your blood group: ");
	blood=keyboard.nextLine();//IN SCANNER UTILITY PACKAGE a String = Line so for a word “nextLine

	System.out.println("Please enter your age:");
	age=keyboard.nextInt();//store the user answer to the variable (age) //datatype (int) of what user input//= means link/store what user input to the variable age

	//set
	bloodApp.setAge(age);//age is variable of what input the user //setAge must be the set name of Instantiable Class file (Blood.java) //bloodApp is the nameCopyObject
	bloodApp.setBlood(blood);

	//Compute-process
	bloodApp.computeAge();//computeAge must be the compute name of Instantiable Class file (Blood.java)

	//Get
	msg=bloodApp.getMsg(); //getMsg must be the get name of Instantiable Class file (Blood.java)

	//output //grab info (msg) from my instantiable class (Blood.java) and output it
    System.out.println(msg);
	}
}
