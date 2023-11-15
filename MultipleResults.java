//Week 8 correction Lab2 from the moodle

import javax.swing.JOptionPane;
public class MultipleResults{
	public static void main(String[] args){
		//declare vars
		String[] students={"Sam Cogan","John Smith","Bob Loblaw"};
		int rows=students.length;
		int numModules=4;
		int columns=numModules;
		double[][] results;
		results=new double[rows][columns];//students then numModules set the number of boxes in the 2D Arrays
		//input
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				results[i][j]=Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter result "+(j+1)+" for "+students[i]));
			}
		}
		//output
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println(students[i]+" result #"+(j+1)+" is: "+results[i][j]);
			}
		}

		//set example
		public void setResults(double[][] results){
			this.results=results;
		}

		//get example
		public String[][] getGrades(){
			return grades;
		}
	}
}