/*
Lisa Murphy
05 12 2022

Piglatin is a secret language used by children whereby the first letter of
a word is moved to the end of the word and the letters "ay" is added to the end.
 Example: Lisa would be translated to "isalay". You have being asked to develop
 an application that accepts a word from the user and translates the word to
PigLatin and outputs the translated word. Call your files PigLatin.java and
 PigLatinApp.java.

1) move the 2nd 3rd 4th char into StringBuffer "isa"
2) move the first char into the StringBuffer "isal"
3) Add the "ay" to the end of the StringBuffer "isalay"

For EXAM TABA win max of points comment a lot
*/

//method
public class PigLatin{

	//vars
	private String word;//input
	private StringBuffer strBuff; //store the word to be altered
	private String newWord;//output

	//constructor
	public PigLatin (){ //think about ()
		word="";
		newWord="";
		strBuff=new StringBuffer();
	}

	//set method - received info from app file user input
	public void setWord(String word){
		this.word=word; //store the input user into the var word
	}

	//compute
	public void compute(){//think about ()
		//step 1 - Move the 2nd, 3rd and 4th character into the StringBuffer "isa"
		for (int i=1;i<word.length();i++){//think about ()
			//access an inividual char from the String word (inside the loop) and add those char to the strBuff
			strBuff.append(word.charAt(i));
		}//close for loop

		//step 2 - Move the first char into the StringBuffer "isal"
		strBuff.append(word.charAt(0));

		//step 3 - Add the "ay" to the end of the StringBuffer "isalay"
		strBuff.append("ay");

		//step 4 - Convert back to a String again
		newWord=strBuff.toString();

	}//close compute

	//get
	public String getNewWord(){
		return newWord;
	}
}