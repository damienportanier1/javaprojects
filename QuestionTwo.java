/*Week 2 Lab

Q2 - Create an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour

Damien Portanier
11 10 2022
*/

//I considered that the salary could be a decimal number. So the type of variable is double.

import javax.swing.*; //JOptionPane or * work
public class QuestionTwo{
	public static void main(String[] args){

		//variables + inputs
		double monthlyWage=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your monthly wage : "));
		double weeklyHours=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your weekly hours : "));

		//process
		double yearWage=monthlyWage*12;
		double hourWage=monthlyWage/4/weeklyHours;

		//output
		JOptionPane.showMessageDialog(null,"Your salary per year is "+yearWage);
		JOptionPane.showMessageDialog(null, "Your salary per hours is "+hourWage);

	}
}