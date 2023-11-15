/*
Software Development
Lab Week 10
Damien Portanier
26 11 2022

Random.java
RandomApp.java

Lab 1
Create an instantiable class that generates and returns an array of random numbers based on 3 parameters:

-How large the array should be
-Where the random number range should start
-Where the random number range should end
*/

//method
import java.util.Scanner;//Scanner java utility package that permit to input
public class RandomApp{//method
	public static void main(String[] args){

	//variables
		int[]array=new int[5];
		int start;
		int end;

		//Scanner + Object
		Scanner scanner =new Scanner(System.in);
		Random random =new Random();

		//input//ask to input something and store it into a variable (start, end)
		System.out.println("Enter where the random number should start : ");
			start = scanner.nextInt();

		System.out.println("Enter where the random number should end : ");
			end = scanner.nextInt();

		//combined method is one method that combine three methods (set+compute+get)
		array=random.combine(start,end,array);

		//output
		System.out.println("The random number range should start at "+start);
		System.out.println("The random number range should end at "+end);

		for (int i=0; i<array.length;i++){
			System.out.println("Random numbers in the array position "+i+" is "+array[i]+".");}

	}
}
