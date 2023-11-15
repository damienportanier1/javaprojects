/*Week 2 Lab - Week 3 Lab the same but with instantiable classes

Q2 - Create an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour

Damien Portanier
16 10 2022
*/

//I considered that the salary could be a decimal number. So the type of variable is double.

import javax.swing.*; //JOptionPane or * work
public class QuestionTwoApp{
	public static void main(String[] args){

		//variables
		double monthlyWage;
		double weeklyHours;
		double yearWage;
		double hourWage;

		//object - nameInitialClassFile+nomcopieobjet; nomcopyobject=new+nomInitialClassFile(); or less long nomInitialClassFile+nomcopyobject=new+nomInitialClassFile();
		QuestionTwoInstantiable salary=new QuestionTwoInstantiable();

		//input
		monthlyWage=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your monthly wage : "));
		weeklyHours=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your weekly hours : "));

		//setmethod - namecopyobject.namesetINSTANTIABLE(what input user);
		salary.setMonthlyWage(monthlyWage);
		salary.setWeeklyHours(weeklyHours);

		//compute-process - namecopyobject.computeNameInstantiable();
		salary.computeYearWage();
		salary.computeHourWage();

		//getmethod - nameVariableInstantiable=namecopyobject.getNameVariableInstantiable();
		yearWage=salary.getYearWage();
		hourWage=salary.getHourWage();

		//output - MessageDialogBox or println
		JOptionPane.showMessageDialog(null,"Your salary per year is "+yearWage);
		JOptionPane.showMessageDialog(null, "Your salary per hours is "+hourWage);
	}
}