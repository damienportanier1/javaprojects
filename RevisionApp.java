/*
Software Development
Lab Week 12

Revision.java
RevisionApp.java

Damien Portanier

05 12 2022

Create an application using the Scanner class that takes in from a user; a single email address. You should store an array of 3 character domain extensions (eg com, edu, org) and check to see if the email address matches any of these in the array. These should be taken in as parameters into a single method. This application only needs 2 methods; 1 that sets and computes and 1 that returns information.

The method should then do the following to validate the email address:
-Check that there is an @ symbol in the email address
-Check that there is a . before the 3 character extension
-Ensure that the domain extension is one of the 3 character Strings from the array
The method should return a String that states whether or not the email address is valid, and why.
*/

import java.util.Scanner; //java utility package - allowing for user input
public class RevisionApp{ //method
	public static void main(String[] args){

		//variables
		String email;//input
		char[]array;
		String newEmail;//output


		//Scanner + Objet
		Scanner system = new Scanner(System.in);
		Revision objet = new Revision();

		//input (ask user input and store user input into the variable email)
		System.out.println("Please enter your email address in lower case :");
		email = system.nextLine(); //Line because Scanner package is used; means String

		//set method (send the user input to the instantiable class file Revision.java)
		objet.setEmail(email); //same setName than in instantiable class file Revision.java

		//compute method (same computeName than in instantiable class file Revision.java)
		objet.compute();

		//get method (receive info from the instantiable class file Revision.java and store it, into the variable newEmail)
		newEmail=objet.getNewEmail(); //same getName than in instantiable class file Revision.java

		//output the variable newEmail
		System.out.println(newEmail);


	}//close main method
}//close public class RevisionApp method

