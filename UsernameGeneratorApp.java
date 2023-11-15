/*
Software Development - TABA 2023 (Semester 1 2022-2023)

Damien Portanier
Student n°22152431

Question 1 b. Table 2 - Username Rules ID: MFNA1

A company has hired you to develop an application to generate usernames for their
employees’ accounts. The application prompts the user to provide one single line of text with an
employee’s full name in the following format forename surname at a time. (Please note that you
are not required to validate the input, we assume that the input is well formed.) Next, the
application uses the given full name to generate/create the corresponding username. The username
is created using several rules.

Develop an application that uses the instantiable class UsernameGenerator (the
instantiable class previously developed at Question 1. a.) to generate usernames.
The application should allow a user to enter multiple employees’ full names.
The application will display on the screen the generated usernames, based on the given full names.
Name the application class UsernameGeneratorApp.

Ask the user at the beginning of the application how many usernames they would like to generate, and ensure that the application enables the user to provide that amount of full names and for each full name generates the corresponding username.

UsernameGeneratorApp.java
07/01/2023
*/

import java.util.Scanner; //java utility package - allowing for user input
public class UsernameGeneratorApp { //java class called UsernameGeneratorApp
	public static void main(String[] args) {//main class

		//variables
		String fullName;
    	String username;
    	int numUsernames; //an interger variable that will store the number of usernames required

		//Create a Scanner object to read user input from the keyboard
		Scanner sc = new Scanner(System.in); //scanner named sc
		//Create a object of the UsernameGenerator class named app
		UsernameGenerator app = new UsernameGenerator();

		//Input : ask user how many usernames they want to generate for their employees - then store the user input to the variable numUsernames
		System.out.print("Please enter the number of usernames you want to generate for your employees' accounts : ");
			numUsernames = sc.nextInt(); //scanner method nextInt() to store the user input in the Int variable numUsernames

		sc.nextLine(); //discard newline //essential in Scanner System.in for input a String after input an Integer

		//for loop method - ask the user to enter the full name of an employee (forename surname), then it will send the full name entered to the instantiable class (set method fullName) which will generate with this full name, the corresponding username. The instantiable class will return this username to the application class (get method username). And the application class will output the username. And due to the for loop method this cycle will repeat as many times as the number of usernames previously required by the user.
		for (int i = 0; i < numUsernames; i++) {
		// ask user for full name (forename surname)
			System.out.print("Please enter the employee's full name #"+(i+1)+" in the following format 'forename surname': ");
				fullName = sc.nextLine(); //scanner nextLine() method to store the user input in the String variable fullName

			//setter method fullName: send info to the instantiable class UsernameGenerator.java - important to have the same setName in the instantiable class (UsernameGeneratorApp.java) and the application class (UsernameGeneratorApp.java)
			app.setFullName(fullName);

			//compute method - important to have the same computeName in the instantiable class (UsernameGeneratorApp.java) and the application class (UsernameGeneratorApp.java)
			app.computeUsername();

			//getter method username: get info from instantiable class UsernameGenerator.java - important to have the same getName in the instantiable class (UsernameGeneratorApp.java) and the application class (UsernameGeneratorApp.java)
			username = app.getUsername();

			//output username
			System.out.println("Employee's username #"+(i+1)+": " + username);

		}//close bracket of for loop
	}//close main class
}//close java class UsernameGeneratorApp
