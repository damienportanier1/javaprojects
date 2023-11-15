/*
Software development - Lab Week 9 - Characters & Strings
Solution myMoodle

- Counts the letters - int letterCount;

- Counts vowels - int vowelCount;

- Every second letter - String secondLetter;

- Stores the positions of each space - int[] spacePositons;

- vowels are replaced by exclamation points - String vowelExclamationString;
*/
public class SecondLetterGenerator{
	//vars
	private String input;
	private StringBuffer strBuff;
	private String output;
	//constructor
	public SecondLetterGenerator(){
		strBuff=new StringBuffer(); //initialise StringBuffer
		input="";
		output="";
	}
	//set
	public void setInput(String x){
		input=x;
	}
	//compute
	public void generateNewString(){
		for(int i=1;i<input.length();i=i+2){ //i=i+2 for have only the second char (but this solution lack of "if char is a letter then" because we need "SecondLetter"
			strBuff.append(input.charAt(i));
		}
		output=strBuff.toString();  //for output is necessary to convert the String buffer into a String
	}
	//get
	public String getOutput(){
		return output;
	}
}