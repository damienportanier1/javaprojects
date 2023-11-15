/*
HelloName.java
Damien Portanier
3 10 2022
*/

//build an application to ask the user their name and print the name back on the screen

import javax.swing.*; 						//a la place de * on peut mettre JOptionPane cest pareil
public class HelloName{
	public static void main(String[] args){

		//variable to hold a name - tous les variables ont un TYPE et un NOM
		String name; 						//String is the type for a name - ATTENTION S MAJUSCULE
		name=""; 							// "" empty container (case vide) on connait pas le nom

		//ask the user for their name
		name=JOptionPane.showInputDialog(null, "What is your names?");	//Input function

		//print the name back to the user
		JOptionPane.showMessageDialog(null, "Hello "+name); 			//Output
	}
}
//ALTERNATIVE COURTE

//import javax.swing.*
//public class HelloName{
	//public static void main(String[] args){
		//String name=JOptionPane.showInputDialog(null, "What is your names?");
		//JOptionPane.showMessageDialog(null, "Hello "+name);