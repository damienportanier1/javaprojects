
//4 variables - one for the text(input), one for the number(input), one for the password(output), one for the StringBuffer(word to be altered)


//process
public void generatePassword(){
	int len=text.length();
	int position=1;
	//3, 4, 5
	for(int i=0;i<len;i++){
		char c=text.charAt(i);
		if(position%n!=0){
			//space
			if(c==''){
				//replace with an ! mark
				sb.append('!');
			}
			else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				sb.append('R');
				sb.append(c);
			}
			else{
				sb.append(c);
			}
		}
		position=position+1;
	}
	password.sb.toString();
}

//getter to send back the password

//App - ask the user for their name i.e. forename and surname
//ask the user to enter a number from 3-5 inclusive
•	//2 marks for the right correct password being displayed
•	//4 marks for validating n - while loop to check
//do{
			//System.out.println("enter a number between 3 and 5");
			//number = input.nextInt();
		//}while(number < 3 || number >5);

•	//14 marks for the remaining implementation of the app class









}