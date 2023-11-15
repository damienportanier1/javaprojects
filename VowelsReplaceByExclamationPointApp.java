
/*Lab Week 9 - Software Development

Damien Portanier

19 11 2022

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

//method
import java.util.Scanner;//utility package - allowing for user input
public class VowelsReplaceByExclamationPointApp {
	public static void main(String args[]){

		//variables
		String sentence; //old String
		String msg; //new String

		//scanner + object
		Scanner scanner = new Scanner(System.in);
		VowelsReplaceByExclamationPoint object=new VowelsReplaceByExclamationPoint ();

		//input //ask to the user to input + store the answer into sentence (variable)
		System.out.println("Enter a sentence :");
			sentence = scanner.nextLine();

		//set //send what user input to the instantiable class file
		object.setSentence(sentence); //same setName than in instantiable class file

		//compute
		object.compute();//same computeName than in instantiable class file

		//get //get info from instantiable class file
		msg=object.getMsg(); //same getName than in instantiable class file

		//output the new String msg that replace vowel by !
		System.out.println(msg);
	}
}
