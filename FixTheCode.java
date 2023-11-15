/*Week 2 Lab

Q1 - Fix the code by figuring out what should be in the **** sections

Damien Portanier
11 10 2022*/

import javax.swing.JOptionPane;
public class FixTheCode{
	public static void main(String[] args){
		//variables
		int eggs;
		int boxSize;
		int numBoxes;
		int leftOverEggs;
		//inputs
		eggs=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter a number of eggs"));
		boxSize=6;
		//process
		numBoxes=(eggs/6);
		leftOverEggs=eggs%boxSize;
		//output
		JOptionPane.showMessageDialog(null,"Number of boxes needed "+numBoxes);
		JOptionPane.showMessageDialog(null,"Number of eggs left over "+leftOverEggs);
	}
}