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
public class Random{
	//variables //declare array and create arraySize and initialise array
	private int[]array=new int[5];
	private int start;
	private int end;

	//constructor (modify or by default)
	public Random(){
		int[]array=new int[5];
		int start=0;
		int end=0;
	}

	//set //receive what input the user in App file and store to the variable start and end
	public void setStart(int start){
		this.start=start;
	}
	public void setEnd(int end){
		this.end=end;
	}

	//combined method is one method that combine three methods (set+compute+get)
	public int[]combine(int start, int end, int[]array){ //public int[] because we return an int array //calculate  with all the variables inside () separate by ,
		for(int i=0;i<array.length;i++){
					array[i] = start + ((int)(Math.random() * ((end - start) + 1))); //Math.random give always 0 or 0,9999.... so we put a range with this formula
		}
		return array; //get = return info (array) to the App file
	}
}