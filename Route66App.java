/*
Software Development - Week 3
Teacher Lisa Murphy send us this stuff
October 2022
*/

import java.lang.Math.*;//??
import java.util.*;//Scanner method
public class Route66App{//no instantiable class file created yet
	public static void main(String[] args){

		double speed;
		int members;
		double time;
		final int distance;
		double fullBlocks;
		double teamBlocks;
		double hoursLeftovers;
	//scanner + objet
	Scanner keyboard;
	Route66 myRoute66;

	keyboard = new Scanner (System.in);
	myRoute66 = new Route66();

	//input (ask input, store user answer into a variable)
	System.out.println("Please enter your speed");
	speed = keyboard.nextDouble();
	//set (send the info to the instantiable class file)
	myRoute66.setSpeed(speed);

	//input 2
	System.out.println("Please enter how many team members there are");
	members = keyboard.nextInt();
	//set 2
	myRoute66.setMembers(members);

	//compute
	myRoute66.compute();

	//get (receive info from the instantiable class file) + output
	time = Math.round(myRoute66.getTime());
	System.out.println("Your time for the race is "+time);

	//get + output 2
	fullBlocks = Math.round(myRoute66.getFullBlocks());
	System.out.println("The total number of block is "+fullBlocks);

	//get + output 3
	teamBlocks = Math.round(myRoute66.getTeamBlocks());
	System.out.println("The number of block per team is "+teamBlocks);

	//get + output4
	hoursLeftovers = Math.round(myRoute66.getHoursLeftovers());
	System.out.println("The number of hours leftover is "+hoursLeftovers);
	}
}