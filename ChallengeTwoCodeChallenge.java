/*Create an application that takes in two variables from a user; their age and the current year. The application should then output the year that they were born.

Créez une application qui prend en compte deux variables d'un utilisateur : son âge et l'année en cours. L'application doit ensuite afficher l'année de naissance de l'utilisateur.*/

import javax.swing.*;
public class ChallengeTwoCodeChallenge {
	public static void main(String[] args){
		/*Fill in the gaps in code by replacing the **** sections*/
		//addition
		int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter your age"));
		int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the current year"));
		int ans=y-x;
		//print
		JOptionPane.showMessageDialog(null,"You are born in "+ans);
	}
}