/*
Software Development
Lab Week 6 - Question 1
BeerSong.java
Damien Portanier
05 11 2022

Question 1. Create an application that prints all of the lyrics to '99 bottles of beer' httpswww.songfacts.comlyricstraditional99-bottles-of-beer
*/

//method
public class BeerSong{
	public static void main(String[] args){

		//variables
		int x;
		int i;

		//for loop + compute + if/else statement + output
		//for loop
		for(i=99;i>1;i--){ //round brackets (run start at 99 (i=99) and go down (i--) until 2 (i>1)) //i-- or i=i-1 make the same result//i put until 2 for respect the spelling of the song (see bellow: 1 bottle not bottles)

			//curly brackets {run as many time as the loop run}
			x=i-1; //compute
			if(x>1){ //if-else statement
			//output
				System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
				System.out.println("Take one down and pass it around, "+x+" bottles of beer on the wall");
				System.out.println(" ");
			}
			else {
				System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
				System.out.println("Take one down and pass it around, "+x+" bottle of beer on the wall");
				System.out.println(" ");

				//we respect the spelling of the song = 1 bottle not 1 bottles

				System.out.println(x+" bottle of beer on the wall, "+x+" bottle of beer");
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall");
				System.out.println(" ");
				System.out.println("No more bottles of beer on the wall, no more bottles of beer");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall");
			}
		}//close bracket of for loop
	}
}