/*
Software dévelopment - Lab Week 9 - Characters & Strings
Solution myMoodle

- Counts the letters - int letterCount;

- Counts vowels - int vowelCount;

- Every second letter - String secondLetter;

- Stores the positions of each space - int[] spacePositons;

- vowels are replaced by exclamation points - String vowelExclamationString;
*/
import javax.swing.JOptionPane;
public class StringManipulatorApp{
	public static void main(String[] args){

		//declare vars
		String initialString;
		int letterCount;
		int vowelCount;
		String secondLetter;
		int[] spacePositions;
		String vowelExclamationString;
		String msg="Enter a sentence";

		//declare objects
		LetterCounter lc;
		lc=new LetterCounter();
		VowelCounter vc;
		vc=new VowelCounter();
		SecondLetterGenerator slg;
		slg=new SecondLetterGenerator();
		SpacePosition sp;
		sp=new SpacePosition();
		ReplaceVowels rp;
		rp=new ReplaceVowels();

		//input
		initialString=JOptionPane.showInputDialog(null,"Enter a sentence");

		//set //send the info to the different Instantiable Class file
		lc.setInput(initialString);
		vc.setInput(initialString);
		slg.setInput(initialString);
		sp.setInput(initialString);
		rp.setInput(initialString);

		//compute
		lc.count();
		vc.count();
		slg.generateNewString();
		sp.findPositions();
		rp.replaceVowels();

		//get //receive info from different Instantiable Class file
		letterCount=lc.getNumLetters();
		vowelCount=vc.getNumVowels();
		secondLetter=slg.getOutput();
		spacePositions=sp.getPositions(); // ARRAY from "SpacePositionArray"; as you see no need of [ ] ; store the array directly into a variable of the App file
		vowelExclamationString=rp.getOutput();

		//output
		System.out.println("Your sentence: "+initialString);
		System.out.println("Your sentence has "+letterCount+" letters");
		System.out.println("Your sentence has "+vowelCount+" vowels");
		System.out.println("Your sentence with only every second letter is "+secondLetter);

		System.out.print("Your spaces are in positions: ");
		for(int i=0;i<spacePositions.length;i++){
			if(spacePositions[i]!=0){ // != means "not equal to"
				System.out.print(spacePositions[i]+", "); //"print" permit to output the position of space on one line only
			}
		}
		System.out.println();
		System.out.println("your sentence with replace vowels is: "+vowelExclamationString);
	}
}