/*
Lab Week 9 Software Development

Damien Portanier

19 11 2022

Create an app (using instan class and only the Scanner class for input) that takes in a String from a user and does the following:

Assume the String can only take letters spaces and full stops

·         Counts the letters

·         Counts vowels

·         Stores a new String that only contains every second letter

·         Stores the positions of each space

·         Outputs a new String with all vowels are replaced/printed as exclamation points

Please note: Create only 1 app class, but either create multiple instantiable classes, or multiple computes to deal with each bullet point
*/
//method
import java.util.Scanner; //utility package - allowing for user input
public class CountLettersVowelsApp{
	public static void main(String[] args){

		//vars
		String sentence;
		int count;
		int letter;

		//Scanner + Object
		Scanner scanner=new Scanner (System.in);
		CountLettersVowels object=new CountLettersVowels();

		//input //ask to input //user answer are store into sentence (variable)
		System.out.println("Enter a sentence :");
			sentence=scanner.nextLine();

		//set //send what user input to the instantiable class file
		object.setSentence(sentence); //same setName than in instantiable class file

		//compute
		object.compute();//same computeName than in instantiable class file

		//get //get info from instantiable class file
		letter=object.getLetter(); //same getName than in instantiable class file
		count=object.getCount();

		//output
		System.out.println("Number of letters in the given sentence is "+letter);
		System.out.println("Number of vowels in the given sentence is "+count);
	}
}
