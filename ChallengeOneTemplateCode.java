/*We are going to take the 'SimpleAddition' example from last week and upgrade it so that the number values are no longer 'hard-coded'. This means that you will need to change the section where the variables are initialised and set it to a user inputted value.

Nous allons reprendre l'exemple "SimpleAddition" de la semaine dernière et le mettre à jour afin que les valeurs numériques ne soient plus "codées en dur". Cela signifie que vous devrez modifier la section où les variables sont initialisées et la définir sur une valeur saisie par l'utilisateur.
*/


import javax.swing.*;
public class ChallengeOneTemplateCode{
	public static void main(String[] args){
		/*Fill in the gaps in code by replacing the **** sections*/
		//addition
		int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number"));
		int ans=x+y;
		//print
		System.out.println(ans);
	}
}