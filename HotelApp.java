/*
Lab 2 Week 5
Damien Portanier
23 10 2022

Develop an application that allows the user to book a hotel room. The user should be asked for their name, the required number of nights, and their age. The application should assume that each room costs 90 euro per night and then calculate and output the total cost to confirm the booking. Please note: a booking can only be confirmed if the user is at least 18.
*/

import java.util.Scanner; //utility package - allowing for user input
public class HotelApp{
	public static void main(String[] args){

	//variables
	int age;
	int night;
	String name;
	double cost;
	double costPerNight;
	String msg;


	//object
	Scanner keyboard;
 	keyboard=new Scanner(System.in);
	Hotel hotelApp; //hotelApp is the name of the copyObject
	hotelApp=new Hotel(); //permit to create (new) copyObject (hotelApp) and link it with the instantiable class file (Hotel)

	//input
	System.out.println("Please enter your name here:");
	name=keyboard.nextLine();//IN SCANNER UTILITY PACKAGE a String = Line so for a word “nextLine

	System.out.println("Please enter the number of nights you wish to book:");
	night=keyboard.nextInt();

	System.out.println("Please enter your age: ");
	age=keyboard.nextInt();//store the user answer to the variable (age) //datatype (int) of what user input//= means link/store what user input to the variable age

	//set
	hotelApp.setAge(age);//age is variable of what input the user //setAge must be the set name of Instantiable Class file (Blood.java) //hotelApp is the nameCopyObject
	hotelApp.setNight(night);
	hotelApp.setName(name);

	//Compute-process
	hotelApp.computeAge();//computeAge must be the compute name of Instantiable Class file (Blood.java)

	//Get
	msg=hotelApp.getMsg(); //getMsg must be the get name of Instantiable Class file (Blood.java)

	//output //grab info (msg) from my instantiable class (Blood.java) and output it
    System.out.println(msg);
	}
}
