//CORRECTION DU PROF POUR LAB WEEK 7
/*Question 1
Create an application that asks a user to enter how many subjects they have. The application should then ask the user to enter the results for each subject. Store these results in an array and print them back to the user along with their overall average and grade for each module.*/

import javax.swing.JOptionPane;
public class GradesApp{
	public static void main(String[] args){
		//vars
		int numSubjects;
		double[] results;
		String[] grades;
	 	double average;
		//objects
		Grades g;
		g=new Grades();
		//input
		numSubjects=Integer.parseInt(JOptionPane.showInputDialog(null,"How many subjects?"));
		results=new double[numSubjects];//input the number of boxes in the array
		//ask for all results
		for(int i=0;i<results.length;i++){
			results[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Enter result for subject "+(i+1)));
		}//input in each boxes of the array a thing/number etc
		//set//send to the Instantiable File
		g.setResults(results);
		//compute
		g.computeAverage();
		g.computeGrades();
		//get
		average=g.getAverage();
		grades=g.getGrades();
		//output
		JOptionPane.showMessageDialog(null,"Your average is "+average);
		for(int i=0;i<results.length;i++){
			System.out.println("Your result for module "+(i+1)+" was " +results[i]+"\n This means your grade was "+grades[i]);

		}
	}
}