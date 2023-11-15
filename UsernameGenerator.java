/*
Software Development - TABA 2023 (Semester 1 2022-2023)

Damien Portanier
Student n°22152431

Question 1 a. Table 1 - Username Rules ID: UR1

A company has hired you to develop an application to generate usernames for their
employees’ accounts. The application prompts the user to provide one single line of text with an
employee’s full name in the following format forename surname at a time. (Please note that you
are not required to validate the input, we assume that the input is well formed.) Next, the
application uses the given full name to generate/create the corresponding username. The username
is created using several rules.

Develop an instantiable class, named UsernameGenerator, for this application which
contains:
• A class definition
• Suitable data members (instance variables)
• A constructor
• A setter method to set the given full name
• A compute method to generate/create the username according to the rules assigned to
you in Table 1.
• A getter method to return the generated username

Given a full name with the following format forename surname
Note: Any letter can be in either upper case or lower case in the provided full name.

The username is generated from the given full name as follows:
a) The username starts with the last letter of the forename followed by the last letter of the
surname, written using the same letter case as in the given full name.

Then the rest of the username is generated from the given full name as follows:
b) Each upper case vowel is added twice to the username
c) The space is eliminated
d) Apart from the above-mentioned letters and characters, all the other letters should be
copied unchanged to the username from the given full name
e) The username ends with the total number of upper case vowels contained in the generated
username (here should be included the number of all the upper case vowels added due to
the above-mentioned rules i.e. rules a) and b) )

UsernameGenerator.java
07/01/2023
*/

public class UsernameGenerator {//java class called UsernameGenerator
	//variables
	private String fullName;
	private String username;
	private StringBuffer str = new StringBuffer();
	private int numUppercaseVowels; //number of upper case vowels

	//constructor permit to initialize variables by default
	public UsernameGenerator() {
		String fullName = "";
		String username = "";
		StringBuffer str = new StringBuffer();
		int numUppercaseVowels = 0;
	}

	//setter method : receive information from the application class UsernameGeneratorApp.java (String (datatype) fullName (variable) contain the information that the user have input in the application class) and store this information into the variable fullName present in the instantiable class UsernameGenerator.java
	public void setFullName(String fullName) {//important to have the same setName in the instantiable class (UsernameGeneratorApp.java) and the application class (UsernameGeneratorApp.java) to transmit the information
		this.fullName = fullName; //store the information (Sring fullName) received into the variable fullName
	}

	//compute method to generate username according to the rule edicted Table 1 - Username Rules ID: UR1
	public void computeUsername(){//important to have the same computeName in the instantiable class (UsernameGeneratorApp.java) and the application class (UsernameGeneratorApp.java)

		//initialize variables //permit to initialize each time the compute run and avoid to the store each input into username
		StringBuffer str = new StringBuffer(); //a String is not modifiable but a StringBuffer is modifiable. For generate an username based on an user input String, i create the StringBuffer named str to make easier the generation of the username required.
		int numUppercaseVowels = 0;//this variable will permit me to count the number of upper case vowels

		//for loop method through the full name (user input) and add the character just before the space (which is represent the forname last letter) to the StringBuffer str (representing the username that we want to generate)
		for (int i=0; i < fullName.length(); i++) {
			if (fullName.charAt(i) == ' ') { //charAt method() to spot the position of the space (permit to check with the for loop method each character of the full name (user input)
				char forenameLastLetter = fullName.charAt(i-1);//store the character just before the space spotted (fullName.charAt(i-1)) into the char variable name forenameLastLetter
					str.append(forenameLastLetter); //append method() to add the forename last letter at the first position of the StringBuffer str
			}
		}//close first for loop

		//take the last character of the full name (= surname last letter) and add it to StringBuffer str (which represent the username that we want to generate)
		char surnameLastLetter = fullName.charAt(fullName.length() - 1);
			str.append(surnameLastLetter);

		//2nd for loop through the full name and add each upper case vowel twice to the username (StringBuffer str)
		for (int j = 0; j < fullName.length(); j++) {
			char ch = fullName.charAt(j);
			//if the character is an upper case vowel, add it twice to the username
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				if (Character.isUpperCase(ch)) { //isUpperCase() permit to spot upper case
					str.append(ch);
					str.append(ch); //allows the addition of the same upper case vowel
				}
			}

			//if the character is not a space, add it to the username (StringBuffer str)
			else if (ch != ' ') {
				str.append(ch); //append method() permit to add character in the correct format (Upper/Lower Case)
			}

        }//close second for loop

		//3rd for loop through the username generated and count the number of upper case vowels with the counter variable numUppercaseVowels++
        for (int k = 0; k < str.length(); k++) {
        	char c = str.charAt(k);
     	      	if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
					if (Character.isUpperCase(c)) {
						numUppercaseVowels++;
			        }
            	}
		}//close third for loop

        //append method() permit to add the number of upper case vowels to username/StringBuffer str (this method is place in the end of the instantiable class to add numUppercaseVowels at the last position of the username/StringBuffer str)
        str.append(numUppercaseVowels);

        //we have finish to generate the username needed - we convert the StringBuffer str to the String username for prepare the future output (to display the username properly on the screen)
        username = str.toString();

    }//close compute method

    //getter method : send the information (String username) to the application class (UsernameGeneratorApp.java)
   	public String getUsername() {//important to have the same getName in the instantiable class (UsernameGeneratorApp.java) and the application class (UsernameGeneratorApp.java) to transmit the information
        return username;
	}
}//close java class UsernameGenerator
