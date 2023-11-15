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
import java.util.Scanner; //java utility package - allowing for user input
public class PigLatinApp{ //method
	public static void main(String[] args){

	//vars
	String word;//input
	StringBuffer strBuff; //store the word to be altered
	String newWord;//output

	//Scanner + Objet
	Scanner system = new Scanner(System.in);
	PigLatin objet = new PigLatin();

	//input //ask for data
	System.out.println("Enter the word lisa");
	word=system.nextLine();

	//set method (send input to the instantiable class file)
	objet.setWord(word);

	//compute
	objet.compute(); //think about ()

	//get (receive info from instantiable class file)
	newWord=objet.getNewWord(); //think about ()

	//output
	System.out.println(newWord);

	}//close main method
}//close public class method
