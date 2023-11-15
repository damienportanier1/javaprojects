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
public class EverySecondLetter {
		//variables
		private String sentence; //old String
		private char msg;
		private String str; //new String

		//constructor (by default or modify)
		public EverySecondLetter(){
			String sentence;
			char msg;
			String str;
			}

		//set // receive info from the App file and store it, into sentence (variable)
		public void setSentence (String sentence){
			this.sentence=sentence;
		}

		//compute - for loop that permit to look all the String
		public void compute(){
		for(int i=0;i<sentence.length();i=i+2){
			msg = sentence.charAt(i); //store every second characters (i=i+2) into char msg (variable)

			if(Character.isLetter(msg)){ //if user input is a letter
			str = Character.toString(msg);//convert the char msg into a String and store it into str (variable)

			//output in instantiable class file for have the new String that only contains every second letter
			System.out.print(str);
			}
		}
		}
		//get //send info to the App file
		public String getStr(){
			return str;
		}

}
/*
Other way to contains half of the letters input:
- replace the for loop by = for(int i=0;i<sentence.length()/2;i=i+1)

For contains half of the length :
- System.out.println(Stringvariable.substring(0, Stringvariable.length() / 2));
*/