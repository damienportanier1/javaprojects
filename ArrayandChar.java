/*
Create an app (using instan class and only the Scanner class for input) that takes in a String from a user and does the following:

Assume the String can only take letters spaces and full stops

�         Counts the letters

�         Counts vowels

�         Stores a new String that only contains every second letter

�         Stores the positions of each space

�         Outputs a new String with all vowels are replaced/printed as exclamation points

Please note: Create only 1 app class, but either create multiple instantiable classes, or multiple computes to deal with each bullet point

Cr�ez une application (en utilisant la classe instan et seulement la classe Scanner pour l'entr�e) qui prend une cha�ne de caract�res d'un utilisateur et fait ce qui suit :

Supposons que la cha�ne ne peut contenir que des lettres, des espaces et des points.

- Compte les lettres

- Compte les voyelles

- Stocke une nouvelle cha�ne de caract�res qui ne contient qu'une lettre sur deux

- Stocke les positions de chaque espace

- Produit une nouvelle cha�ne de caract�res dans laquelle toutes les voyelles sont remplac�es/imprim�es par des points d'exclamation.

Remarque : ne cr�ez qu'une seule classe d'application, mais cr�ez plusieurs classes instanciables ou plusieurs calculs pour traiter chaque point.

*/

import java.util.Scanner;
public class ArrayandChar{
	public static void main(String[] args){

	//scanner
	Scanner scanner = new Scanner(System.in);

	//input //ask to the user to input + store the answer in to sentence (String variable)
	System.out.println("Enter a string: ");

	//vars
	String sentence = scanner.nextLine();

	//convert the String sentence into a sequence of characters and store it into an array (letters)
	char[] letters = sentence.toCharArray();

	//variables
	int countLetters=0; //numbers of letters
	int count= 0; //number of vowels

	//compute / ForLoop & IfStatement & CountMethod
	for(int i = 0; i< sentence.length(); i++) {
		if(Character.isLetter(letters[i])) {
			countLetters++;
			if(letters[i] == 'a' || letters[i] == 'e' || letters[i] == 'i' || letters[i] == 'o' || letters[i] == 'u') {
				count++;
			}
	}
}
	//output
	System.out.println("Number of letters:" + countLetters);
	System.out.println("Number of vowels:" + count);

	}
}