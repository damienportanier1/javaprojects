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
//method
public class Revision{
	//variables
	private String email;//input
	private char[]array;//declare and create an array
	private String newEmail;//output

	//constructor (by default)
	public Revision(){
		email="";
		array = new char[]{'.','c','o','m','e','d','u','o','r','g'};//initialise the array
		newEmail="";
	}
	//set //receive info from App file and store it into the variable email
	public void setEmail(String email){
		this.email=email;
	}
	//compute
	public void compute(){

		newEmail="Your email : "+email+" is invalid because it does not have an arobase. Please try again.";

		//for loop to traverse all the String email
		for(int i=0;i<email.length();i++){

			//check that there is an @ symbol in the email address
			if (email.charAt(i)=='@'){
				newEmail="Your email: "+email+" has an arobase but does not end in .com, .edu or .org, so it is not valid. Please try again.";

					//check that @ is follow with a dot before the 3 character extension (.com.edu.org)
					for (int j=i+1;j<email.length();j++){
						//check the dot
						if(email.charAt(j)==array[0]){
								//check that the domain extension is one of the 3 character Strings from the array
								if(email.charAt(j+1)==array[1]&&email.charAt(j+2)==array[2]&&email.charAt(j+3)==array[3]
								||
								email.charAt(j+1)==array[4]&&email.charAt(j+2)==array[5]&&email.charAt(j+3)==array[6]
								||
								email.charAt(j+1)==array[7]&&email.charAt(j+2)==array[8]&&email.charAt(j+3)==array[9]){
									newEmail="Your email: "+email+" is valid because it has an arobase, and a dot followed by com, edu or org.";
								}//close 3rd if statement
								else {
									newEmail="Your email: "+email+" is invalid because it does not end in .com, .edu or .org. Please try again.";
								}
						}//close 2nd if statement

					}//close 2nd for loop

			}//close 1st if statement

		}//close first for loop

	}//compute method close

	//get
	public String getNewEmail(){
		return newEmail; //return info to the App File
	}

}//close public class Revision

