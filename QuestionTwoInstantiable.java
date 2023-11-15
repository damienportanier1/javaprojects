/*Week 2 Lab - Week 3 Lab the same but with instantiable classes

Q2 - Create an application that takes in a user's monthly wage and weekly hours and calculates how much they make per year and per hour

Damien Portanier
16 10 2022
*/

//I considered that the salary could be a decimal number. So the type of variable is double.

public class QuestionTwoInstantiable{

		//variables = It is the mould - Here we have 4 variables (Question 2) - The user will put two of them in the App file that gonna transmit to the Instantiable file that gonna compute and get back to the App file that gonna output the result to the user
		private double monthlyWage;
		private double weeklyHours;
		private double yearWage;
		private double hourWage;

		//constructor (none)

		//setmethod
		public void setWeeklyHours(double weeklyHours){
			this.weeklyHours=weeklyHours;
		}
		public void setMonthlyWage(double monthlyWage){
					this.monthlyWage=monthlyWage;
		}
		//compute-process
		public void computeYearWage(){ //computeYearWage is a name
			yearWage=monthlyWage*12;
		}
		public void computeHourWage(){
			hourWage=monthlyWage/4/weeklyHours;
		}
		//getmethod
		public double getYearWage(){
			return yearWage;
		}
		public double getHourWage(){
			return hourWage;
		}
}