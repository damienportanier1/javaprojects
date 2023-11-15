/*
Software development - Lab Week 9 - Characters & Strings
Solution myMoodle

- Counts the letters - int letterCount;

- Counts vowels - int vowelCount;

- Every second letter - String secondLetter;

- Stores the positions of each space - int[] spacePositons;

- vowels are replaced by exclamation points - String vowelExclamationString;
*/
public class VowelCounter{
	//vars
	private String input;
	private int numVowels;
	//constructor
	public VowelCounter(){ //do not forget the "( ) {"
		input="";
		numVowels=0;
	}
	//set
	public void setInput(String x){
		input=x;
	}
	//compute
	public void count(){
		for(int i=0;i<input.length();i++){ //WARNING LACK OF if (Character.isLetter())
			if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'
			 || input.charAt(i)=='A' || input.charAt(i)=='E'  || input.charAt(i)=='I'  || input.charAt(i)=='O'  || input.charAt(i)=='U'){
				numVowels++; //permit to count the number of vowels // || = AltGr+6 on the french keyboard
			}
		}
	}
	//get
	public int getNumVowels(){
		return numVowels;
	}
}