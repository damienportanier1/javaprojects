/*
Week 9 Software Development
21 11 2022
Reverse.java
Lisa Murphy

Taking in a word from the user and putting it in reverse order
*/

import java.util.Scanner;
public class Reverse{
	public static void main (String[]args){

		//variables
		String word;
		int length; //variable for store the length of the word

		//Scanner
		Scanner keyboard=new Scanner (System.in);

		//input + output
		System.out.println("Please enter a word");
			word = keyboard.nextLine();

		//loop to start at the end and work backwards
		for(int i=word.length()-1;i>=0;i--){//(int i=word.length()-1) permit to start the loop at the last character until (i>=0) the first character (go backwards) = begin at the end until the first character
			System.out.print(word.charAt(i));//print each char in the String word with the loop
			}

	}
}
