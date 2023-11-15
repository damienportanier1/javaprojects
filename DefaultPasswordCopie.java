/*
Soft Dev - Week 11
Lisa Murphy
Check record around 1h30min

Exo of TABA - EXAM

4 variables
var text (input)
var number (input)
var password (output)
var StringBuffer (altered the String word)
*/

//process
public void generatePassword(){
	int len.text.length(); //String text is input by user
	int position=1;

	//3,4,5
	for (int i=0;i<len;i++){
		char c=text.charAt(i);
		if(position%n!=0){ //n represent number //!= if the position is not equal

			if(c==' ')[//if space
				sb.append('!'); //put !
			}
			else if (c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'){//if vowels
				sb.append('R');//put a R
				sb.append(c);//then print c ??
			}
			else{
			}

		}//close first if

		position=position+1;

	}//close for loop

	password.sb.toString(); //think about ()

	//get method

	//App - ask user input their name = forename and surname
	//ask user input a number between 3 and 5

}//close public void

//2 ùarks for the right correct password being displayed
//4 marks for valdating n - while loop to check
//do{
//	enter a number between 3 and 5
//	number = input

//	}while number < 3 || number > 5);
//14 marks for the remaining implementation of the app class

/*
Q1: C
Marks

check the file of the teacher
*/
