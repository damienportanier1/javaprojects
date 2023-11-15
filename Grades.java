//CORRECTION DU PROF POUR LAB WEEK 7
/*Question 1
Create an application that asks a user to enter how many subjects they have. The application should then ask the user to enter the results for each subject. Store these results in an array and print them back to the user along with their overall average and grade for each module.*/

/*
inputs
int numSubjects
double[] results

process
???

output
double[] results;
double average;
String[] grades;
*/
public class Grades{
	//vars
	private double[] results;
	private String[] grades;
	private double average;

	//constructor
	public Grades(){
		average=0;
	}
	//set//receive array (input user) from AppFile//array named/created/initialized in AppFile
	public void setResults(double[] results){
		this.results=results;//link/store array to the variable (results)
	}
	//compute
	public void computeAverage(){
		for(int i=0;i<results.length;i++){//run as many as number of boxes in the array (stored in results variable)
			average=average+results[i]; //result[i]-> when i=0 -> result[0]= what user input in the array at the box/position 0 in AppFile
		}//sum of every value input inside boxes of the array
		average=average/results.length;
	}
	public void computeGrades(){
		grades=new String[results.length];//array named/created/initialized in instantiable class because we fill in this array in InstClass
		//initialise the number of boxes=number boxes in results(array)//inside the array grade only words so String

		for(int i =0;i<grades.length;i++){
			if(results[i]>=70 && results[i]<=100){//result[i]-> when i=0 -> result[0]= what user input in the array at the box/position 0 in AppFile//because in the set InstClass we have stored the array to the variable (results)
				grades[i]="1.1";
			}
			else if(results[i]>=60 && results[i]<70){
				grades[i]="2.1";
			}
			else if(results[i]>=50 && results[i]<60){
				grades[i]="2.2";
			}
			else if(results[i]>=40 && results[i]<50){
				grades[i]="Pass";
			}
			else if(results[i]>=0 && results[i]<40){
				grades[i]="Fail";
			}
			else{
				grades[i]="Invalid result";
			}
		}
	}
	//get
	public double getAverage(){
		return average;
	}
	public String[] getGrades(){
		return grades;
	}

}