/*
Week 10
LetterSwapApp.java
Lisa Murphy
28 11 2022
*/

import java.util.Scanner;
public class LetterSwapApp{
	public static void main (String []args){

	//vars
	String word,newWord;

	//Scanner + Object
	Scanner scanner=new Scanner(System.in);
	LetterSwap object=new LetterSwap();

	//input
	System.out.println("Please enter a word");
		word=scanner.nextLine();

	//set
	object.setWord(word); //same set name than in instantiable class file

	//process
	object.compute();

	//get
	newWord=object.getNewWord();

	//output
	System.out.println("Your new word is "+newWord);

	}
}