/*
Software Development
Lab Week 9
Damien Portanier
26 11 2022

LabOne.java
LabOneApp.java

Lab 1
Create an instantiable class that generates and returns an array of random numbers based on 3 parameters:

-How large the array should be
-Where the random number range should start
-Where the random number range should end
*/

//method
public class LabOne{
	//variables //declare array and create arraySize and initialise array
	private int[]array=new int[5];
	private int start;
	private int end;

	//constructor
	public LabOne(){
		int[]array=new int[5]; //How large the array should be //initialise the number of boxes the array will have and link to the array (variable)
		int start=0;
		int end=0;
	}

	//set //receive what input the user in App file //a variable(ARRAY) store all slot(emplacement) so nb input(AppFile) not equal nb set(InstClass)
	public void setStart(int start){
		this.start=start;
	}
	public void setEnd(int end){
		this.end=end;
	}

	//compute
	public void compute(){
		for(int i=0;i<array.length;i++){
			array[i] = start + ((int)(Math.random() * ((end - start) + 1)));
		}
	}
	//get//return = send info(variable) we want to output to the App file
	public int[]getArray(){
		return array;
	}
	public int getStart(){
			return start;
	}
	public int getEnd(){
			return end;
	}

}