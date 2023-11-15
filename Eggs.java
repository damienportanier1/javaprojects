/*Week 2 Lab

Q3 - A farmer has asked you to create an application that takes in a number of eggs that has been laid. The application should calculate and output how many 6-egg boxes the farmer needs to purchase to hold the eggs, and how many eggs will be left over.
NB: The code for this can be found in question 1, feel free to answer that question first if you are not confident, and then try to do this one while referring to Q1 as little as possible

Damien Portanier
11 10 2022
*/

import javax.swing.JOptionPane;
public class Eggs{
	public static void main(String[] args){

		//variables + inputs
		int eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		int boxSize=6;

		//process + output
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+(eggs/6));
		JOptionPane.showMessageDialog(null,"Number of eggs left over "+(eggs%boxSize));
	}
}