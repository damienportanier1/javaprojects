/*
Software Development
Lab Week 7 - Question 3

Version with only one file

Guess.java

Damien Portanier
05 11 2022

Question 3. Create an application that generates an array of 5 random numbers 1-10. The user should then guess a number and the app will tell them how many time that number exists within the array.
*/
import java.util.Scanner;
public class Guess{
	public static void main(String[] args){

		//variables + declare

		/*//constructor
		public Andom(){
			inputUser;
			counterOfTruth = 0;//by default
			int i=0;
		}*/
		//declare array //create arraySize of 5 //random is the name of the array
		int[]random=new int[5];
		int random1=(int)(Math.random() * 10+1);
		int random2=(int)(Math.random() * 10+1);
		int random3=(int)(Math.random() * 10+1);
		int random4=(int)(Math.random() * 10+1);
		int random5=(int)(Math.random() * 10+1);
		//initialise array with random number//position of the boxes is 0 to 4 ///random number between 1-10
		random[0]=random1;
		random[1]=random2;
		random[2]=random3;
		random[3]=random4;
		random[4]=random5;

		//objet
		Scanner scanner=new Scanner(System.in);

		//input
		int inputUser;
		System.out.println("Enter a number between 1 and 10: ");
		inputUser=scanner.nextInt();

		System.out.println();
		System.out.println("Random numbers in the array: ");
		System.out.println();

		//compute
		int counterOfTruth=0;
		int i=0;

		for(i=0;i<random.length;i++){
		System.out.println(random[i]);}
		System.out.println();//for verify if the program work

		for(i=0;i<random.length;i++){//i++ or i=i+1 are the same
			if(random[i]==inputUser){
				counterOfTruth++;
			}
		}
		//output
		System.out.println("Number of time your number appear in the array: "+counterOfTruth+".");
		System.out.println();
	}
}
