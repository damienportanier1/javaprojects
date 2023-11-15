/*
Week 9 Software Development
Lisa Murphy example
MobileNumber.java
21 11 2021

Create an app to check for a valid mobile number from a user (input). The mobile number is valid if its 10 numbers length (if statement) and its starts with either 083, 085 and 087 (if statement). Based on this, tell the user whether its valid or invalid (output). */

//method
public class MobileNumber{

	//variables
	private String number;//(input)store the number coming in from the user
	private String validity;//(output)store the message to send back to the user

	//charAt(i);//for check characters of the String

	//constructors (by default or modify)
	/*public MobileNumber{
		String number="";
		String validity="";
	}*/

	//set //receive info from App file //store the user answer into number (variable)
	public void setNumber(String number){
		this.number=number;
	}

	//compute
	public void compute(){

		//check if the String number a length of 10
		if (number.length() == 10){

			//if the String number has a char at position 0 equal to 0 &&(and) had a char at position 1 (2nd char) equal to 8
			if(number.charAt(0)=='0'&&number.charAt(1)=='8'){

				//if the String number has a char at position 2 (3rd letter) equals to 3, 5 or 7.
				if (number.charAt(2)=='3' || number.charAt(2)=='8' || number.charAt(2)=='7'){
					validity="Valid Mobile Number";
				}
				else{//grab everything outside of the above
					validity="Invalid Mobile Number";
				}
			}

		}//close outer if
	}
	//get //send info to the App file
	public String getValidity(){
		return validity;
	}

}//close class signature

/*
Shorter compute
  if((number.length()==10)&&((number.charAt(0)=='0')&&(number.charAt(1)=='8'))&&(number.charAt(2)=='3'||number.charAt(2)=='5'||number.charAt(2)=='7')){
            validity="Valid Mobile Number";
        }
        else{
            validity="Invalid Mobile Number";
        }
*/