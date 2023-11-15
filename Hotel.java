/*
Lab 2 Week 5
Damien Portanier
23 10 2022

Develop an application that allows the user to book a hotel room. The user should be asked for their name, the required number of nights, and their age. The application should assume that each room costs 90 euro per night and then calculate and output the total cost to confirm the booking. Please note: a booking can only be confirmed if the user is at least 18.
*/

public class Hotel{
	//Variables
	private int age;
	private int night;
	private String name;
	private double cost;
	private double costPerNight;
	private String msg;

	//Constructor (by default ou modif)
	public Hotel(){//permit to Input by default if no input
	age=0;
	night=0;
	name="";
	costPerNight=90.0;
	cost=costPerNight*night;
	msg="";
	}

	//Setmethod
	public void setAge(int age){ //receive what the user input in App file
	this.age=age;} //RightToLeft - link what user input ("his age") in Appfile (HotelApp) to (=) the Variable (age) in Instantiablefile Hotel.java (this.)

 	public void setNight(int night){
	this.night=night;}

	public void setName(String name){
	this.name=name;}

	//Compute
	public void computeAge(){
		cost=costPerNight*night;
		if (age<18){
			msg=name+", please note that a reservation can only be confirmed if the person booking is at least 18 years old.";}
		else {
			msg="Thank you "+name+", your booking is confirmed. The total cost of your reservation is "+cost+" euros.";}
	}
	//Getmethod
	public String getMsg(){
	return msg;} //return = send the information to the App file //msg is the variable we want to output
}