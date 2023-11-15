/*Lab Week 9 - Software Development

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

Créez une application (en utilisant la classe instan et seulement la classe Scanner pour l'entrée) qui prend une chaîne de caractères d'un utilisateur et fait ce qui suit :

Supposons que la chaîne ne peut contenir que des lettres, des espaces et des points.

- Compte les lettres

- Compte les voyelles

- Stocke une nouvelle chaîne de caractères qui ne contient qu'une lettre sur deux

- Stocke les positions de chaque espace

- Produit une nouvelle chaîne de caractères dans laquelle toutes les voyelles sont remplacées/imprimées par des points d'exclamation.

Remarque : ne créez qu'une seule classe d'application, mais créez plusieurs classes instanciables ou plusieurs calculs pour traiter chaque point.

*/
//method
public class VowelsReplaceByExclamationPoint {

		//variable
		String sentence; //old String
		String msg; //new String

		//constructor (by default or modify)
		public VowelsReplaceByExclamationPoint(){
			String sentence;
			String msg;
			}

		//set // receive info from the App file and store it, into sentence (variable)
		public void setSentence (String sentence){
			this.sentence=sentence;
		}

		//compute /.replaceAll() method that permit to replace vowels by !
		public void compute(){
		msg = sentence.replaceAll("[aeiouAEIOU]", "!"); //store the new String into msg (variable)
		}
		//get //send info to the App file
		public String getMsg(){
			return msg;
		}

}