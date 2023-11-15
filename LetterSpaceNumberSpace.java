/*
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
public class LetterSpaceNumberSpace{
public static void main(String[] args) {

String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

int letter = 0;
int space = 0;
int number = 0;
int other = 0;
char temp;

for (int i=0; i < string.length(); i++) { // there can be no <= because to test it right it needs to be of lenght -1!!!
temp = string.charAt(i);

if(Character.isLetter(temp)){
letter ++;
}
else if (Character.isDigit(temp)){
number ++;
}
else if (Character.isSpaceChar(temp)){
space ++;
}
else {
other ++;
}
}
System.out.println("The string is : " + string);
System.out.println("letter: " + letter);
System.out.println("space: " + space);
System.out.println("number: " + number);
System.out.println("other: " + other);
}
}
