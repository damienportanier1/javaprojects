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
import java.util.Scanner;//Scanner permit the input
public class LabOneApp{//method
	public static void main(String[] args){
		//variables
		int[]array=new int[5];
		int start;
		int end;

		//Scanner + Object
		Scanner scanner =new Scanner(System.in);
		LabOne random =new LabOne();

		//input//ask to input something
		System.out.println("Enter where the random number should start : ");
			start = scanner.nextInt();

		System.out.println("Enter where the random number should end : ");
			end = scanner.nextInt();

		//set//send info (what user input) to the instantiable class file
		random.setStart(start);
		random.setEnd(end);

		//compute
		//random.computeStartEnd(); //what (variable) we want to output is calculate in InstantiableClass
		random.compute();

		//get//grab info from the instantiable class file
		array=random.getArray();
		start=random.getStart();
		end=random.getEnd();

		//output
		System.out.println("The random number range should start at "+start);
		System.out.println("The random number range should end at "+end);
		for (int i=0; i<array.length;i++){
		System.out.println("Random numbers in the array position "+i+" is "+array[i]+".");}


	}
}
