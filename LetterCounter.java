/*
Software development - Lab Week 9 - Characters & Strings
Solution myMoodle

- Counts the letters - int letterCount;

- Counts vowels - int vowelCount;

- Every second letter - String secondLetter;

- Stores the positions of each space - int[] spacePositons;

- vowels are replaced by exclamation points - String vowelExclamationString;
*/
public class LetterCounter{
	//vars
	private String input;
	private int numLetters;
	//constructor
	public LetterCounter(){
		input="";
		numLetters=0;
	}
	//set
	public void setInput(String x){
		input=x;
	}
	//compute
	public void count(){
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)!='.' && input.charAt(i)!=' '){ //the solution lac of "if (Character.isLetter())" //!= means "is not equal"
				numLetters++; //count the number of letters (WARNING LACK OF if (Character.isLetter())
			}
		}
	}
	//get
	public int getNumLetters(){
		return numLetters;
	}
}